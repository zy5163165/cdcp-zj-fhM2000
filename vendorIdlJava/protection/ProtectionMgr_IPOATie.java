package protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler 
 */

public class ProtectionMgr_IPOATie
	extends ProtectionMgr_IPOA
{
	private ProtectionMgr_IOperations _delegate;

	private POA _poa;
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public protection.ProtectionMgr_I _this()
	{
		return protection.ProtectionMgr_IHelper.narrow(_this_object());
	}
	public protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.ProtectionMgr_IHelper.narrow(_this_object(orb));
	}
	public ProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getAllProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.ProtectionGroupList_THolder pgList, protection.ProtectionGroupIterator_IHolder pgpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionGroups(meName,how_many,pgList,pgpIt);
	}

	public void getAllEProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.EProtectionGroupList_THolder epgpList, protection.EProtectionGroupIterator_IHolder epgpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEProtectionGroups(meName,how_many,epgpList,epgpIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllProtectedTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectedTPNames(pgName,how_many,nameList,nameIt);
	}

	public void getContainingPGNames(globaldefs.NameAndStringValue_T[] pTPName, globaldefs.NamingAttributesList_THolder pgNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getContainingPGNames(pTPName,pgNameList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void performProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.SwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.performProtectionCommand(protectionCommand,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
	}

	public void getEProtectionGroup(globaldefs.NameAndStringValue_T[] ePGPname, protection.EProtectionGroup_THolder eProtectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.getEProtectionGroup(ePGPname,eProtectionGroup);
	}

	public void retrieveSwitchData(globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, protection.SwitchDataList_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void retrieveESwitchData(globaldefs.NameAndStringValue_T[] ePGPName, protection.ESwitchDataList_THolder eSwitchDataList) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveESwitchData(ePGPName,eSwitchDataList);
	}

	public void getProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.ProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.getProtectionGroup(pgName,protectionGroup);
	}

	public void getAllNUTTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllNUTTPNames(pgName,how_many,nameList,nameIt);
	}

	public void getAllPreemptibleTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPreemptibleTPNames(pgName,how_many,nameList,nameIt);
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
