package globaldefs;

/**
 *	Generated from IDL definition of interface "NamingAttributesIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface NamingAttributesIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
