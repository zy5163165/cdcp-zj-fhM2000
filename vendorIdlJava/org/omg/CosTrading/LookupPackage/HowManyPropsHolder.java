package org.omg.CosTrading.LookupPackage;
/**
 *	Generated from IDL definition of enum "HowManyProps"
 *	@author JacORB IDL compiler 
 */

public final class HowManyPropsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public HowManyProps value;

	public HowManyPropsHolder ()
	{
	}
	public HowManyPropsHolder (final HowManyProps initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HowManyPropsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HowManyPropsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HowManyPropsHelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
