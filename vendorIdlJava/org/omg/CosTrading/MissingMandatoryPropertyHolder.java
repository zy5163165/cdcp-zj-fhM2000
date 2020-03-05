package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "MissingMandatoryProperty"
 *	@author JacORB IDL compiler 
 */

public final class MissingMandatoryPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.MissingMandatoryProperty value;

	public MissingMandatoryPropertyHolder ()
	{
	}
	public MissingMandatoryPropertyHolder (final org.omg.CosTrading.MissingMandatoryProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.MissingMandatoryPropertyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.MissingMandatoryPropertyHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.MissingMandatoryPropertyHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
