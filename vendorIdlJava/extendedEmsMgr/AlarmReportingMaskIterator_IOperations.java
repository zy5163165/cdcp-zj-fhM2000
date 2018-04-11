package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "AlarmReportingMaskIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface AlarmReportingMaskIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedEmsMgr.AlarmReportingMaskList_THolder alarmReportingMaskList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
