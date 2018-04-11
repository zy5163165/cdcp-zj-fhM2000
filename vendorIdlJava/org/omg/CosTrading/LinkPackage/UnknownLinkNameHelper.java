package org.omg.CosTrading.LinkPackage;


/**
 *	Generated from IDL definition of exception "UnknownLinkName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownLinkNameHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.id(),"UnknownLinkName",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosTrading.LinkNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LinkPackage.UnknownLinkName s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LinkPackage.UnknownLinkName extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Link/UnknownLinkName:1.0";
	}
	public static org.omg.CosTrading.LinkPackage.UnknownLinkName read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.LinkPackage.UnknownLinkName result = new org.omg.CosTrading.LinkPackage.UnknownLinkName();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.name = org.omg.CosTrading.LinkNameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.LinkPackage.UnknownLinkName s)
	{
		out.write_string(id());
		org.omg.CosTrading.LinkNameHelper.write(out,s.name);
	}
}
