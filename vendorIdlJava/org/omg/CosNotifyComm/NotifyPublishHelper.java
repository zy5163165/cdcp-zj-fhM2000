package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of interface "NotifyPublish"
 *	@author JacORB IDL compiler 
 */

public final class NotifyPublishHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyComm.NotifyPublish s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosNotifyComm.NotifyPublish extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0", "NotifyPublish");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0";
	}
	public static NotifyPublish read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyComm.NotifyPublish s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyComm.NotifyPublish narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosNotifyComm.NotifyPublish)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"))
			{
				org.omg.CosNotifyComm._NotifyPublishStub stub;
				stub = new org.omg.CosNotifyComm._NotifyPublishStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
