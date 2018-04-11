package org.omg.CosNaming;

/**
 *	Generated from IDL definition of interface "BindingIterator"
 *	@author JacORB IDL compiler 
 */

public final class BindingIteratorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.BindingIterator s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosNaming.BindingIterator extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosNaming/BindingIterator:1.0", "BindingIterator");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNaming/BindingIterator:1.0";
	}
	public static BindingIterator read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNaming.BindingIterator s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNaming.BindingIterator narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosNaming.BindingIterator)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosNaming/BindingIterator:1.0"))
			{
				org.omg.CosNaming._BindingIteratorStub stub;
				stub = new org.omg.CosNaming._BindingIteratorStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
