package org.omg.CosEventComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "PushConsumer"
 *	@author JacORB IDL compiler 
 */

public class PushConsumerPOATie
	extends PushConsumerPOA
{
	private PushConsumerOperations _delegate;

	private POA _poa;
	public PushConsumerPOATie(PushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public PushConsumerPOATie(PushConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventComm.PushConsumer _this()
	{
		return org.omg.CosEventComm.PushConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosEventComm.PushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventComm.PushConsumerHelper.narrow(_this_object(orb));
	}
	public PushConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public void disconnect_push_consumer()
	{
_delegate.disconnect_push_consumer();
	}

	public void push(org.omg.CORBA.Any data) throws org.omg.CosEventComm.Disconnected
	{
_delegate.push(data);
	}

}
