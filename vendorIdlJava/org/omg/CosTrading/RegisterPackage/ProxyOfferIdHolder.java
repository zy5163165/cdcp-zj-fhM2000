package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "ProxyOfferId"
 *	@author JacORB IDL compiler 
 */

public final class ProxyOfferIdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.ProxyOfferId value;

	public ProxyOfferIdHolder ()
	{
	}
	public ProxyOfferIdHolder (final org.omg.CosTrading.RegisterPackage.ProxyOfferId initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
