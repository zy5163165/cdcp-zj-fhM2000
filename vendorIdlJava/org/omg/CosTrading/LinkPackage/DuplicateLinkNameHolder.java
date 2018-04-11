package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "DuplicateLinkName"
 *	@author JacORB IDL compiler 
 */

public final class DuplicateLinkNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LinkPackage.DuplicateLinkName value;

	public DuplicateLinkNameHolder ()
	{
	}
	public DuplicateLinkNameHolder (final org.omg.CosTrading.LinkPackage.DuplicateLinkName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
