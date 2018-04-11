package org.omg.CosTrading.LookupPackage;


/**
 *	Generated from IDL definition of exception "InvalidPolicyValue"
 *	@author JacORB IDL compiler 
 */

public final class InvalidPolicyValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.id(),"InvalidPolicyValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("the_policy", org.omg.CosTrading.PolicyHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LookupPackage.InvalidPolicyValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LookupPackage.InvalidPolicyValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Lookup/InvalidPolicyValue:1.0";
	}
	public static org.omg.CosTrading.LookupPackage.InvalidPolicyValue read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.LookupPackage.InvalidPolicyValue result = new org.omg.CosTrading.LookupPackage.InvalidPolicyValue();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.the_policy=org.omg.CosTrading.PolicyHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.LookupPackage.InvalidPolicyValue s)
	{
		out.write_string(id());
		org.omg.CosTrading.PolicyHelper.write(out,s.the_policy);
	}
}
