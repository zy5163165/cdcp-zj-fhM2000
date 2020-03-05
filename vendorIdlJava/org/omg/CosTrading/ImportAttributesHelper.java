package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "ImportAttributes"
 *	@author JacORB IDL compiler 
 */

public final class ImportAttributesHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.ImportAttributes s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosTrading.ImportAttributes extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/ImportAttributes:1.0", "ImportAttributes");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/ImportAttributes:1.0";
	}
	public static ImportAttributes read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTrading.ImportAttributes s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTrading.ImportAttributes narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosTrading.ImportAttributes)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosTrading/ImportAttributes:1.0"))
			{
				org.omg.CosTrading._ImportAttributesStub stub;
				stub = new org.omg.CosTrading._ImportAttributesStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
