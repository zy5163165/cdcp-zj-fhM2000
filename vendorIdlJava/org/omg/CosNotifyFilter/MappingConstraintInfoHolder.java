package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "MappingConstraintInfo"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.MappingConstraintInfo value;

	public MappingConstraintInfoHolder ()
	{
	}
	public MappingConstraintInfoHolder (final org.omg.CosNotifyFilter.MappingConstraintInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.MappingConstraintInfoHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.MappingConstraintInfoHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.MappingConstraintInfoHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
