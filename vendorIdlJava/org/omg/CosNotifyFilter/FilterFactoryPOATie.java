package org.omg.CosNotifyFilter;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "FilterFactory"
 *	@author JacORB IDL compiler 
 */

public class FilterFactoryPOATie
	extends FilterFactoryPOA
{
	private FilterFactoryOperations _delegate;

	private POA _poa;
	public FilterFactoryPOATie(FilterFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public FilterFactoryPOATie(FilterFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyFilter.FilterFactory _this()
	{
		return org.omg.CosNotifyFilter.FilterFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyFilter.FilterFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyFilter.FilterFactoryHelper.narrow(_this_object(orb));
	}
	public FilterFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FilterFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosNotifyFilter.MappingFilter create_mapping_filter(java.lang.String constraint_grammar, org.omg.CORBA.Any default_value) throws org.omg.CosNotifyFilter.InvalidGrammar
	{
		return _delegate.create_mapping_filter(constraint_grammar,default_value);
	}

	public org.omg.CosNotifyFilter.Filter create_filter(java.lang.String constraint_grammar) throws org.omg.CosNotifyFilter.InvalidGrammar
	{
		return _delegate.create_filter(constraint_grammar);
	}

}
