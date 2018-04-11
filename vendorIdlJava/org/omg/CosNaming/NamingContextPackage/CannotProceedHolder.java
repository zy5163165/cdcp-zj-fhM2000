package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "CannotProceed"
 *	@author JacORB IDL compiler 
 */

public final class CannotProceedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NamingContextPackage.CannotProceed value;

	public CannotProceedHolder ()
	{
	}
	public CannotProceedHolder (final org.omg.CosNaming.NamingContextPackage.CannotProceed initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
