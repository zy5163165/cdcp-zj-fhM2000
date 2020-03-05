package org.omg.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "StructuredProxyPushSupplier"
 *	@author JacORB IDL compiler 
 */

public class StructuredProxyPushSupplierPOATie
	extends StructuredProxyPushSupplierPOA
{
	private StructuredProxyPushSupplierOperations _delegate;

	private POA _poa;
	public StructuredProxyPushSupplierPOATie(StructuredProxyPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredProxyPushSupplierPOATie(StructuredProxyPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplier _this()
	{
		return org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.narrow(_this_object(orb));
	}
	public StructuredProxyPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredProxyPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public void suspend_connection() throws org.omg.CosNotifyChannelAdmin.NotConnected,org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive
	{
_delegate.suspend_connection();
	}

	public org.omg.CosNotifyFilter.MappingFilter lifetime_filter()
	{
		return _delegate.lifetime_filter();
	}

	public org.omg.CosNotifyChannelAdmin.ProxyType MyType()
	{
		return _delegate.MyType();
	}

	public org.omg.CosNotifyFilter.MappingFilter priority_filter()
	{
		return _delegate.priority_filter();
	}

	public void disconnect_structured_push_supplier()
	{
_delegate.disconnect_structured_push_supplier();
	}

	public org.omg.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public void resume_connection() throws org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive,org.omg.CosNotifyChannelAdmin.NotConnected
	{
_delegate.resume_connection();
	}

	public org.omg.CosNotification.EventType[] obtain_offered_types(org.omg.CosNotifyChannelAdmin.ObtainInfoMode mode)
	{
		return _delegate.obtain_offered_types(mode);
	}

	public int add_filter(org.omg.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void priority_filter(org.omg.CosNotifyFilter.MappingFilter a)
	{
		_delegate.priority_filter(a);
	}

	public void validate_event_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_event_qos(required_qos,available_qos);
	}

	public void remove_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public void connect_structured_push_consumer(org.omg.CosNotifyComm.StructuredPushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError
	{
_delegate.connect_structured_push_consumer(push_consumer);
	}

	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public void lifetime_filter(org.omg.CosNotifyFilter.MappingFilter a)
	{
		_delegate.lifetime_filter(a);
	}

	public org.omg.CosNotifyChannelAdmin.ConsumerAdmin MyAdmin()
	{
		return _delegate.MyAdmin();
	}

}
