package extendedMLSNMgr;

/**
 *	Generated from IDL definition of alias "MLSNSubNetWorkList_T"
 *	@author JacORB IDL compiler 
 */

public final class MLSNSubNetWorkList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedMLSNMgr.MLSNSubNetWork_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedMLSNMgr.MLSNSubNetWork_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedMLSNMgr.MLSNSubNetWorkList_THelper.id(), "MLSNSubNetWorkList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedMLSNMgr.MLSNSubNetWork_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/MLSNSubNetWorkList_T:1.0";
	}
	public static extendedMLSNMgr.MLSNSubNetWork_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedMLSNMgr.MLSNSubNetWork_T[] _result;
		int _l_result59 = _in.read_long();
		_result = new extendedMLSNMgr.MLSNSubNetWork_T[_l_result59];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedMLSNMgr.MLSNSubNetWork_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedMLSNMgr.MLSNSubNetWork_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedMLSNMgr.MLSNSubNetWork_THelper.write(_out,_s[i]);
		}

	}
}
