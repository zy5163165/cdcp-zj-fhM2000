package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "ReadonlyProperty"
 *	@author JacORB IDL compiler 
 */

public final class ReadonlyPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.ReadonlyProperty value;

	public ReadonlyPropertyHolder ()
	{
	}
	public ReadonlyPropertyHolder (final org.omg.CosTrading.RegisterPackage.ReadonlyProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
