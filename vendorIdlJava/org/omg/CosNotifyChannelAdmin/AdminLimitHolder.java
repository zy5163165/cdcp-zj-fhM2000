package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of struct "AdminLimit"
 *	@author JacORB IDL compiler 
 */

public final class AdminLimitHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyChannelAdmin.AdminLimit value;

	public AdminLimitHolder ()
	{
	}
	public AdminLimitHolder (final org.omg.CosNotifyChannelAdmin.AdminLimit initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyChannelAdmin.AdminLimitHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyChannelAdmin.AdminLimitHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyChannelAdmin.AdminLimitHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
