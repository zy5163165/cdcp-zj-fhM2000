package org.omg.CosNotifyComm;


/**
 *	Generated from IDL definition of exception "InvalidEventType"
 *	@author JacORB IDL compiler 
 */

public final class InvalidEventTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosNotifyComm.InvalidEventTypeHelper.id(),"InvalidEventType",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CosNotification.EventTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyComm.InvalidEventType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyComm.InvalidEventType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/InvalidEventType:1.0";
	}
	public static org.omg.CosNotifyComm.InvalidEventType read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotifyComm.InvalidEventType result = new org.omg.CosNotifyComm.InvalidEventType();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.type=org.omg.CosNotification.EventTypeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyComm.InvalidEventType s)
	{
		out.write_string(id());
		org.omg.CosNotification.EventTypeHelper.write(out,s.type);
	}
}
