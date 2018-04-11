package org.omg.CosNaming;

/**
 *	Generated from IDL definition of interface "NamingContext"
 *	@author JacORB IDL compiler 
 */

public final class NamingContextHolder	implements org.omg.CORBA.portable.Streamable{
	 public NamingContext value;
	public NamingContextHolder ()
	{
	}
	public NamingContextHolder (final NamingContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamingContextHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingContextHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NamingContextHelper.write (_out,value);
	}
}
