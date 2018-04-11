package CORBA;

/**
 *	Generated from IDL definition of interface "NamedValue"
 *	@author JacORB IDL compiler 
 */

public final class NamedValueHelper
{
	public static void insert (final org.omg.CORBA.Any any, final CORBA.NamedValue s)
	{
		any.insert_Object (s);
	}
	public static CORBA.NamedValue extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:CORBA/NamedValue:1.0", "NamedValue");
	}
	public static String id()
	{
		return "IDL:CORBA/NamedValue:1.0";
	}
	public static NamedValue read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final CORBA.NamedValue s)
	{
		_out.write_Object(s);
	}
	public static CORBA.NamedValue narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (CORBA.NamedValue)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:CORBA/NamedValue:1.0"))
			{
				CORBA._NamedValueStub stub;
				stub = new CORBA._NamedValueStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
