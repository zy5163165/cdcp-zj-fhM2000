package performance;

/**
 *	Generated from IDL definition of alias "TCAParameterList_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, performance.TCAParameter_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static performance.TCAParameter_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(performance.TCAParameterList_THelper.id(), "TCAParameterList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, performance.TCAParameter_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/TCAParameterList_T:1.0";
	}
	public static performance.TCAParameter_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		performance.TCAParameter_T[] _result;
		int _l_result122 = _in.read_long();
		_result = new performance.TCAParameter_T[_l_result122];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=performance.TCAParameter_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, performance.TCAParameter_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			performance.TCAParameter_THelper.write(_out,_s[i]);
		}

	}
}
