package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "UnknownOfferId"
 *	@author JacORB IDL compiler 
 */

public final class UnknownOfferIdHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.UnknownOfferIdHelper.id(),"UnknownOfferId",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CosTrading.OfferIdHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.UnknownOfferId s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.UnknownOfferId extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/UnknownOfferId:1.0";
	}
	public static org.omg.CosTrading.UnknownOfferId read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.UnknownOfferId result = new org.omg.CosTrading.UnknownOfferId();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.id = org.omg.CosTrading.OfferIdHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.UnknownOfferId s)
	{
		out.write_string(id());
		org.omg.CosTrading.OfferIdHelper.write(out,s.id);
	}
}
