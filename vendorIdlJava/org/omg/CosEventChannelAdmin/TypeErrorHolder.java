package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of exception "TypeError"
 *	@author JacORB IDL compiler 
 */

public final class TypeErrorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosEventChannelAdmin.TypeError value;

	public TypeErrorHolder ()
	{
	}
	public TypeErrorHolder (final org.omg.CosEventChannelAdmin.TypeError initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosEventChannelAdmin.TypeErrorHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosEventChannelAdmin.TypeErrorHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosEventChannelAdmin.TypeErrorHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
