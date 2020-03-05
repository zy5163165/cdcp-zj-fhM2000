package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "PropertyTypeMismatch"
 *	@author JacORB IDL compiler 
 */

public final class PropertyTypeMismatchHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.PropertyTypeMismatch value;

	public PropertyTypeMismatchHolder ()
	{
	}
	public PropertyTypeMismatchHolder (final org.omg.CosTrading.PropertyTypeMismatch initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.PropertyTypeMismatchHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.PropertyTypeMismatchHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.PropertyTypeMismatchHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
