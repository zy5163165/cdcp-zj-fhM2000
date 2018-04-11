package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "PolicySeq"
 *	@author JacORB IDL compiler 
 */

public final class PolicySeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosTrading.Policy[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosTrading.Policy[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.PolicySeqHelper.id(), "PolicySeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosTrading.PolicyHelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/PolicySeq:1.0";
	}
	public static org.omg.CosTrading.Policy[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosTrading.Policy[] _result;
		int _l_result34 = _in.read_long();
		_result = new org.omg.CosTrading.Policy[_l_result34];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CosTrading.PolicyHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosTrading.Policy[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			org.omg.CosTrading.PolicyHelper.write(_out,_s[i]);
		}

	}
}
