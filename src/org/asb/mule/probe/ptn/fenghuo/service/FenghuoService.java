package org.asb.mule.probe.ptn.fenghuo.service;

import com.alcatelsbell.cdcp.nodefx.exception.EmsDataIllegalException;
import com.alcatelsbell.cdcp.nodefx.exception.EmsFunctionInvokeException;
import equipment.EquipmentHolder_T;
import equipment.EquipmentOrHolder_T;
import equipment.EquipmentTypeQualifier_T;
import equipment.Equipment_T;
import extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder;
import extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T;
import extendedMLSNMgr.TNetworkProtectionGroup_T;
import flowDomain.FlowDomain_T;
import flowDomainFragment.FDFrRoute_THolder;
import flowDomainFragment.FlowDomainFragment_T;
import flowDomainFragment.MatrixFlowDomainFragment_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.util.*;

import managedElement.ManagedElement_T;
import multiLayerSubnetwork.MultiLayerSubnetwork_T;

import org.asb.mule.probe.framework.entity.CTP;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.FlowDomain;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.entity.ProtectionGroup;
import org.asb.mule.probe.framework.entity.R_FTP_PTP;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.SubnetworkConnection;
import org.asb.mule.probe.framework.entity.TopoNode;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.entity.TrailNtwProtection;
import org.asb.mule.probe.framework.service.NbiService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.fenghuo.sbi.mgrhandler.*;
import org.asb.mule.probe.ptn.fenghuo.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.CtpMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.EquipmentHolderMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.EquipmentMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.FlowDomainFragmentMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.FlowDomainMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.IPCrossconnectionMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.ManagedElementMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.ProtectGroupMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.PtpMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.SectionMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.SubnetworkConnectionMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.TopoNodeMapper;
import org.asb.mule.probe.ptn.fenghuo.service.mapper.VendorDNFactory;
import org.asb.mule.probe.ptn.fenghuo.sbi.mgrhandler.ManagedElementMgrHandler;
import org.asb.mule.probe.ptn.fenghuo.sbi.mgrhandler.ProtectionMgrHandler;

import subnetworkConnection.*;
import terminationPoint.TerminationPoint_T;
import topologicalLink.TopologicalLinkIterator_IHolder;
import topologicalLink.TopologicalLink_T;
import trailNtwProtection.TrailNtwProtection_T;

import com.alcatelsbell.nms.util.ObjectUtil;

public class FenghuoService implements NbiService {

	private CorbaService corbaService;
	private FileLogger sbilog = null;
	private FileLogger errorlog = null;

	private String key;

	public String getServiceName() {

		return corbaService.getEmsName();

	}

	public FenghuoService() {
	}

	@Override
	public String getEmsName() {
		// TODO Auto-generated method stub
		sbilog = corbaService.getSbilog();
		errorlog = corbaService.getErrorlog();

		return corbaService.getEmsName();
	}

	public void setCorbaService(CorbaService corbaService) {
		sbilog = corbaService.getSbilog();
		errorlog = corbaService.getErrorlog();
		this.corbaService = corbaService;
	}

