package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of alias "EXTCAParametersList_T"
 *	@author JacORB IDL compiler 
 */

public final class EXTCAParametersList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedPerformanceMgr.EXTCAParameters_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedPerformanceMgr.EXTCAParameters_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedPerformanceMgr.EXTCAParametersList_THelper.id(), "EXTCAParametersList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedPerformanceMgr.EXTCAParameters_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedPerformanceMgr/EXTCAParametersList_T:1.0";
	}
	public static extendedPerformanceMgr.EXTCAParameters_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedPerformanceMgr.EXTCAParameters_T[] _result;
		int _l_result62 = _in.read_long();
		_result = new extendedPerformanceMgr.EXTCAParameters_T[_l_result62];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedPerformanceMgr.EXTCAParameters_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedPerformanceMgr.EXTCAParameters_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedPerformanceMgr.EXTCAParameters_THelper.write(_out,_s[i]);
		}

	}
}
