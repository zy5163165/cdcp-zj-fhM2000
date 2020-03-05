package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "PropertySeq"
 *	@author JacORB IDL compiler 
 */

public final class PropertySeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosTrading.Property[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosTrading.Property[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.PropertySeqHelper.id(), "PropertySeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosTrading.PropertyHelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/PropertySeq:1.0";
	}
	public static org.omg.CosTrading.Property[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosTrading.Property[] _result;
		int _l_result29 = _in.read_long();
		_result = new org.omg.CosTrading.Property[_l_result29];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CosTrading.PropertyHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosTrading.Property[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			org.omg.CosTrading.PropertyHelper.write(_out,_s[i]);
		}

	}
}
