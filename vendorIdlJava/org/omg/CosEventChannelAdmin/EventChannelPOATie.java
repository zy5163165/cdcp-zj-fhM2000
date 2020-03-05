package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "EventChannel"
 *	@author JacORB IDL compiler 
 */

public class EventChannelPOATie
	extends EventChannelPOA
{
	private EventChannelOperations _delegate;

	private POA _poa;
	public EventChannelPOATie(EventChannelOperations delegate)
	{
		_delegate = delegate;
	}
	public EventChannelPOATie(EventChannelOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.EventChannel _this()
	{
		return org.omg.CosEventChannelAdmin.EventChannelHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.EventChannel _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.EventChannelHelper.narrow(_this_object(orb));
	}
	public EventChannelOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventChannelOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosEventChannelAdmin.ConsumerAdmin for_consumers()
	{
		return _delegate.for_consumers();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CosEventChannelAdmin.SupplierAdmin for_suppliers()
	{
		return _delegate.for_suppliers();
	}

}
