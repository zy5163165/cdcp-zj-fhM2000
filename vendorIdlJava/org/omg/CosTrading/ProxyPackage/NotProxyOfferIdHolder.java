package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of exception "NotProxyOfferId"
 *	@author JacORB IDL compiler 
 */

public final class NotProxyOfferIdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.ProxyPackage.NotProxyOfferId value;

	public NotProxyOfferIdHolder ()
	{
	}
	public NotProxyOfferIdHolder (final org.omg.CosTrading.ProxyPackage.NotProxyOfferId initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
