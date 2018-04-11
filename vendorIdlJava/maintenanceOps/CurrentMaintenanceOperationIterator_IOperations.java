package maintenanceOps;

/**
 *	Generated from IDL definition of interface "CurrentMaintenanceOperationIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface CurrentMaintenanceOperationIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder cMOList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
