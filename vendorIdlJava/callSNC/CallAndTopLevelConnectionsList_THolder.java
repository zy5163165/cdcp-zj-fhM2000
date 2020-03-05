package callSNC;

/**
 *	Generated from IDL definition of alias "CallAndTopLevelConnectionsList_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.CallAndTopLevelConnections_T[] value;

	public CallAndTopLevelConnectionsList_THolder ()
	{
	}
	public CallAndTopLevelConnectionsList_THolder (final callSNC.CallAndTopLevelConnections_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CallAndTopLevelConnectionsList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallAndTopLevelConnectionsList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CallAndTopLevelConnectionsList_THelper.write (out,value);
	}
}
