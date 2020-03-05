package extendedMaintenanceMgrOps;

/**
 *	Generated from IDL definition of interface "extendedMaintenanceMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface extendedMaintenanceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList) throws globaldefs.ProcessingFailureException;
	void performMaintenanceOperationList(maintenanceOps.CurrentMaintenanceOperation_T[] maintenanceOperationList, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList) throws globaldefs.ProcessingFailureException;
}
