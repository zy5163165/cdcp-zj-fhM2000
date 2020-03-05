package mLSNPP;

/**
 *	Generated from IDL definition of alias "SNPTNAPairList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAPairList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, mLSNPP.SNPTNAPair_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mLSNPP.SNPTNAPair_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(mLSNPP.SNPTNAPairList_THelper.id(), "SNPTNAPairList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mLSNPP.SNPTNAPair_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/SNPTNAPairList_T:1.0";
	}
	public static mLSNPP.SNPTNAPair_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mLSNPP.SNPTNAPair_T[] _result;
		int _l_result98 = _in.read_long();
		_result = new mLSNPP.SNPTNAPair_T[_l_result98];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=mLSNPP.SNPTNAPair_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mLSNPP.SNPTNAPair_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			mLSNPP.SNPTNAPair_THelper.write(_out,_s[i]);
		}

	}
}
