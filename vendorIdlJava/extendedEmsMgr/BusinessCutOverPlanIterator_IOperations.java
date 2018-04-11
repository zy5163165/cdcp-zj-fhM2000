package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "BusinessCutOverPlanIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface BusinessCutOverPlanIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedEmsMgr.BusinessCutOverPlanList_THolder bcoPlanList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
