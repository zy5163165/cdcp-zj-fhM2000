package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "IllegalLinkName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalLinkNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LinkPackage.IllegalLinkName value;

	public IllegalLinkNameHolder ()
	{
	}
	public IllegalLinkNameHolder (final org.omg.CosTrading.LinkPackage.IllegalLinkName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
