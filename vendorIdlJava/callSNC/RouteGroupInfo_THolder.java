package callSNC;

/**
 *	Generated from IDL definition of struct "RouteGroupInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteGroupInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.RouteGroupInfo_T value;

	public RouteGroupInfo_THolder ()
	{
	}
	public RouteGroupInfo_THolder (final callSNC.RouteGroupInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.RouteGroupInfo_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.RouteGroupInfo_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.RouteGroupInfo_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
