package org.omg.CosNotification;

/**
 *	Generated from IDL definition of interface "AdminPropertiesAdmin"
 *	@author JacORB IDL compiler 
 */

public final class AdminPropertiesAdminHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.AdminPropertiesAdmin s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosNotification.AdminPropertiesAdmin extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0", "AdminPropertiesAdmin");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0";
	}
	public static AdminPropertiesAdmin read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotification.AdminPropertiesAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotification.AdminPropertiesAdmin narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosNotification.AdminPropertiesAdmin)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0"))
			{
				org.omg.CosNotification._AdminPropertiesAdminStub stub;
				stub = new org.omg.CosNotification._AdminPropertiesAdminStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
