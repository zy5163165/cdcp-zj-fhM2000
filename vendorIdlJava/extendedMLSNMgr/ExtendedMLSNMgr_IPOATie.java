package extendedMLSNMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ExtendedMLSNMgr_I"
 *	@author JacORB IDL compiler 
 */

public class ExtendedMLSNMgr_IPOATie
	extends ExtendedMLSNMgr_IPOA
{
	private ExtendedMLSNMgr_IOperations _delegate;

	private POA _poa;
	public ExtendedMLSNMgr_IPOATie(ExtendedMLSNMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExtendedMLSNMgr_IPOATie(ExtendedMLSNMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedMLSNMgr.ExtendedMLSNMgr_I _this()
	{
		return extendedMLSNMgr.ExtendedMLSNMgr_IHelper.narrow(_this_object());
	}
	public extendedMLSNMgr.ExtendedMLSNMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedMLSNMgr.ExtendedMLSNMgr_IHelper.narrow(_this_object(orb));
	}
	public ExtendedMLSNMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExtendedMLSNMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void createTNetworkProtectionGroup(extendedMLSNMgr.TNetworkProtectionGroup_T tNProtectionGroupToCreate, extendedMLSNMgr.TNetworkProtectionGroup_THolder createdTNProtectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.createTNetworkProtectionGroup(tNProtectionGroupToCreate,createdTNProtectionGroup);
	}

	public void getTNetworkProtectionGroups(globaldefs.NameAndStringValue_T[] subnetName, java.lang.String protectionType, int how_many, extendedMLSNMgr.TNProtectionGroupList_THolder tnProtectionGroupList, extendedMLSNMgr.TNProtectionGroupIterator_IHolder tnpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTNetworkProtectionGroups(subnetName,protectionType,how_many,tnProtectionGroupList,tnpIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void deleteTNetworkProtectionGroups(globaldefs.NameAndStringValue_T[] tnProtectionGroupName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTNetworkProtectionGroups(tnProtectionGroupName);
	}

	public void modifyTNetworkProtectionGroups(java.lang.String modifyType, extendedMLSNMgr.TNetworkProtectionGroup_T tnProtectionGroupToModify, extendedMLSNMgr.TNetworkProtectionGroup_THolder tnProtectionGroupModified) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyTNetworkProtectionGroups(modifyType,tnProtectionGroupToModify,tnProtectionGroupModified);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setMLSNPPLinkSRLGs(java.lang.String sRLGName, globaldefs.NameAndStringValue_T[][] mLSNPPLinkNames) throws globaldefs.ProcessingFailureException
	{
_delegate.setMLSNPPLinkSRLGs(sRLGName,mLSNPPLinkNames);
	}

	public void performTnpProtectionCommand(protection.ProtectionCommand_T protectionCommand, extendedMLSNMgr.TNetworkProtectionGroup_T oneTnpData, globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.SwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.performTnpProtectionCommand(protectionCommand,oneTnpData,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
	}

	public void getMLSNBackBoneRoute(globaldefs.NameAndStringValue_T[] subnetName, int how_many, extendedMLSNMgr.MLSNSubNetWorkList_THolder mlsnSubnetworkList, extendedMLSNMgr.MLSNSubNetWorkIterator_IHolder mlsnSubnetworkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getMLSNBackBoneRoute(subnetName,how_many,mlsnSubnetworkList,mlsnSubnetworkIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
