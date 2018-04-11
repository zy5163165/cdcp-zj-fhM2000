package org.omg.CosTrading;


/**
 *	Generated from IDL definition of struct "Policy"
 *	@author JacORB IDL compiler 
 */

public final class PolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosTrading.PolicyHelper.id(),"Policy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosTrading.PolicyNameHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CosTrading.PolicyValueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.Policy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.Policy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Policy:1.0";
	}
	public static org.omg.CosTrading.Policy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.Policy result = new org.omg.CosTrading.Policy();
		result.name = org.omg.CosTrading.PolicyNameHelper.read(in);
		result.value = org.omg.CosTrading.PolicyValueHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.Policy s)
	{
		org.omg.CosTrading.PolicyNameHelper.write(out,s.name);
		org.omg.CosTrading.PolicyValueHelper.write(out,s.value);
	}
}
