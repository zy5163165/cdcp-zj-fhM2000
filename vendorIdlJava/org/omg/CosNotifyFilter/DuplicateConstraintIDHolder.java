package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "DuplicateConstraintID"
 *	@author JacORB IDL compiler 
 */

public final class DuplicateConstraintIDHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.DuplicateConstraintID value;

	public DuplicateConstraintIDHolder ()
	{
	}
	public DuplicateConstraintIDHolder (final org.omg.CosNotifyFilter.DuplicateConstraintID initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
