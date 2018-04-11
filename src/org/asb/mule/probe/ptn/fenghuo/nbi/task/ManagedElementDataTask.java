package org.asb.mule.probe.ptn.fenghuo.nbi.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.ProtectionGroup;
import org.asb.mule.probe.framework.entity.TopoNode;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.service.SqliteConn;
import org.asb.mule.probe.framework.service.SqliteService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.ptn.fenghuo.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.VendorDNFactory;

import com.alcatelsbell.nms.valueobject.BObject;

import extendedMLSNMgr.ExtendedMLSNMgr_I;
import extendedMLSNMgr.TNProtectionGroupIterator_IHolder;
import extendedMLSNMgr.TNProtectionGroupList_THolder;
import extendedMLSNMgr.TNetworkProtectionGroup_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

public class ManagedElementDataTask extends CommonDataTask {
    public ManagedElementDataTask(SqliteConn sqliteConn) {
        this.setSqliteConn(sqliteConn);
        // TODO Auto-generated constructor stub

    }
	public Vector<BObject> excute() {

		try {
			List<TopoNode> node_ts = ((FenghuoService) service).retrieveAllTopoNodes();
			if (node_ts != null && node_ts.size() > 0) {
				nbilog.info("TopoNode : " + node_ts.size());
				for (TopoNode node : node_ts) {
					getSqliteConn().insertBObject(node);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 1.1sync neData from ems via corba interface;
		List<ManagedElement> neList = service.retrieveAllManagedElements();
		// System.out.println("managedelment list size = " + (neList == null ? null : neList.size()));
		// List<Section> sectionList = service.retrieveAllSections();

		// List<TrafficTrunk> trafficTrunkList = new ArrayList<TrafficTrunk>();
		// trafficTrunkList = service.retrieveAllTrafficTrunk();
		// System.out.println("trafficTrunkList size = " + trafficTrunkList.size());

		// List<FlowDomainFragment> fdrsList = service.retrieveAllFdrs();
		// System.out.println("fdrsList size = " + fdrsList.size());

		Vector<BObject> neVec = new Vector<BObject>();

		// 1.2 get data from local db
		// String sql = "select c from "+ManagedElement.class.getSimpleName()+ " as c where c.parentDn = '"+service.getEmsName()+"'";

		// 2.1 generate insertData

		// HashMap data = new HashMap();
		try {
			if (neList != null && neList.size() > 0) {
				nbilog.info("ManagedElement : " + neList.size());
				// System.out.println("111111111 nelistsize = " + neList.size());
				for (ManagedElement ne : neList) {
					// System.out.println("-- neVec.add(ne);");
					getSqliteConn().insertBObject(ne);
					// System.out.println("22 neVec.add(ne);");
					neVec.add(ne);
					// System.out.println("neVec.add(ne);");
				}

				// List<IPCrossconnection> totalIpCCList = new ArrayList<IPCrossconnection>();
				// for (ManagedElement ne : neList) {

				// List<IPCrossconnection> ipccList = service.retrieveAllCrossconnections(ne.getDn());
				// System.out.println(ne.getDn() + " ccsize = " + (ipccList == null ? null : ipccList.size()));
				// totalIpCCList.addAll(ipccList);
				// }
				// System.out.println(" totalIpCCList size  = " + (totalIpCCList == null ? null : totalIpCCList.size()));
				// if (totalIpCCList != null && totalIpCCList.size() > 0) {
				// for (IPCrossconnection ipcc : totalIpCCList) {
				// SqliteService.getInstance().insertBObject(ipcc);
				// neVec.add(ipcc);
				// }
				// }

				// if (sectionList != null && sectionList.size() > 0) {
				// for (Section section : sectionList) {
				// SqliteService.getInstance().insertBObject(section);
				// neVec.add(section);
				// }
				// }
				//
				// if (trafficTrunkList != null && trafficTrunkList.size() > 0) {
				// for (TrafficTrunk trafficTrunk : trafficTrunkList) {
				// SqliteService.getInstance().insertBObject(trafficTrunk);
				//
				// List<IPRoute> routes = trafficTrunk.getRoutes();
				// if (routes != null) {
				// for (int i = 0; i < routes.size(); i++) {
				// IPRoute ipRoute = routes.get(i);
				// SqliteService.getInstance().insertBObject(ipRoute);
				// }
				// }
				// neVec.add(trafficTrunk);
				// }
				// }
				//
				// if (fdrsList != null && fdrsList.size() > 0) {
				// for (FlowDomainFragment fdrs : fdrsList) {
				// SqliteService.getInstance().insertBObject(fdrs);
				// neVec.add(fdrs);
				// }
				// }

			}

		} catch (Throwable e) {
			// System.out.println("Exception : " + e);
			e.printStackTrace();
		}
		// System.out.println("neVec  size = " + (neVec == null ? null : neVec.size()));
		return neVec;

	}

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	private List<ProtectionGroup> retrieveAllProtectionGroup(CorbaService corbaService) throws Exception {
		ExtendedMLSNMgr_I extendedMLSNMgrI = corbaService.getNmsSession().getExtendedMLSNMgrI();
		System.out.println("extendedMLSNMgrI = " + extendedMLSNMgrI);
		NameAndStringValue_T[] subnetDn = VendorDNFactory.createSubnetworkDN("JH-OTNM2000-1-PTN", "1");
		TNProtectionGroupList_THolder tnProtectionGroupList_tHolder = new TNProtectionGroupList_THolder();
		String[] pgs = new String[] { "SNCP", "OTHER" };
		List<TNetworkProtectionGroup_T> list = new ArrayList();
		for (int i = 0; i < pgs.length; i++) {
			String pg = pgs[i];
			System.out.println("pg = " + pg);

			try {
				TNProtectionGroupIterator_IHolder tnProtectionGroupIterator_iHolder = new TNProtectionGroupIterator_IHolder();
				extendedMLSNMgrI.getTNetworkProtectionGroups(subnetDn, pg, 200, tnProtectionGroupList_tHolder, tnProtectionGroupIterator_iHolder);

				for (int j = 0; j < tnProtectionGroupList_tHolder.value.length; j++) {
					list.add(tnProtectionGroupList_tHolder.value[i]);
				}

				if (tnProtectionGroupIterator_iHolder.value != null) {
					boolean hasMore;
					do {
						hasMore = tnProtectionGroupIterator_iHolder.value.next_n(200, tnProtectionGroupList_tHolder);

						for (int j = 0; j < tnProtectionGroupList_tHolder.value.length; j++) {
							list.add(tnProtectionGroupList_tHolder.value[j]);
						}
					} while (hasMore);

					try {
						tnProtectionGroupIterator_iHolder.value.destroy();
					} catch (Throwable ex) {

					}
				}

			} catch (Exception e) {
				if (e instanceof ProcessingFailureException)
					System.out.println(((ProcessingFailureException) e).errorReason);
				e.printStackTrace();
			}

		}

		// return list;
		return transProtectGroup(list);

	}

	public List transProtectGroup(List<TNetworkProtectionGroup_T> list) {
		ArrayList<ProtectionGroup> gps = new ArrayList<ProtectionGroup>();
		for (int i = 0; i < list.size(); i++) {
			TNetworkProtectionGroup_T vendorEntity = list.get(i);
			ProtectionGroup pg = new ProtectionGroup();
			if (vendorEntity.name.length == 2)
				pg.setDn(vendorEntity.name[0].value + Constant.dnSplit + vendorEntity.name[1].value);
			else if (vendorEntity.name.length >= 3)
				pg.setDn(vendorEntity.name[0].value + Constant.dnSplit + vendorEntity.name[1].value + Constant.dnSplit + vendorEntity.name[3].value);

			// pg.setParentDn(mapperParentDnNameAndStringValue(vendorEntity.name));
			pg.setEmsName(vendorEntity.name[0].value);
			pg.setOwner(vendorEntity.owner);
			pg.setProtectionSchemeState(vendorEntity.protectionSchemeState.value() + "");
			pg.setNativeEMSName(CodeTool.isoToGbk(vendorEntity.nativeEMSName));
			pg.setUserLabel(CodeTool.isoToGbk(vendorEntity.userLabel));
			pg.setPgpParameters(mapperNameAndStringValue(vendorEntity.pgpParameters));
			pg.setProtectedList(mapperNameAndStringValues(vendorEntity.sncProtectedNameList));
			pg.setProtectingList(mapperNameAndStringValues(vendorEntity.sncProtectingNameList));
			pg.setProtectionGroupType((vendorEntity.protectionGroupType).value() + "");

			gps.add(pg);
			// pg.setReversionMode(mapperMode(vendorEntity.reversionMode));
		}
		return gps;
	}

	protected String mapperNameAndStringValues(NameAndStringValue_T[][] object) {
		StringBuffer sb = new StringBuffer();
		for (NameAndStringValue_T[] ns : object) {
			sb.append(mapperNameAndStringValue(ns));
			sb.append(Constant.listSplit);
		}
		return sb.toString();
	}

	protected String mapperNameAndStringValue(NameAndStringValue_T[] object) {
		StringBuffer sb = new StringBuffer();
		for (NameAndStringValue_T nst : object) {
			// sb.append(nst.name);
			// sb.append(Constant.namevalueSplit);
			sb.append(nst.value);
			sb.append(Constant.dnSplit);
		}
		if (object.length > 0) {
			return sb.toString().trim().substring(0, sb.toString().trim().length() - 1);

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		List list = (List) com.alcatelsbell.nms.util.ObjectUtil.readObjectByPath("d:\\work\\ptlist_SNCP");
		ManagedElementDataTask task = new ManagedElementDataTask(null);
		List<ProtectionGroup> pgs = task.transProtectGroup(list);

	}

}
