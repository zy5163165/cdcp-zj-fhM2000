package nmsSession;

/**
 *	Generated from IDL definition of interface "NmsSession_I"
 *	@author JacORB IDL compiler 
 */


public interface NmsSession_IOperations
	extends session.Session_IOperations
{
	/* constants */
	/* operations  */
	void eventLossOccurred(java.lang.String startTime, java.lang.String notificationId);
	void eventLossCleared(java.lang.String endTime);
	void alarmLossOccurred(java.lang.String startTime, java.lang.String notificationId);
}
