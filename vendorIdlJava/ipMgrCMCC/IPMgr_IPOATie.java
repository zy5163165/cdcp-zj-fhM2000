package ipMgrCMCC;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "IPMgr_I"
 *	@author JacORB IDL compiler 
 */

public class IPMgr_IPOATie
	extends IPMgr_IPOA
{
	private IPMgr_IOperations _delegate;

	private POA _poa;
	public IPMgr_IPOATie(IPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public IPMgr_IPOATie(IPMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ipMgrCMCC.IPMgr_I _this()
	{
		return ipMgrCMCC.IPMgr_IHelper.narrow(_this_object());
	}
	public ipMgrCMCC.IPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgrCMCC.IPMgr_IHelper.narrow(_this_object(orb));
	}
	public IPMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getAllStaticRoutings(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.StaticRoutingList_THolder srList, ipMgrCMCC.StaticRoutingIterator_IHolder srIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllStaticRoutings(managedElementName,how_many,srList,srIt);
	}

	public void getAllBridges(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.BridgeList_THolder bridgeList, ipMgrCMCC.BridgeIterator_IHolder bridgeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllBridges(managedElementName,how_many,bridgeList,bridgeIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllVRRPs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.VRRPList_THolder vrrpList, ipMgrCMCC.VRRPIterator_IHolder vrrpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVRRPs(managedElementName,how_many,vrrpList,vrrpIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getFDFrVRFs(globaldefs.NameAndStringValue_T[] fdfrName, int how_many, ipMgrCMCC.VRFList_THolder vrfList, ipMgrCMCC.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrVRFs(fdfrName,how_many,vrfList,vrfIt);
	}

	public void getAllFRRs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.FRRList_THolder frrList, ipMgrCMCC.FRRIterator_IHolder frrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFRRs(managedElementName,how_many,frrList,frrIt);
	}

	public void getAllVRFs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.VRFList_THolder vrfList, ipMgrCMCC.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVRFs(managedElementName,how_many,vrfList,vrfIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
