package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of struct "TimeSpan_T"
 *	@author JacORB IDL compiler 
 */

public final class TimeSpan_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FH_FaultAnalyzer.TimeSpan_T value;

	public TimeSpan_THolder ()
	{
	}
	public TimeSpan_THolder (final FH_FaultAnalyzer.TimeSpan_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FH_FaultAnalyzer.TimeSpan_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = FH_FaultAnalyzer.TimeSpan_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FH_FaultAnalyzer.TimeSpan_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
