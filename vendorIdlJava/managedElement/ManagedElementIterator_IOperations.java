package managedElement;

/**
 *	Generated from IDL definition of interface "ManagedElementIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface ManagedElementIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, managedElement.ManagedElementList_THolder meList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
