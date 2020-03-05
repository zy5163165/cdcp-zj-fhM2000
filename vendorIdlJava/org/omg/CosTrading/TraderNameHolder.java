package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "TraderName"
 *	@author JacORB IDL compiler 
 */

public final class TraderNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public TraderNameHolder ()
	{
	}
	public TraderNameHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TraderNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TraderNameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TraderNameHelper.write (out,value);
	}
}
