package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "UnknownMaxLeft"
 *	@author JacORB IDL compiler 
 */

public final class UnknownMaxLeftHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.UnknownMaxLeft value;

	public UnknownMaxLeftHolder ()
	{
	}
	public UnknownMaxLeftHolder (final org.omg.CosTrading.UnknownMaxLeft initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.UnknownMaxLeftHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.UnknownMaxLeftHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.UnknownMaxLeftHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
