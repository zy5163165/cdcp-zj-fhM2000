package flowDomain;

/**
 *	Generated from IDL definition of interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface FlowDomainMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllFlowDomains(int how_many, flowDomain.FDList_THolder flowDomains, flowDomain.FDIterator_IHolder fdIt) throws globaldefs.ProcessingFailureException;
	void getFlowDomainsByUserLabel(java.lang.String userLabel, flowDomain.FDList_THolder flowDomains) throws globaldefs.ProcessingFailureException;
	void getFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException;
	void getAssociatingFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException;
	void getTransmissionParams(globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, transmissionParameters.LayeredParameterList_THolder transmissionParams) throws globaldefs.ProcessingFailureException;
	void createFlowDomain(flowDomain.FDCreateData_T createData, globaldefs.NamingAttributesList_THolder assignedCPTPs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteFlowDomain(globaldefs.NameAndStringValue_T[] fdName, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void modifyFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FDModifyData_T fdModifyData, flowDomain.FlowDomain_THolder modifiedFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void associateMFDsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deAssociateMFDsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void associateCPTPsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] cptpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deAssociateCPTPsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] tpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllAssociatedMFDs(globaldefs.NameAndStringValue_T[] tmdOrFdName, int how_many, flowDomain.MFDList_THolder mfds, flowDomain.MFDIterator_IHolder mfdIt) throws globaldefs.ProcessingFailureException;
	void getAllSupportedMFDs(globaldefs.NameAndStringValue_T[] holderName, int how_many, flowDomain.MFDList_THolder mfds, flowDomain.MFDIterator_IHolder mfdIt) throws globaldefs.ProcessingFailureException;
	void getMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException;
	void getAssigningMFD(globaldefs.NameAndStringValue_T[] cptpName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException;
	void createMFD(flowDomain.MFDCreateData_T createData, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomain.MatrixFlowDomain_THolder theMFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteMFD(globaldefs.NameAndStringValue_T[] mfdName, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void modifyMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MFDModifyData_T mfdModifyData, flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void assignCPTPsToMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void unassignCPTPsFromMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void createFTP(flowDomain.FTPCreateData_T createData, subnetworkConnection.TPDataList_THolder tpsToModify, terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteFTP(globaldefs.NameAndStringValue_T[] ftpName, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllCPTPs(globaldefs.NameAndStringValue_T[] fdName, flowDomain.CPTP_Role_T cptpRole, int how_many, terminationPoint.TerminationPointList_THolder cptpList, terminationPoint.TerminationPointIterator_IHolder cptpIt) throws globaldefs.ProcessingFailureException;
	void getAllAssignedCPTPs(globaldefs.NameAndStringValue_T[] mfdName, int how_many, terminationPoint.TerminationPointList_THolder cptpList, terminationPoint.TerminationPointIterator_IHolder cptpIt) throws globaldefs.ProcessingFailureException;
	void getAllAssignableCPTPs(globaldefs.NameAndStringValue_T[] mfdName, int how_many, terminationPoint.TerminationPointList_THolder cptpList, terminationPoint.TerminationPointIterator_IHolder cptpIt) throws globaldefs.ProcessingFailureException;
	void getAllFDFrs(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;
	void getFDFrsWithTP(globaldefs.NameAndStringValue_T[] cptpName, int how_many, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;
	void getFDFrsByUserLabel(java.lang.String userLabel, flowDomainFragment.FDFrList_THolder fdfrs) throws globaldefs.ProcessingFailureException;
	void getFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void createAndActivateFDFr(flowDomainFragment.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, globaldefs.NameAndStringValue_T[][] aEnd, globaldefs.NameAndStringValue_T[][] zEnd, globaldefs.NamingAttributesList_THolder internalTPs, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, globaldefs.NamingAttributesList_THolder notConnectableCPTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deactivateAndDeleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void modifyFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FDFrModifyData_T fdfrModifyData, flowDomain.ConnectivityRequirement_T connectivityRequirement, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NamingAttributesList_THolder failedTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getAllTopologicalLinksOfFD(globaldefs.NameAndStringValue_T[] flowDomainName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;
	void getFDFrRoute(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FDFrRoute_THolder route) throws globaldefs.ProcessingFailureException;
	void createFDFr(flowDomainFragment.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, globaldefs.NamingAttributesList_THolder internalTPs, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void activateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void deactivateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException;
	void deleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName) throws globaldefs.ProcessingFailureException;
}
