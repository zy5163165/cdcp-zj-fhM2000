package managedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler 
 */

public class ManagedElementMgr_IPOATie
	extends ManagedElementMgr_IPOA
{
	private ManagedElementMgr_IOperations _delegate;

	private POA _poa;
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public managedElementManager.ManagedElementMgr_I _this()
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
	}
	public ManagedElementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void modifyGTP(globaldefs.NameAndStringValue_T[] gtpName, globaldefs.NameAndStringValue_T[][] tpNames, java.lang.String actionType, terminationPoint.GTP_THolder modifiedGTP) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyGTP(gtpName,tpNames,actionType,modifiedGTP);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getContainedPotentialTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getAllUnacknowledgedActiveAlarms(globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllUnacknowledgedActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getContainedInUseTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getAllPTPNamesWithoutFTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPNamesWithoutFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getManagedElement(globaldefs.NameAndStringValue_T[] managedElementName, managedElement.ManagedElement_THolder me) throws globaldefs.ProcessingFailureException
	{
_delegate.getManagedElement(managedElementName,me);
	}

	public void getAllFixedCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllPTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllFTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getContainingSubnetworkNames(globaldefs.NameAndStringValue_T[] managedElementName, globaldefs.NamingAttributesList_THolder subnetNames) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingSubnetworkNames(managedElementName,subnetNames);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setGtpAlarmReportingOff(globaldefs.NameAndStringValue_T[] gtpName) throws globaldefs.ProcessingFailureException
	{
_delegate.setGtpAlarmReportingOff(gtpName);
	}

	public void getAllGTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllGTPNames(managedElementName,tpLayerRateList,how_many,nameList,nameIt);
	}

	public void getContainingTPs(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPs(tpName,tpList);
	}

	public void getAllManagedElementNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(how_many,nameList,nameIt);
	}

	public void setTPData(subnetworkConnection.TPData_T tpInfo, terminationPoint.TerminationPoint_THolder modifiedTP) throws globaldefs.ProcessingFailureException
	{
_delegate.setTPData(tpInfo,modifiedTP);
	}

	public void getContainedInUseTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getAllPTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getAllPTPsWithoutFTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPsWithoutFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void deleteGTP(globaldefs.NameAndStringValue_T[] gtpName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteGTP(gtpName);
	}

	public void getAllGTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, terminationPoint.GTPlist_THolder gtpList, terminationPoint.GTPiterator_IHolder gtpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllGTPs(managedElementName,tpLayerRateList,how_many,gtpList,gtpIt);
	}

	public void getPotentialFixedCCs(globaldefs.NameAndStringValue_T[] inputTP, globaldefs.NVSList_THolder ContainingTP, globaldefs.NVSList_THolder potentialCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.getPotentialFixedCCs(inputTP,ContainingTP,potentialCCList);
	}

	public void getContainingGTP(globaldefs.NameAndStringValue_T[] ctpName, terminationPoint.GTP_THolder gtp) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingGTP(ctpName,gtp);
	}

	public void getTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPoint_THolder tp) throws globaldefs.ProcessingFailureException
	{
_delegate.getTP(tpName,tp);
	}

	public void getAllActiveAlarms(globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getContainedPotentialTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setGtpAlarmReportingOn(globaldefs.NameAndStringValue_T[] gtpName) throws globaldefs.ProcessingFailureException
	{
_delegate.setGtpAlarmReportingOn(gtpName);
	}

	public void verifyTMDAssignment(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.Directionality_T direction, org.omg.CORBA.StringHolder tmdAssignmentState, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalTPInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.verifyTMDAssignment(tpName,direction,tmdAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void getAllManagedElements(int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(how_many,meList,meIt);
	}

	public void getAllFTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void createGTP(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.NameAndStringValue_T[][] listOfTPs, globaldefs.NameAndStringValue_T[] initialCTPname, int numberOfCTPs, terminationPoint.GTPEffort_T gtpEffort, globaldefs.NameAndStringValue_T[] additionalCreationInfo, terminationPoint.GTP_THolder newGTP) throws globaldefs.ProcessingFailureException
	{
_delegate.createGTP(userLabel,forceUniqueness,owner,listOfTPs,initialCTPname,numberOfCTPs,gtpEffort,additionalCreationInfo,newGTP);
	}

	public void getContainedCurrentTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getContainingTPNames(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NamingAttributesList_THolder tpNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPNames(tpName,tpNameList);
	}

	public void getGTP(globaldefs.NameAndStringValue_T[] gtpName, terminationPoint.GTP_THolder gtp) throws globaldefs.ProcessingFailureException
	{
_delegate.getGTP(gtpName,gtp);
	}

}
