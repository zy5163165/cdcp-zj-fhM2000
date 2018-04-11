package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "TraderComponents"
 *	@author JacORB IDL compiler 
 */

public class TraderComponentsPOATie
	extends TraderComponentsPOA
{
	private TraderComponentsOperations _delegate;

	private POA _poa;
	public TraderComponentsPOATie(TraderComponentsOperations delegate)
	{
		_delegate = delegate;
	}
	public TraderComponentsPOATie(TraderComponentsOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.TraderComponents _this()
	{
		return org.omg.CosTrading.TraderComponentsHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.TraderComponents _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.TraderComponentsHelper.narrow(_this_object(orb));
	}
	public TraderComponentsOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TraderComponentsOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosTrading.Admin admin_if()
	{
		return _delegate.admin_if();
	}

	public org.omg.CosTrading.Link link_if()
	{
		return _delegate.link_if();
	}

	public org.omg.CosTrading.Proxy proxy_if()
	{
		return _delegate.proxy_if();
	}

	public org.omg.CosTrading.Register register_if()
	{
		return _delegate.register_if();
	}

	public org.omg.CosTrading.Lookup lookup_if()
	{
		return _delegate.lookup_if();
	}

}
