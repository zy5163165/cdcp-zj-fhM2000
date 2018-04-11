package mLSNPPLink;

/**
 *	Generated from IDL definition of alias "LayeredSNPPLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPLinkList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, mLSNPPLink.LayeredSNPPLink_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mLSNPPLink.LayeredSNPPLink_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(mLSNPPLink.LayeredSNPPLinkList_THelper.id(), "LayeredSNPPLinkList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mLSNPPLink.LayeredSNPPLink_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPPLink/LayeredSNPPLinkList_T:1.0";
	}
	public static mLSNPPLink.LayeredSNPPLink_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mLSNPPLink.LayeredSNPPLink_T[] _result;
		int _l_result102 = _in.read_long();
		_result = new mLSNPPLink.LayeredSNPPLink_T[_l_result102];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=mLSNPPLink.LayeredSNPPLink_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mLSNPPLink.LayeredSNPPLink_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			mLSNPPLink.LayeredSNPPLink_THelper.write(_out,_s[i]);
		}

	}
}
