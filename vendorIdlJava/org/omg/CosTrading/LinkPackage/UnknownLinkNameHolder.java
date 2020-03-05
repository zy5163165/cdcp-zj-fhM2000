package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "UnknownLinkName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownLinkNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LinkPackage.UnknownLinkName value;

	public UnknownLinkNameHolder ()
	{
	}
	public UnknownLinkNameHolder (final org.omg.CosTrading.LinkPackage.UnknownLinkName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
