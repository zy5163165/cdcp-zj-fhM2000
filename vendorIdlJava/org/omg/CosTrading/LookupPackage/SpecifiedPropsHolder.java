package org.omg.CosTrading.LookupPackage;
/**
 *	Generated from IDL definition of union "SpecifiedProps"
 *	@author JacORB IDL compiler 
 */

public final class SpecifiedPropsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SpecifiedProps value;

	public SpecifiedPropsHolder ()
	{
	}
	public SpecifiedPropsHolder (final SpecifiedProps initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SpecifiedPropsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SpecifiedPropsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SpecifiedPropsHelper.write (out, value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
