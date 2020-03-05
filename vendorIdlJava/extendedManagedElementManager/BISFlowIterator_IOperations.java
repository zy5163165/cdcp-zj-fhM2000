package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "BISFlowIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface BISFlowIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedManagedElementManager.BoardInternalSignalFlowList_THolder internalSignalFlowList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
