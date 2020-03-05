package notifications;

/**
 *	Generated from IDL definition of interface "EventIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface EventIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, notifications.EventList_THolder eventList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
