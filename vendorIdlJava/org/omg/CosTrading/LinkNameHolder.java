package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "LinkName"
 *	@author JacORB IDL compiler 
 */

public final class LinkNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String value;

	public LinkNameHolder ()
	{
	}
	public LinkNameHolder (final java.lang.String initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LinkNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LinkNameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LinkNameHelper.write (out,value);
	}
}
