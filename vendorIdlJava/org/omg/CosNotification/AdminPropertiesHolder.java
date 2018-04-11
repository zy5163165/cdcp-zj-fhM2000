package org.omg.CosNotification;

/**
 *	Generated from IDL definition of alias "AdminProperties"
 *	@author JacORB IDL compiler 
 */

public final class AdminPropertiesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.Property[] value;

	public AdminPropertiesHolder ()
	{
	}
	public AdminPropertiesHolder (final org.omg.CosNotification.Property[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AdminPropertiesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdminPropertiesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AdminPropertiesHelper.write (out,value);
	}
}
