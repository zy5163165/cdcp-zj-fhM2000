package ipMgrCMCC;

/**
 *	Generated from IDL definition of interface "StaticRoutingIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface StaticRoutingIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, ipMgrCMCC.StaticRoutingList_THolder srList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
