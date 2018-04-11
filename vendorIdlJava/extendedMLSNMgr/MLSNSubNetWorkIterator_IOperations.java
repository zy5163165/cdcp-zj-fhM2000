package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "MLSNSubNetWorkIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface MLSNSubNetWorkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedMLSNMgr.MLSNSubNetWorkList_THolder mlsnSubNetWorkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
