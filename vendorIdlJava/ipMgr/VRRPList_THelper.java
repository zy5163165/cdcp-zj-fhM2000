package ipMgr;

/**
 *	Generated from IDL definition of alias "VRRPList_T"
 *	@author JacORB IDL compiler 
 */

public final class VRRPList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, ipMgr.VRRPProtection_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static ipMgr.VRRPProtection_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(ipMgr.VRRPList_THelper.id(), "VRRPList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, ipMgr.VRRPProtection_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgr/VRRPList_T:1.0";
	}
	public static ipMgr.VRRPProtection_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		ipMgr.VRRPProtection_T[] _result;
		int _l_result83 = _in.read_long();
		_result = new ipMgr.VRRPProtection_T[_l_result83];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=ipMgr.VRRPProtection_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, ipMgr.VRRPProtection_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			ipMgr.VRRPProtection_THelper.write(_out,_s[i]);
		}

	}
}
