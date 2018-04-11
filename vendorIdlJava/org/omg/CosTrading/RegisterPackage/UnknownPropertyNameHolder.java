package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "UnknownPropertyName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownPropertyNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.UnknownPropertyName value;

	public UnknownPropertyNameHolder ()
	{
	}
	public UnknownPropertyNameHolder (final org.omg.CosTrading.RegisterPackage.UnknownPropertyName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
