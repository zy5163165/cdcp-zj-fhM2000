package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "NotEmpty"
 *	@author JacORB IDL compiler 
 */

public final class NotEmptyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NamingContextPackage.NotEmpty value;

	public NotEmptyHolder ()
	{
	}
	public NotEmptyHolder (final org.omg.CosNaming.NamingContextPackage.NotEmpty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
