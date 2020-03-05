package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "DuplicatePolicyName"
 *	@author JacORB IDL compiler 
 */

public final class DuplicatePolicyNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.DuplicatePolicyName value;

	public DuplicatePolicyNameHolder ()
	{
	}
	public DuplicatePolicyNameHolder (final org.omg.CosTrading.DuplicatePolicyName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.DuplicatePolicyNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.DuplicatePolicyNameHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.DuplicatePolicyNameHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
