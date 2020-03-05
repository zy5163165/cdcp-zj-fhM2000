package org.omg.CosTrading.RegisterPackage;


/**
 *	Generated from IDL definition of struct "OfferInfo"
 *	@author JacORB IDL compiler 
 */

public final class OfferInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosTrading.RegisterPackage.OfferInfoHelper.id(),"OfferInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("reference", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Object:1.0","Object"), null),new org.omg.CORBA.StructMember("type", org.omg.CosTrading.ServiceTypeNameHelper.type(), null),new org.omg.CORBA.StructMember("properties", org.omg.CosTrading.PropertySeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.RegisterPackage.OfferInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.RegisterPackage.OfferInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Register/OfferInfo:1.0";
	}
	public static org.omg.CosTrading.RegisterPackage.OfferInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.RegisterPackage.OfferInfo result = new org.omg.CosTrading.RegisterPackage.OfferInfo();
		result.reference=in.read_Object();
		result.type = org.omg.CosTrading.ServiceTypeNameHelper.read(in);
		result.properties = org.omg.CosTrading.PropertySeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.RegisterPackage.OfferInfo s)
	{
		out.write_Object(s.reference);
		org.omg.CosTrading.ServiceTypeNameHelper.write(out,s.type);
		org.omg.CosTrading.PropertySeqHelper.write(out,s.properties);
	}
}
