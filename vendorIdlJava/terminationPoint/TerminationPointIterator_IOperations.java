package terminationPoint;

/**
 *	Generated from IDL definition of interface "TerminationPointIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface TerminationPointIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
