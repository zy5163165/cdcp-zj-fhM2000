package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "UnknownServiceType"
 *	@author JacORB IDL compiler 
 */

public final class UnknownServiceTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.UnknownServiceTypeHelper.id(),"UnknownServiceType",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CosTrading.ServiceTypeNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.UnknownServiceType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.UnknownServiceType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/UnknownServiceType:1.0";
	}
	public static org.omg.CosTrading.UnknownServiceType read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.UnknownServiceType result = new org.omg.CosTrading.UnknownServiceType();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.type = org.omg.CosTrading.ServiceTypeNameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.UnknownServiceType s)
	{
		out.write_string(id());
		org.omg.CosTrading.ServiceTypeNameHelper.write(out,s.type);
	}
}
