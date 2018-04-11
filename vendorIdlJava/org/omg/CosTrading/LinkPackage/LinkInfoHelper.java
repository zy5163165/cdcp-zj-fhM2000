package org.omg.CosTrading.LinkPackage;


/**
 *	Generated from IDL definition of struct "LinkInfo"
 *	@author JacORB IDL compiler 
 */

public final class LinkInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosTrading.LinkPackage.LinkInfoHelper.id(),"LinkInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target", org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/Lookup:1.0", "Lookup"), null),new org.omg.CORBA.StructMember("target_reg", org.omg.CORBA.ORB.init().create_interface_tc( "IDL:omg.org/CosTrading/Register:1.0", "Register"), null),new org.omg.CORBA.StructMember("def_pass_on_follow_rule", org.omg.CosTrading.FollowOptionHelper.type(), null),new org.omg.CORBA.StructMember("limiting_follow_rule", org.omg.CosTrading.FollowOptionHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LinkPackage.LinkInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LinkPackage.LinkInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Link/LinkInfo:1.0";
	}
	public static org.omg.CosTrading.LinkPackage.LinkInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.LinkPackage.LinkInfo result = new org.omg.CosTrading.LinkPackage.LinkInfo();
		result.target=org.omg.CosTrading.LookupHelper.read(in);
		result.target_reg=org.omg.CosTrading.RegisterHelper.read(in);
		result.def_pass_on_follow_rule=org.omg.CosTrading.FollowOptionHelper.read(in);
		result.limiting_follow_rule=org.omg.CosTrading.FollowOptionHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.LinkPackage.LinkInfo s)
	{
		org.omg.CosTrading.LookupHelper.write(out,s.target);
		org.omg.CosTrading.RegisterHelper.write(out,s.target_reg);
		org.omg.CosTrading.FollowOptionHelper.write(out,s.def_pass_on_follow_rule);
		org.omg.CosTrading.FollowOptionHelper.write(out,s.limiting_follow_rule);
	}
}
