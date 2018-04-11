package maintenanceOps;

/**
 *	Generated from IDL definition of interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface MaintenanceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws globaldefs.ProcessingFailureException;
	void getActiveMaintenanceOperations(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList, maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws globaldefs.ProcessingFailureException;
}
