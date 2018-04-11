package org.omg.CosNotification;


/**
 *	Generated from IDL definition of struct "PropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class PropertyRangeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNotification.PropertyRangeHelper.id(),"PropertyRange",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("low_val", org.omg.CosNotification.PropertyValueHelper.type(), null),new org.omg.CORBA.StructMember("high_val", org.omg.CosNotification.PropertyValueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.PropertyRange s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotification.PropertyRange extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/PropertyRange:1.0";
	}
	public static org.omg.CosNotification.PropertyRange read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotification.PropertyRange result = new org.omg.CosNotification.PropertyRange();
		result.low_val = org.omg.CosNotification.PropertyValueHelper.read(in);
		result.high_val = org.omg.CosNotification.PropertyValueHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotification.PropertyRange s)
	{
		org.omg.CosNotification.PropertyValueHelper.write(out,s.low_val);
		org.omg.CosNotification.PropertyValueHelper.write(out,s.high_val);
	}
}
