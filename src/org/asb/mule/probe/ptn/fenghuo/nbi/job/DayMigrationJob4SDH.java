package org.asb.mule.probe.ptn.fenghuo.nbi.job;

import com.alcatelsbell.cdcp.domain.SummaryUtil;
import com.alcatelsbell.cdcp.nodefx.FtpInfo;
import com.alcatelsbell.cdcp.nodefx.FtpUtil;
import com.alcatelsbell.cdcp.nodefx.MessageUtil;
import com.alcatelsbell.cdcp.nodefx.NodeContext;
import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.util.SysProperty;
import com.alcatelsbell.nms.valueobject.BObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.EDS_PTN;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.service.SqliteConn;

import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.*;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;
import org.quartz.JobExecutionContext;

import java.io.File;
import java.util.*;

/**
 * Author: Ronnie.Chen
 * Date: 14-8-31
 * Time: 下午2:47
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class DayMigrationJob4SDH  extends MigrateCommonJob implements CommandBean {

    private FileLogger nbilog = null;
    private String name = "";
    private SqliteConn sqliteConn = null;

    private long t1 = System.currentTimeMillis();
    @Override
    public void execute(JobExecutionContext arg0) {
        nbilog = ((FenghuoService) service).getCorbaService().getNbilog();
        Date startTime = new Date();
        EDS_PTN eds = null;
        if (!service.getConnectState()) {
            nbilog.error(service.getEmsName()+"  >>>EMS is disconnect.");
            NodeContext.getNodeContext().getLogger().error(service.getEmsName()+"  >>>EMS is disconnect.");
            return;
        }
        nbilog.info("Start for task : " + serial);
        nbilog.info("Start to migrate all data from ems: " + service.getEmsName());

        String dir = SysProperty.getString("cdcp.node.db.dir", "");
        if (!dir.isEmpty() && !(dir.endsWith("/") || dir.endsWith("\\"))) dir += File.pathSeparator;
        if (!dir.isEmpty() && new File(dir).isDirectory()) new File(dir).mkdirs();
        String dbName = dir +getJobName() + ".db";

        nbilog.info("db: " + dbName);
        try {
            sqliteConn = new SqliteConn();
            sqliteConn.setDataPath(dbName);
            sqliteConn.init();
            // 1.ne
            nbilog.info("ManagedElementDataTask : ");
            ManagedElementDataTask neTask = new ManagedElementDataTask(sqliteConn);
            neTask.CreateTask(service, getJobName(), service.getEmsName(), nbilog);
            Vector<BObject> neList = neTask.excute();

            nbilog.info("SectionDataTask: ");
            SectionDataTask sectionTask = new SectionDataTask(sqliteConn);
            sectionTask.CreateTask(service, getJobName(), null, nbilog);
            Vector<BObject> sectionList = sectionTask.excute();
            ObjectUtil.newFolder("../cache/"+service.getEmsName());
            if (logical) {
                TaskPoolExecutor ccexecutor = new TaskPoolExecutor(5);
                for (BObject ne : neList) {

                    if (service.getEmsName().equals("SHX-OTNM2000-1-OTN")
                            || service.getEmsName().equals("HZ-OTNM2000-1-F"))
                        continue;
                    CrossConnectionDataTask ccTask = new CrossConnectionDataTask(sqliteConn);
                    ccTask.CreateTask(service, getJobName(), ne.getDn(), nbilog);
                    ccexecutor.executeTask(ccTask);

                }

                ccexecutor.waitingForAllFinish();
            }


//            LinkedList<BObject> neLL = new LinkedList(neList);
//            HashMap<String,Integer> count = new HashMap<String, Integer>();
//            while (true) {
//                BObject ne = neLL.poll();
//                if (ne == null) break;
//                CrossConnectionDataTask ccTask = new CrossConnectionDataTask(sqliteConn);
//                ccTask.CreateTask(service, getJobName(), ne.getDn(), nbilog);
//                Vector<BObject> ccs = ccTask.excute();
//                if (ccs == null || ccs.isEmpty()) {
//
//                    if (count.get(ne.getDn()) == null) count.put(ne.getDn(),1);
//                    else {
//                        count.put(ne.getDn(), ((Integer) count.get(ne.getDn())).intValue() + 1);
//
//                    }
//
//                    if ((Integer)count.get(ne.getDn()) < 100) {
//                        neLL.addLast(ne);
//                    }
//                }
//            }





            nbilog.info("PhysicalDataTask CrossConnectionDataTask: ");
            TaskPoolExecutor executor = new TaskPoolExecutor(5);
            for (BObject ne : neList) {
                PhysicalDataTask phyTask = new PhysicalDataTask(sqliteConn);
                phyTask.CreateTask(service, getJobName(), ne.getDn(), nbilog, true);
                executor.executeTask(phyTask);

//                CrossConnectionDataTask ccTask = new CrossConnectionDataTask(sqliteConn);
//                ccTask.CreateTask(service, getJobName(), ne.getDn(), nbilog);
//                executor.executeTask(ccTask);
            }
            nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForAllFinish.");
            executor.waitingForAllFinish();
            nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForInsertBObject.");
            sqliteConn.waitingForInsertBObject();



            // nbilog.info("ProtectionGroupDataTask: ");
            // ProtectionGroupDataTask pgTask = new ProtectionGroupDataTask();
            // pgTask.CreateTask(service, getJobName(), null, nbilog);
            // pgTask.excute();
            //
            // nbilog.info("FlowDomainFragmentDataTask: ");
            // FlowDomainFragmentDataTask ffdrTask = new FlowDomainFragmentDataTask();
            // ffdrTask.CreateTask(service, getJobName(), null, nbilog);
            // Vector<BObject> ttVector = ffdrTask.excute();
            //
            // nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: ");
            // HashMap tpSectionMap = getSectionByTp(sectionList);
            // TaskPoolExecutor executor2 = new TaskPoolExecutor(3);
            // for (BObject trafficTrunk : ttVector) {
            // FlowDomainFragment fdfr = (FlowDomainFragment) trafficTrunk;
            // TrafficTrunkAndCrossConnectionAndSectionDataTask task = new TrafficTrunkAndCrossConnectionAndSectionDataTask();
            // if (fdfr.getRate().equals("309")) {
            // task.CreateTask(service, getJobName(), fdfr.getDn(), nbilog);
            // task.setTpSectionMap(tpSectionMap);
            // executor2.executeTask(task);
            // }
            // }
            // nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: waitingForAllFinish.");
            // executor2.waitingForAllFinish();
            // nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: waitingForInsertBObject.");
            // SqliteService.getInstance().waitingForInsertBObject();

            if (logical) {
                nbilog.info("SNCDataTask: ");
                SNCDataTask ttTask = new SNCDataTask(sqliteConn);
                ttTask.CreateTask(service, getJobName(), null, nbilog);
                Vector<BObject> ttVector = ttTask.excute();

                nbilog.info("SNCAndCCAndSectionDataTask: ");
                TaskPoolExecutor executor2 = new TaskPoolExecutor(50);
                for (BObject snc : ttVector) {
                    SNCAndCCAndSectionDataTask task = new SNCAndCCAndSectionDataTask(sqliteConn);
                    task.CreateTask(service, getJobName(), snc.getDn(), nbilog);
                    executor2.executeTask(task);
                }
                nbilog.info("SNCAndCCAndSectionDataTask: waitingForAllFinish.");
                executor2.waitingForAllFinish();
                nbilog.info("SNCAndCCAndSectionDataTask: waitingForInsertBObject.");
                sqliteConn.waitingForInsertBObject();
            }

            if (neList != null) {
                neList.clear();
            }
            if (sectionList != null) {
                sectionList.clear();
            }
            // if (ttVector != null) {
            // ttVector.clear();
            // }
            sqliteConn.waitingForInsertBObject();

            queryCount();
            eds = SummaryUtil.geyEDS(serial, sqliteConn, service.getEmsName(), dbName);
            sqliteConn.release();
            // printTalbe();
            nbilog.info("End to migrate all data from ems.");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        // message
        nbilog.info("Uploading file...");
        try {
            FtpInfo ftpInfo = FtpUtil.uploadFile("SDH", "FH", service.getEmsName(), new File(dbName));
            ftpInfo.getAttributes().put("logical",""+logical);
            nbilog.info("Uploading file to :"+ftpInfo);
            if (eds != null) {
                eds.setStartTime(startTime);
                HashMap map = new HashMap();
                map.put("logical",logical);
                eds.setUserObject(map);
            }

            MessageUtil.sendSBIFinishMessage(ftpInfo, serial, eds);
        } catch (Exception e) {
            nbilog.error(e, e);
        }

        try {
            File file = new File(dbName);
            file.delete();
            MessageUtil.sendSBIMessage(serial, "End", 90);
        } catch (Exception e) {
            nbilog.error("DayMigrationJob.Message Exception:", e);
        }

        nbilog.info("End of task : " + serial);
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {

        }



    }

    private void queryCount() {
        Logger logger = NodeContext.getNodeContext().getLogger();
        synchronized (logger) {
            logger.info("");
            long t2 = (System.currentTimeMillis() - t1) / (3600000l);
            logger.info("=========================== "+t2+"Hours ["+service.getEmsName()+"]"+getJobName()+" =========================================================");
            try {
                JPASupport jpaSupport = sqliteConn.getJpaSupport();
                HashMap<String,String> sqls = new HashMap<String, String>();
                sqls.put("NE:","SELECT count(ne.dn)     FROM  ManagedElement ne ");
                sqls.put("slot:","SELECT count(slot.dn)       FROM  EquipmentHolder slot WHERE slot.holderType='slot' ");
                sqls.put("subslot:", "SELECT count(subslot.dn)    FROM  EquipmentHolder subslot WHERE subslot.holderType='sub_slot' ");
                sqls.put("card:","SELECT count(card.dn)       FROM  Equipment card ");
                sqls.put("ptp:","SELECT count(ptp.dn)        FROM  PTP ptp WHERE dn like '%PTP%' ");
                sqls.put("ftp:","SELECT count(ftp.dn)        FROM  PTP ftp WHERE dn like '%FTP%' ");
                sqls.put("ctp:","SELECT count(id)        FROM  CTP ");
                sqls.put("crossconnect:","SELECT count(id)        FROM  CrossConnect ");
                sqls.put("subnetworkconnection:","SELECT count(id) FROM SubnetworkConnection ");
                sqls.put("section:","SELECT count(id) FROM Section ");
                sqls.put("R_TrafficTrunk_CC_Section:","SELECT count(id) FROM R_TrafficTrunk_CC_Section ");

                Set<String> keySet = sqls.keySet();
                for (String key : keySet) {
                    String sql = sqls.get(key);
                    List list = JPAUtil.getInstance().queryQL(jpaSupport, sql);
                    int count = ((Long) list.get(0)).intValue();
                    nbilog.info(key+" "+count);
                    logger.info(key+" "+count);
                }


                // jpaSupport.end();
            } catch (Exception e) {
                nbilog.error(e,e);
            }
            logger.info("===============================================================================================================");
            logger.info("");
        }

    }
    private HashMap getSectionByTp(Vector<BObject> sectionList) {
        HashMap map = new HashMap<String, Section>();
        for (BObject section : sectionList) {
            if (section instanceof Section) {
                map.put(((Section) section).getaEndTP(), section);
                map.put(((Section) section).getzEndTP(), section);
            }
        }
        return map;
    }

    /**
     * define job name ,as unique id for migration job.
     * It can be used in failed job to migrate ems data from ems.
     *
     * @return
     */
    private String getJobName() {
        if (name.trim().length() == 0) {
            // name = CodeTool.getDatetime()+"-"+service.getEmsName()+"-DayMigration";

            name = CodeTool.getDatetimeStr() + "-" + service.getEmsName() + "-DayMigration";
        }
        return name;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        execute(null);
    }

}

