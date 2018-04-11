package performance;

/**
 *	Generated from IDL definition of alias "TCAParameterProfileList_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterProfileList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, performance.TCAParameterProfile_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static performance.TCAParameterProfile_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(performance.TCAParameterProfileList_THelper.id(), "TCAParameterProfileList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, performance.TCAParameterProfile_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/TCAParameterProfileList_T:1.0";
	}
	public static performance.TCAParameterProfile_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		performance.TCAParameterProfile_T[] _result;
		int _l_result123 = _in.read_long();
		_result = new performance.TCAParameterProfile_T[_l_result123];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=performance.TCAParameterProfile_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, performance.TCAParameterProfile_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			performance.TCAParameterProfile_THelper.write(_out,_s[i]);
		}

	}
}
