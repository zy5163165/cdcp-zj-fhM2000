package performance;

/**
 *	Generated from IDL definition of interface "TCAParameterProfileIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface TCAParameterProfileIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.TCAParameterProfileList_THolder tcaParameterProfileList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
