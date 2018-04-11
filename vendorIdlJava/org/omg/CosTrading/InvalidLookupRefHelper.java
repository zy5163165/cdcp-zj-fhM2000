package org.omg.CosTrading;


/**
 *	Generated from IDL definition of exception "InvalidLookupRef"
 *	@author JacORB IDL compiler 
 */

public final class InvalidLookupRefHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.InvalidLookupRefHelper.id(),"InvalidLookupRef",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target", org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/Lookup:1.0", "Lookup"), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.InvalidLookupRef s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.InvalidLookupRef extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/InvalidLookupRef:1.0";
	}
	public static org.omg.CosTrading.InvalidLookupRef read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.InvalidLookupRef result = new org.omg.CosTrading.InvalidLookupRef();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.target=org.omg.CosTrading.LookupHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.InvalidLookupRef s)
	{
		out.write_string(id());
		org.omg.CosTrading.LookupHelper.write(out,s.target);
	}
}
