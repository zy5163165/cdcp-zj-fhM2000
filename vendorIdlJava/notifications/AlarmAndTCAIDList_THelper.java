package notifications;

/**
 *	Generated from IDL definition of alias "AlarmAndTCAIDList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmAndTCAIDList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, notifications.AlarmOrTCAIdentifier_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static notifications.AlarmOrTCAIdentifier_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(notifications.AlarmAndTCAIDList_THelper.id(), "AlarmAndTCAIDList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, notifications.AlarmOrTCAIdentifier_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/AlarmAndTCAIDList_T:1.0";
	}
	public static notifications.AlarmOrTCAIdentifier_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		notifications.AlarmOrTCAIdentifier_T[] _result;
		int _l_result116 = _in.read_long();
		_result = new notifications.AlarmOrTCAIdentifier_T[_l_result116];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=notifications.AlarmOrTCAIdentifier_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, notifications.AlarmOrTCAIdentifier_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			notifications.AlarmOrTCAIdentifier_THelper.write(_out,_s[i]);
		}

	}
}
