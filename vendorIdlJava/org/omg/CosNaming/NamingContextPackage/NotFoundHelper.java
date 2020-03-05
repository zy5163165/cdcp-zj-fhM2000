package org.omg.CosNaming.NamingContextPackage;


/**
 *	Generated from IDL definition of exception "NotFound"
 *	@author JacORB IDL compiler 
 */

public final class NotFoundHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosNaming.NamingContextPackage.NotFoundHelper.id(),"NotFound",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("why", org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.type(), null),new org.omg.CORBA.StructMember("rest_of_name", org.omg.CosNaming.NameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextPackage.NotFound s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NamingContextPackage.NotFound extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContext/NotFound:1.0";
	}
	public static org.omg.CosNaming.NamingContextPackage.NotFound read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNaming.NamingContextPackage.NotFound result = new org.omg.CosNaming.NamingContextPackage.NotFound();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.why=org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.read(in);
		result.rest_of_name = org.omg.CosNaming.NameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.NamingContextPackage.NotFound s)
	{
		out.write_string(id());
		org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.write(out,s.why);
		org.omg.CosNaming.NameHelper.write(out,s.rest_of_name);
	}
}
