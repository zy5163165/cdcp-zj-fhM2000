package org.omg.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedAdmin"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedAdminHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.UnsupportedAdmin value;

	public UnsupportedAdminHolder ()
	{
	}
	public UnsupportedAdminHolder (final org.omg.CosNotification.UnsupportedAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.UnsupportedAdminHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.UnsupportedAdminHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.UnsupportedAdminHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
