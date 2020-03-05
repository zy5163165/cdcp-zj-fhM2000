package terminationPoint;

/**
 *	Generated from IDL definition of interface "GTPiterator_I"
 *	@author JacORB IDL compiler 
 */


public interface GTPiterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, terminationPoint.GTPlist_THolder gtpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
