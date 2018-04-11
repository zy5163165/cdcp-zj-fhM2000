package ipMgr;

/**
 *	Generated from IDL definition of interface "IPMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface IPMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllBridges(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.BridgeList_THolder bridgeList, ipMgr.BridgeIterator_IHolder bridgeIt) throws globaldefs.ProcessingFailureException;
	void getAllStaticRoutings(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.StaticRoutingList_THolder srList, ipMgr.StaticRoutingIterator_IHolder srIt) throws globaldefs.ProcessingFailureException;
	void getAllVRFs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.VRFList_THolder vrfList, ipMgr.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException;
	void getFDFrVRFs(globaldefs.NameAndStringValue_T[] fdfrName, int how_many, ipMgr.VRFList_THolder vrfList, ipMgr.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException;
	void getAllFRRs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.FRRList_THolder frrList, ipMgr.FRRIterator_IHolder frrIt) throws globaldefs.ProcessingFailureException;
	void getAllVRRPs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgr.VRRPList_THolder vrrpList, ipMgr.VRRPIterator_IHolder vrrpIt) throws globaldefs.ProcessingFailureException;
}
