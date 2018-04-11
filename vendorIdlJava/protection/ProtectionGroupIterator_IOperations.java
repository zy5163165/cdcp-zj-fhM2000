package protection;

/**
 *	Generated from IDL definition of interface "ProtectionGroupIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface ProtectionGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, protection.ProtectionGroupList_THolder pgpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
