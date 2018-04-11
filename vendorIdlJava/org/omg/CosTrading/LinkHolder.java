package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Link"
 *	@author JacORB IDL compiler 
 */

public final class LinkHolder	implements org.omg.CORBA.portable.Streamable{
	 public Link value;
	public LinkHolder ()
	{
	}
	public LinkHolder (final Link initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LinkHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LinkHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LinkHelper.write (_out,value);
	}
}
