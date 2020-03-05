package org.omg.CosNaming;

/**
 *	Generated from IDL definition of alias "Name"
 *	@author JacORB IDL compiler 
 */

public final class NameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NameComponent[] value;

	public NameHolder ()
	{
	}
	public NameHolder (final org.omg.CosNaming.NameComponent[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NameHelper.write (out,value);
	}
}
