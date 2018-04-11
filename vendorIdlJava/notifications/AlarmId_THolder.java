package notifications;

/**
 *	Generated from IDL definition of struct "AlarmId_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmId_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.AlarmId_T value;

	public AlarmId_THolder ()
	{
	}
	public AlarmId_THolder (final notifications.AlarmId_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return notifications.AlarmId_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = notifications.AlarmId_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		notifications.AlarmId_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
