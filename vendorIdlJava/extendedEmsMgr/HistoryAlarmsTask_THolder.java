package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "HistoryAlarmsTask_T"
 *	@author JacORB IDL compiler 
 */

public final class HistoryAlarmsTask_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.HistoryAlarmsTask_T value;

	public HistoryAlarmsTask_THolder ()
	{
	}
	public HistoryAlarmsTask_THolder (final extendedEmsMgr.HistoryAlarmsTask_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.HistoryAlarmsTask_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.HistoryAlarmsTask_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.HistoryAlarmsTask_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
