package org.omg.CosTrading.LookupPackage;


/**
 *	Generated from IDL definition of exception "IllegalPolicyName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalPolicyNameHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.LookupPackage.IllegalPolicyNameHelper.id(),"IllegalPolicyName",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosTrading.PolicyNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LookupPackage.IllegalPolicyName s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LookupPackage.IllegalPolicyName extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Lookup/IllegalPolicyName:1.0";
	}
	public static org.omg.CosTrading.LookupPackage.IllegalPolicyName read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.LookupPackage.IllegalPolicyName result = new org.omg.CosTrading.LookupPackage.IllegalPolicyName();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.name = org.omg.CosTrading.PolicyNameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.LookupPackage.IllegalPolicyName s)
	{
		out.write_string(id());
		org.omg.CosTrading.PolicyNameHelper.write(out,s.name);
	}
}
