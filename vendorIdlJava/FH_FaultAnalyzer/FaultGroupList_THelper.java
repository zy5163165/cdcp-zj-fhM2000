package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of alias "FaultGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroupList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, FH_FaultAnalyzer.FaultGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static FH_FaultAnalyzer.FaultGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(FH_FaultAnalyzer.FaultGroupList_THelper.id(), "FaultGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, FH_FaultAnalyzer.FaultGroup_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/FH_FaultAnalyzer/FaultGroupList_T:1.0";
	}
	public static FH_FaultAnalyzer.FaultGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		FH_FaultAnalyzer.FaultGroup_T[] _result;
		int _l_result66 = _in.read_long();
		_result = new FH_FaultAnalyzer.FaultGroup_T[_l_result66];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=FH_FaultAnalyzer.FaultGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, FH_FaultAnalyzer.FaultGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			FH_FaultAnalyzer.FaultGroup_THelper.write(_out,_s[i]);
		}

	}
}
