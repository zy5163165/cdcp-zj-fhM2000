package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "OfferIdSeq"
 *	@author JacORB IDL compiler 
 */

public final class OfferIdSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public OfferIdSeqHolder ()
	{
	}
	public OfferIdSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OfferIdSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OfferIdSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OfferIdSeqHelper.write (out,value);
	}
}
