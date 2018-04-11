package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "RouteNameAndAdminStateList_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteNameAndAdminStateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteNameAndAdminState_T[] value;

	public RouteNameAndAdminStateList_THolder ()
	{
	}
	public RouteNameAndAdminStateList_THolder (final subnetworkConnection.RouteNameAndAdminState_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteNameAndAdminStateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteNameAndAdminStateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteNameAndAdminStateList_THelper.write (out,value);
	}
}
