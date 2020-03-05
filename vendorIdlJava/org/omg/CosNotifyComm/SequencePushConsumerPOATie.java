package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "SequencePushConsumer"
 *	@author JacORB IDL compiler 
 */

public class SequencePushConsumerPOATie
	extends SequencePushConsumerPOA
{
	private SequencePushConsumerOperations _delegate;

	private POA _poa;
	public SequencePushConsumerPOATie(SequencePushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePushConsumerPOATie(SequencePushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.SequencePushConsumer _this()
	{
		return org.omg.CosNotifyComm.SequencePushConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.SequencePushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.SequencePushConsumerHelper.narrow(_this_object(orb));
	}
	public SequencePushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public void push_structured_events(org.omg.CosNotification.StructuredEvent[] notifications) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push_structured_events(notifications);
	}

	public void disconnect_sequence_push_consumer()
	{
_delegate.disconnect_sequence_push_consumer();
	}

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
