package org.omg.CosNaming.NamingContextExtPackage;

/**
 *	Generated from IDL definition of exception "InvalidAddress"
 *	@author JacORB IDL compiler 
 */

public final class InvalidAddressHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NamingContextExtPackage.InvalidAddress value;

	public InvalidAddressHolder ()
	{
	}
	public InvalidAddressHolder (final org.omg.CosNaming.NamingContextExtPackage.InvalidAddress initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
