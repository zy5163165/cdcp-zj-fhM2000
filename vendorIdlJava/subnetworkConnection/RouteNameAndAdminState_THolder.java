package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteNameAndAdminState_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteNameAndAdminState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteNameAndAdminState_T value;

	public RouteNameAndAdminState_THolder ()
	{
	}
	public RouteNameAndAdminState_THolder (final subnetworkConnection.RouteNameAndAdminState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return subnetworkConnection.RouteNameAndAdminState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = subnetworkConnection.RouteNameAndAdminState_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		subnetworkConnection.RouteNameAndAdminState_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
