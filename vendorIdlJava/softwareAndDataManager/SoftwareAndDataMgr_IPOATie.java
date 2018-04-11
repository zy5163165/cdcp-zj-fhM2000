package softwareAndDataManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "SoftwareAndDataMgr_I"
 *	@author JacORB IDL compiler 
 */

public class SoftwareAndDataMgr_IPOATie
	extends SoftwareAndDataMgr_IPOA
{
	private SoftwareAndDataMgr_IOperations _delegate;

	private POA _poa;
	public SoftwareAndDataMgr_IPOATie(SoftwareAndDataMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public SoftwareAndDataMgr_IPOATie(SoftwareAndDataMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public softwareAndDataManager.SoftwareAndDataMgr_I _this()
	{
		return softwareAndDataManager.SoftwareAndDataMgr_IHelper.narrow(_this_object());
	}
	public softwareAndDataManager.SoftwareAndDataMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return softwareAndDataManager.SoftwareAndDataMgr_IHelper.narrow(_this_object(orb));
	}
	public SoftwareAndDataMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SoftwareAndDataMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getMEBackupStatus(globaldefs.NameAndStringValue_T[] managedElementName, softwareAndDataManager.BackupStatus_THolder backupStatus) throws globaldefs.ProcessingFailureException
	{
_delegate.getMEBackupStatus(managedElementName,backupStatus);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void backupME(globaldefs.NameAndStringValue_T[] managedElementName) throws globaldefs.ProcessingFailureException
	{
_delegate.backupME(managedElementName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void abortMEBackup(globaldefs.NameAndStringValue_T[] managedElementName) throws globaldefs.ProcessingFailureException
	{
_delegate.abortMEBackup(managedElementName);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getBackupList(globaldefs.NameAndStringValue_T[][] managedElementNameList, int how_many, softwareAndDataManager.BackupIdList_THolder backupList, softwareAndDataManager.BackupIdIterator_IHolder backupIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getBackupList(managedElementNameList,how_many,backupList,backupIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
