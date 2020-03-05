package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "AlarmReportingMaskList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmReportingMaskList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedEmsMgr.AlarmReportingMask_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedEmsMgr.AlarmReportingMask_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedEmsMgr.AlarmReportingMaskList_THelper.id(), "AlarmReportingMaskList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedEmsMgr.AlarmReportingMask_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/AlarmReportingMaskList_T:1.0";
	}
	public static extendedEmsMgr.AlarmReportingMask_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedEmsMgr.AlarmReportingMask_T[] _result;
		int _l_result48 = _in.read_long();
		_result = new extendedEmsMgr.AlarmReportingMask_T[_l_result48];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedEmsMgr.AlarmReportingMask_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedEmsMgr.AlarmReportingMask_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedEmsMgr.AlarmReportingMask_THelper.write(_out,_s[i]);
		}

	}
}
