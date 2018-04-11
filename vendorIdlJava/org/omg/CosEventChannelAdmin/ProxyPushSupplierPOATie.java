package org.omg.CosEventChannelAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler 
 */

public class ProxyPushSupplierPOATie
	extends ProxyPushSupplierPOA
{
	private ProxyPushSupplierOperations _delegate;

	private POA _poa;
	public ProxyPushSupplierPOATie(ProxyPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public ProxyPushSupplierPOATie(ProxyPushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventChannelAdmin.ProxyPushSupplier _this()
	{
		return org.omg.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.ProxyPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object(orb));
	}
	public ProxyPushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProxyPushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public void connect_push_consumer(org.omg.CosEventComm.PushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError
	{
_delegate.connect_push_consumer(push_consumer);
	}

	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}
