package topologicalLink;

/**
 *	Generated from IDL definition of interface "TopologicalLinkIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface TopologicalLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, topologicalLink.TopologicalLinkList_THolder topoLinkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
