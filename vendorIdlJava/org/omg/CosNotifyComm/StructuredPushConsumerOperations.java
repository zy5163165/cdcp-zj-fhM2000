package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of interface "StructuredPushConsumer"
 *	@author JacORB IDL compiler 
 */


public interface StructuredPushConsumerOperations
	extends org.omg.CosNotifyComm.NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void push_structured_event(org.omg.CosNotification.StructuredEvent notification) throws org.omg.CosEventComm.Disconnected;
	void disconnect_structured_push_consumer();
}
