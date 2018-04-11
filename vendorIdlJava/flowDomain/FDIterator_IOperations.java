package flowDomain;

/**
 *	Generated from IDL definition of interface "FDIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface FDIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomain.FDList_THolder fdList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
