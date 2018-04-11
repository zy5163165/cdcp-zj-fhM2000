package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "ClockLinkNetIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface ClockLinkNetIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedManagedElementManager.ClockLinkNetList_THolder clockLinkNetList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
