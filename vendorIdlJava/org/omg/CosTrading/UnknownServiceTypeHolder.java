package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "UnknownServiceType"
 *	@author JacORB IDL compiler 
 */

public final class UnknownServiceTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.UnknownServiceType value;

	public UnknownServiceTypeHolder ()
	{
	}
	public UnknownServiceTypeHolder (final org.omg.CosTrading.UnknownServiceType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.UnknownServiceTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.UnknownServiceTypeHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.UnknownServiceTypeHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
