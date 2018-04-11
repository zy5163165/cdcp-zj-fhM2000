package org.omg.CosNotifyFilter;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "FilterAdmin"
 *	@author JacORB IDL compiler 
 */

public class FilterAdminPOATie
	extends FilterAdminPOA
{
	private FilterAdminOperations _delegate;

	private POA _poa;
	public FilterAdminPOATie(FilterAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public FilterAdminPOATie(FilterAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyFilter.FilterAdmin _this()
	{
		return org.omg.CosNotifyFilter.FilterAdminHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyFilter.FilterAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyFilter.FilterAdminHelper.narrow(_this_object(orb));
	}
	public FilterAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FilterAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public int add_filter(org.omg.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public org.omg.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public void remove_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

}
