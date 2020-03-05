package trailNtwProtection;

/**
 *	Generated from IDL definition of interface "TrailNtwProtectionIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface TrailNtwProtectionIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, trailNtwProtection.TrailNtwProtectionList_THolder tnpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
