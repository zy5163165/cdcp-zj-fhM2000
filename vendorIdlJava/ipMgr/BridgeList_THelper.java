package ipMgr;

/**
 *	Generated from IDL definition of alias "BridgeList_T"
 *	@author JacORB IDL compiler 
 */

public final class BridgeList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, ipMgr.Bridge_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static ipMgr.Bridge_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(ipMgr.BridgeList_THelper.id(), "BridgeList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, ipMgr.Bridge_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgr/BridgeList_T:1.0";
	}
	public static ipMgr.Bridge_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		ipMgr.Bridge_T[] _result;
		int _l_result77 = _in.read_long();
		_result = new ipMgr.Bridge_T[_l_result77];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=ipMgr.Bridge_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, ipMgr.Bridge_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			ipMgr.Bridge_THelper.write(_out,_s[i]);
		}

	}
}
