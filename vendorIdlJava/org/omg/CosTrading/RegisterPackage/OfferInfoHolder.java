package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of struct "OfferInfo"
 *	@author JacORB IDL compiler 
 */

public final class OfferInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.OfferInfo value;

	public OfferInfoHolder ()
	{
	}
	public OfferInfoHolder (final org.omg.CosTrading.RegisterPackage.OfferInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.OfferInfoHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.OfferInfoHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.OfferInfoHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
