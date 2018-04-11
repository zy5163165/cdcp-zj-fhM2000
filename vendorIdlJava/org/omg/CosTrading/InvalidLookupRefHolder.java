package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "InvalidLookupRef"
 *	@author JacORB IDL compiler 
 */

public final class InvalidLookupRefHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.InvalidLookupRef value;

	public InvalidLookupRefHolder ()
	{
	}
	public InvalidLookupRefHolder (final org.omg.CosTrading.InvalidLookupRef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.InvalidLookupRefHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.InvalidLookupRefHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.InvalidLookupRefHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
