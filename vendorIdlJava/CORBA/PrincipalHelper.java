package CORBA;

/**
 *	Generated from IDL definition of interface "Principal"
 *	@author JacORB IDL compiler 
 */

public final class PrincipalHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CORBA.Principal s)
	{
		any.insert_Object (s);
	}
	public static CORBA.Principal extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:CORBA/Principal:1.0", "Principal");
	}
	public static String id()
	{
		return "IDL:CORBA/Principal:1.0";
	}
	public static Principal read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final CORBA.Principal s)
	{
		_out.write_Object(s);
	}
	public static CORBA.Principal narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (CORBA.Principal)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:CORBA/Principal:1.0"))
			{
				CORBA._PrincipalStub stub;
				stub = new CORBA._PrincipalStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