	public CorbaService getCorbaService() {
		return corbaService;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public boolean ping() {

		return corbaService.getNmsSession().isEmsSessionOK();
	}

	public String getKey() {
		return key;
	}

	public List<TopoNode> retrieveAllTopoNodes() {
		List<TopoNode> topoList = new ArrayList<TopoNode>();
		// MultiLayerSubnetwork_T[] nodes = null;
		// NameAndStringValue_T[] subnetwrokName = VendorDNFactory.createSubnetworkDN(getEmsName(), "1");
		// try {
		// nodes = SubnetworkMgrHandler.instance().retrieveAllSubordinateMLSNs(corbaService.getNmsSession().getMultiLayerSubnetworkMgr(), subnetwrokName);
		// } catch (ProcessingFailureException e) {
		// errorlog.error("retrieveAllSubordinateMLSNs ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		// } catch (org.omg.CORBA.SystemException e) {
		// errorlog.error("retrieveAllSubordinateMLSNs CORBA.SystemException: " + e.getMessage(), e);
		// }
		// if (nodes != null) {
		// for (MultiLayerSubnetwork_T node : nodes) {
		// try {
		// NameAndStringValue_T[][] nes = null;
		// try {
		// nes = SubnetworkMgrHandler.instance().retrieveAllManagedElementNames(corbaService.getNmsSession().getMultiLayerSubnetworkMgr(),
		// node.name);
		// } catch (ProcessingFailureException e) {
		// errorlog.error("retrieveAllManagedElementNames ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		// } catch (org.omg.CORBA.SystemException e) {
		// errorlog.error("retrieveAllManagedElementNames CORBA.SystemException: " + e.getMessage(), e);
		// }
		//
		// for (NameAndStringValue_T[] ne : nes) {
		// try {
		// TopoNode to = TopoNodeMapper.instance().convertTopoNode(ne, node.name);
		// // sbilog.info("node : " + to.getDn() + "##" + to.getParent());
		// topoList.add(to);
		// } catch (Exception e) {
		// errorlog.error("retrieveAllTopoNodes convertException: ", e);
		// }
		// }
		//
		// sbilog.info("retrieveAllTopoNodes : " + node);
		// TopoNode ne = TopoNodeMapper.instance().convertTopoNode(node, subnetwrokName);
		// topoList.add(ne);
		//
		// } catch (Exception e) {
		// errorlog.error("retrieveAllTopoNodes convertException: ", e);
		// }
		// }
		// }
		// sbilog.info("retrieveAllTopoNodes : " + topoList.size());

		// 浙江移动客戶需求根据NEid解析
		ManagedElement_T[] vendorNeList = null;
		List<ManagedElement> neList = new ArrayList<ManagedElement>();
		try {
			vendorNeList = ManagedElementMgrHandler.instance().retrieveAllManagedElements(corbaService.getNmsSession().getManagedElementMgr());
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllManagedElements ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllManagedElements CORBA.SystemException: " + e.getMessage(), e);
		}
		HashMap<String, String> neblockMap = new HashMap<String, String>();
		if (vendorNeList != null) {
			for (ManagedElement_T vendorNe : vendorNeList) {
				try {
					if (vendorNe.nativeEMSName.endsWith("XNWY")) {
						continue;
					}
					String neblockdn = null;
					try {
						neblockdn = TopoNodeMapper.instance().getNeblockdn(vendorNe.name);
					} catch (Exception e) {
						errorlog.error(e, e);
					}
					if (neblockdn != null) {
						neblockMap.put(neblockdn, CodeTool.isoToGbk(vendorNe.nativeEMSName).split("_")[0]);
					}
					sbilog.info("convet ne : "+CodeTool.isoToGbk(vendorNe.nativeEMSName)+" to neblock:"+neblockdn+" name="+neblockMap.get(neblockdn));
					TopoNode subne = TopoNodeMapper.instance().convertTopoNode(TopoNodeMapper.instance().nv2dn(vendorNe.name), neblockdn, null);
					topoList.add(subne);
				} catch (Exception e) {
					errorlog.error("retrieveAllManagedElements convertException: ", e);
				}
			}
		}
		Set<String> set = neblockMap.keySet();
		for (String neblock : set) {
			TopoNode subne = TopoNodeMapper.instance().convertTopoNode(neblock, null, neblockMap.get(neblock));
			topoList.add(subne);
		}

		return topoList;
	}

	// 1.锟斤拷去锟斤拷锟斤拷锟斤拷元
	public List<ManagedElement> retrieveAllManagedElements() {
		ManagedElement_T[] vendorNeList = null;
		List<ManagedElement> neList = new ArrayList();
		try {
			
			if (corbaService.getNmsSession().getTrailNtwProtMgr() == null) {
				sbilog.info("retrieveAllTrailNtwProtection: getTrailNtwProtMgr is null");
			} else {
				sbilog.info("retrieveAllTrailNtwProtection: getTrailNtwProtMgr.class is --" + corbaService.getNmsSession().getTrailNtwProtMgr().getClass().toString());
//				corbaService.getNmsSession().getTrailNtwProtMgr().getClass();
			}
			
			vendorNeList = ManagedElementMgrHandler.instance().retrieveAllManagedElements(corbaService.getNmsSession().getManagedElementMgr());
		} catch (ProcessingFailureException e) {
			corbaService.handleException(new EmsFunctionInvokeException("retrieveAllManagedElements",e));

			errorlog.error("retrieveAllManagedElements ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			corbaService.handleException(new EmsFunctionInvokeException("retrieveAllManagedElements",e));

			errorlog.error("retrieveAllManagedElements CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorNeList == null || vendorNeList.length == 0)
			corbaService.handleException(new EmsDataIllegalException("Managedelement",null," size = 0 "));
		if (vendorNeList != null && vendorNeList.length > 0) {
			corbaService.handleExceptionRecover(EmsDataIllegalException.EXCEPTION_CODE+"Managedelement");
			corbaService.handleExceptionRecover(EmsFunctionInvokeException.EXCEPTION_CODE+"retrieveAllManagedElements");

			for (ManagedElement_T vendorNe : vendorNeList) {
				try {
					sbilog.info("vendorNe : " + CodeTool.isoToGbk(vendorNe.nativeEMSName));
					if (vendorNe.nativeEMSName.endsWith("XNWY")) {
						sbilog.info("VirtualNE : " + vendorNe);
						continue;
					}
					ManagedElement ne = ManagedElementMapper.instance().convertManagedElement(vendorNe);
					neList.add(ne);
				} catch (Exception e) {
					errorlog.error("retrieveAllManagedElements convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllManagedElements : " + neList.size());
		return neList;
	}

	/**
	 * 2.锟斤拷去某锟斤拷元锟斤拷锟斤拷锟叫诧拷锟斤拷
	 * 
	 * @return
	 */
	public List<Equipment> retrieveAllEquipments(String neName) {
		Equipment_T[] vendorCardList = null;
		List<Equipment> cardList = new ArrayList<Equipment>();
		try {
			// String[] neNameList = neName.split(Constant.dnSplit);
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);

			vendorCardList = EquipmentInventoryMgrHandler.instance().retrieveAllEquipments(corbaService.getNmsSession().getEquipmentInventoryMgr(), neDn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllEquipments ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		}
		if (vendorCardList != null) {
			for (Equipment_T vendorCard : vendorCardList) {
				try {
					Equipment card = EquipmentMapper.instance().convertEquipment(vendorCard, neName);
					cardList.add(card);
				} catch (Exception e) {
					errorlog.error("retrieveAllEquipments convertException: ", e);
				}

			}
		}
		sbilog.info("retrieveAllEquipments : " + cardList.size());
		return cardList;

	}

	/**
	 * 3.锟斤拷去某锟斤拷元锟斤拷锟斤拷锟叫熫匡拷锟�
	 * 
	 * @return
	 */
	public List<EquipmentHolder> retrieveAllEquipmentHolders(String neName) {
		EquipmentHolder_T[] vendorHolderList = null;
		List<EquipmentHolder> holderList = new ArrayList();
		try {

			// String[] neNameList = neName.split(Constant.dnSplit);
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);

			vendorHolderList = EquipmentInventoryMgrHandler.instance().retrieveAllEquipmentHolders(corbaService.getNmsSession().getEquipmentInventoryMgr(),
					neDn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllEquipmentHolders ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		}
		if (vendorHolderList != null) {
			for (EquipmentHolder_T vendorHolder : vendorHolderList) {
				try {
					EquipmentHolder card = EquipmentHolderMapper.instance().convertEquipmentHolder(vendorHolder, neName);
					holderList.add(card);
				} catch (Exception e) {
					errorlog.error("retrieveAllEquipmentHolders convertException: ", e);
				}

			}
		}
		sbilog.info("retrieveAllEquipmentHolders : " + holderList.size());
		return holderList;
	}
	public List<Equipment> retrieveAllEquipmentAndHolders(String neName) throws ProcessingFailureException {
		NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
		EquipmentOrHolder_T[] equipments = EquipmentInventoryMgrHandler.instance().retrieveAllEquipmentAndHolders(
				corbaService.getNmsSession().getEquipmentInventoryMgr(), neDn);
		sbilog.info("equipmentOrHolderList: " + equipments == null ? "null":equipments.length);
		List<Equipment> list = new ArrayList<Equipment>();
		if (equipments != null) {
			EquipmentHolderMapper mapper = new EquipmentHolderMapper();
			sbilog.info("equipmentOrHolderList: " + equipments.length);
			for (EquipmentOrHolder_T equipment : equipments) {

				Equipment equipment1 = new Equipment();
				equipment1.setDn((equipment.discriminator().value()+""));
				list.add(equipment1);
			}
		}
		return list;
	}

	public void retrieveAllEquipmentAndHolders(String neName, List<EquipmentHolder> equipmentHolderList, List<Equipment> equipmentList) {
		EquipmentOrHolder_T[] equipmentOrHolderList = null;
		NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
		try {
			equipmentOrHolderList = EquipmentInventoryMgrHandler.instance().retrieveAllEquipmentAndHolders(
					corbaService.getNmsSession().getEquipmentInventoryMgr(), neDn);
			if (equipmentOrHolderList != null)
				sbilog.info("equipmentOrHolderList: " + equipmentOrHolderList.length);

		} catch (ProcessingFailureException e) {
			errorlog.error(neName + " retrieveAllEquipmentAndHolders ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error(neName + " retrieveAllEquipmentAndHolders CORBA.SystemException: " + e.getMessage(), e);
		}
		List<NameAndStringValue_T[]> shelflist = new ArrayList<NameAndStringValue_T[]>();
		if (equipmentOrHolderList != null) {
			for (EquipmentOrHolder_T equipmentOrHolder : equipmentOrHolderList) {
				try {
					if (equipmentOrHolder.discriminator().equals(EquipmentTypeQualifier_T.EQT_HOLDER)) {
						String holderType = equipmentOrHolder.holder().holderType;
						if (holderType != null && !holderType.equals("slot")) {
							if (holderType.equals("shelf")) {
								shelflist.add(equipmentOrHolder.holder().name);
							}
							EquipmentHolder holder = EquipmentHolderMapper.instance().convertEquipmentHolder(equipmentOrHolder.holder(), neName);
							equipmentHolderList.add(holder);
						}

					} else if (equipmentOrHolder.discriminator().equals(EquipmentTypeQualifier_T.EQT)) {
						Equipment card = EquipmentMapper.instance().convertEquipment(equipmentOrHolder.equip(), neName);
						equipmentList.add(card);
					}
				} catch (Exception e) {
					errorlog.error("retrieveAllEquipmentAndHolders convertException: ", e);
				}
			}
		}
		// 现网只上报了有单板的槽位，getContainedEquipment取所有的slot
		EquipmentOrHolder_T[] containedEquipments = null;
		for (NameAndStringValue_T[] shelfname : shelflist) {
			try {
				containedEquipments = EquipmentInventoryMgrHandler.instance().retrieveContainedEquipments(
						corbaService.getNmsSession().getEquipmentInventoryMgr(), shelfname);
			} catch (ProcessingFailureException e) {
				errorlog.error(neName + " retrieveAllEquipmentAndHolders ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			} catch (org.omg.CORBA.SystemException e) {
				errorlog.error(neName + " retrieveAllEquipmentAndHolders CORBA.SystemException: " + e.getMessage(), e);
			}
		}
		if (containedEquipments != null) {
			for (EquipmentOrHolder_T equipmentOrHolder : containedEquipments) {
				try {
					EquipmentHolder holder = EquipmentHolderMapper.instance().convertEquipmentHolder(equipmentOrHolder.holder(), neName);
					equipmentHolderList.add(holder);
				} catch (Exception e) {
					errorlog.error("retrieveAllEquipmentAndHolders convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllEquipmentAndHolders EquipmentHolders: " + equipmentHolderList.size());
		sbilog.info("retrieveAllEquipmentAndHolders Equipments: " + equipmentList.size());

	}

	/**
	 * 4.锟斤拷去某锟斤拷元锟斤拷锟斤拷锟叫溗匡拷
	 * 
	 * @return
	 */
	public List<PTP> retrieveAllPtps(String neName) {
		TerminationPoint_T[] vendorPtpList = null;
		List<PTP> ptpList = new ArrayList();
		try {
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);

			short[] tpLayerRateList = new short[0];
			short[] connectionLayerRateList = new short[0];
			vendorPtpList = ManagedElementMgrHandler.instance().retrieveAllPTPs(corbaService.getNmsSession().getManagedElementMgr(), neDn, tpLayerRateList,
					connectionLayerRateList);

		} catch (ProcessingFailureException e) {
			errorlog.error(neName + " retrieveAllPtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error(neName + " retrieveAllPtps CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorPtpList != null) {
			for (TerminationPoint_T vendorPtp : vendorPtpList) {
				try {
					// sbilog.info("ptp : " + vendorPtp);
					// TerminationPoint_T[] vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedCurrentTPs(
					// corbaService.getNmsSession().getManagedElementMgr(), vendorPtp.name, new short[0]);
					// for (TerminationPoint_T ctp : vendorCtpList) {
					// sbilog.info("ctp : " + ctp);
					// }
					PTP ptp = PtpMapper.instance().convertPtp(vendorPtp, neName);
					ptpList.add(ptp);
				} catch (Exception e) {
					errorlog.error("retrieveAllPtps convertException: ", e);
				}
			}
		}

		if (neName.equals("EMS:JH-OTNM2000-1-PTN@ManagedElement:134220892;76033")) {
			if (vendorPtpList != null) {
				ObjectUtil.saveObject("testptps",vendorPtpList);
				ObjectUtil.saveObject("testptps2",ptpList);
			}
		}

		sbilog.info("retrieveAllPtps : " + ptpList.size());
		return ptpList;
	}

	public Vector<String> retrieveAllPtpNames(String neName) {
		TerminationPoint_T[] vendorPtpList = null;

		try {
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);

			short[] tpLayerRateList = new short[0];
			short[] connectionLayerRateList = new short[0];
			Vector names  = ManagedElementMgrHandler.instance().retrieveAllPTPNames(corbaService.getNmsSession().getManagedElementMgr(), neDn, tpLayerRateList,
					connectionLayerRateList);
			return  names;
		} catch (ProcessingFailureException e) {
			errorlog.error(neName + " retrieveAllPtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error(neName + " retrieveAllPtps CORBA.SystemException: " + e.getMessage(), e);
		}
		return new Vector();

	}

	@Override
	public List<R_FTP_PTP> retrieveAllPTPsByFtp(String ftpName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 5.锟斤拷去某锟斤拷元锟斤拷锟斤拷锟斤拷CTP
	 * 
	 * @return
	 */

	public List<CTP> retrieveAllCtps(String ptpName) {
		long t1 = System.currentTimeMillis();
		TerminationPoint_T[] vendorCtpList = null;
		List<CTP> ctpList = new ArrayList();
		try {
			// String[] ptpNameList = ptpName.split(Constant.dnSplit);
			// String[]
			// ptpNameList2=(ptpNameList.length==3?(ptpNameList[2].split(Constant.namevalueSplit)):null);
			NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);

			vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedPotentialTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
					new short[0]);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		}
		if (vendorCtpList != null) {
			for (TerminationPoint_T vendorctp : vendorCtpList) {
				try {
					CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
					ctpList.add(ctp);
				} catch (Exception e) {
					errorlog.error("retrieveAllCtps convertException: ", e);
				}
			}
		}
		long t2 = System.currentTimeMillis() - t1;
		sbilog.info("retrieveAllCtps : " + ctpList.size()+" spend : "+(t2)+"ms");

		return ctpList;
	}


	public List<CTP> retrieveAllCurrentCtps(String ptpName) {
		long t1 = System.currentTimeMillis();
		TerminationPoint_T[] vendorCtpList = null;
		List<CTP> ctpList = new ArrayList();
		try {
			// String[] ptpNameList = ptpName.split(Constant.dnSplit);
			// String[]
			// ptpNameList2=(ptpNameList.length==3?(ptpNameList[2].split(Constant.namevalueSplit)):null);
			NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);

			vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedCurrentTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
					new short[0]);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		}
		if (vendorCtpList != null) {
			for (TerminationPoint_T vendorctp : vendorCtpList) {
				try {
					CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
					ctpList.add(ctp);
				} catch (Exception e) {
					errorlog.error("retrieveAllCtps convertException: ", e);
				}
			}
		}
		long t2 = System.currentTimeMillis() - t1;
		sbilog.info("retrieveAllCurrentCtps : " + ctpList.size()+" spend "+t2+"ms");
		return ctpList;
	}

	public List<CTP> retrieveAllInUseCtps(String ptpName) {
		TerminationPoint_T[] vendorCtpList = null;
		List<CTP> ctpList = new ArrayList();
		try {
			// String[] ptpNameList = ptpName.split(Constant.dnSplit);
			// String[]
			// ptpNameList2=(ptpNameList.length==3?(ptpNameList[2].split(Constant.namevalueSplit)):null);
			NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);

			vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedInUseTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
					new short[0]);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		}
		if (vendorCtpList != null) {
			for (TerminationPoint_T vendorctp : vendorCtpList) {
				try {
					CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
					ctpList.add(ctp);
				} catch (Exception e) {
					errorlog.error("retrieveAllCtps convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCtps : " + ctpList.size());
		return ctpList;
	}
	/**
	 * 7.锟斤拷去ems锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟接滐拷
	 * 
	 * @return
	 */
	public List<Section> retrieveAllSections() {
		TopologicalLink_T[] vendorSectionList = null;
		List<Section> sectionList = new ArrayList();
		NameAndStringValue_T[] subnetDn = VendorDNFactory.createSubnetworkDN(getEmsName(), "1");
		try {
			vendorSectionList = SubnetworkMgrHandler.instance().retrieveAllTopologicalLinks(corbaService.getNmsSession().getMultiLayerSubnetworkMgr(),
					subnetDn, errorlog);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllSections ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllSections CORBA.SystemException: " + e.getMessage(), e);
		}
		List<String> vneID = new ArrayList<String>();
		try {
			ManagedElement_T[] vendorNeList = ManagedElementMgrHandler.instance().retrieveAllManagedElements(
					corbaService.getNmsSession().getManagedElementMgr());
			for (ManagedElement_T ne : vendorNeList) {
				if (ne.nativeEMSName.endsWith("XNWY")) {
					vneID.add(ne.name[1].value);
				}
			}
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllManagedElements ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllManagedElements CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorSectionList != null) {
			for (TopologicalLink_T vendorSection : vendorSectionList) {
				try {
					if (vneID.contains(vendorSection.aEndTP[1].value) || vneID.contains(vendorSection.zEndTP[1].value)) {
						sbilog.info("VirtualSection : " + vendorSection);
						continue;
					}
					Section section = SectionMapper.instance().convertSection(vendorSection, subnetDn);
					sectionList.add(section);
				} catch (Exception e) {
					errorlog.error("retrieveAllSections convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllSections : " + sectionList.size());
		return sectionList;
	}

	/**
	 * 8.锟斤拷去ems锟斤拷锟斤拷锟斤拷锟斤拷锟�锟斤拷锟斤拷锟斤拷什锟斤拷t_mpls(309)锟斤拷
	 * 
	 * @return
	 */
	public List<TrafficTrunk> retrieveAllTrafficTrunk() {
		// List<TrafficTrunk> fdrList = new ArrayList<TrafficTrunk>();
		// try {
		// NameAndStringValue_T[] fdDn = VendorDNFactory.createFlowDomainDN(corbaService.getEmsDn(), "1");
		// short[] rates = new short[] { 309, 1500, 96, 5 };
		// for (short rate : rates) {
		// FlowDomainFragment_T[] fdfrs = null;
		// try {
		// short[] layer = new short[] { rate };
		// fdfrs = FlowDomainMgrHandler.instance().retrieveAllFDFrs(corbaService.getNmsSession().getFlowDomainMgr(), layer, fdDn, errorlog);
		// } catch (ProcessingFailureException e) {
		// errorlog.error("retrieveAllTrafficTrunk ProcessingFailureException: rate=[ " + rate + " ] : " + CodeTool.isoToGbk(e.errorReason), e);
		// } catch (org.omg.CORBA.SystemException e) {
		// errorlog.error("retrieveAllTrafficTrunk CORBA.SystemException: " + e.getMessage(), e);
		// }
		//
		// if (fdfrs != null) {
		// sbilog.info("AllTrafficTrunk " + rate + " COUNTS: " + fdfrs.length);
		// for (FlowDomainFragment_T vendorFdr : fdfrs) {
		// try {
		// TrafficTrunk trafficTrunk = TrafficTrunkMapper.instance().convertTrafficTrunk(vendorFdr);
		// trafficTrunk.setTag2(String.valueOf(rate));
		//
		// fdrList.add(trafficTrunk);
		// sbilog.info("DN: " + trafficTrunk.getTag1());
		//
		// } catch (Exception e) {
		// errorlog.error("retrieveAllTrafficTrunk convertException: ", e);
		// }
		// }
		// }
		// }
		// sbilog.info("AllTrafficTrunk COUNTS: " + fdrList.size());
		// } catch (Exception e) {
		// errorlog.error("retrieveAllTrafficTrunk Exception: ", e);
		// }
		// return fdrList;
		return null;
	}

	/**
	 * 9.锟斤拷去ems锟斤拷锟斤拷锟斤拷喂锟斤拷 喂锟斤拷锟斤拷锟绞诧拷锟絫_mpls_chl(1500)
	 * 
	 * @return
	 */
	public List<FlowDomainFragment> retrieveAllFdrs() {
		List<FlowDomainFragment> fdrList = new ArrayList<FlowDomainFragment>();
		FlowDomain_T[] fds = null;
		try {
			fds = FlowDomainMgrHandler.instance().retrieveAllFlowDomains(corbaService.getNmsSession().getFlowDomainMgr());
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllFdrs.retrieveAllFlowDomains ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllFdrs.retrieveAllFlowDomains CORBA.SystemException: " + e.getMessage(), e);
		}
		if (fds != null) {
			for (FlowDomain_T fd : fds) {
				short[] rates = new short[] { 309, 1500, 96, 5 };
				for (short rate : rates) {
					FlowDomainFragment_T[] fdfrs = null;
					try {
						short[] layer = new short[] { rate };
						fdfrs = FlowDomainMgrHandler.instance().retrieveAllFDFrs(corbaService.getNmsSession().getFlowDomainMgr(), layer, fd.name, errorlog);
					} catch (ProcessingFailureException e) {
						errorlog.error("retrieveAllFdrs ProcessingFailureException: rate=[ " + rate + " ] : " + CodeTool.isoToGbk(e.errorReason), e);
					} catch (org.omg.CORBA.SystemException e) {
						errorlog.error("retrieveAllFdrs CORBA.SystemException: " + e.getMessage(), e);
					}
					if (fdfrs != null) {
						sbilog.info("AllFdrs " + rate + " COUNTS: " + fdfrs.length);
						for (FlowDomainFragment_T vendorFdr : fdfrs) {
							try {
								FlowDomainFragment fdr = FlowDomainFragmentMapper.instance().convertFlowDomainFragment(vendorFdr);
								fdr.setRate(String.valueOf(rate));
								fdrList.add(fdr);
							} catch (Exception e) {
								errorlog.error("retrieveAllFdrs convertException: " + vendorFdr, e);
							}
						}
					}
				}
			}
		}
		sbilog.info("AllTrafficTrunk COUNTS: " + fdrList.size());
		return fdrList;
	}

	/**
	 * 10.锟斤拷去锟斤拷细隆锟斤拷
	 */

	/**
	 * 11.锟矫碉拷锟斤拷锟斤拷flowdomain
	 */
	public List<FlowDomain> retrieveAllFlowDomain() {

		FlowDomain_T[] vendorFdList = null;
		List<FlowDomain> fdList = new ArrayList();
		try {

			vendorFdList = FlowDomainMgrHandler.instance().retrieveAllFlowDomains(corbaService.getNmsSession().getFlowDomainMgr());

			sbilog.info("retrieveAllFlowDomain : " + vendorFdList.length);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllFlowDomain ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		}
		if (vendorFdList != null) {
			for (FlowDomain_T vendorFd : vendorFdList) {
				try {
					FlowDomain fd = FlowDomainMapper.instance().convertFlowDomain(vendorFd);
					fdList.add(fd);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}

		return fdList;
	}

	@Override
	public boolean connect() {
		return corbaService.connect();

	}

	@Override
	public boolean disconnect() {
		return corbaService.disconnect();
	}

	@Override
	public boolean getConnectState() {
		// TODO Auto-generated method stub
		return corbaService.isConnectState();
	}

	@Override
	public String getLastestDayMigrationJobName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IPCrossconnection> retrieveAllFDFrsInMe(String meDn) {
		NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(meDn);
		List<IPCrossconnection> ipCrossconnections = new ArrayList<IPCrossconnection>();
		ExMatrixFlowDomainFragment_T[] exMatrixFlowDomainFragment_ts = new ExMatrixFlowDomainFragment_T[0];
		try {
			exMatrixFlowDomainFragment_ts = ExtendFlowDomainMgrHandler.instance().retrieveAllFDFrsInMe
                    (corbaService.getNmsSession().getExtendFlowDomainMgr(), new short[0], neDn);
		} catch (ProcessingFailureException e) {
			errorlog.error(e, e);
		}
		if (exMatrixFlowDomainFragment_ts != null) {
			for (ExMatrixFlowDomainFragment_T ex : exMatrixFlowDomainFragment_ts) {
				IPCrossconnection ipCrossconnection = IPCrossconnectionMapper.instance().convertIPCrossConnection(ex, meDn);
				ipCrossconnection.setTag1("FdfrsInMe");
				ipCrossconnections.add(ipCrossconnection);
			}
		}
		return ipCrossconnections;
	}

	@Override
	public List<IPCrossconnection> retrieveRoute(String trafficTrunkName) {
		List<IPCrossconnection> IPCrossconnectionList = new ArrayList<IPCrossconnection>();
		ExMatrixFlowDomainFragment_T[] routes = null;
		NameAndStringValue_T[] ttname = VendorDNFactory.createCommonDN(trafficTrunkName);
		ExMatrixFlowDomainFragmentList_THolder routeHolder = new ExMatrixFlowDomainFragmentList_THolder();
		long start = System.currentTimeMillis();
		sbilog.debug("retrieveRoute :start " + trafficTrunkName);
		try {
			corbaService.getNmsSession().getExtendFlowDomainMgr().getExFDFrRoute(ttname, routeHolder);
			routes = routeHolder.value;
		} catch (ProcessingFailureException e) {
			errorlog.error(trafficTrunkName + " retrieveRoute ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error(trafficTrunkName + " retrieveRoute CORBA.SystemException: " + e.getMessage(), e);
		}
		sbilog.debug("retrieveRoute :end " + trafficTrunkName);
		long end = System.currentTimeMillis();
		long sub = end - start;
		sbilog.info("retrieveRoute : " + sub + "ms Tunnel: " + trafficTrunkName);
		if (sub > 60000) {
			sbilog.info("retrieveRoute1 : " + sub + "ms Tunnel: " + trafficTrunkName);
		}
		// if (routes == null || routes.length == 0) {
		// sbilog.info("retrieveRoute1 :0 Tunnel: " + trafficTrunkName);
		// try {
		// Thread.sleep(600000L);
		// } catch (InterruptedException e2) {
		// errorlog.error("retrieveRoute2 InterruptedException: ", e2);
		// }
		// try {
		// corbaService.getNmsSession().getExtendFlowDomainMgr().getExFDFrRoute(ttname, routeHolder);
		// routes = routeHolder.value;
		// } catch (ProcessingFailureException e1) {
		// errorlog.error(trafficTrunkName + " retrieveRoute2 ProcessingFailureException: " + CodeTool.isoToGbk(e1.errorReason), e1);
		// } catch (org.omg.CORBA.SystemException e1) {
		// errorlog.error(trafficTrunkName + " retrieveRoute2 CORBA.SystemException: " + e1.getMessage(), e1);
		// }
		// }
		if (routes != null) {
			for (ExMatrixFlowDomainFragment_T route : routes) {
				try {
					IPCrossconnection ipCC = IPCrossconnectionMapper.instance().convertIPCrossConnection(route, trafficTrunkName);
					IPCrossconnectionList.add(ipCC);
				} catch (Exception e) {
					errorlog.error("retrieveRoute convertException: \nTunnel=" + trafficTrunkName + " \nroute=" + route, e);
				}
			}
		}
		sbilog.info("retrieveRoute : " + IPCrossconnectionList.size() + " Tunnel: " + trafficTrunkName);
		return IPCrossconnectionList;
	}

	@Override
	public List<ProtectionGroup> retrieveAllProtectionGroupByMe(String meDn) {

		List<ProtectionGroup> list = new ArrayList<ProtectionGroup>();

		return list;
	}


	@Override
	public List<IPCrossconnection> retrieveAllCrossconnections(String neName) {
	    List<IPCrossconnection> IPCrossconnectionList = new ArrayList<IPCrossconnection>();
		MatrixFlowDomainFragment_T[] routes = null;
		NameAndStringValue_T[] ttname = VendorDNFactory.createCommonDN(neName);
		FDFrRoute_THolder routeHolder = new FDFrRoute_THolder();
		long start = System.currentTimeMillis();
		sbilog.debug("retrieveFdfrRoute :start " + neName);
		try {
			corbaService.getNmsSession().getFlowDomainMgr().getFDFrRoute(ttname, routeHolder);
			routes = routeHolder.value;
		} catch (ProcessingFailureException e) {
			errorlog.error(neName + " retrieveFdfrRoute ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error(neName + " retrieveFdfrRoute CORBA.SystemException: " + e.getMessage(), e);
		}
		sbilog.debug("retrieveFdfrRoute :end " + neName);
		long end = System.currentTimeMillis();
		long sub = end - start;
		sbilog.info("retrieveFdfrRoute : " + sub + "ms Tunnel: " + neName);
		if (sub > 60000) {
			sbilog.info("retrieveFdfrRoute1 : " + sub + "ms Tunnel: " + neName);
		}
		if (routes != null) {
			for (MatrixFlowDomainFragment_T route : routes) {
				try {
					IPCrossconnection ipCC = IPCrossconnectionMapper.instance().convertIPCrossConnection(route, neName);
					IPCrossconnectionList.add(ipCC);
				} catch (Exception e) {
					errorlog.error("retrieveRoute convertException: \nTunnel=" + neName + " \nroute=" + route, e);
				}
			}
		}
		sbilog.info("retrieveRoute : " + IPCrossconnectionList.size() + " Tunnel: " + neName);
		return IPCrossconnectionList;
	    
	}

	@Override
	public List<TrailNtwProtection> retrieveAllTrailNtwProtections() {
		
		List<TrailNtwProtection> pgList = new ArrayList<TrailNtwProtection>();
		
		// 20180306 烽火隧道保护组采集改造，更换采集接口，使用TrailNtwProtMgr::getAllTrailNtwProtections进行采集
//		NameAndStringValue_T[] subnetDn = VendorDNFactory.createSubnetworkDN(getEmsName(), "1");
//		TNetworkProtectionGroup_T[] tnps = null;
//		try {
//			String protectionType = "SNCP";
//			tnps = ExtendedMLSNMgrHandler.instance().retrieveTNetworkProtectionGroups(corbaService.getNmsSession().getExtendedMLSNMgrI(), subnetDn,
//					protectionType);
//		} catch (ProcessingFailureException e) {
//			errorlog.error("retrieveTNetworkProtectionGroups ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
//		} catch (org.omg.CORBA.SystemException e) {
//			errorlog.error("retrieveTNetworkProtectionGroups CORBA.SystemException: " + e.getMessage(), e);
//		}
//		if (tnps != null) {
//			//ObjectUtil.saveObject("TNetworkProtectionGroups_" + getServiceName(), tnps);
//			sbilog.info("retrieveTNetworkProtectionGroups : " + tnps.length);
//			for (TNetworkProtectionGroup_T tnpg : tnps) {
//				try {
//					TrailNtwProtection pg = ProtectGroupMapper.instance().convert(tnpg);
//					pgList.add(pg);
//				} catch (Exception e) {
//					errorlog.error("retrieveTNetworkProtectionGroups convertException: ", e);
//				}
//			}
//		}
		
		sbilog.info("retrieveAllTrailNtwProtection: function start...");
		
		NameAndStringValue_T[] emsDn = VendorDNFactory.createEmsDN(getEmsName());
		TrailNtwProtection_T[] pgs = null;
		try {
			
			if (corbaService.getNmsSession().getTrailNtwProtMgr() == null) {
				sbilog.info("retrieveAllTrailNtwProtection: getTrailNtwProtMgr is null");
			} else {
				sbilog.info("retrieveAllTrailNtwProtection: getTrailNtwProtMgr.class is --" + corbaService.getNmsSession().getTrailNtwProtMgr().getClass().toString());
			}
			
			pgs = ProtectionMgrHandler.instance().getAllTrailNtwProtections(corbaService.getNmsSession().getTrailNtwProtMgr(), emsDn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllTrailNtwProtection ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllTrailNtwProtection CORBA.SystemException: " + e.getMessage(), e);
		}
		if (pgs != null) {
			for (TrailNtwProtection_T trailpg : pgs) {
				try {
					TrailNtwProtection pg = ProtectGroupMapper.instance().convert(trailpg);
					pgList.add(pg);
				} catch (Exception e) {
					errorlog.error("retrieveAllTrailNtwProtection convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllTrailNtwProtection: TrailNtwProtectionList size = " + pgList.size());
		
		
//		NameAndStringValue_T[][] neNames = null;
//		try {
//			neNames = ManagedElementMgrHandler.instance().retrieveAllManagedElementNames(corbaService.getNmsSession().getManagedElementMgr());
//			
//			if (corbaService.getNmsSession().getTrailNtwProtMgr() == null) {
//				sbilog.info("retrieveAllTrailNtwProtection: getTrailNtwProtMgr is null");
//			} else {
//				sbilog.info("retrieveAllTrailNtwProtection: getTrailNtwProtMgr.class is --" + corbaService.getNmsSession().getTrailNtwProtMgr().getClass().toString());
////				corbaService.getNmsSession().getTrailNtwProtMgr().getClass();
//			}
//			
//		} catch (ProcessingFailureException e) {
//			errorlog.error("retrieveAllManagedElementNames ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
//		} catch (org.omg.CORBA.SystemException e) {
//			errorlog.error("retrieveAllManagedElementNames CORBA.SystemException: " + e.getMessage(), e);
//		}
//		sbilog.info("retrieveAllTrailNtwProtection: neNames size = " + neNames == null?0:neNames.length);
//		if (neNames != null) {
//			for (NameAndStringValue_T[] meName : neNames) {
//				TrailNtwProtection_T[] pgs = null;
//				try {
//					pgs = ProtectionMgrHandler.instance().getAllTrailNtwProtections(corbaService.getNmsSession().getTrailNtwProtMgr(), meName);
//				} catch (ProcessingFailureException e) {
//					errorlog.error("retrieveAllTrailNtwProtection ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
//				} catch (org.omg.CORBA.SystemException e) {
//					errorlog.error("retrieveAllTrailNtwProtection CORBA.SystemException: " + e.getMessage(), e);
//				}
//				if (pgs != null) {
//					for (TrailNtwProtection_T trailpg : pgs) {
//						try {
//							TrailNtwProtection pg = ProtectGroupMapper.instance().convert(trailpg);
//							pgList.add(pg);
//						} catch (Exception e) {
//							errorlog.error("retrieveAllTrailNtwProtection convertException: ", e);
//						}
//					}
//				}
//			}
//		}
//		sbilog.info("retrieveAllTrailNtwProtection: TrailNtwProtectionList size = " + pgList.size());
		
		return pgList;
	}

	@Override
	public ManagedElement retrieveManagedElement(String neName) {
		ManagedElement_T vendorNe = null;
		try {
			NameAndStringValue_T[] ns = VendorDNFactory.createCommonDN(neName);
			vendorNe = ManagedElementMgrHandler.instance().retrieveManagedElement(corbaService.getNmsSession().getManagedElementMgr(), ns);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllManagedElements ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllManagedElements CORBA.SystemException: " + e.getMessage(), e);
		}
		ManagedElement ne = null;
		try {
			sbilog.info("vendorNe="+vendorNe);
			ne = ManagedElementMapper.instance().convertManagedElement(vendorNe);
		} catch (Exception e) {
			errorlog.error("retrieveAllManagedElements convertException: ", e);
		}
		return ne;
	}

	public void retrieveRoute(String sncName, List<CrossConnect> ccList,boolean bol) {
		subnetworkConnection.Route_THolder normalRoute = new subnetworkConnection.Route_THolder();
		String[] sncdns = sncName.split("@");
		NameAndStringValue_T[] vendorSncName = VendorDNFactory.createSNCDN(sncdns[0].substring(4), sncdns[1].substring(21), sncdns[2].substring(21));
		try {
			corbaService.getNmsSession().getMultiLayerSubnetworkMgr().getRoute(vendorSncName, bol, normalRoute);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveRouteAndTopologicalLinks ProcessingFailureException: " + CodeTool.IsoToUtf8(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveRouteAndTopologicalLinks CORBA.SystemException: " + e.getMessage(), e);
		}
		if (normalRoute.value != null) {
			for (subnetworkConnection.CrossConnect_T cc : normalRoute.value) {
				try {
					ccList.add(IPCrossconnectionMapper.instance().convertCrossConnection(cc, sncName));
				} catch (Exception e) {
					errorlog.error("retrieveRouteAndTopologicalLinks convertException: ", e);
				}
			}
		}

		sbilog.info("ccList:" + ccList.size());


	}

	public void retrieveRouteAndTopologicalLinks(String sncName, List<CrossConnect> ccList, List<Section> sectionList) {
		subnetworkConnection.Route_THolder normalRoute = new subnetworkConnection.Route_THolder();
		topologicalLink.TopologicalLinkList_THolder topologicalLinkList = new topologicalLink.TopologicalLinkList_THolder();
		topologicalLink.TopologicalLinkIterator_IHolder tpLinkIt = new TopologicalLinkIterator_IHolder();
		
		String[] sncdns = sncName.split("@");
		NameAndStringValue_T[] vendorSncName = VendorDNFactory.createSNCDN(sncdns[0].substring(4), sncdns[1].substring(21), sncdns[2].substring(21));
		try {
//			corbaService.getNmsSession().getMultiLayerSubnetworkMgr().getRouteAndTopologicalLinks(vendorSncName, normalRoute, topologicalLinkList);
			
			corbaService.getNmsSession().getMultiLayerSubnetworkMgr().getRoute(vendorSncName, true, normalRoute);
			corbaService.getNmsSession().getMultiLayerSubnetworkMgr().getAllTopologicalLinks(vendorSncName, 4000, topologicalLinkList, tpLinkIt);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveRouteAndTopologicalLinks ProcessingFailureException: " + CodeTool.IsoToUtf8(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveRouteAndTopologicalLinks CORBA.SystemException: " + e.getMessage(), e);
		}
		if (normalRoute.value != null) {
			for (subnetworkConnection.CrossConnect_T cc : normalRoute.value) {
				try {
					ccList.add(IPCrossconnectionMapper.instance().convertCrossConnection(cc, sncName));
				} catch (Exception e) {
					errorlog.error("retrieveRouteAndTopologicalLinks convertException: ", e);
				}
			}
		}
		if (topologicalLinkList.value != null) {
			for (topologicalLink.TopologicalLink_T section : topologicalLinkList.value) {
				try {
					sectionList.add(SectionMapper.instance().convertSection(section, vendorSncName));
				} catch (Exception e) {
					errorlog.error("retrieveRouteAndTopologicalLinks convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveRouteAndTopologicalLinks ccList: " + ccList.size());
		sbilog.info("retrieveRouteAndTopologicalLinks sectionList: " + sectionList.size());

	}

	public List<SubnetworkConnection> retrieveAllSNCs() {
		List<SubnetworkConnection> sncList = new ArrayList<SubnetworkConnection>();
		SubnetworkConnection_T[] sncs = null;
		NameAndStringValue_T[] subnetworkName = VendorDNFactory.createSubnetworkDN(corbaService.getEmsDn(), "1");
		try {
			sncs = SubnetworkMgrHandler.instance().retrieveAllSNCs(corbaService.getNmsSession().getMultiLayerSubnetworkMgr(), subnetworkName, new short[0]);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllSNCs ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllSNCs CORBA.SystemException: " + e.getMessage(), e);
		}
		if (sncs != null) {
			for (SubnetworkConnection_T snc : sncs) {
				try {
					sncList.add(SubnetworkConnectionMapper.instance().convertSNC(snc));
				} catch (Exception e) {
					errorlog.error("retrieveAllSNCs convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllSNCs : " + sncList.size());
		return sncList;
	}

	@Override
	public List<CrossConnect>  retrieveAllCrossConnects(String neName) {
		CrossConnect_T[] vendorCCs = null;
		List<CrossConnect> ccList = new ArrayList<CrossConnect>();
		try {
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
			short[] layer = new short[0];
			// ManagedElement_T ne = ManagedElementMgrHandler.instance().retrieveManagedElement(corbaService.getNmsSession().getManagedElementMgr(), neDn);
			// layer = ne.supportedRates;
			// sbilog.info("ManagedElement_T : " + ne);
			// if (layer == null || layer.length == 0) {
			// if (ne.productName.contains("WDM")) {
			// layer = new short[] { 42, 41, 40, 47, 87, 96, 98, 111, 108, 105 };
			// } else {
			// layer = new short[] { 11, 13, 15, 16, 17, 18, 29 };
			// }
			// }
			vendorCCs = ManagedElementMgrHandler.instance().retrieveAllCrossConnections(corbaService.getNmsSession().getManagedElementMgr(), neDn, layer);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCrossConnects ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllCrossConnects CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorCCs != null) {
			for (CrossConnect_T vendorIPCc : vendorCCs) {
				try {
					CrossConnect ipCC = IPCrossconnectionMapper.instance().convertCrossConnection(vendorIPCc, neName);
					ccList.add(ipCC);
				} catch (Exception e) {
					errorlog.error("retrieveAllCrossConnects convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCrossConnects : " + ccList.size());
		return ccList;
	}


	public List<CrossConnect> retrieveAllExtCrossConnects(String neName) {
		CrossConnect_T[] vendorCCs = null;
		List<CrossConnect> ccList = new ArrayList<CrossConnect>();
		try {
			if (corbaService.getNmsSession().getExtendedManagedelementMgrI() == null) return null;
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
			short[] layer = new short[]{40,41,50};
			// ManagedElement_T ne = ManagedElementMgrHandler.instance().retrieveManagedElement(corbaService.getNmsSession().getManagedElementMgr(), neDn);
			// layer = ne.supportedRates;
			// sbilog.info("ManagedElement_T : " + ne);
			// if (layer == null || layer.length == 0) {
			// if (ne.productName.contains("WDM")) {
			// layer = new short[] { 42, 41, 40, 47, 87, 96, 98, 111, 108, 105 };
			// } else {
			// layer = new short[] { 11, 13, 15, 16, 17, 18, 29 };
			// }
			// }
			CrossConnectList_THolder ccholders = new CrossConnectList_THolder();
			CCIterator_IHolder ccIterator_iHolder = new CCIterator_IHolder();
			corbaService.getNmsSession().getExtendedManagedelementMgrI().getAllCrossConnections(neDn,layer,50, ccholders, ccIterator_iHolder);
		//	vendorCCs = ManagedElementMgrHandler.instance().retrieveAllCrossConnections(corbaService.getNmsSession().getManagedElementMgr(), neDn, layer);
			java.util.Vector ccs = new java.util.Vector();
			for (int i = 0; i < ccholders.value.length; i++) {
				ccs.addElement(ccholders.value[i]);
			}

			if (ccIterator_iHolder.value != null) {
				boolean hasMore;
				do {
					hasMore = ccIterator_iHolder.value.next_n(50, ccholders);

					for (int i = 0; i < ccholders.value.length; i++) {
						ccs.addElement(ccholders.value[i]);
					}
				} while (hasMore);

				try {
					ccIterator_iHolder.value.destroy();
				} catch (Throwable ex) {

				}
			}

			vendorCCs = new CrossConnect_T[ccs.size()];
			ccs.copyInto(vendorCCs);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllExtCrossConnects ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllExtCrossConnects CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorCCs != null) {
			for (CrossConnect_T vendorIPCc : vendorCCs) {
				try {
					CrossConnect ipCC = IPCrossconnectionMapper.instance().convertCrossConnection(vendorIPCc, neName);
					ipCC.setTag1("EXT");
					ccList.add(ipCC);
				} catch (Exception e) {
					errorlog.error("retrieveAllExtCrossConnects convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllExtCrossConnects : " + ccList.size());
		return ccList;
	}

	public static void main(String[] args) {
		List list = (List)ObjectUtil.readObjectByPath("D:\\newsvn\\xpon-dev\\NETHERE\\releases\\binary\\result_1486609916624");
		for (Object o : list) {
			CrossConnect cc = (CrossConnect)o;
			if (cc.getDn().equals("EMS:HUZ-OTNM2000-7-P@ManagedElement:134247231;66578@CrossConnect:/rack=1342209/shelf=1/slot=16778270/port=4/sts3c_au4-j=1/tu3_vc3-k=3/vt2_tu12-l=3-m=1/rack=1342209/shelf=1/slot=3146769/port=2/sts3c_au4-j=15/tu3_vc3-k=3/vt2_tu12-l=3-m=1_/rack=1342209/shelf=1/slot=23069700/port=1/sts3c_au4-j=58/tu3_vc3-k=3/vt2_tu12-l=3-m=1"))
				System.out.println("cc = " + cc);
		}
	}

}