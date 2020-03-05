package org.omg.CosNaming;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "NamingContext"
 *	@author JacORB IDL compiler 
 */

public class NamingContextPOATie
	extends NamingContextPOA
{
	private NamingContextOperations _delegate;

	private POA _poa;
	public NamingContextPOATie(NamingContextOperations delegate)
	{
		_delegate = delegate;
	}
	public NamingContextPOATie(NamingContextOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNaming.NamingContext _this()
	{
		return org.omg.CosNaming.NamingContextHelper.narrow(_this_object());
	}
	public org.omg.CosNaming.NamingContext _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNaming.NamingContextHelper.narrow(_this_object(orb));
	}
	public NamingContextOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NamingContextOperations delegate)
	{
		_delegate = delegate;
	}
	public void list(int how_many, org.omg.CosNaming.BindingListHolder bl, org.omg.CosNaming.BindingIteratorHolder bi)
	{
_delegate.list(how_many,bl,bi);
	}

	public void bind(org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
_delegate.bind(n,obj);
	}

	public org.omg.CosNaming.NamingContext bind_new_context(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		return _delegate.bind_new_context(n);
	}

	public void rebind_context(org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
_delegate.rebind_context(n,nc);
	}

	public void bind_context(org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
_delegate.bind_context(n,nc);
	}

	public void unbind(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
_delegate.unbind(n);
	}

	public org.omg.CosNaming.NamingContext new_context()
	{
		return _delegate.new_context();
	}

	public void destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty
	{
_delegate.destroy();
	}

	public void rebind(org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
_delegate.rebind(n,obj);
	}

	public org.omg.CORBA.Object resolve(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		return _delegate.resolve(n);
	}

}
