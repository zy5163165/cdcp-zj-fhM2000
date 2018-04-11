package extendedManagedElementManager;
/**
 *	Generated from IDL definition of enum "RouteTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteTypeQualifier_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(extendedManagedElementManager.RouteTypeQualifier_THelper.id(),"RouteTypeQualifier_T",new String[]{"CC","TPL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.RouteTypeQualifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedManagedElementManager.RouteTypeQualifier_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/RouteTypeQualifier_T:1.0";
	}
	public static RouteTypeQualifier_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return RouteTypeQualifier_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final RouteTypeQualifier_T s)
	{
		out.write_long(s.value());
	}
}
