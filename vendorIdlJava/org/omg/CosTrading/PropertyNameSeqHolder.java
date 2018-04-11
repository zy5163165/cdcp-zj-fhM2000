package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "PropertyNameSeq"
 *	@author JacORB IDL compiler 
 */

public final class PropertyNameSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public PropertyNameSeqHolder ()
	{
	}
	public PropertyNameSeqHolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyNameSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyNameSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyNameSeqHelper.write (out,value);
	}
}
