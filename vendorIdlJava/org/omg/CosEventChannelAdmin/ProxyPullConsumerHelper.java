package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyPullConsumer"
 *	@author JacORB IDL compiler 
 */

public final class ProxyPullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.ProxyPullConsumer s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPullConsumer extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0", "ProxyPullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0";
	}
	public static ProxyPullConsumer read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventChannelAdmin.ProxyPullConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.ProxyPullConsumer narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosEventChannelAdmin.ProxyPullConsumer)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0"))
			{
				org.omg.CosEventChannelAdmin._ProxyPullConsumerStub stub;
				stub = new org.omg.CosEventChannelAdmin._ProxyPullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
