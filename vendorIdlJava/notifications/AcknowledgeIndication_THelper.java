package notifications;
/**
 *	Generated from IDL definition of enum "AcknowledgeIndication_T"
 *	@author JacORB IDL compiler 
 */

public final class AcknowledgeIndication_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(notifications.AcknowledgeIndication_THelper.id(),"AcknowledgeIndication_T",new String[]{"AI_EVENT_ACKNOWLEDGED","AI_EVENT_UNACKNOWLEDGED","AI_NA"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final notifications.AcknowledgeIndication_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.AcknowledgeIndication_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/AcknowledgeIndication_T:1.0";
	}
	public static AcknowledgeIndication_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return AcknowledgeIndication_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final AcknowledgeIndication_T s)
	{
		out.write_long(s.value());
	}
}
