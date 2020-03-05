package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "SupportAttributes"
 *	@author JacORB IDL compiler 
 */

public final class SupportAttributesHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.SupportAttributes s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosTrading.SupportAttributes extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/SupportAttributes:1.0", "SupportAttributes");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/SupportAttributes:1.0";
	}
	public static SupportAttributes read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTrading.SupportAttributes s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTrading.SupportAttributes narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosTrading.SupportAttributes)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosTrading/SupportAttributes:1.0"))
			{
				org.omg.CosTrading._SupportAttributesStub stub;
				stub = new org.omg.CosTrading._SupportAttributesStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
