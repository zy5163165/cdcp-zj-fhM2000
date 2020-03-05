package org.omg.CosNotifyChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ConsumerAdmin"
 *	@author JacORB IDL compiler 
 */

public class ConsumerAdminPOATie
	extends ConsumerAdminPOA
{
	private ConsumerAdminOperations _delegate;

	private POA _poa;
	public ConsumerAdminPOATie(ConsumerAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public ConsumerAdminPOATie(ConsumerAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyChannelAdmin.ConsumerAdmin _this()
	{
		return org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.ConsumerAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.narrow(_this_object(orb));
	}
	public ConsumerAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConsumerAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		return _delegate.obtain_pull_supplier();
	}

	public org.omg.CosNotifyChannelAdmin.ProxySupplier get_proxy_supplier(int proxy_id) throws org.omg.CosNotifyChannelAdmin.ProxyNotFound
	{
		return _delegate.get_proxy_supplier(proxy_id);
	}

	public int MyID()
	{
		return _delegate.MyID();
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public org.omg.CosNotifyFilter.MappingFilter lifetime_filter()
	{
		return _delegate.lifetime_filter();
	}

	public org.omg.CosNotifyFilter.MappingFilter priority_filter()
	{
		return _delegate.priority_filter();
	}

	public org.omg.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public org.omg.CosNotifyChannelAdmin.ProxySupplier obtain_notification_pull_supplier(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_pull_supplier(ctype,proxy_id);
	}

	public org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator()
	{
		return _delegate.MyOperator();
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public int[] pull_suppliers()
	{
		return _delegate.pull_suppliers();
	}

	public org.omg.CosNotifyChannelAdmin.ProxySupplier obtain_notification_push_supplier(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_push_supplier(ctype,proxy_id);
	}

	public int add_filter(org.omg.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public org.omg.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		return _delegate.obtain_push_supplier();
	}

	public void priority_filter(org.omg.CosNotifyFilter.MappingFilter a)
	{
		_delegate.priority_filter(a);
	}

	public void remove_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public void lifetime_filter(org.omg.CosNotifyFilter.MappingFilter a)
	{
		_delegate.lifetime_filter(a);
	}

	public org.omg.CosNotifyChannelAdmin.EventChannel MyChannel()
	{
		return _delegate.MyChannel();
	}

	public int[] push_suppliers()
	{
		return _delegate.push_suppliers();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
