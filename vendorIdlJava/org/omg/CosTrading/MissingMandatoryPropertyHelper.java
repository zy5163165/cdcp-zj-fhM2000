package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "MissingMandatoryProperty"
 *	@author JacORB IDL compiler 
 */

public final class MissingMandatoryPropertyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.MissingMandatoryPropertyHelper.id(),"MissingMandatoryProperty",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CosTrading.ServiceTypeNameHelper.type(), null),new org.omg.CORBA.StructMember("name", org.omg.CosTrading.PropertyNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.MissingMandatoryProperty s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.MissingMandatoryProperty extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/MissingMandatoryProperty:1.0";
	}
	public static org.omg.CosTrading.MissingMandatoryProperty read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.MissingMandatoryProperty result = new org.omg.CosTrading.MissingMandatoryProperty();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.type = org.omg.CosTrading.ServiceTypeNameHelper.read(in);
		result.name = org.omg.CosTrading.PropertyNameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.MissingMandatoryProperty s)
	{
		out.write_string(id());
		org.omg.CosTrading.ServiceTypeNameHelper.write(out,s.type);
		org.omg.CosTrading.PropertyNameHelper.write(out,s.name);
	}
}
