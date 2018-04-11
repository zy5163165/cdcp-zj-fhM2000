package aSAP;

/**
 *	Generated from IDL definition of interface "ASAPIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface ASAPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, aSAP.ASAPList_THolder aSAPList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
