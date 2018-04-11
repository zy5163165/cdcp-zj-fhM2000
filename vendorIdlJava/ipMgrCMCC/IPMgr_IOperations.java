package ipMgrCMCC;

/**
 *	Generated from IDL definition of interface "IPMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface IPMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllBridges(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.BridgeList_THolder bridgeList, ipMgrCMCC.BridgeIterator_IHolder bridgeIt) throws globaldefs.ProcessingFailureException;
	void getAllStaticRoutings(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.StaticRoutingList_THolder srList, ipMgrCMCC.StaticRoutingIterator_IHolder srIt) throws globaldefs.ProcessingFailureException;
	void getAllVRFs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.VRFList_THolder vrfList, ipMgrCMCC.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException;
	void getFDFrVRFs(globaldefs.NameAndStringValue_T[] fdfrName, int how_many, ipMgrCMCC.VRFList_THolder vrfList, ipMgrCMCC.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException;
	void getAllFRRs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.FRRList_THolder frrList, ipMgrCMCC.FRRIterator_IHolder frrIt) throws globaldefs.ProcessingFailureException;
	void getAllVRRPs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.VRRPList_THolder vrrpList, ipMgrCMCC.VRRPIterator_IHolder vrrpIt) throws globaldefs.ProcessingFailureException;
}
