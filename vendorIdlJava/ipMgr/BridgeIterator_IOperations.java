package ipMgr;

/**
 *	Generated from IDL definition of interface "BridgeIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface BridgeIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, ipMgr.BridgeList_THolder bridgeList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
