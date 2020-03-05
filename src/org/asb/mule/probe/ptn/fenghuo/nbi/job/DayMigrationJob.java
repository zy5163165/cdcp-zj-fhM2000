package org.asb.mule.probe.ptn.fenghuo.nbi.job;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.EDS_PTN;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrailNtwProtection;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.service.SqliteConn;
import org.asb.mule.probe.framework.service.SqliteService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.FlowDomainFragmentDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.ManagedElementDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.PhysicalDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.ProtectionGroupDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.SectionDataTask;
import org.asb.mule.probe.ptn.fenghuo.nbi.task.TrafficTrunkAndCrossConnectionAndSectionDataTask;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;
import org.quartz.JobExecutionContext;

import com.alcatelsbell.cdcp.nodefx.FtpInfo;
import com.alcatelsbell.cdcp.nodefx.FtpUtil;
import com.alcatelsbell.cdcp.nodefx.MessageUtil;
import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class DayMigrationJob extends MigrateCommonJob implements CommandBean {

	private FileLogger nbilog = null;
	private String name = "";
    private SqliteConn sqliteConn = null;

	@Override
	public void execute(JobExecutionContext arg0) {
		// nbilog = new FileLogger(service.getEmsName() + "/nbi.log");
		nbilog = ((FenghuoService) service).getCorbaService().getNbilog();

		if (!service.getConnectState()) {
			nbilog.error(">>>EMS is disconnect.");
			try {
				MessageUtil.sendSBIFailedMessage("EMS is disconnect.", serial);
			} catch (Exception e) {
				nbilog.error("DayMigrationJob.Message Exception:", e);
			}
			return;
		}
		nbilog.info("Start for task : " + serial);
		nbilog.info("Start to migrate all data from ems: " + service.getEmsName());
		String dbName = getJobName() + ".db";
		nbilog.info("db: " + dbName);
		// name = "";// set empty to create new db instance
		try {
            sqliteConn = new SqliteConn();
			sqliteConn.setDataPath(dbName);
            sqliteConn.init();
			// 1.ne
			nbilog.info("ManagedElementDataTask : ");
			MessageUtil.sendSBIMessage(serial, "ManagedElementDataTask", 0);
			ManagedElementDataTask neTask = new ManagedElementDataTask(sqliteConn);
			neTask.CreateTask(service, getJobName(), service.getEmsName(), nbilog);
			Vector<BObject> neList = neTask.excute();

			nbilog.info("SectionDataTask: ");
			MessageUtil.sendSBIMessage(serial, "SectionDataTask", 40);
			SectionDataTask sectionTask = new SectionDataTask(sqliteConn);
			sectionTask.CreateTask(service, getJobName(), null, nbilog);
			Vector<BObject> sectionList = sectionTask.excute();

			nbilog.info("PhysicalDataTask CrossConnectionDataTask: ");
			MessageUtil.sendSBIMessage(serial, "PhysicalDataTask", 10);
			// TaskPoolExecutor executor = new TaskPoolExecutor(20);
			for (BObject ne : neList) {
				PhysicalDataTask phyTask = new PhysicalDataTask(sqliteConn);
				phyTask.CreateTask(service, getJobName(), ne.getDn(), nbilog, false);
				// executor.executeTask(phyTask);
				phyTask.excute();
			}


			nbilog.info("FlowDomainFragmentDataTask: ");
			MessageUtil.sendSBIMessage(serial, "FlowDomainFragmentDataTask", 50);
			FlowDomainFragmentDataTask ffdrTask = new FlowDomainFragmentDataTask(sqliteConn);
			ffdrTask.CreateTask(service, getJobName(), null, nbilog);
			Vector<BObject> ttVector = ffdrTask.excute();

			nbilog.info("ProtectionGroupDataTask: ");
			MessageUtil.sendSBIMessage(serial, "ProtectionGroupDataTask", 60);
			ProtectionGroupDataTask pgTask = new ProtectionGroupDataTask(sqliteConn);
			pgTask.CreateTask(service, getJobName(), null, nbilog);
			pgTask.excute();

			nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: ");
			MessageUtil.sendSBIMessage(serial, "TrafficTrunkAndCrossConnectionAndSectionDataTask", 70);
			HashMap tpSectionMap = getSectionByTp(sectionList);
			TaskPoolExecutor executor2 = new TaskPoolExecutor(3);
			for (BObject trafficTrunk : ttVector) {
				FlowDomainFragment fdfr = (FlowDomainFragment) trafficTrunk;
				TrafficTrunkAndCrossConnectionAndSectionDataTask task = new TrafficTrunkAndCrossConnectionAndSectionDataTask(sqliteConn);
				if (fdfr.getRate().equals("309")) {
					task.CreateTask(service, getJobName(), fdfr.getDn(), nbilog);
					task.setTpSectionMap(tpSectionMap);
					executor2.executeTask(task);
				}
			}
			nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: waitingForAllFinish.");
			executor2.waitingForAllFinish();
			nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: waitingForInsertBObject.");
			sqliteConn.waitingForInsertBObject();

			if (neList != null) {
				neList.clear();
			}
			if (sectionList != null) {
				sectionList.clear();
			}
			if (ttVector != null) {
				ttVector.clear();
			}
            sqliteConn.waitingForInsertBObject();

			// printTalbe();
			nbilog.info("End to migrate all data from ems.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			nbilog.error("DayMigrationJob.execute Exception:", e);
			try {
				MessageUtil.sendSBIFailedMessage("SBI ERROR.", serial);
			} catch (Exception e1) {
				nbilog.error("DayMigrationJob.Message Exception:", e);
			}
		}

		// ftp
		try {
			MessageUtil.sendSBIMessage(serial, "ftpFile", 85);
			FtpInfo ftpInfo = FtpUtil.uploadFile("PTN", "FENGHUO", service.getEmsName(), new File(dbName));

			EDS_PTN eds = geyEDS(dbName);
			MessageUtil.sendSBIFinishMessage(ftpInfo, serial, eds);
		} catch (Exception e) {
			nbilog.error("DayMigrationJob.ftp Exception:", e);
			try {
				MessageUtil.sendSBIFailedMessage("FTP ERROR.", serial);
			} catch (Exception e1) {
				nbilog.error("DayMigrationJob.Message Exception:", e);
			}
		}

        sqliteConn.release();


        try {
			File file = new File(dbName);
			file.delete();
			MessageUtil.sendSBIMessage(serial, "End", 90);
		} catch (Exception e) {
			nbilog.error("DayMigrationJob.Message Exception:", e);
		}
		nbilog.info("End of task : " + serial);
	}

	private EDS_PTN geyEDS(String dn) {
		EDS_PTN eds = new EDS_PTN();
		try {
			JPASupport jpaSupport = sqliteConn.getJpaSupport();
			// jpaSupport.begin();
			String[] sqls = { "SELECT count(ne.dn)     FROM  ManagedElement ne ",
					"SELECT count(slot.dn)       FROM  EquipmentHolder slot WHERE slot.holderType='slot' ",
					"SELECT count(card.dn)       FROM  Equipment card ",
					"SELECT count(ptp.dn)        FROM  PTP ptp WHERE dn like '%PTP%' ",
					"SELECT count(ftp.dn)        FROM  PTP ftp WHERE dn like '%FTP%' ",
					"SELECT count(section.dn)    FROM  Section section ",
					"SELECT count(tunnel.dn)     FROM  FlowDomainFragment tunnel where tunnel.rate='309' ",
					"SELECT count(pw.dn)         FROM  FlowDomainFragment pw   where pw.rate='1500' ",
					"SELECT count(fdfr.dn)       FROM  FlowDomainFragment fdfr where fdfr.rate='96' or fdfr.rate='5' ",
					"SELECT count(route.dn)      FROM  R_TrafficTrunk_CC_Section route where route.type='CC' ",
					"SELECT count(pg.dn)         FROM  TrailNtwProtection pg " };
			StringBuilder sb = new StringBuilder();
			int[] count = new int[sqls.length];
			for (int i = 0; i < sqls.length; i++) {
				List list = JPAUtil.getInstance().queryQL(jpaSupport, sqls[i]);
				sb.append(list.get(0)).append("	");

				count[i] = ((Long) list.get(0)).intValue();
			}
			nbilog.info("\nNE,Slot,Equipment,PTP,FTP,Section,Tunnel,PW,PWE3,Route,TunnelPG\n" + sb.toString());
			// jpaSupport.end();
			// jpaSupport.release();

			eds.setDn(dn);
			eds.setCollectTime(new Date());
			eds.setCreateDate(new Date());
			eds.setTaskSerial(serial);
			eds.setEmsname(service.getEmsName());
			eds.setNeCount(count[0]);
			eds.setSlotCount(count[1]);
			eds.setSubSlotCount(0);
			eds.setEquipmentCount(count[2]);
			eds.setPtpCount(count[3]);
			eds.setFtpCount(count[4]);
			eds.setSectionCount(count[5]);
			eds.setTunnelCount(count[6]);
			eds.setPwCount(count[7]);
			eds.setPwe3Count(count[8]);
			eds.setRouteCount(count[9]);
			eds.setTunnelPG(count[10]);
		} catch (Exception e) {
			nbilog.error("DayMigrationJob.count Exception:", e);
		}
		return eds;
	}

	// private void printTalbe() {
	// JPASupport jpaSupport = SqliteService.getInstance().getJpaSupport();
	// try {
	// jpaSupport.begin();
	// String[] sqls = { "SELECT count(ne.dn)     FROM  ManagedElement ne ",
	// "SELECT count(slot.dn)       FROM  EquipmentHolder slot WHERE slot.holderType='slot' ", "SELECT count(card.dn) FROM  Equipment card ",
	// "SELECT count(ptp.dn)        FROM  PTP ptp ", "SELECT count(section.dn)  FROM  Section section ",
	// "SELECT count(tunnel.dn)     FROM  FlowDomainFragment tunnel where tunnel.rate='309' ",
	// "SELECT count(pw.dn)         FROM  FlowDomainFragment pw   where pw.rate='1500' ",
	// "SELECT count(fdfr.dn)       FROM  FlowDomainFragment fdfr where fdfr.rate='96' or fdfr.rate='5' ",
	// "SELECT count(route.dn)      FROM  R_TrafficTrunk_CC_Section route where route.type='CC' ",
	// "SELECT count(pg.dn)         FROM  TrailNtwProtection pg " };
	// StringBuilder sb = new StringBuilder();
	// for (String sql : sqls) {
	// List list = JPAUtil.getInstance().queryQL(jpaSupport, sql);
	// sb.append(list.get(0)).append("	");
	// }
	// nbilog.info("\nNE,Slot,Equipment,PTP,Section,Tunnel,PW,PWE3,Route,TunnelPG\n" + sb.toString());
	// jpaSupport.end();
	// jpaSupport.release();
	// } catch (Exception e) {
	// e.printStackTrace();
	// nbilog.error("printTalbe Exception:", e);
	// }
	//
	// }

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
