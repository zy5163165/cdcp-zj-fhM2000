package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "RegisterNotSupported"
 *	@author JacORB IDL compiler 
 */

public final class RegisterNotSupportedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.RegisterNotSupported value;

	public RegisterNotSupportedHolder ()
	{
	}
	public RegisterNotSupportedHolder (final org.omg.CosTrading.RegisterPackage.RegisterNotSupported initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
