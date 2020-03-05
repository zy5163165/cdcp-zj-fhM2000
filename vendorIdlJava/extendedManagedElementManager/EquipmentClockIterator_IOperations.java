package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "EquipmentClockIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface EquipmentClockIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedManagedElementManager.EquipmentClockList_THolder equipmentClockList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
