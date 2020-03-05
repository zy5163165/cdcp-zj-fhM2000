package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "AlreadyBound"
 *	@author JacORB IDL compiler 
 */

public final class AlreadyBoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NamingContextPackage.AlreadyBound value;

	public AlreadyBoundHolder ()
	{
	}
	public AlreadyBoundHolder (final org.omg.CosNaming.NamingContextPackage.AlreadyBound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
