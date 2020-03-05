package org.omg.CosTrading;


/**
 *	Generated from IDL definition of struct "Offer"
 *	@author JacORB IDL compiler 
 */

public final class OfferHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosTrading.OfferHelper.id(),"Offer",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("reference", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/Object:1.0","Object"), null),new org.omg.CORBA.StructMember("properties", org.omg.CosTrading.PropertySeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.Offer s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.Offer extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Offer:1.0";
	}
	public static org.omg.CosTrading.Offer read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.Offer result = new org.omg.CosTrading.Offer();
		result.reference=in.read_Object();
		result.properties = org.omg.CosTrading.PropertySeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.Offer s)
	{
		out.write_Object(s.reference);
		org.omg.CosTrading.PropertySeqHelper.write(out,s.properties);
	}
}
