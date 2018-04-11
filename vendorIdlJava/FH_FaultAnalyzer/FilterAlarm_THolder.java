package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of struct "FilterAlarm_T"
 *	@author JacORB IDL compiler 
 */

public final class FilterAlarm_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FH_FaultAnalyzer.FilterAlarm_T value;

	public FilterAlarm_THolder ()
	{
	}
	public FilterAlarm_THolder (final FH_FaultAnalyzer.FilterAlarm_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FH_FaultAnalyzer.FilterAlarm_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = FH_FaultAnalyzer.FilterAlarm_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FH_FaultAnalyzer.FilterAlarm_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
