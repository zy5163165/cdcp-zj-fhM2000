package performance;

/**
 *	Generated from IDL definition of interface "PMDataIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface PMDataIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.PMDataList_THolder pmDataList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
