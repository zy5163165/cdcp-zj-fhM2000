package org.omg.CosNaming.NamingContextPackage;


/**
 *	Generated from IDL definition of exception "CannotProceed"
 *	@author JacORB IDL compiler 
 */

public final class CannotProceedHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id(),"CannotProceed",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("cxt", org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosNaming/NamingContext:1.0", "NamingContext"), null),new org.omg.CORBA.StructMember("rest_of_name", org.omg.CosNaming.NameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextPackage.CannotProceed s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NamingContextPackage.CannotProceed extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0";
	}
	public static org.omg.CosNaming.NamingContextPackage.CannotProceed read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNaming.NamingContextPackage.CannotProceed result = new org.omg.CosNaming.NamingContextPackage.CannotProceed();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.cxt=org.omg.CosNaming.NamingContextHelper.read(in);
		result.rest_of_name = org.omg.CosNaming.NameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.NamingContextPackage.CannotProceed s)
	{
		out.write_string(id());
		org.omg.CosNaming.NamingContextHelper.write(out,s.cxt);
		org.omg.CosNaming.NameHelper.write(out,s.rest_of_name);
	}
}
