package extendedManagedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ExtendedManagedElementMgr_I"
 *	@author JacORB IDL compiler 
 */

public class ExtendedManagedElementMgr_IPOATie
	extends ExtendedManagedElementMgr_IPOA
{
	private ExtendedManagedElementMgr_IOperations _delegate;

	private POA _poa;
	public ExtendedManagedElementMgr_IPOATie(ExtendedManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExtendedManagedElementMgr_IPOATie(ExtendedManagedElementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedManagedElementManager.ExtendedManagedElementMgr_I _this()
	{
		return extendedManagedElementManager.ExtendedManagedElementMgr_IHelper.narrow(_this_object());
	}
	public extendedManagedElementManager.ExtendedManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedManagedElementManager.ExtendedManagedElementMgr_IHelper.narrow(_this_object(orb));
	}
	public ExtendedManagedElementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExtendedManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void activateCrossConnections(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.activateCrossConnections(meName,ccList,failedCCList);
	}

	public void getAllClockLinkNets(globaldefs.NameAndStringValue_T[] targetObjName, java.lang.String linkType, int how_many, extendedManagedElementManager.ClockLinkNetList_THolder clockLinkNetList, extendedManagedElementManager.ClockLinkNetIterator_IHolder clockLinkNetIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllClockLinkNets(targetObjName,linkType,how_many,clockLinkNetList,clockLinkNetIt);
	}

	public void getAllEquipmentClocks(globaldefs.NameAndStringValue_T[] targetObjName, int how_many, extendedManagedElementManager.EquipmentClockList_THolder ecList, extendedManagedElementManager.EquipmentClockIterator_IHolder ecIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentClocks(targetObjName,how_many,ecList,ecIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void deactivateCrossConnection(subnetworkConnection.CrossConnect_T crossConnection) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateCrossConnection(crossConnection);
	}

	public void provisionEquipment(equipment.EQTCreateData_T[] equipmentCreateDataList, equipment.EquipmentOrHolderList_THolder successEquipmentList) throws globaldefs.ProcessingFailureException
	{
_delegate.provisionEquipment(equipmentCreateDataList,successEquipmentList);
	}

	public void getAllCCCapacity(globaldefs.NameAndStringValue_T[] objectName, java.lang.String capacityType, int how_many, extendedManagedElementManager.CCCapacityList_THolder ccCapacityList, extendedManagedElementManager.CCCapacityIterator_IHolder ccCapacityIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCCCapacity(objectName,capacityType,how_many,ccCapacityList,ccCapacityIt);
	}

	public void getTPRouteAndTopologicalLinksInME(globaldefs.NameAndStringValue_T[][] targetObjectNameList, extendedManagedElementManager.BusinessPathList_THolder srcBusinessPathList, extendedManagedElementManager.BusinessPathList_THolder sinkBusinessPathList) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPRouteAndTopologicalLinksInME(targetObjectNameList,srcBusinessPathList,sinkBusinessPathList);
	}

	public void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getBoardInternalSingalFlow(globaldefs.NameAndStringValue_T[] managedElementName, extendedManagedElementManager.BoardInternalSignalFlowList_THolder internalSignalList) throws globaldefs.ProcessingFailureException
	{
_delegate.getBoardInternalSingalFlow(managedElementName,internalSignalList);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void activateCrossConnection(subnetworkConnection.CrossConnect_T crossConnection) throws globaldefs.ProcessingFailureException
	{
_delegate.activateCrossConnection(crossConnection);
	}

	public void createCrossConnection(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.TPData_T[] tpInclusions, subnetworkConnection.TPData_T[] tpExclusions, subnetworkConnection.CrossConnectList_THolder successCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.createCrossConnection(meName,ccList,tpInclusions,tpExclusions,successCCList);
	}

	public void deactivateCrossConnections(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateCrossConnections(meName,ccList,failedCCList);
	}

	public void getAssignActiveAlarms(globaldefs.NameAndStringValue_T[] objName, java.lang.String nativeProbableCauseList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssignActiveAlarms(objName,nativeProbableCauseList,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getTPMembers(globaldefs.NameAndStringValue_T[] tpName, subnetworkConnection.TPDataList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPMembers(tpName,tpList);
	}

	public void getAllMeClocks(globaldefs.NameAndStringValue_T[] targetObjName, int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMeClocks(targetObjName,how_many,meList,meIt);
	}

	public void deleteCrossConnection(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteCrossConnection(meName,ccList,failedCCList);
	}

}
