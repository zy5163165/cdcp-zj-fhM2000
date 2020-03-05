package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler 
 */

public final class ProxyPushSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.ProxyPushSupplier s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushSupplier extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0", "ProxyPushSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0";
	}
	public static ProxyPushSupplier read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventChannelAdmin.ProxyPushSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPushSupplier narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosEventChannelAdmin.ProxyPushSupplier)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0"))
			{
				org.omg.CosEventChannelAdmin._ProxyPushSupplierStub stub;
				stub = new org.omg.CosEventChannelAdmin._ProxyPushSupplierStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
