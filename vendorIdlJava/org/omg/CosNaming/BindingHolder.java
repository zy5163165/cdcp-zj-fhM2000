package org.omg.CosNaming;

/**
 *	Generated from IDL definition of struct "Binding"
 *	@author JacORB IDL compiler 
 */

public final class BindingHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.Binding value;

	public BindingHolder ()
	{
	}
	public BindingHolder (final org.omg.CosNaming.Binding initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.BindingHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.BindingHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.BindingHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
