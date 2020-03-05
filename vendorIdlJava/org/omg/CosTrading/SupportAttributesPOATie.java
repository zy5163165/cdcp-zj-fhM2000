package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "SupportAttributes"
 *	@author JacORB IDL compiler 
 */

public class SupportAttributesPOATie
	extends SupportAttributesPOA
{
	private SupportAttributesOperations _delegate;

	private POA _poa;
	public SupportAttributesPOATie(SupportAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public SupportAttributesPOATie(SupportAttributesOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.SupportAttributes _this()
	{
		return org.omg.CosTrading.SupportAttributesHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.SupportAttributes _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.SupportAttributesHelper.narrow(_this_object(orb));
	}
	public SupportAttributesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SupportAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean supports_proxy_offers()
	{
		return _delegate.supports_proxy_offers();
	}

	public org.omg.CORBA.Object type_repos()
	{
		return _delegate.type_repos();
	}

	public boolean supports_dynamic_properties()
	{
		return _delegate.supports_dynamic_properties();
	}

	public boolean supports_modifiable_properties()
	{
		return _delegate.supports_modifiable_properties();
	}

}
