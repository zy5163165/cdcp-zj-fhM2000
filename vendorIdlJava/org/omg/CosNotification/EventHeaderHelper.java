package org.omg.CosNotification;


/**
 *	Generated from IDL definition of struct "EventHeader"
 *	@author JacORB IDL compiler 
 */

public final class EventHeaderHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNotification.EventHeaderHelper.id(),"EventHeader",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("fixed_header", org.omg.CosNotification.FixedEventHeaderHelper.type(), null),new org.omg.CORBA.StructMember("variable_header", org.omg.CosNotification.OptionalHeaderFieldsHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.EventHeader s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotification.EventHeader extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/EventHeader:1.0";
	}
	public static org.omg.CosNotification.EventHeader read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotification.EventHeader result = new org.omg.CosNotification.EventHeader();
		result.fixed_header=org.omg.CosNotification.FixedEventHeaderHelper.read(in);
		result.variable_header = org.omg.CosNotification.OptionalHeaderFieldsHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotification.EventHeader s)
	{
		org.omg.CosNotification.FixedEventHeaderHelper.write(out,s.fixed_header);
		org.omg.CosNotification.OptionalHeaderFieldsHelper.write(out,s.variable_header);
	}
}
