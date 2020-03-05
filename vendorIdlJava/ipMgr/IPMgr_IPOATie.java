package ipMgr;

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
	public ipMgr.IPMgr_I _this()
	{
		return ipMgr.IPMgr_IHelper.narrow(_this_object());
	}
	public ipMgr.IPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgr.IPMgr_IHelper.narrow(_this_object(orb));
	}
	public IPMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getAllStaticRoutings(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.StaticRoutingList_THolder srList, ipMgr.StaticRoutingIterator_IHolder srIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllStaticRoutings(managedElementName,how_many,srList,srIt);
	}

	public void getAllVRFs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.VRFList_THolder vrfList, ipMgr.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVRFs(managedElementName,how_many,vrfList,vrfIt);
	}

	public void getAllVRRPs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.VRRPList_THolder vrrpList, ipMgr.VRRPIterator_IHolder vrrpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVRRPs(managedElementName,how_many,vrrpList,vrrpIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getFDFrVRFs(globaldefs.NameAndStringValue_T[] fdfrName, int how_many, ipMgr.VRFList_THolder vrfList, ipMgr.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getFDFrVRFs(fdfrName,how_many,vrfList,vrfIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllFRRs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.FRRList_THolder frrList, ipMgr.FRRIterator_IHolder frrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFRRs(managedElementName,how_many,frrList,frrIt);
	}

	public void getAllBridges(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.BridgeList_THolder bridgeList, ipMgr.BridgeIterator_IHolder bridgeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllBridges(managedElementName,how_many,bridgeList,bridgeIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
