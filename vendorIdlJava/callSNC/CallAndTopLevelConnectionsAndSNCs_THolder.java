package callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnectionsAndSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsAndSNCs_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.CallAndTopLevelConnectionsAndSNCs_T value;

	public CallAndTopLevelConnectionsAndSNCs_THolder ()
	{
	}
	public CallAndTopLevelConnectionsAndSNCs_THolder (final callSNC.CallAndTopLevelConnectionsAndSNCs_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
