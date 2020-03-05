package ipMgrCMCC;

/**
 *	Generated from IDL definition of interface "VRRPIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface VRRPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, ipMgrCMCC.VRRPList_THolder vrrpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
