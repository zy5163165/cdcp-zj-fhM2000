package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of interface "ExMFDFrIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface ExMFDFrIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
