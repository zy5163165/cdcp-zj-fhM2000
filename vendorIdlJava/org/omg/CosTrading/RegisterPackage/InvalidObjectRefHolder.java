package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "InvalidObjectRef"
 *	@author JacORB IDL compiler 
 */

public final class InvalidObjectRefHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.InvalidObjectRef value;

	public InvalidObjectRefHolder ()
	{
	}
	public InvalidObjectRefHolder (final org.omg.CosTrading.RegisterPackage.InvalidObjectRef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
