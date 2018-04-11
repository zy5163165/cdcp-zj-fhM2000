package org.omg.CosNotifyFilter;


/**
 *	Generated from IDL definition of exception "InvalidGrammar"
 *	@author JacORB IDL compiler 
 */

public final class InvalidGrammarHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosNotifyFilter.InvalidGrammarHelper.id(),"InvalidGrammar",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyFilter.InvalidGrammar s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyFilter.InvalidGrammar extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/InvalidGrammar:1.0";
	}
	public static org.omg.CosNotifyFilter.InvalidGrammar read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotifyFilter.InvalidGrammar result = new org.omg.CosNotifyFilter.InvalidGrammar();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyFilter.InvalidGrammar s)
	{
		out.write_string(id());
	}
}
