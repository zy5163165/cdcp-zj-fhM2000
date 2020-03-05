package org.omg.CosTrading.RegisterPackage;


/**
 *	Generated from IDL definition of exception "InterfaceTypeMismatch"
 *	@author JacORB IDL compiler 
 */

public final class InterfaceTypeMismatchHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatchHelper.id(),"InterfaceTypeMismatch",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CosTrading.ServiceTypeNameHelper.type(), null),new org.omg.CORBA.StructMember("reference", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Object:1.0","Object"), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Register/InterfaceTypeMismatch:1.0";
	}
	public static org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch result = new org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.type = org.omg.CosTrading.ServiceTypeNameHelper.read(in);
		result.reference=in.read_Object();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch s)
	{
		out.write_string(id());
		org.omg.CosTrading.ServiceTypeNameHelper.write(out,s.type);
		out.write_Object(s.reference);
	}
}
