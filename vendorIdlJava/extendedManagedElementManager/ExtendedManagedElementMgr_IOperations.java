package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "ExtendedManagedElementMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface ExtendedManagedElementMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createCrossConnection(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.TPData_T[] tpInclusions, subnetworkConnection.TPData_T[] tpExclusions, subnetworkConnection.CrossConnectList_THolder successCCList) throws globaldefs.ProcessingFailureException;
	void deleteCrossConnection(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException;
	void activateCrossConnection(subnetworkConnection.CrossConnect_T crossConnection) throws globaldefs.ProcessingFailureException;
	void deactivateCrossConnection(subnetworkConnection.CrossConnect_T crossConnection) throws globaldefs.ProcessingFailureException;
	void activateCrossConnections(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException;
	void deactivateCrossConnections(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException;
	void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException;
	void getAllEquipmentClocks(globaldefs.NameAndStringValue_T[] targetObjName, int how_many, extendedManagedElementManager.EquipmentClockList_THolder ecList, extendedManagedElementManager.EquipmentClockIterator_IHolder ecIt) throws globaldefs.ProcessingFailureException;
	void getAllMeClocks(globaldefs.NameAndStringValue_T[] targetObjName, int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException;
	void getAllClockLinkNets(globaldefs.NameAndStringValue_T[] targetObjName, java.lang.String linkType, int how_many, extendedManagedElementManager.ClockLinkNetList_THolder clockLinkNetList, extendedManagedElementManager.ClockLinkNetIterator_IHolder clockLinkNetIt) throws globaldefs.ProcessingFailureException;
	void provisionEquipment(equipment.EQTCreateData_T[] equipmentCreateDataList, equipment.EquipmentOrHolderList_THolder successEquipmentList) throws globaldefs.ProcessingFailureException;
	void getTPRouteAndTopologicalLinksInME(globaldefs.NameAndStringValue_T[][] targetObjectNameList, extendedManagedElementManager.BusinessPathList_THolder srcBusinessPathList, extendedManagedElementManager.BusinessPathList_THolder sinkBusinessPathList) throws globaldefs.ProcessingFailureException;
	void getBoardInternalSingalFlow(globaldefs.NameAndStringValue_T[] managedElementName, extendedManagedElementManager.BoardInternalSignalFlowList_THolder internalSignalList) throws globaldefs.ProcessingFailureException;
	void getAllCCCapacity(globaldefs.NameAndStringValue_T[] objectName, java.lang.String capacityType, int how_many, extendedManagedElementManager.CCCapacityList_THolder ccCapacityList, extendedManagedElementManager.CCCapacityIterator_IHolder ccCapacityIt) throws globaldefs.ProcessingFailureException;
	void getTPMembers(globaldefs.NameAndStringValue_T[] tpName, subnetworkConnection.TPDataList_THolder tpList) throws globaldefs.ProcessingFailureException;
	void getAssignActiveAlarms(globaldefs.NameAndStringValue_T[] objName, java.lang.String nativeProbableCauseList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
}
