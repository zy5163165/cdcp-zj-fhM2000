package ipMgrCMCC;

/**
 *	Generated from IDL definition of interface "FRRIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface FRRIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, ipMgrCMCC.FRRList_THolder frrList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
