package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyPullSupplier"
 *	@author JacORB IDL compiler 
 */

public final class ProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPullSupplier value;
	public ProxyPullSupplierHolder ()
	{
	}
	public ProxyPullSupplierHolder (final ProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyPullSupplierHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPullSupplierHelper.write (_out,value);
	}
}
