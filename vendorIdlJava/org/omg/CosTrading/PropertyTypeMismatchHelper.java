package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "PropertyTypeMismatch"
 *	@author JacORB IDL compiler 
 */

public final class PropertyTypeMismatchHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.PropertyTypeMismatchHelper.id(),"PropertyTypeMismatch",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CosTrading.ServiceTypeNameHelper.type(), null),new org.omg.CORBA.StructMember("prop", org.omg.CosTrading.PropertyHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.PropertyTypeMismatch s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.PropertyTypeMismatch extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/PropertyTypeMismatch:1.0";
	}
	public static org.omg.CosTrading.PropertyTypeMismatch read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.PropertyTypeMismatch result = new org.omg.CosTrading.PropertyTypeMismatch();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.type = org.omg.CosTrading.ServiceTypeNameHelper.read(in);
		result.prop=org.omg.CosTrading.PropertyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.PropertyTypeMismatch s)
	{
		out.write_string(id());
		org.omg.CosTrading.ServiceTypeNameHelper.write(out,s.type);
		org.omg.CosTrading.PropertyHelper.write(out,s.prop);
	}
}
