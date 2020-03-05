package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalPropertyName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalPropertyNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.IllegalPropertyName value;

	public IllegalPropertyNameHolder ()
	{
	}
	public IllegalPropertyNameHolder (final org.omg.CosTrading.IllegalPropertyName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.IllegalPropertyNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.IllegalPropertyNameHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.IllegalPropertyNameHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
