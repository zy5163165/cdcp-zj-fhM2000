package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "EXMegEntityDataIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface EXMegEntityDataIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedEmsMgr.EXMegEntityDataList_THolder megList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
