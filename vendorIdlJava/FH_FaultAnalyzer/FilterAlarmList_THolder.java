package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of alias "FilterAlarmList_T"
 *	@author JacORB IDL compiler 
 */

public final class FilterAlarmList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FH_FaultAnalyzer.FilterAlarm_T[] value;

	public FilterAlarmList_THolder ()
	{
	}
	public FilterAlarmList_THolder (final FH_FaultAnalyzer.FilterAlarm_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FilterAlarmList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterAlarmList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FilterAlarmList_THelper.write (out,value);
	}
}
