package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of alias "ConstraintInfoSeq"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintInfoSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.ConstraintInfo[] value;

	public ConstraintInfoSeqHolder ()
	{
	}
	public ConstraintInfoSeqHolder (final org.omg.CosNotifyFilter.ConstraintInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConstraintInfoSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstraintInfoSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConstraintInfoSeqHelper.write (out,value);
	}
}
