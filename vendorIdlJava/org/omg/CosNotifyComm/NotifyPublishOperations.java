package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of interface "NotifyPublish"
 *	@author JacORB IDL compiler 
 */


public interface NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType;
}
