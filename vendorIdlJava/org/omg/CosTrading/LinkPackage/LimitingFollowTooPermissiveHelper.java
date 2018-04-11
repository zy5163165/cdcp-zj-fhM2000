package org.omg.CosTrading.LinkPackage;


/**
 *	Generated from IDL definition of exception "LimitingFollowTooPermissive"
 *	@author JacORB IDL compiler 
 */

public final class LimitingFollowTooPermissiveHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.id(),"LimitingFollowTooPermissive",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("limiting_follow_rule", org.omg.CosTrading.FollowOptionHelper.type(), null),new org.omg.CORBA.StructMember("max_link_follow_policy", org.omg.CosTrading.FollowOptionHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Link/LimitingFollowTooPermissive:1.0";
	}
	public static org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive result = new org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.limiting_follow_rule=org.omg.CosTrading.FollowOptionHelper.read(in);
		result.max_link_follow_policy=org.omg.CosTrading.FollowOptionHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive s)
	{
		out.write_string(id());
		org.omg.CosTrading.FollowOptionHelper.write(out,s.limiting_follow_rule);
		org.omg.CosTrading.FollowOptionHelper.write(out,s.max_link_follow_policy);
	}
}
