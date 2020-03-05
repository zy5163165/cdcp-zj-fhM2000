package extendedManagedElementManager;
/**
 *	Generated from IDL definition of enum "RouteTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteTypeQualifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public RouteTypeQualifier_T value;

	public RouteTypeQualifier_THolder ()
	{
	}
	public RouteTypeQualifier_THolder (final RouteTypeQualifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteTypeQualifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteTypeQualifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteTypeQualifier_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
