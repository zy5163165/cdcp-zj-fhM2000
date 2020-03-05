package softwareAndDataManager;

/**
 *	Generated from IDL definition of interface "BackupIdIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface BackupIdIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, softwareAndDataManager.BackupIdList_THolder backupList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
