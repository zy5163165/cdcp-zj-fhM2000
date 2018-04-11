package common;

/**
 *	Generated from IDL definition of alias "CapabilityList_T"
 *	@author JacORB IDL compiler 
 */

public final class CapabilityList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, globaldefs.NameAndStringValue_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static globaldefs.NameAndStringValue_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(common.CapabilityList_THelper.id(), "CapabilityList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, common.Capability_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/common/CapabilityList_T:1.0";
	}
	public static globaldefs.NameAndStringValue_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		globaldefs.NameAndStringValue_T[] _result;
		int _l_result10 = _in.read_long();
		_result = new globaldefs.NameAndStringValue_T[_l_result10];
		for(int i=0;i<_result.length;i++)
		{
			_result[i] = common.Capability_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, globaldefs.NameAndStringValue_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			common.Capability_THelper.write(_out,_s[i]);
		}

	}
}
