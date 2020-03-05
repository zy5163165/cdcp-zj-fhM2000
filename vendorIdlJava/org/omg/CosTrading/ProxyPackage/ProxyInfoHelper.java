package org.omg.CosTrading.ProxyPackage;


/**
 *	Generated from IDL definition of struct "ProxyInfo"
 *	@author JacORB IDL compiler 
 */

public final class ProxyInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosTrading.ProxyPackage.ProxyInfoHelper.id(),"ProxyInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CosTrading.ServiceTypeNameHelper.type(), null),new org.omg.CORBA.StructMember("target", org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/Lookup:1.0", "Lookup"), null),new org.omg.CORBA.StructMember("properties", org.omg.CosTrading.PropertySeqHelper.type(), null),new org.omg.CORBA.StructMember("if_match_all", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("recipe", org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.type(), null),new org.omg.CORBA.StructMember("policies_to_pass_on", org.omg.CosTrading.PolicySeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.ProxyPackage.ProxyInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.ProxyPackage.ProxyInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Proxy/ProxyInfo:1.0";
	}
	public static org.omg.CosTrading.ProxyPackage.ProxyInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.ProxyPackage.ProxyInfo result = new org.omg.CosTrading.ProxyPackage.ProxyInfo();
		result.type = org.omg.CosTrading.ServiceTypeNameHelper.read(in);
		result.target=org.omg.CosTrading.LookupHelper.read(in);
		result.properties = org.omg.CosTrading.PropertySeqHelper.read(in);
		result.if_match_all=in.read_boolean();
		result.recipe = org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.read(in);
		result.policies_to_pass_on = org.omg.CosTrading.PolicySeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.ProxyPackage.ProxyInfo s)
	{
		org.omg.CosTrading.ServiceTypeNameHelper.write(out,s.type);
		org.omg.CosTrading.LookupHelper.write(out,s.target);
		org.omg.CosTrading.PropertySeqHelper.write(out,s.properties);
		out.write_boolean(s.if_match_all);
		org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.write(out,s.recipe);
		org.omg.CosTrading.PolicySeqHelper.write(out,s.policies_to_pass_on);
	}
}
