package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of struct "ProxyInfo"
 *	@author JacORB IDL compiler 
 */

public final class ProxyInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.ProxyPackage.ProxyInfo value;

	public ProxyInfoHolder ()
	{
	}
	public ProxyInfoHolder (final org.omg.CosTrading.ProxyPackage.ProxyInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.ProxyPackage.ProxyInfoHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.ProxyPackage.ProxyInfoHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.ProxyPackage.ProxyInfoHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
