package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "CCCapacityIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface CCCapacityIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedManagedElementManager.CCCapacityList_THolder CCCapacityList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
