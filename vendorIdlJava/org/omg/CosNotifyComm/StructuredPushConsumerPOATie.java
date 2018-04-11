package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "StructuredPushConsumer"
 *	@author JacORB IDL compiler 
 */

public class StructuredPushConsumerPOATie
	extends StructuredPushConsumerPOA
{
	private StructuredPushConsumerOperations _delegate;

	private POA _poa;
	public StructuredPushConsumerPOATie(StructuredPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPushConsumerPOATie(StructuredPushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.StructuredPushConsumer _this()
	{
		return org.omg.CosNotifyComm.StructuredPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.StructuredPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.StructuredPushConsumerHelper.narrow(_this_object(orb));
	}
	public StructuredPushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public void disconnect_structured_push_consumer()
	{
_delegate.disconnect_structured_push_consumer();
	}

	public void push_structured_event(org.omg.CosNotification.StructuredEvent notification) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push_structured_event(notification);
	}

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
