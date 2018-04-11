package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "LinkAttributes"
 *	@author JacORB IDL compiler 
 */

public final class LinkAttributesHolder	implements org.omg.CORBA.portable.Streamable{
	 public LinkAttributes value;
	public LinkAttributesHolder ()
	{
	}
	public LinkAttributesHolder (final LinkAttributes initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LinkAttributesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LinkAttributesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LinkAttributesHelper.write (_out,value);
	}
}
