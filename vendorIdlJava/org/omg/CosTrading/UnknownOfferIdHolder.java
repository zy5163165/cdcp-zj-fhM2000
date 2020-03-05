package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "UnknownOfferId"
 *	@author JacORB IDL compiler 
 */

public final class UnknownOfferIdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.UnknownOfferId value;

	public UnknownOfferIdHolder ()
	{
	}
	public UnknownOfferIdHolder (final org.omg.CosTrading.UnknownOfferId initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.UnknownOfferIdHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.UnknownOfferIdHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.UnknownOfferIdHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
