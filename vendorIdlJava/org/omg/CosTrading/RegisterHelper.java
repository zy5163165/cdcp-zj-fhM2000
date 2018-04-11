package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Register"
 *	@author JacORB IDL compiler 
 */

public final class RegisterHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.Register s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosTrading.Register extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/Register:1.0", "Register");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/Register:1.0";
	}
	public static Register read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTrading.Register s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTrading.Register narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosTrading.Register)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosTrading/Register:1.0"))
			{
				org.omg.CosTrading._RegisterStub stub;
				stub = new org.omg.CosTrading._RegisterStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
