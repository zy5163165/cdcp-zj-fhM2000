package mLSNPP;

/**
 *	Generated from IDL definition of alias "SNPPList_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, mLSNPP.SNPP_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mLSNPP.SNPP_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(mLSNPP.SNPPList_THelper.id(), "SNPPList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mLSNPP.SNPP_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/SNPPList_T:1.0";
	}
	public static mLSNPP.SNPP_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mLSNPP.SNPP_T[] _result;
		int _l_result95 = _in.read_long();
		_result = new mLSNPP.SNPP_T[_l_result95];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=mLSNPP.SNPP_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mLSNPP.SNPP_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			mLSNPP.SNPP_THelper.write(_out,_s[i]);
		}

	}
}
