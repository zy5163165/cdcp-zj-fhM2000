package flowDomainFragment;

/**
 *	Generated from IDL definition of interface "MFDFrIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface MFDFrIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
