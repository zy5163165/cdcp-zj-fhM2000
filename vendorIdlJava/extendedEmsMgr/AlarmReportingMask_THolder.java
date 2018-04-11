package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "AlarmReportingMask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmReportingMask_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.AlarmReportingMask_T value;

	public AlarmReportingMask_THolder ()
	{
	}
	public AlarmReportingMask_THolder (final extendedEmsMgr.AlarmReportingMask_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.AlarmReportingMask_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.AlarmReportingMask_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.AlarmReportingMask_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
