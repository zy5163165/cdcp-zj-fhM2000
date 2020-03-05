package managedElementManager;

/**
 *	Generated from IDL definition of interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface ManagedElementMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllManagedElements(int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException;
	void getAllManagedElementNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainingSubnetworkNames(globaldefs.NameAndStringValue_T[] managedElementName, globaldefs.NamingAttributesList_THolder subnetNames) throws globaldefs.ProcessingFailureException;
	void getAllPTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllPTPsWithoutFTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllFTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllPTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllPTPNamesWithoutFTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllFTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPoint_THolder tp) throws globaldefs.ProcessingFailureException;
	void getManagedElement(globaldefs.NameAndStringValue_T[] managedElementName, managedElement.ManagedElement_THolder me) throws globaldefs.ProcessingFailureException;
	void getContainedPotentialTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedPotentialTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainedInUseTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedInUseTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainedCurrentTPs(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainingTPs(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;
	void getContainingTPNames(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NamingAttributesList_THolder tpNameList) throws globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getAllUnacknowledgedActiveAlarms(globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void setTPData(subnetworkConnection.TPData_T tpInfo, terminationPoint.TerminationPoint_THolder modifiedTP) throws globaldefs.ProcessingFailureException;
	void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException;
	void createGTP(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.NameAndStringValue_T[][] listOfTPs, globaldefs.NameAndStringValue_T[] initialCTPname, int numberOfCTPs, terminationPoint.GTPEffort_T gtpEffort, globaldefs.NameAndStringValue_T[] additionalCreationInfo, terminationPoint.GTP_THolder newGTP) throws globaldefs.ProcessingFailureException;
	void deleteGTP(globaldefs.NameAndStringValue_T[] gtpName) throws globaldefs.ProcessingFailureException;
	void modifyGTP(globaldefs.NameAndStringValue_T[] gtpName, globaldefs.NameAndStringValue_T[][] tpNames, java.lang.String actionType, terminationPoint.GTP_THolder modifiedGTP) throws globaldefs.ProcessingFailureException;
	void getGTP(globaldefs.NameAndStringValue_T[] gtpName, terminationPoint.GTP_THolder gtp) throws globaldefs.ProcessingFailureException;
	void getAllGTPs(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, terminationPoint.GTPlist_THolder gtpList, terminationPoint.GTPiterator_IHolder gtpIt) throws globaldefs.ProcessingFailureException;
	void getAllGTPNames(globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getContainingGTP(globaldefs.NameAndStringValue_T[] ctpName, terminationPoint.GTP_THolder gtp) throws globaldefs.ProcessingFailureException;
	void setGtpAlarmReportingOn(globaldefs.NameAndStringValue_T[] gtpName) throws globaldefs.ProcessingFailureException;
	void setGtpAlarmReportingOff(globaldefs.NameAndStringValue_T[] gtpName) throws globaldefs.ProcessingFailureException;
	void verifyTMDAssignment(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.Directionality_T direction, org.omg.CORBA.StringHolder tmdAssignmentState, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalTPInfo) throws globaldefs.ProcessingFailureException;
	void getAllFixedCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException;
	void getPotentialFixedCCs(globaldefs.NameAndStringValue_T[] inputTP, globaldefs.NVSList_THolder ContainingTP, globaldefs.NVSList_THolder potentialCCList) throws globaldefs.ProcessingFailureException;
}
