package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of interface "SequencePushConsumer"
 *	@author JacORB IDL compiler 
 */


public interface SequencePushConsumerOperations
	extends org.omg.CosNotifyComm.NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void push_structured_events(org.omg.CosNotification.StructuredEvent[] notifications) throws org.omg.CosEventComm.Disconnected;
	void disconnect_sequence_push_consumer();
}
