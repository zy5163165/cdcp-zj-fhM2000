package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalOfferId"
 *	@author JacORB IDL compiler 
 */

public final class IllegalOfferIdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.IllegalOfferId value;

	public IllegalOfferIdHolder ()
	{
	}
	public IllegalOfferIdHolder (final org.omg.CosTrading.IllegalOfferId initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.IllegalOfferIdHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.IllegalOfferIdHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.IllegalOfferIdHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
