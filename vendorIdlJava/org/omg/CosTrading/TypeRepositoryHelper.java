package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "TypeRepository"
 *	@author JacORB IDL compiler 
 */

public final class TypeRepositoryHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.Object s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.Object extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.TypeRepositoryHelper.id(), "TypeRepository",org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Object:1.0","Object") );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/TypeRepository:1.0";
	}
	public static org.omg.CORBA.Object read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.Object _result;
		_result=_in.read_Object();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.Object _s)
	{
		_out.write_Object(_s);
	}
}
