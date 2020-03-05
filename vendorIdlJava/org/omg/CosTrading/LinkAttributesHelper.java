package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "LinkAttributes"
 *	@author JacORB IDL compiler 
 */

public final class LinkAttributesHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LinkAttributes s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosTrading.LinkAttributes extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/LinkAttributes:1.0", "LinkAttributes");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/LinkAttributes:1.0";
	}
	public static LinkAttributes read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTrading.LinkAttributes s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTrading.LinkAttributes narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosTrading.LinkAttributes)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosTrading/LinkAttributes:1.0"))
			{
				org.omg.CosTrading._LinkAttributesStub stub;
				stub = new org.omg.CosTrading._LinkAttributesStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
