package callSNC;

/**
 *	Generated from IDL definition of struct "CallParameterProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class CallParameterProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.CallParameterProfile_T value;

	public CallParameterProfile_THolder ()
	{
	}
	public CallParameterProfile_THolder (final callSNC.CallParameterProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.CallParameterProfile_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.CallParameterProfile_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.CallParameterProfile_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
