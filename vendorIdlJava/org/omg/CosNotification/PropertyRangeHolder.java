package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "PropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class PropertyRangeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.PropertyRange value;

	public PropertyRangeHolder ()
	{
	}
	public PropertyRangeHolder (final org.omg.CosNotification.PropertyRange initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.PropertyRangeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.PropertyRangeHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.PropertyRangeHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
