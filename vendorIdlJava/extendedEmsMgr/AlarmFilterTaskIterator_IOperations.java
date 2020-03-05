package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "AlarmFilterTaskIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface AlarmFilterTaskIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedEmsMgr.AlarmFilterTaskList_THolder alarmFilterMaskList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
