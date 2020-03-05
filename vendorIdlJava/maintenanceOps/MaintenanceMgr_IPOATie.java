package maintenanceOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler 
 */

public class MaintenanceMgr_IPOATie
	extends MaintenanceMgr_IPOA
{
	private MaintenanceMgr_IOperations _delegate;

	private POA _poa;
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public maintenanceOps.MaintenanceMgr_I _this()
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object());
	}
	public maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object(orb));
	}
	public MaintenanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaintenanceMgr_IOperations delegate)
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

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getActiveMaintenanceOperations(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList, maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getActiveMaintenanceOperations(tpOrMeName,how_many,currentMaintenanceOperationList,cmoIt);
	}

	public void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode);
	}

}
