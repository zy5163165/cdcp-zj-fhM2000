package flowDomain;

/**
 *	Generated from IDL definition of interface "MFDIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface MFDIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomain.MFDList_THolder mfdList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
