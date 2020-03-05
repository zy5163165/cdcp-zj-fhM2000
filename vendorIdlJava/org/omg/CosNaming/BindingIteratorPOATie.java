package org.omg.CosNaming;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "BindingIterator"
 *	@author JacORB IDL compiler 
 */

public class BindingIteratorPOATie
	extends BindingIteratorPOA
{
	private BindingIteratorOperations _delegate;

	private POA _poa;
	public BindingIteratorPOATie(BindingIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public BindingIteratorPOATie(BindingIteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNaming.BindingIterator _this()
	{
		return org.omg.CosNaming.BindingIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosNaming.BindingIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNaming.BindingIteratorHelper.narrow(_this_object(orb));
	}
	public BindingIteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BindingIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean next_one(org.omg.CosNaming.BindingHolder b)
	{
		return _delegate.next_one(b);
	}

	public boolean next_n(int how_many, org.omg.CosNaming.BindingListHolder bl)
	{
		return _delegate.next_n(how_many,bl);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
