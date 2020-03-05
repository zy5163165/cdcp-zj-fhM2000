package terminationPoint;

/**
 *	Generated from IDL definition of alias "GTPlist_T"
 *	@author JacORB IDL compiler 
 */

public final class GTPlist_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, terminationPoint.GTP_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static terminationPoint.GTP_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(terminationPoint.GTPlist_THelper.id(), "GTPlist_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, terminationPoint.GTP_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/GTPlist_T:1.0";
	}
	public static terminationPoint.GTP_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		terminationPoint.GTP_T[] _result;
		int _l_result144 = _in.read_long();
		_result = new terminationPoint.GTP_T[_l_result144];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=terminationPoint.GTP_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, terminationPoint.GTP_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			terminationPoint.GTP_THelper.write(_out,_s[i]);
		}

	}
}
