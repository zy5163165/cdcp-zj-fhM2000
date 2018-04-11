package org.omg.CosNotification;

/**
 *	Generated from IDL definition of alias "PropertyName"
 *	@author JacORB IDL compiler 
 */

public final class PropertyNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String value;

	public PropertyNameHolder ()
	{
	}
	public PropertyNameHolder (final java.lang.String initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyNameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyNameHelper.write (out,value);
	}
}
