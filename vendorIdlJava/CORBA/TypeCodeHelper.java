package CORBA;

/**
 *	Generated from IDL definition of interface "TypeCode"
 *	@author JacORB IDL compiler 
 */

public final class TypeCodeHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CORBA.TypeCode s)
	{
		any.insert_Object (s);
	}
	public static CORBA.TypeCode extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:CORBA/TypeCode:1.0", "TypeCode");
	}
	public static String id()
	{
		return "IDL:CORBA/TypeCode:1.0";
	}
	public static TypeCode read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final CORBA.TypeCode s)
	{
		_out.write_Object(s);
	}
	public static CORBA.TypeCode narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (CORBA.TypeCode)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:CORBA/TypeCode:1.0"))
			{
				CORBA._TypeCodeStub stub;
				stub = new CORBA._TypeCodeStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
