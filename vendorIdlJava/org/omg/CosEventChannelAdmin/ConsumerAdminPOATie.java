package org.omg.CosEventChannelAdmin;

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
	public org.omg.CosEventChannelAdmin.ConsumerAdmin _this()
	{
		return org.omg.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.ConsumerAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object(orb));
	}
	public ConsumerAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConsumerAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		return _delegate.obtain_pull_supplier();
	}

	public org.omg.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		return _delegate.obtain_push_supplier();
	}

}
