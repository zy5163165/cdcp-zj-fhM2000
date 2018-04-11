package org.omg.CosNotifyChannelAdmin;


/**
 *	Generated from IDL definition of struct "AdminLimit"
 *	@author JacORB IDL compiler 
 */

public final class AdminLimitHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNotifyChannelAdmin.AdminLimitHelper.id(),"AdminLimit",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosNotification.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CosNotification.PropertyValueHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.AdminLimit s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyChannelAdmin.AdminLimit extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/AdminLimit:1.0";
	}
	public static org.omg.CosNotifyChannelAdmin.AdminLimit read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotifyChannelAdmin.AdminLimit result = new org.omg.CosNotifyChannelAdmin.AdminLimit();
		result.name = org.omg.CosNotification.PropertyNameHelper.read(in);
		result.value = org.omg.CosNotification.PropertyValueHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyChannelAdmin.AdminLimit s)
	{
		org.omg.CosNotification.PropertyNameHelper.write(out,s.name);
		org.omg.CosNotification.PropertyValueHelper.write(out,s.value);
	}
}
