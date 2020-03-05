package performance;

/**
 *	Generated from IDL definition of alias "PMThresholdList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, performance.PMThreshold_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static performance.PMThreshold_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(performance.PMThresholdList_THelper.id(), "PMThresholdList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, performance.PMThreshold_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMThresholdList_T:1.0";
	}
	public static performance.PMThreshold_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		performance.PMThreshold_T[] _result;
		int _l_result127 = _in.read_long();
		_result = new performance.PMThreshold_T[_l_result127];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=performance.PMThreshold_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, performance.PMThreshold_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			performance.PMThreshold_THelper.write(_out,_s[i]);
		}

	}
}
