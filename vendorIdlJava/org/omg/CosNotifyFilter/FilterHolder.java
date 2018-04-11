package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of interface "Filter"
 *	@author JacORB IDL compiler 
 */

public final class FilterHolder	implements org.omg.CORBA.portable.Streamable{
	 public Filter value;
	public FilterHolder ()
	{
	}
	public FilterHolder (final Filter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FilterHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FilterHelper.write (_out,value);
	}
}
