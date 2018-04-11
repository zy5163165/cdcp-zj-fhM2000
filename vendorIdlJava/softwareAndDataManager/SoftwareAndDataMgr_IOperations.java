package softwareAndDataManager;

/**
 *	Generated from IDL definition of interface "SoftwareAndDataMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface SoftwareAndDataMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void backupME(globaldefs.NameAndStringValue_T[] managedElementName) throws globaldefs.ProcessingFailureException;
	void getMEBackupStatus(globaldefs.NameAndStringValue_T[] managedElementName, softwareAndDataManager.BackupStatus_THolder backupStatus) throws globaldefs.ProcessingFailureException;
	void abortMEBackup(globaldefs.NameAndStringValue_T[] managedElementName) throws globaldefs.ProcessingFailureException;
	void getBackupList(globaldefs.NameAndStringValue_T[][] managedElementNameList, int how_many, softwareAndDataManager.BackupIdList_THolder backupList, softwareAndDataManager.BackupIdIterator_IHolder backupIt) throws globaldefs.ProcessingFailureException;
}
