package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalServiceType"
 *	@author JacORB IDL compiler 
 */

public final class IllegalServiceTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.IllegalServiceType value;

	public IllegalServiceTypeHolder ()
	{
	}
	public IllegalServiceTypeHolder (final org.omg.CosTrading.IllegalServiceType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.IllegalServiceTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.IllegalServiceTypeHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.IllegalServiceTypeHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
