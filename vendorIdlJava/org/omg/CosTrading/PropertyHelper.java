package org.omg.CosTrading;


/**
 *	Generated from IDL definition of struct "Property"
 *	@author JacORB IDL compiler 
 */

public final class PropertyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosTrading.PropertyHelper.id(),"Property",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosTrading.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CosTrading.PropertyValueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.Property s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.Property extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Property:1.0";
	}
	public static org.omg.CosTrading.Property read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.Property result = new org.omg.CosTrading.Property();
		result.name = org.omg.CosTrading.PropertyNameHelper.read(in);
		result.value = org.omg.CosTrading.PropertyValueHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.Property s)
	{
		org.omg.CosTrading.PropertyNameHelper.write(out,s.name);
		org.omg.CosTrading.PropertyValueHelper.write(out,s.value);
	}
}
