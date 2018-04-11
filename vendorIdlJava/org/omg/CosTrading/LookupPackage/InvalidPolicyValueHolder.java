package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of exception "InvalidPolicyValue"
 *	@author JacORB IDL compiler 
 */

public final class InvalidPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LookupPackage.InvalidPolicyValue value;

	public InvalidPolicyValueHolder ()
	{
	}
	public InvalidPolicyValueHolder (final org.omg.CosTrading.LookupPackage.InvalidPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
