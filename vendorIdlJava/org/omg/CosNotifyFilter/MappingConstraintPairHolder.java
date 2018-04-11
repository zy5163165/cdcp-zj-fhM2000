package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "MappingConstraintPair"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintPairHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.MappingConstraintPair value;

	public MappingConstraintPairHolder ()
	{
	}
	public MappingConstraintPairHolder (final org.omg.CosNotifyFilter.MappingConstraintPair initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.MappingConstraintPairHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.MappingConstraintPairHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.MappingConstraintPairHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
