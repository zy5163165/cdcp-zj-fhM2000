package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "AlarmFilterTask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmFilterTask_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.AlarmFilterTask_T value;

	public AlarmFilterTask_THolder ()
	{
	}
	public AlarmFilterTask_THolder (final extendedEmsMgr.AlarmFilterTask_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.AlarmFilterTask_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.AlarmFilterTask_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.AlarmFilterTask_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
