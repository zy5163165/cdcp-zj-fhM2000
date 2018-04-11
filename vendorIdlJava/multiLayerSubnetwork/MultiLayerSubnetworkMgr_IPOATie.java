package multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler 
 */

public class MultiLayerSubnetworkMgr_IPOATie
	extends MultiLayerSubnetworkMgr_IPOA
{
	private MultiLayerSubnetworkMgr_IOperations _delegate;

	private POA _poa;
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
	}
	public MultiLayerSubnetworkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getAllTPPoolNames(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPoolNames(subnetworkName,how_many,nameList,nameIt);
	}

	public void getAllFixedSubnetworkConnectionsWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getTPGroupingRelationships(globaldefs.NameAndStringValue_T[] tpName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPGroupingRelationships(tpName,how_many,nameList,nameIt);
	}

	public void getAllManagedElements(globaldefs.NameAndStringValue_T[] subnetName, int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(subnetName,how_many,meList,meIt);
	}

	public void getCall(globaldefs.NameAndStringValue_T[] callName, callSNC.Call_THolder theCall) throws globaldefs.ProcessingFailureException
	{
_delegate.getCall(callName,theCall);
	}

	public void getConnectionsAndRouteDetails(java.lang.String callID, globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws globaldefs.ProcessingFailureException
	{
_delegate.getConnectionsAndRouteDetails(callID,mLRAName,sNPOrSNPPID,mLSNPPLinkRequested,routeType,connectionAndRouteList);
	}

	public void getAllMLSNPPs(globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPs(subnetName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void getCallAndTopLevelConnections(globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnections(callName,callId,callAndTopLevelConnections);
	}

	public void getAllTopologicalLinkNames(globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinkNames(subnetName,how_many,nameList,nameIt);
	}

	public void getAllEdgePointNames(globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePointNames(subnetName,layerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getAllSubnetworkConnections(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getAllInternalMLSNPPLinks(globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void releaseCall(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.releaseCall(callName,tpsToModify,remainingSNCs,errorReason);
	}

	public void getAllEdgePoints(globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePoints(subnetName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getIntendedRoute(sncName,includeHigherOrderCCs,additionalInfo,route);
	}

	public void getAllSubnetworkConnectionNamesWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllFixedSubnetworkConnectionNamesWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getSNCsByUserLabel(java.lang.String userLabel, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByUserLabel(userLabel,sncList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void createAndActivateSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateSNC(createData,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void createTPPool(multiLayerSubnetwork.TPPoolCreateData_T newTPPoolCreateData, terminationPoint.TerminationPoint_THolder newTPPool) throws globaldefs.ProcessingFailureException
	{
_delegate.createTPPool(newTPPoolCreateData,newTPPool);
	}

	public void getAllFixedSubnetworkConnections(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void setRoutesAdminState(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, subnetworkConnection.SNCState_THolder sncState) throws globaldefs.ProcessingFailureException
	{
_delegate.setRoutesAdminState(sncName,routeNameAndAdminStateList,sncState);
	}

	public void deleteSNC(globaldefs.NameAndStringValue_T[] sncName, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteSNC(sncName,emsFreedomLevel);
	}

	public void switchRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void deactivateAndDeleteSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getAllSubordinateRAidsWithConnection(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateRAidsWithConnection(subnetName,connection,routeType,routePerRouteType);
	}

	public void createModifiedSNC(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createModifiedSNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
	}

	public void getAllSubnetworkConnectionNames(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCs(subnetName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void getAllTopologicalLinks(globaldefs.NameAndStringValue_T[] subnetName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinks(subnetName,how_many,topoList,topoIt);
	}

	public void getTPPool(globaldefs.NameAndStringValue_T[] tPPoolName, terminationPoint.TerminationPoint_THolder tPPool, org.omg.CORBA.IntHolder numberOfMembers, org.omg.CORBA.IntHolder numberOfIdleMembers, org.omg.CORBA.StringHolder descriptionOfUse) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPPool(tPPoolName,tPPool,numberOfMembers,numberOfIdleMembers,descriptionOfUse);
	}

	public void getAllMLSNPPLinks(globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getMultiLayerSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws globaldefs.ProcessingFailureException
	{
_delegate.getMultiLayerSubnetwork(subnetName,subnetwork);
	}

	public void deactivateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void swapSNC(globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.swapSNC(nameOfSNCtoBeDeactivated,nameOfSNCtoBeActivated,emsFreedomLevel,tolerableImpact,tpsToModify,stateOfActivatedSNC,errorReason);
	}

	public void deleteTPPool(globaldefs.NameAndStringValue_T[] tpPoolName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTPPool(tpPoolName);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] tPName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithTP(subnetName,tPName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void getAllFixedSubnetworkConnectionNames(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getRoute(sncName,includeHigherOrderCCs,route);
	}

	public void establishCall(callSNC.CallCreateData_T callCreateData, subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, subnetworkConnection.TPDataList_THolder tpsToModify, callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs, subnetworkConnection.SNCCreateDataList_THolder sNCsNotCreated, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.establishCall(callCreateData,connectionCreateDataList,routeGroupsNumber,tpsToModify,callAndTopLevelConnectionsAndSNCs,sNCsNotCreated,partialSNCs,callErrorReason);
	}

	public void getAllCallsAndTopLevelConnections(globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnections(subnetName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

	public void getSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.SubnetworkConnection_THolder snc) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNC(sncName,snc);
	}

	public void activateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.activateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void checkValidSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws globaldefs.ProcessingFailureException
	{
_delegate.checkValidSNC(createData,tpsToModify,considerResources,valid);
	}

	public void getCallAndTopLevelConnectionsAndSNCs(globaldefs.NameAndStringValue_T[] callName, callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnectionsAndSNCs(callName,callAndTopLevelConnectionsAndSNCs);
	}

	public void getAllEdgeMLSNPPLinks(globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgeMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllCallIdsWithTP(globaldefs.NameAndStringValue_T[] tPName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithTP(tPName,callIdList);
	}

	public void modifyCall(globaldefs.NameAndStringValue_T[] callName, callSNC.CallModifyData_T callModifyData, callSNC.Call_THolder modifiedCall) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyCall(callName,callModifyData,modifiedCall);
	}

	public void modifyTPPool(globaldefs.NameAndStringValue_T[] tPPoolName, globaldefs.NameAndStringValue_T[][] containedMembers, java.lang.String actionType, terminationPoint.TerminationPoint_THolder modifiedTPPool) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyTPPool(tPPoolName,containedMembers,actionType,modifiedTPPool);
	}

	public void modifyDiversityAndCorouting(globaldefs.NameAndStringValue_T[] callName, callSNC.Diversity_T callDiversity, callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, globaldefs.NVSList_THolder additionalInfo, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyDiversityAndCorouting(callName,callDiversity,routeGroupInfoList,connectionRouteReArrangementAllowed,routeGroupsNumber,additionalInfo,callAndTopLevelConnections);
	}

	public void removeConnections(globaldefs.NameAndStringValue_T[] callName, globaldefs.NameAndStringValue_T[][] connectionNamesList, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.removeConnections(callName,connectionNamesList,tpsToModify,sNCsNotDeleted,errorReason);
	}

	public void getRouteAndTopologicalLinks(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.Route_THolder route, topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
	}

	public void removeRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.removeRoute(sncName,routeId,emsFreedomLevel,additionalInfo);
	}

	public void getAllTPPools(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
	}

	public void getTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalLink(topoLinkName,topoLink);
	}

	public void modifySNC(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
	}

	public void getAssociatedTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTP(tpName,tpList);
	}

	public void getMLSNPPLink(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, boolean sNPListRequested, mLSNPPLink.MultiLayerSNPPLink_THolder theMLSNPPLink) throws globaldefs.ProcessingFailureException
	{
_delegate.getMLSNPPLink(mLSNPPLinkName,sNPListRequested,theMLSNPPLink);
	}

	public void getAllCallIdsWithSNPPOrTNAName(globaldefs.NameAndStringValue_T sNPPOrTNAName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithSNPPOrTNAName(sNPPOrTNAName,callIdList);
	}

	public void addRoute(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteCreateData_T createRoute, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.addRoute(sncName,createRoute,tolerableImpact,emsFreedomLevel,theRoute,errorReason);
	}

	public void addConnections(globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder connectionList, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.addConnections(callName,connectionsToAdd,connectionRouteReArrangementAllowed,tpsToModify,connectionList,partialSNCs,errorReason);
	}

	public void createSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createSNC(createData,tolerableImpact,emsFreedomLevel,theSNC,errorReason);
	}

	public void getAllSubnetworkConnectionsWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getAllCallsAndTopLevelConnectionsWithME(globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

	public void getAllManagedElementNames(globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(subnetName,how_many,nameList,nameIt);
	}

	public void getBackupRoutes(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.RouteList_THolder routeList) throws globaldefs.ProcessingFailureException
	{
_delegate.getBackupRoutes(sncName,routeId,includeHigherOrderCCs,additionalInfo,routeList);
	}

	public void getAllSubordinateMLSNs(globaldefs.NameAndStringValue_T[] subnetName, int how_many, multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateMLSNs(subnetName,how_many,subordinateMLSNsList,subnetIt);
	}

	public void setIntendedRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setIntendedRoute(sncName,routeId,additionalInfo);
	}

}
