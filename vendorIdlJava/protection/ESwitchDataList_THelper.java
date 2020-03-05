package protection;

/**
 *	Generated from IDL definition of alias "ESwitchDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchDataList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, protection.ESwitchData_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static protection.ESwitchData_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(protection.ESwitchDataList_THelper.id(), "ESwitchDataList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, protection.ESwitchData_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ESwitchDataList_T:1.0";
	}
	public static protection.ESwitchData_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		protection.ESwitchData_T[] _result;
		int _l_result133 = _in.read_long();
		_result = new protection.ESwitchData_T[_l_result133];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=protection.ESwitchData_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, protection.ESwitchData_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			protection.ESwitchData_THelper.write(_out,_s[i]);
		}

	}
}
