package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of interface "FaultGroupIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface FaultGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, FH_FaultAnalyzer.FaultGroupList_THolder faultGroupList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
