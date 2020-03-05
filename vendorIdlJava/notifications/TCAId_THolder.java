package notifications;

/**
 *	Generated from IDL definition of struct "TCAId_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAId_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.TCAId_T value;

	public TCAId_THolder ()
	{
	}
	public TCAId_THolder (final notifications.TCAId_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return notifications.TCAId_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = notifications.TCAId_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		notifications.TCAId_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
