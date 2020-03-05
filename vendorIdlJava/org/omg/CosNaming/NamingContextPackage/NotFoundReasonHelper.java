package org.omg.CosNaming.NamingContextPackage;
/**
 *	Generated from IDL definition of enum "NotFoundReason"
 *	@author JacORB IDL compiler 
 */

public final class NotFoundReasonHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.id(),"NotFoundReason",new String[]{"missing_node","not_context","not_object"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextPackage.NotFoundReason s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NamingContextPackage.NotFoundReason extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContext/NotFoundReason:1.0";
	}
	public static NotFoundReason read (final org.omg.CORBA.portable.InputStream in)
	{
		return NotFoundReason.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final NotFoundReason s)
	{
		out.write_long(s.value());
	}
}
