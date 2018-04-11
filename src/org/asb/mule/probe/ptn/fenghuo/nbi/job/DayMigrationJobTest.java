package org.asb.mule.probe.ptn.fenghuo.nbi.job;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import com.alcatelsbell.cdcp.nodefx.FtpInfo;
import com.alcatelsbell.cdcp.nodefx.FtpUtil;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.service.SqliteConn;

import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.CrossConnectionDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.FlowDomainFragmentDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.ManagedElementDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.PhysicalDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.ProtectionGroupDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.SNCAndCCAndSectionDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.SNCDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.SectionDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.TrafficTrunkAndCrossConnectionAndSectionDataTask;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;
import org.quartz.JobExecutionContext;

import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class DayMigrationJobTest extends MigrateCommonJob implements CommandBean {

	private FileLogger nbilog = null;
	private String name = "";
    private SqliteConn sqliteConn = null;

	@Override
	public void execute(JobExecutionContext arg0) {
		nbilog = ((FenghuoService) service).getCorbaService().getNbilog();

		if (!service.getConnectState()) {
			nbilog.error(">>>EMS is disconnect.");
			return;
		}
		nbilog.info("Start for task : " + serial);
		nbilog.info("Start to migrate all data from ems: " + service.getEmsName());

		String dbName = getJobName() + ".db";

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

			nbilog.info("PhysicalDataTask CrossConnectionDataTask: ");
			TaskPoolExecutor executor = new TaskPoolExecutor(5);
			for (BObject ne : neList) {
				PhysicalDataTask phyTask = new PhysicalDataTask(sqliteConn);
				phyTask.CreateTask(service, getJobName(), ne.getDn(), nbilog, true);
				executor.executeTask(phyTask);

				CrossConnectionDataTask ccTask = new CrossConnectionDataTask(sqliteConn);
				ccTask.CreateTask(service, getJobName(), ne.getDn(), nbilog);
				executor.executeTask(ccTask);
			}
			nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForAllFinish.");
			executor.waitingForAllFinish();
			nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForInsertBObject.");
            sqliteConn.waitingForInsertBObject();

			nbilog.info("SectionDataTask: ");
			SectionDataTask sectionTask = new SectionDataTask(sqliteConn);
			sectionTask.CreateTask(service, getJobName(), null, nbilog);
			Vector<BObject> sectionList = sectionTask.excute();

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
            nbilog.info("Uploading file to :"+ftpInfo);
        } catch (Exception e) {
            nbilog.error(e, e);
        }
        nbilog.info("End of task : " + serial);
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {

        }
        System.exit(0);


	}

	private void printTalbe() {
		JPASupport jpaSupport = sqliteConn.getJpaSupport();
		try {
			// jpaSupport.begin();
			String[] sqls = { "SELECT count(ne.dn)     FROM  ManagedElement ne ",
					"SELECT count(slot.dn)       FROM  EquipmentHolder slot WHERE slot.holderType='slot' ",
					"SELECT count(card.dn)       FROM  Equipment card ", "SELECT count(ptp.dn)        FROM  PTP ptp WHERE dn like '%PTP%' ",
					"SELECT count(ftp.dn)        FROM  PTP ftp WHERE dn like '%FTP%' ", "SELECT count(section.dn)    FROM  Section section ",
					"SELECT count(tunnel.dn)     FROM  FlowDomainFragment tunnel where tunnel.rate='309' ",
					"SELECT count(pw.dn)         FROM  FlowDomainFragment pw   where pw.rate='1500' ",
					"SELECT count(fdfr.dn)       FROM  FlowDomainFragment fdfr where fdfr.rate='96' or fdfr.rate='5' ",
					"SELECT count(route.dn)      FROM  R_TrafficTrunk_CC_Section route where route.type='CC' ",
					"SELECT count(pg.dn)         FROM  TrailNtwProtection pg " };
			StringBuilder sb = new StringBuilder();
			for (String sql : sqls) {
				List list = JPAUtil.getInstance().queryQL(jpaSupport, sql);
				sb.append(list.get(0)).append("	");
			}
			nbilog.info("\nNE,Slot,Equipment,PTP,FTP,Section,Tunnel,PW,PWE3,Route,TunnelPG\n" + sb.toString());
			// jpaSupport.end();
			// jpaSupport.release();
		} catch (Exception e) {
			e.printStackTrace();
			nbilog.error("printTalbe Exception:", e);
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
