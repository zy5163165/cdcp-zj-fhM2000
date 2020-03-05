package org.omg.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ProxyConsumer"
 *	@author JacORB IDL compiler 
 */

public class ProxyConsumerPOATie
	extends ProxyConsumerPOA
{
	private ProxyConsumerOperations _delegate;

	private POA _poa;
	public ProxyConsumerPOATie(ProxyConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyConsumerPOATie(ProxyConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyChannelAdmin.ProxyConsumer _this()
	{
		return org.omg.CosNotifyChannelAdmin.ProxyConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.ProxyConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.ProxyConsumerHelper.narrow(_this_object(orb));
	}
	public ProxyConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosNotifyChannelAdmin.ProxyType MyType()
	{
		return _delegate.MyType();
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public void validate_event_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_event_qos(required_qos,available_qos);
	}

	public org.omg.CosNotification.EventType[] obtain_subscription_types(org.omg.CosNotifyChannelAdmin.ObtainInfoMode mode)
	{
		return _delegate.obtain_subscription_types(mode);
	}

	public int add_filter(org.omg.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void remove_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.CosNotifyChannelAdmin.SupplierAdmin MyAdmin()
	{
		return _delegate.MyAdmin();
	}

	public org.omg.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

}
