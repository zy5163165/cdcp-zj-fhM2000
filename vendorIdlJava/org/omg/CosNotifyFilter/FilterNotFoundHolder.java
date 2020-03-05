package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "FilterNotFound"
 *	@author JacORB IDL compiler 
 */

public final class FilterNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.FilterNotFound value;

	public FilterNotFoundHolder ()
	{
	}
	public FilterNotFoundHolder (final org.omg.CosNotifyFilter.FilterNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.FilterNotFoundHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.FilterNotFoundHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.FilterNotFoundHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
