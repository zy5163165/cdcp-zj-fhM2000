package org.omg.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "EventChannelFactory"
 *	@author JacORB IDL compiler 
 */

public class EventChannelFactoryPOATie
	extends EventChannelFactoryPOA
{
	private EventChannelFactoryOperations _delegate;

	private POA _poa;
	public EventChannelFactoryPOATie(EventChannelFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public EventChannelFactoryPOATie(EventChannelFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyChannelAdmin.EventChannelFactory _this()
	{
		return org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.EventChannelFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(_this_object(orb));
	}
	public EventChannelFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventChannelFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosNotifyChannelAdmin.EventChannel create_channel(org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS
	{
		return _delegate.create_channel(initial_qos,initial_admin,id);
	}

	public org.omg.CosNotifyChannelAdmin.EventChannel get_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound
	{
		return _delegate.get_event_channel(id);
	}

	public int[] get_all_channels()
	{
		return _delegate.get_all_channels();
	}

}
