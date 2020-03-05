package protection;

/**
 *	Generated from IDL definition of interface "EProtectionGroupIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface EProtectionGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, protection.EProtectionGroupList_THolder ePGPList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
