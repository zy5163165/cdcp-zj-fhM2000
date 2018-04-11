package emsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "EMSMgr_I"
 *	@author JacORB IDL compiler 
 */

public class EMSMgr_IPOATie
	extends EMSMgr_IPOA
{
	private EMSMgr_IOperations _delegate;

	private POA _poa;
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public emsMgr.EMSMgr_I _this()
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
	}
	public EMSMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllTopLevelSubnetworkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworkNames(how_many,nameList,nameIt);
	}

	public void getAllTopLevelSubnetworks(int how_many, multiLayerSubnetwork.SubnetworkList_THolder sList, multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworks(how_many,sList,sIt);
	}

	public void unacknowledgeAlarms(notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws globaldefs.ProcessingFailureException
	{
_delegate.unacknowledgeAlarms(unacknowledgeIDList,additionalInfo,failedunAcknowledgeIDList);
	}

	public void createASAP(aSAP.ASAPCreateModifyData_T newASAPCreateData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.createASAP(newASAPCreateData,newASAP,additionalInfo);
	}

	public void getASAPAssociatedResourceNames(globaldefs.NameAndStringValue_T[] aSAPName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getASAPAssociatedResourceNames(aSAPName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllASAPNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPNames(how_many,nameList,nameIt);
	}

	public void getEMS(emsMgr.EMS_THolder emsInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.getEMS(emsInfo);
	}

	public void getTopLevelTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopLevelTopologicalLink(topoLinkName,topoLink);
	}

	public void modifyASAP(globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAPCreateModifyData_T aSAPModifyData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyASAP(aSAPName,aSAPModifyData,newASAP,additionalInfo);
	}

	public void getAllMLSNPPLinksWithTNAs(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithTNAs(tNAList,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllEMSAndMEUnacknowledgedActiveAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEUnacknowledgedActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllEMSSystemActiveAlarms(notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSSystemActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllEMSSystemUnacknowledgedActiveAlarms(notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSSystemUnacknowledgedActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getASAPbyResource(globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getASAPbyResource(resourceName,layerRateList,how_many,aSAPList,asapIt);
	}

	public void getAllMLRAs(int how_many, multiLayerSubnetwork.SubnetworkList_THolder mLRAList, multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLRAs(how_many,mLRAList,sIt);
	}

	public void deleteASAP(globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteASAP(aSAPName,additionalInfo);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllMLSNPPLinksWithMLSNs(globaldefs.NameAndStringValue_T[][] mLRANames, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithMLSNs(mLRANames,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void deleteTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTopologicalLink(topoLinkName);
	}

	public void getAllTopLevelTopologicalLinks(int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinks(how_many,topoList,topoIt);
	}

	public void deassignASAP(globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.deassignASAP(resourceName,layerRate,additionalInfo);
	}

	public void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllMLSNPPsWithTP(globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPsWithTP(tPName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void acknowledgeAlarms(notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws globaldefs.ProcessingFailureException
	{
_delegate.acknowledgeAlarms(acknowledgeIDList,additionalInfo,failedAcknowledgeIDList);
	}

	public void getAllMLSNPPLinks(boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinks(sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllMLSNPPsWithTNA(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPsWithTNA(tNAList,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void getASAP(globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAP_THolder anASAP) throws globaldefs.ProcessingFailureException
	{
_delegate.getASAP(aSAPName,anASAP);
	}

	public void getHistoryAlarmDataByPull(globaldefs.NameAndStringValue_T[][] nameList, java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws globaldefs.ProcessingFailureException
	{
_delegate.getHistoryAlarmDataByPull(nameList,taskName,compressType,packingType,excludeProbCauseList,excludeSeverityList,startTime,endTime);
	}

	public void getAllMLSNPPLinksWithTP(globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithTP(tPName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllASAPs(int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPs(how_many,aSAPList,asapIt);
	}

	public void getAllMLSNPPs(boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPs(sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void assignASAP(globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.assignASAP(aSAPName,resourceName,layerRate,additionalInfo);
	}

	public void getAllTopLevelTopologicalLinkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinkNames(how_many,nameList,nameIt);
	}

	public void createTopologicalLink(topologicalLink.TLCreateData_T newTLCreateData, topologicalLink.TopologicalLink_THolder newTopologicalLink) throws globaldefs.ProcessingFailureException
	{
_delegate.createTopologicalLink(newTLCreateData,newTopologicalLink);
	}

}
