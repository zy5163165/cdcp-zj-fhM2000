package org.omg.CosTrading.LookupPackage;


/**
 *	Generated from IDL definition of exception "IllegalPreference"
 *	@author JacORB IDL compiler 
 */

public final class IllegalPreferenceHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.id(),"IllegalPreference",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pref", org.omg.CosTrading.LookupPackage.PreferenceHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LookupPackage.IllegalPreference s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LookupPackage.IllegalPreference extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Lookup/IllegalPreference:1.0";
	}
	public static org.omg.CosTrading.LookupPackage.IllegalPreference read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.LookupPackage.IllegalPreference result = new org.omg.CosTrading.LookupPackage.IllegalPreference();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.pref = org.omg.CosTrading.LookupPackage.PreferenceHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.LookupPackage.IllegalPreference s)
	{
		out.write_string(id());
		org.omg.CosTrading.LookupPackage.PreferenceHelper.write(out,s.pref);
	}
}
