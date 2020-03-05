package org.omg.CosTrading.LinkPackage;


/**
 *	Generated from IDL definition of exception "DefaultFollowTooPermissive"
 *	@author JacORB IDL compiler 
 */

public final class DefaultFollowTooPermissiveHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.id(),"DefaultFollowTooPermissive",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("def_pass_on_follow_rule", org.omg.CosTrading.FollowOptionHelper.type(), null),new org.omg.CORBA.StructMember("limiting_follow_rule", org.omg.CosTrading.FollowOptionHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Link/DefaultFollowTooPermissive:1.0";
	}
	public static org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive result = new org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.def_pass_on_follow_rule=org.omg.CosTrading.FollowOptionHelper.read(in);
		result.limiting_follow_rule=org.omg.CosTrading.FollowOptionHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive s)
	{
		out.write_string(id());
		org.omg.CosTrading.FollowOptionHelper.write(out,s.def_pass_on_follow_rule);
		org.omg.CosTrading.FollowOptionHelper.write(out,s.limiting_follow_rule);
	}
}
