package org.omg.CosNotification;


/**
 *	Generated from IDL definition of struct "StructuredEvent"
 *	@author JacORB IDL compiler 
 */

public final class StructuredEventHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNotification.StructuredEventHelper.id(),"StructuredEvent",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("header", org.omg.CosNotification.EventHeaderHelper.type(), null),new org.omg.CORBA.StructMember("filterable_data", org.omg.CosNotification.FilterableEventBodyHelper.type(), null),new org.omg.CORBA.StructMember("remainder_of_body", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.StructuredEvent s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotification.StructuredEvent extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/StructuredEvent:1.0";
	}
	public static org.omg.CosNotification.StructuredEvent read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotification.StructuredEvent result = new org.omg.CosNotification.StructuredEvent();
		result.header=org.omg.CosNotification.EventHeaderHelper.read(in);
		result.filterable_data = org.omg.CosNotification.FilterableEventBodyHelper.read(in);
		result.remainder_of_body=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotification.StructuredEvent s)
	{
		org.omg.CosNotification.EventHeaderHelper.write(out,s.header);
		org.omg.CosNotification.FilterableEventBodyHelper.write(out,s.filterable_data);
		out.write_any(s.remainder_of_body);
	}
}
