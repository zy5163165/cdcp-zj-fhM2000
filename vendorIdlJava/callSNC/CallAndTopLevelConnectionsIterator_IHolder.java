package callSNC;

/**
 *	Generated from IDL definition of interface "CallAndTopLevelConnectionsIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CallAndTopLevelConnectionsIterator_I value;
	public CallAndTopLevelConnectionsIterator_IHolder ()
	{
	}
	public CallAndTopLevelConnectionsIterator_IHolder (final CallAndTopLevelConnectionsIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CallAndTopLevelConnectionsIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallAndTopLevelConnectionsIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CallAndTopLevelConnectionsIterator_IHelper.write (_out,value);
	}
}
