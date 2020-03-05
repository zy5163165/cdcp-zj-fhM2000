package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "AlarmFilterTaskList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmFilterTaskList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedEmsMgr.AlarmFilterTask_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedEmsMgr.AlarmFilterTask_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedEmsMgr.AlarmFilterTaskList_THelper.id(), "AlarmFilterTaskList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedEmsMgr.AlarmFilterTask_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/AlarmFilterTaskList_T:1.0";
	}
	public static extendedEmsMgr.AlarmFilterTask_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedEmsMgr.AlarmFilterTask_T[] _result;
		int _l_result49 = _in.read_long();
		_result = new extendedEmsMgr.AlarmFilterTask_T[_l_result49];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedEmsMgr.AlarmFilterTask_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedEmsMgr.AlarmFilterTask_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedEmsMgr.AlarmFilterTask_THelper.write(_out,_s[i]);
		}

	}
}
