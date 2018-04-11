package org.asb.mule.probe.ptn.fenghuo.nbi.job;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.valueobject.BObject;
import com.alcatelsbell.nms.valueobject.CdcpDictionary;
import com.alcatelsbell.nms.valueobject.sys.Ems;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.*;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.DataTask;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.nbi.task.TaskResultHandler;
import org.quartz.JobExecutionContext;

import com.alcatelsbell.cdcp.nodefx.NEWrapper;
import com.alcatelsbell.cdcp.nodefx.NodeContext;

public class DeviceJob extends MigrateCommonJob implements CommandBean {

	private String devicedn = null;
    private Ems  ems = null;
	private int protocolType = CdcpDictionary.PROTOCALTYPE.SDH.value;
	public Ems getEms() {
		return ems;
	}

	public void setEms(Ems ems) {
		this.ems = ems;
		if (ems != null && ems.getProtocalType() != null)
			protocolType = ems.getProtocalType();
	}

	public DeviceJob(String devicedn) {
		this.devicedn = devicedn;
	}

	@Override
	public void execute(JobExecutionContext arg0) {
		// TODO Auto-generated method stub
		NEWrapper neWrapper = new NEWrapper();

		ManagedElement me=service.retrieveManagedElement(devicedn);
		List<EquipmentHolder> holderList = new ArrayList<EquipmentHolder>();
		List<Equipment> cardList = new ArrayList<Equipment>();
		holderList = service.retrieveAllEquipmentHolders(devicedn);
		cardList = service.retrieveAllEquipments(devicedn);
		//service.retrieveAllEquipmentAndHolders(devicedn, holderList, cardList);
		List<PTP> ptpList = service.retrieveAllPtps(devicedn);


		try {
			String neKey = devicedn.substring(devicedn.lastIndexOf(":") + 1).replaceAll(";", "-");
			if (ptpList != null && !ptpList.isEmpty()) {
                ObjectUtil.saveObject(service.getEmsName() + "/PTP-" + neKey, ptpList);
            } else {
                ptpList = (List) ObjectUtil.readObject(service.getEmsName() + "/PTP-" + neKey);
                if (ptpList == null) ptpList = new ArrayList<PTP>();
            }
		} catch (Exception e) {

			 e.printStackTrace();
		}


		neWrapper.setMe(me);
		neWrapper.setEquipmentHolders(holderList);
		neWrapper.setEquipments(cardList);
		neWrapper.setPtps(ptpList);

		if (ptpList != null && protocolType != CdcpDictionary.PROTOCALTYPE.PTN.value && !devicedn.contains("PTN")) {
			TaskPoolExecutor executor = new TaskPoolExecutor(5);
			final Vector ctps = new Vector();
			for (PTP ptp : ptpList) {
				final PTP _ptp = ptp;
				executor.executeTask(new DataTask() {
					@Override
					public Vector<BObject> excute() {
						List<CTP> ctps = service.retrieveAllCtps(_ptp.getDn());
						return new Vector<BObject>(ctps);
					}

					@Override
					public void insertDate(Vector<BObject> dataList) {

					}

					@Override
					public void updateDate(Vector<BObject> dataList) {

					}

					@Override
					public void deleteDate(Vector<BObject> dataList) {

					}

					@Override
					public void saveTask(C_TASK task) {

					}
				}, new TaskResultHandler() {
					@Override
					public void handleResult(DataTask task, Object result) throws Exception {
						if (result != null && result instanceof Collection)
							ctps.addAll((Collection) result);
					}
				});
			}

			executor.waitingForAllFinish();
			neWrapper.setCtps(new ArrayList<CTP>(ctps));
		}

		NodeContext.getNodeContext().deliverEmsJobObject(serial, neWrapper);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		execute(null);
	}

}
