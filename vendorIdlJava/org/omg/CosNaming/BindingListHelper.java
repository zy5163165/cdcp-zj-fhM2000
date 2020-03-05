package org.omg.CosNaming;

/**
 *	Generated from IDL definition of alias "BindingList"
 *	@author JacORB IDL compiler 
 */

public final class BindingListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosNaming.Binding[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosNaming.Binding[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNaming.BindingListHelper.id(), "BindingList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosNaming.BindingHelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/BindingList:1.0";
	}
	public static org.omg.CosNaming.Binding[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosNaming.Binding[] _result;
		int _l_result12 = _in.read_long();
		_result = new org.omg.CosNaming.Binding[_l_result12];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CosNaming.BindingHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosNaming.Binding[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			org.omg.CosNaming.BindingHelper.write(_out,_s[i]);
		}

	}
}
