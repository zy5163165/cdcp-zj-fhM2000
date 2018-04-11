package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "LinkNameSeq"
 *	@author JacORB IDL compiler 
 */

public final class LinkNameSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public LinkNameSeqHolder ()
	{
	}
	public LinkNameSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LinkNameSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LinkNameSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LinkNameSeqHelper.write (out,value);
	}
}
