package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "EventChannel"
 *	@author JacORB IDL compiler 
 */

public final class EventChannelHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.EventChannel s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosEventChannelAdmin.EventChannel extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0", "EventChannel");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0";
	}
	public static EventChannel read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventChannelAdmin.EventChannel s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.EventChannel narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosEventChannelAdmin.EventChannel)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0"))
			{
				org.omg.CosEventChannelAdmin._EventChannelStub stub;
				stub = new org.omg.CosEventChannelAdmin._EventChannelStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
