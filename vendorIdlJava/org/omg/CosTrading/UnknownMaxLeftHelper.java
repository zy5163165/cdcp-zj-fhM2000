package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "UnknownMaxLeft"
 *	@author JacORB IDL compiler 
 */

public final class UnknownMaxLeftHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.UnknownMaxLeftHelper.id(),"UnknownMaxLeft",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.UnknownMaxLeft s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.UnknownMaxLeft extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/UnknownMaxLeft:1.0";
	}
	public static org.omg.CosTrading.UnknownMaxLeft read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.UnknownMaxLeft result = new org.omg.CosTrading.UnknownMaxLeft();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.UnknownMaxLeft s)
	{
		out.write_string(id());
	}
}
