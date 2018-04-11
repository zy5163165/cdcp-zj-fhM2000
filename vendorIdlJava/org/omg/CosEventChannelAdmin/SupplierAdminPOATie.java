package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "SupplierAdmin"
 *	@author JacORB IDL compiler 
 */

public class SupplierAdminPOATie
	extends SupplierAdminPOA
{
	private SupplierAdminOperations _delegate;

	private POA _poa;
	public SupplierAdminPOATie(SupplierAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public SupplierAdminPOATie(SupplierAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.SupplierAdmin _this()
	{
		return org.omg.CosEventChannelAdmin.SupplierAdminHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.SupplierAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.SupplierAdminHelper.narrow(_this_object(orb));
	}
	public SupplierAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SupplierAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer()
	{
		return _delegate.obtain_push_consumer();
	}

	public org.omg.CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer()
	{
		return _delegate.obtain_pull_consumer();
	}

}
