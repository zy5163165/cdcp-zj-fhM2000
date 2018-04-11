package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "OfferSeq"
 *	@author JacORB IDL compiler 
 */

public final class OfferSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosTrading.Offer[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosTrading.Offer[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.OfferSeqHelper.id(), "OfferSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosTrading.OfferHelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/OfferSeq:1.0";
	}
	public static org.omg.CosTrading.Offer[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosTrading.Offer[] _result;
		int _l_result30 = _in.read_long();
		_result = new org.omg.CosTrading.Offer[_l_result30];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CosTrading.OfferHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosTrading.Offer[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			org.omg.CosTrading.OfferHelper.write(_out,_s[i]);
		}

	}
}
