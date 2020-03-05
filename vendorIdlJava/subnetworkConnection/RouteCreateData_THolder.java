package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteCreateData_T value;

	public RouteCreateData_THolder ()
	{
	}
	public RouteCreateData_THolder (final subnetworkConnection.RouteCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.RouteCreateData_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.RouteCreateData_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.RouteCreateData_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
