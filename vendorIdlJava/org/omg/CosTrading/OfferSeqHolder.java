package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "OfferSeq"
 *	@author JacORB IDL compiler 
 */

public final class OfferSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.Offer[] value;

	public OfferSeqHolder ()
	{
	}
	public OfferSeqHolder (final org.omg.CosTrading.Offer[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OfferSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OfferSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OfferSeqHelper.write (out,value);
	}
}
