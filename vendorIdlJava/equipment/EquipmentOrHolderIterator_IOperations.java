package equipment;

/**
 *	Generated from IDL definition of interface "EquipmentOrHolderIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface EquipmentOrHolderIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
