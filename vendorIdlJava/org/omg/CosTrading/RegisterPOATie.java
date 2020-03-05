package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "Register"
 *	@author JacORB IDL compiler 
 */

public class RegisterPOATie
	extends RegisterPOA
{
	private RegisterOperations _delegate;

	private POA _poa;
	public RegisterPOATie(RegisterOperations delegate)
	{
		_delegate = delegate;
	}
	public RegisterPOATie(RegisterOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.Register _this()
	{
		return org.omg.CosTrading.RegisterHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.Register _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.RegisterHelper.narrow(_this_object(orb));
	}
	public RegisterOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RegisterOperations delegate)
	{
		_delegate = delegate;
	}
	public java.lang.String export(org.omg.CORBA.Object reference, java.lang.String type, org.omg.CosTrading.Property[] properties) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.MissingMandatoryProperty,org.omg.CosTrading.IllegalServiceType,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.RegisterPackage.InvalidObjectRef,org.omg.CosTrading.UnknownServiceType
	{
		return _delegate.export(reference,type,properties);
	}

	public void withdraw(java.lang.String id) throws org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.UnknownOfferId
	{
_delegate.withdraw(id);
	}

	public org.omg.CosTrading.Admin admin_if()
	{
		return _delegate.admin_if();
	}

	public org.omg.CORBA.Object type_repos()
	{
		return _delegate.type_repos();
	}

	public boolean supports_proxy_offers()
	{
		return _delegate.supports_proxy_offers();
	}

	public org.omg.CosTrading.Link link_if()
	{
		return _delegate.link_if();
	}

	public boolean supports_modifiable_properties()
	{
		return _delegate.supports_modifiable_properties();
	}

	public org.omg.CosTrading.RegisterPackage.OfferInfo describe(java.lang.String id) throws org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.UnknownOfferId
	{
		return _delegate.describe(id);
	}

	public org.omg.CosTrading.Proxy proxy_if()
	{
		return _delegate.proxy_if();
	}

	public org.omg.CosTrading.Register register_if()
	{
		return _delegate.register_if();
	}

	public void modify(java.lang.String id, java.lang.String[] del_list, org.omg.CosTrading.Property[] modify_list) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.NotImplemented,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.UnknownOfferId,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.RegisterPackage.ReadonlyProperty,org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.UnknownPropertyName,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.RegisterPackage.MandatoryProperty
	{
_delegate.modify(id,del_list,modify_list);
	}

	public org.omg.CosTrading.Register resolve(java.lang.String[] name) throws org.omg.CosTrading.RegisterPackage.UnknownTraderName,org.omg.CosTrading.RegisterPackage.RegisterNotSupported,org.omg.CosTrading.RegisterPackage.IllegalTraderName
	{
		return _delegate.resolve(name);
	}

	public void withdraw_using_constraint(java.lang.String type, java.lang.String constr) throws org.omg.CosTrading.RegisterPackage.NoMatchingOffers,org.omg.CosTrading.UnknownServiceType,org.omg.CosTrading.IllegalConstraint,org.omg.CosTrading.IllegalServiceType
	{
_delegate.withdraw_using_constraint(type,constr);
	}

	public org.omg.CosTrading.Lookup lookup_if()
	{
		return _delegate.lookup_if();
	}

	public boolean supports_dynamic_properties()
	{
		return _delegate.supports_dynamic_properties();
	}

}
