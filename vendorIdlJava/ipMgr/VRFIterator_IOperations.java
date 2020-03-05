package ipMgr;

/**
 *	Generated from IDL definition of interface "VRFIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface VRFIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, ipMgr.VRFList_THolder vrfList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
