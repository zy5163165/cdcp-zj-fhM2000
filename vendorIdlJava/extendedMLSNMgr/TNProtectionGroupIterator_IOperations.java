package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "TNProtectionGroupIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface TNProtectionGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedMLSNMgr.TNProtectionGroupList_THolder tNetworkProtectGroupList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
