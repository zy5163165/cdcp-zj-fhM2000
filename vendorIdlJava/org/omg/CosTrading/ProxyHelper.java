package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Proxy"
 *	@author JacORB IDL compiler 
 */

public final class ProxyHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.Proxy s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosTrading.Proxy extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/Proxy:1.0", "Proxy");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/Proxy:1.0";
	}
	public static Proxy read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTrading.Proxy s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTrading.Proxy narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosTrading.Proxy)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosTrading/Proxy:1.0"))
			{
				org.omg.CosTrading._ProxyStub stub;
				stub = new org.omg.CosTrading._ProxyStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
