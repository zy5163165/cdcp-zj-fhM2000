package org.asb.mule.probe.ptn.fenghuo.nbi.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

import com.alcatelsbell.nms.util.ObjectUtil;
import org.asb.mule.probe.framework.entity.CTP;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteConn;


import com.alcatelsbell.nms.valueobject.BObject;

public class PhysicalDataTask extends CommonDataTask {
    public PhysicalDataTask(SqliteConn sqliteConn) {
        this.setSqliteConn(sqliteConn);
        // TODO Auto-generated constructor stub

    }
	private boolean checkHolders(List<EquipmentHolder> holderList, List<Equipment> cardList) {
		HashSet<String> holders = new HashSet();
		for (EquipmentHolder equipmentHolder : holderList) {
			holders.add(equipmentHolder.getDn());
		}

		for (Equipment equipment : cardList) {
			String dn = equipment.getDn();
			String holderDn = dn.substring(0, dn.lastIndexOf("@Equipment"));
			if (!holders.contains(holderDn))
				return false;
		}
		return true;
	}
	public Vector<BObject> excute() {
		try {
			List<EquipmentHolder> holderList = new ArrayList<EquipmentHolder>();
			List<Equipment> cardList = new ArrayList<Equipment>();
			int i = 0;
			while (true) {
				//service.retrieveAllEquipmentAndHolders(getTask().getObjectName(), holderList, cardList);
				holderList = service.retrieveAllEquipmentHolders(getTask().getObjectName());

				if (holderList == null || holderList.isEmpty()) {
				//	nbilog.error("holder is null : ne = "+getTask().getObjectName());
					Thread.sleep(10000l);
					holderList = service.retrieveAllEquipmentHolders(getTask().getObjectName());
				}


				if (holderList == null || holderList.isEmpty())
					nbilog.error("holder is null : ne = "+getTask().getObjectName());

				cardList = service.retrieveAllEquipments(getTask().getObjectName());
				if (checkHolders(holderList,cardList) || i++ == 5) {
					break;
				}
			}

			if (!checkHolders(holderList,cardList))
				nbilog.error(getTask().getObjectName()+" cardsize = "+cardList.size()+" holdersize = "+holderList.size());


			List<PTP> ptpList = service.retrieveAllPtps(this.getTask().getObjectName());
			if (holderList != null && holderList.size() > 0) {
				for (EquipmentHolder holder : holderList) {
					getSqliteConn().insertBObject(holder);
				}
			}

			if (cardList != null && cardList.size() > 0) {
				for (Equipment card : cardList) {
					getSqliteConn().insertBObject(card);
				}
			}

			try {
				String neKey = getTask().getObjectName().substring(getTask().getObjectName().lastIndexOf(":")+1).replaceAll(";","-");
				if (ptpList != null && !ptpList.isEmpty()) {
                    ObjectUtil.saveObject(service.getEmsName()+"/PTP-"+neKey,ptpList);
                } else {
                    ptpList = (List) ObjectUtil.readObject(service.getEmsName() + "/PTP-" + neKey);
                    if (ptpList == null) ptpList = new ArrayList<PTP>();
                }
			} catch (Exception e) {
				nbilog.error(e, e);
			}

			if (ptpList != null && ptpList.size() > 0) {
				for (PTP ptp : ptpList) {
					getSqliteConn().insertBObject(ptp);
				}
				if (option) {
					for (PTP ptp : ptpList) {
						try {
							List<CTP> ctpList = service.retrieveAllCtps(ptp.getDn());
							if (ctpList != null && ctpList.size() > 0) {
								for (CTP ctp : ctpList) {
									getSqliteConn().insertBObject(ctp);
								}
							}
						} catch (Exception e) {
							nbilog.error("PhysicalDataTask.excute Exception:", e);
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// System.out.println("end execute PhysicalDataTask : " + getTask().getObjectName()); // 1.1sync neData from ems via corba interface;
			// return neVec;
		}
		return null;

	}

	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

}
