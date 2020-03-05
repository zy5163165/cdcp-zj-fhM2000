package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "IllegalOfferId"
 *	@author JacORB IDL compiler 
 */

public final class IllegalOfferIdHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.IllegalOfferIdHelper.id(),"IllegalOfferId",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CosTrading.OfferIdHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.IllegalOfferId s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.IllegalOfferId extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/IllegalOfferId:1.0";
	}
	public static org.omg.CosTrading.IllegalOfferId read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.IllegalOfferId result = new org.omg.CosTrading.IllegalOfferId();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.id = org.omg.CosTrading.OfferIdHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.IllegalOfferId s)
	{
		out.write_string(id());
		org.omg.CosTrading.OfferIdHelper.write(out,s.id);
	}
}
