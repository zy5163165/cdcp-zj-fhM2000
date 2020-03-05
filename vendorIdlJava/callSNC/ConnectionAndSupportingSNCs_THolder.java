package callSNC;

/**
 *	Generated from IDL definition of struct "ConnectionAndSupportingSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAndSupportingSNCs_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.ConnectionAndSupportingSNCs_T value;

	public ConnectionAndSupportingSNCs_THolder ()
	{
	}
	public ConnectionAndSupportingSNCs_THolder (final callSNC.ConnectionAndSupportingSNCs_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.ConnectionAndSupportingSNCs_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.ConnectionAndSupportingSNCs_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.ConnectionAndSupportingSNCs_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
