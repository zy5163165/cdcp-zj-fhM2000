package org.omg.CosNotification;


/**
 *	Generated from IDL definition of struct "PropertyError"
 *	@author JacORB IDL compiler 
 */

public final class PropertyErrorHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNotification.PropertyErrorHelper.id(),"PropertyError",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("code", org.omg.CosNotification.QoSError_codeHelper.type(), null),new org.omg.CORBA.StructMember("name", org.omg.CosNotification.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("available_range", org.omg.CosNotification.PropertyRangeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.PropertyError s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotification.PropertyError extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/PropertyError:1.0";
	}
	public static org.omg.CosNotification.PropertyError read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotification.PropertyError result = new org.omg.CosNotification.PropertyError();
		result.code=org.omg.CosNotification.QoSError_codeHelper.read(in);
		result.name = org.omg.CosNotification.PropertyNameHelper.read(in);
		result.available_range=org.omg.CosNotification.PropertyRangeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotification.PropertyError s)
	{
		org.omg.CosNotification.QoSError_codeHelper.write(out,s.code);
		org.omg.CosNotification.PropertyNameHelper.write(out,s.name);
		org.omg.CosNotification.PropertyRangeHelper.write(out,s.available_range);
	}
}
