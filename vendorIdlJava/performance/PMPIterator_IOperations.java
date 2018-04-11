package performance;

/**
 *	Generated from IDL definition of interface "PMPIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface PMPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.PMPList_THolder pmpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
