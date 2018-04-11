package org.omg.CosNaming;


/**
 *	Generated from IDL definition of struct "NameComponent"
 *	@author JacORB IDL compiler 
 */

public final class NameComponentHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNaming.NameComponentHelper.id(),"NameComponent",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CosNaming.IstringHelper.type(), null),new org.omg.CORBA.StructMember("kind", org.omg.CosNaming.IstringHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NameComponent s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NameComponent extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/NameComponent:1.0";
	}
	public static org.omg.CosNaming.NameComponent read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNaming.NameComponent result = new org.omg.CosNaming.NameComponent();
		result.id = org.omg.CosNaming.IstringHelper.read(in);
		result.kind = org.omg.CosNaming.IstringHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.NameComponent s)
	{
		org.omg.CosNaming.IstringHelper.write(out,s.id);
		org.omg.CosNaming.IstringHelper.write(out,s.kind);
	}
}
