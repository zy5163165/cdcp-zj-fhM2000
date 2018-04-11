package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "PolicyNameSeq"
 *	@author JacORB IDL compiler 
 */

public final class PolicyNameSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public PolicyNameSeqHolder ()
	{
	}
	public PolicyNameSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PolicyNameSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PolicyNameSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PolicyNameSeqHelper.write (out,value);
	}
}
