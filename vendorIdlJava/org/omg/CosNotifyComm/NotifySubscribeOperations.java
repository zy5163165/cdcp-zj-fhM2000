package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of interface "NotifySubscribe"
 *	@author JacORB IDL compiler 
 */


public interface NotifySubscribeOperations
{
	/* constants */
	/* operations  */
	void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType;
}
