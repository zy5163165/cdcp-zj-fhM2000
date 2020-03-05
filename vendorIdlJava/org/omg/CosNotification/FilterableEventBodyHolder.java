package org.omg.CosNotification;

/**
 *	Generated from IDL definition of alias "FilterableEventBody"
 *	@author JacORB IDL compiler 
 */

public final class FilterableEventBodyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.Property[] value;

	public FilterableEventBodyHolder ()
	{
	}
	public FilterableEventBodyHolder (final org.omg.CosNotification.Property[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FilterableEventBodyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterableEventBodyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FilterableEventBodyHelper.write (out,value);
	}
}
