package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of exception "PolicyTypeMismatch"
 *	@author JacORB IDL compiler 
 */

public final class PolicyTypeMismatchHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LookupPackage.PolicyTypeMismatch value;

	public PolicyTypeMismatchHolder ()
	{
	}
	public PolicyTypeMismatchHolder (final org.omg.CosTrading.LookupPackage.PolicyTypeMismatch initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LookupPackage.PolicyTypeMismatchHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LookupPackage.PolicyTypeMismatchHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LookupPackage.PolicyTypeMismatchHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
