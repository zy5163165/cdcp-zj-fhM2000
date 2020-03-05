package org.omg.CosEventComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "PushSupplier"
 *	@author JacORB IDL compiler 
 */

public class PushSupplierPOATie
	extends PushSupplierPOA
{
	private PushSupplierOperations _delegate;

	private POA _poa;
	public PushSupplierPOATie(PushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public PushSupplierPOATie(PushSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosEventComm.PushSupplier _this()
	{
		return org.omg.CosEventComm.PushSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosEventComm.PushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventComm.PushSupplierHelper.narrow(_this_object(orb));
	}
	public PushSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PushSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public void disconnect_push_supplier()
	{
_delegate.disconnect_push_supplier();
	}

}
