package extendedMLSNMgr;

/**
 *	Generated from IDL definition of alias "TNProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class TNProtectionGroupList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedMLSNMgr.TNetworkProtectionGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedMLSNMgr.TNetworkProtectionGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedMLSNMgr.TNProtectionGroupList_THelper.id(), "TNProtectionGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedMLSNMgr.TNetworkProtectionGroup_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/TNProtectionGroupList_T:1.0";
	}
	public static extendedMLSNMgr.TNetworkProtectionGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedMLSNMgr.TNetworkProtectionGroup_T[] _result;
		int _l_result58 = _in.read_long();
		_result = new extendedMLSNMgr.TNetworkProtectionGroup_T[_l_result58];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedMLSNMgr.TNetworkProtectionGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedMLSNMgr.TNetworkProtectionGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedMLSNMgr.TNetworkProtectionGroup_THelper.write(_out,_s[i]);
		}

	}
}
