package org.omg.CosTrading.RegisterPackage;


/**
 *	Generated from IDL definition of exception "InvalidObjectRef"
 *	@author JacORB IDL compiler 
 */

public final class InvalidObjectRefHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.id(),"InvalidObjectRef",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ref", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Object:1.0","Object"), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.RegisterPackage.InvalidObjectRef s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.RegisterPackage.InvalidObjectRef extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Register/InvalidObjectRef:1.0";
	}
	public static org.omg.CosTrading.RegisterPackage.InvalidObjectRef read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.RegisterPackage.InvalidObjectRef result = new org.omg.CosTrading.RegisterPackage.InvalidObjectRef();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.ref=in.read_Object();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.RegisterPackage.InvalidObjectRef s)
	{
		out.write_string(id());
		out.write_Object(s.ref);
	}
}
