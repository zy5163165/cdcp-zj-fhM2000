package org.omg.CosTrading.AdminPackage;

/**
 *	Generated from IDL definition of alias "OctetSeq"
 *	@author JacORB IDL compiler 
 */

public final class OctetSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public OctetSeqHolder ()
	{
	}
	public OctetSeqHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OctetSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OctetSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OctetSeqHelper.write (out,value);
	}
}
