package extendedMaintenanceMgrOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "extendedMaintenanceMgr_I"
 *	@author JacORB IDL compiler 
 */

public class extendedMaintenanceMgr_IPOATie
	extends extendedMaintenanceMgr_IPOA
{
	private extendedMaintenanceMgr_IOperations _delegate;

	private POA _poa;
	public extendedMaintenanceMgr_IPOATie(extendedMaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public extendedMaintenanceMgr_IPOATie(extendedMaintenanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedMaintenanceMgrOps.extendedMaintenanceMgr_I _this()
	{
		return extendedMaintenanceMgrOps.extendedMaintenanceMgr_IHelper.narrow(_this_object());
	}
	public extendedMaintenanceMgrOps.extendedMaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedMaintenanceMgrOps.extendedMaintenanceMgr_IHelper.narrow(_this_object(orb));
	}
	public extendedMaintenanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(extendedMaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void performMaintenanceOperationList(maintenanceOps.CurrentMaintenanceOperation_T[] maintenanceOperationList, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList) throws globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperationList(maintenanceOperationList,maintenanceOperationMode,currentMaintenanceOperationList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList) throws globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode,currentMaintenanceOperationList);
	}

}
