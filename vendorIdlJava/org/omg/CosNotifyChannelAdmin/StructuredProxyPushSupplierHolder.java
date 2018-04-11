package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "StructuredProxyPushSupplier"
 *	@author JacORB IDL compiler 
 */

public final class StructuredProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPushSupplier value;
	public StructuredProxyPushSupplierHolder ()
	{
	}
	public StructuredProxyPushSupplierHolder (final StructuredProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StructuredProxyPushSupplierHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPushSupplierHelper.write (_out,value);
	}
}
