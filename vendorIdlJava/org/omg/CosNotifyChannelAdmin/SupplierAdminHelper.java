package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "SupplierAdmin"
 *	@author JacORB IDL compiler 
 */

public final class SupplierAdminHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyChannelAdmin.SupplierAdmin s)
	{
		any.insert_Object (s);
	}
	public static org.omg.CosNotifyChannelAdmin.SupplierAdmin extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosNotifyChannelAdmin/SupplierAdmin:1.0", "SupplierAdmin");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyChannelAdmin/SupplierAdmin:1.0";
	}
	public static SupplierAdmin read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyChannelAdmin.SupplierAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyChannelAdmin.SupplierAdmin narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (org.omg.CosNotifyChannelAdmin.SupplierAdmin)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:omg.org/CosNotifyChannelAdmin/SupplierAdmin:1.0"))
			{
				org.omg.CosNotifyChannelAdmin._SupplierAdminStub stub;
				stub = new org.omg.CosNotifyChannelAdmin._SupplierAdminStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
