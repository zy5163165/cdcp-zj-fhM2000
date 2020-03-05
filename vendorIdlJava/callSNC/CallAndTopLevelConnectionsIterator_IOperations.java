package callSNC;

/**
 *	Generated from IDL definition of interface "CallAndTopLevelConnectionsIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface CallAndTopLevelConnectionsIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
