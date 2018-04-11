package mLSNPPLink;

/**
 *	Generated from IDL definition of interface "MLSNPPLinkIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface MLSNPPLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLink) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
