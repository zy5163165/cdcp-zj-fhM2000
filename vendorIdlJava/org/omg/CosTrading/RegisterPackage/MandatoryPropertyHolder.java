package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "MandatoryProperty"
 *	@author JacORB IDL compiler 
 */

public final class MandatoryPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.MandatoryProperty value;

	public MandatoryPropertyHolder ()
	{
	}
	public MandatoryPropertyHolder (final org.omg.CosTrading.RegisterPackage.MandatoryProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
