package mLSNPP;

/**
 *	Generated from IDL definition of interface "MLSNPPIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface MLSNPPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
