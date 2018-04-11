package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Proxy"
 *	@author JacORB IDL compiler 
 */

public final class ProxyHolder	implements org.omg.CORBA.portable.Streamable{
	 public Proxy value;
	public ProxyHolder ()
	{
	}
	public ProxyHolder (final Proxy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyHelper.write (_out,value);
	}
}
