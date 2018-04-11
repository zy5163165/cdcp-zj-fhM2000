package flowDomainFragment;

/**
 *	Generated from IDL definition of interface "FDFrIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface FDFrIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomainFragment.FDFrList_THolder fdfrList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
