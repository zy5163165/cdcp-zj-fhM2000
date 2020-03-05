package ipMgrCMCC;

/**
 *	Generated from IDL definition of alias "StaticRoutingList_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRoutingList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, ipMgrCMCC.StaticRouting_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static ipMgrCMCC.StaticRouting_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(ipMgrCMCC.StaticRoutingList_THelper.id(), "StaticRoutingList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, ipMgrCMCC.StaticRouting_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgrCMCC/StaticRoutingList_T:1.0";
	}
	public static ipMgrCMCC.StaticRouting_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		ipMgrCMCC.StaticRouting_T[] _result;
		int _l_result85 = _in.read_long();
		_result = new ipMgrCMCC.StaticRouting_T[_l_result85];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=ipMgrCMCC.StaticRouting_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, ipMgrCMCC.StaticRouting_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			ipMgrCMCC.StaticRouting_THelper.write(_out,_s[i]);
		}

	}
}
