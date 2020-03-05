package org.omg.CosNotification;

/**
 *	Generated from IDL definition of alias "OptionalHeaderFields"
 *	@author JacORB IDL compiler 
 */

public final class OptionalHeaderFieldsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.Property[] value;

	public OptionalHeaderFieldsHolder ()
	{
	}
	public OptionalHeaderFieldsHolder (final org.omg.CosNotification.Property[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OptionalHeaderFieldsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OptionalHeaderFieldsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OptionalHeaderFieldsHelper.write (out,value);
	}
}
