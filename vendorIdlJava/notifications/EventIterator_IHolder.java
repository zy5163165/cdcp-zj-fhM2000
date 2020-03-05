package notifications;

/**
 *	Generated from IDL definition of interface "EventIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class EventIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EventIterator_I value;
	public EventIterator_IHolder ()
	{
	}
	public EventIterator_IHolder (final EventIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EventIterator_IHelper.write (_out,value);
	}
}
