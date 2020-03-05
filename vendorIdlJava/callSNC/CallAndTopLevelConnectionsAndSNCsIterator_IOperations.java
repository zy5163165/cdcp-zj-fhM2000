package callSNC;

/**
 *	Generated from IDL definition of interface "CallAndTopLevelConnectionsAndSNCsIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface CallAndTopLevelConnectionsAndSNCsIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
