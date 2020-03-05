package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of alias "PMTPPmNameList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPPmNameList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedPerformanceMgr.PMTPPmNameSelect_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedPerformanceMgr.PMTPPmNameSelect_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedPerformanceMgr.PMTPPmNameList_THelper.id(), "PMTPPmNameList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedPerformanceMgr.PMTPPmNameSelect_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedPerformanceMgr/PMTPPmNameList_T:1.0";
	}
	public static extendedPerformanceMgr.PMTPPmNameSelect_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedPerformanceMgr.PMTPPmNameSelect_T[] _result;
		int _l_result60 = _in.read_long();
		_result = new extendedPerformanceMgr.PMTPPmNameSelect_T[_l_result60];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedPerformanceMgr.PMTPPmNameSelect_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedPerformanceMgr.PMTPPmNameSelect_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedPerformanceMgr.PMTPPmNameSelect_THelper.write(_out,_s[i]);
		}

	}
}
