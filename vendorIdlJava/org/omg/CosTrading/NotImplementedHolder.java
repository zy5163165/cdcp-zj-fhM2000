package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "NotImplemented"
 *	@author JacORB IDL compiler 
 */

public final class NotImplementedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.NotImplemented value;

	public NotImplementedHolder ()
	{
	}
	public NotImplementedHolder (final org.omg.CosTrading.NotImplemented initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.NotImplementedHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.NotImplementedHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.NotImplementedHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
