package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "ReadonlyDynamicProperty"
 *	@author JacORB IDL compiler 
 */

public final class ReadonlyDynamicPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.ReadonlyDynamicProperty value;

	public ReadonlyDynamicPropertyHolder ()
	{
	}
	public ReadonlyDynamicPropertyHolder (final org.omg.CosTrading.ReadonlyDynamicProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.ReadonlyDynamicPropertyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.ReadonlyDynamicPropertyHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.ReadonlyDynamicPropertyHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
