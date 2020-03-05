package flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler 
 */

public class FlowDomainMgr_IPOATie
	extends FlowDomainMgr_IPOA
{
	private FlowDomainMgr_IOperations _delegate;

	private POA _poa;
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public flowDomain.FlowDomainMgr_I _this()
	{
		return flowDomain.FlowDomainMgr_IHelper.narrow(_this_object());
	}
	public flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return flowDomain.FlowDomainMgr_IHelper.narrow(_this_object(orb));
	}
	public FlowDomainMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void deactivateAndDeleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteFDFr(fdfrName,tpsToModify,theFDFr,errorReason);
	}

	public void getAllTopologicalLinksOfFD(globaldefs.NameAndStringValue_T[] flowDomainName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinksOfFD(flowDomainName,how_many,topoList,topoIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllAssignedCPTPs(globaldefs.NameAndStringValue_T[] mfdName, int how_many, terminationPoint.TerminationPointList_THolder cptpList, terminationPoint.TerminationPointIterator_IHolder cptpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignedCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void assignCPTPsToMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.assignCPTPsToMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

	public void associateMFDsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.associateMFDsWithFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void unassignCPTPsFromMFD(globaldefs.NameAndStringValue_T[] mfdName, globaldefs.NameAndStringValue_T[][] tpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.unassignCPTPsFromMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

	public void getFDFrRoute(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FDFrRoute_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoute(fdfrName,route);
	}

	public void createMFD(flowDomain.MFDCreateData_T createData, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomain.MatrixFlowDomain_THolder theMFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createMFD(createData,tpsToModify,theMFD,errorReason);
	}

	public void getAssociatingFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssociatingFD(mfdName,flowDomain);
	}

	public void modifyFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FDFrModifyData_T fdfrModifyData, flowDomain.ConnectivityRequirement_T connectivityRequirement, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NamingAttributesList_THolder failedTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,connectivityRequirement,tpsToModify,failedTPList,parameterProblemsTPList,newFDFr,errorReason);
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

	public void deleteFlowDomain(globaldefs.NameAndStringValue_T[] fdName, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFlowDomain(fdName,tpsToModify,errorReason);
	}

	public void getAllSupportedMFDs(globaldefs.NameAndStringValue_T[] holderName, int how_many, flowDomain.MFDList_THolder mfds, flowDomain.MFDIterator_IHolder mfdIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedMFDs(holderName,how_many,mfds,mfdIt);
	}

	public void deleteMFD(globaldefs.NameAndStringValue_T[] mfdName, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteMFD(mfdName,tpsToModify,errorReason);
	}

	public void getAssigningMFD(globaldefs.NameAndStringValue_T[] cptpName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssigningMFD(cptpName,mfd);
	}

	public void getAllFlowDomains(int how_many, flowDomain.FDList_THolder flowDomains, flowDomain.FDIterator_IHolder fdIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomains(how_many,flowDomains,fdIt);
	}

	public void deAssociateMFDsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] mfdNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deAssociateMFDsFromFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void associateCPTPsWithFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] cptpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.associateCPTPsWithFlowDomain(fdName,cptpNames,tpsToModify,errorReason);
	}

	public void deleteFDFr(globaldefs.NameAndStringValue_T[] fdfrName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName);
	}

	public void modifyFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FDModifyData_T fdModifyData, flowDomain.FlowDomain_THolder modifiedFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyFlowDomain(fdName,fdModifyData,modifiedFD,failedAttributes,errorReason);
	}

	public void getAllFDFrs(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void getFDFrsWithTP(globaldefs.NameAndStringValue_T[] cptpName, int how_many, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
	}

	public void getAllAssignableCPTPs(globaldefs.NameAndStringValue_T[] mfdName, int how_many, terminationPoint.TerminationPointList_THolder cptpList, terminationPoint.TerminationPointIterator_IHolder cptpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignableCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deAssociateCPTPsFromFlowDomain(globaldefs.NameAndStringValue_T[] fdName, globaldefs.NameAndStringValue_T[][] tpNames, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deAssociateCPTPsFromFlowDomain(fdName,tpNames,tpsToModify,errorReason);
	}

	public void deleteFTP(globaldefs.NameAndStringValue_T[] ftpName, subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName,tpsToModify,errorReason);
	}

	public void getMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MatrixFlowDomain_THolder mfd) throws globaldefs.ProcessingFailureException
	{
_delegate.getMFD(mfdName,mfd);
	}

	public void modifyMFD(globaldefs.NameAndStringValue_T[] mfdName, flowDomain.MFDModifyData_T mfdModifyData, flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyMFD(mfdName,mfdModifyData,newMFD,failedAttributes,errorReason);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, flowDomainFragment.FDFrList_THolder fdfrs) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrs);
	}

	public void createFlowDomain(flowDomain.FDCreateData_T createData, globaldefs.NamingAttributesList_THolder assignedCPTPs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createFlowDomain(createData,assignedCPTPs,tpsToModify,theFD,errorReason);
	}

	public void getTransmissionParams(globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, transmissionParameters.LayeredParameterList_THolder transmissionParams) throws globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void getFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

	public void deactivateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void getAllCPTPs(globaldefs.NameAndStringValue_T[] fdName, flowDomain.CPTP_Role_T cptpRole, int how_many, terminationPoint.TerminationPointList_THolder cptpList, terminationPoint.TerminationPointIterator_IHolder cptpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCPTPs(fdName,cptpRole,how_many,cptpList,cptpIt);
	}

	public void createFTP(flowDomain.FTPCreateData_T createData, subnetworkConnection.TPDataList_THolder tpsToModify, terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,tpsToModify,theFTP,errorReason);
	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, flowDomain.FDList_THolder flowDomains) throws globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomainsByUserLabel(userLabel,flowDomains);
	}

	public void activateFDFr(globaldefs.NameAndStringValue_T[] fdfrName, flowDomainFragment.FlowDomainFragment_THolder fdfr) throws globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void getAllAssociatedMFDs(globaldefs.NameAndStringValue_T[] tmdOrFdName, int how_many, flowDomain.MFDList_THolder mfds, flowDomain.MFDIterator_IHolder mfdIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllAssociatedMFDs(tmdOrFdName,how_many,mfds,mfdIt);
	}

	public void createFDFr(flowDomainFragment.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, globaldefs.NamingAttributesList_THolder internalTPs, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void createAndActivateFDFr(flowDomainFragment.FDFrCreateData_T createData, flowDomain.ConnectivityRequirement_T connectivityRequirement, globaldefs.NameAndStringValue_T[][] aEnd, globaldefs.NameAndStringValue_T[][] zEnd, globaldefs.NamingAttributesList_THolder internalTPs, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, subnetworkConnection.TPDataList_THolder tpsToModify, flowDomainFragment.FlowDomainFragment_THolder theFDFr, globaldefs.NamingAttributesList_THolder notConnectableCPTPList, globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void getFlowDomain(globaldefs.NameAndStringValue_T[] fdName, flowDomain.FlowDomain_THolder flowDomain) throws globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomain(fdName,flowDomain);
	}

}
