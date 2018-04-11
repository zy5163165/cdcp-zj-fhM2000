package aSAP;

/**
 *	Generated from IDL definition of struct "AlarmSeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmSeverityAssignment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public aSAP.AlarmSeverityAssignment_T value;

	public AlarmSeverityAssignment_THolder ()
	{
	}
	public AlarmSeverityAssignment_THolder (final aSAP.AlarmSeverityAssignment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return aSAP.AlarmSeverityAssignment_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = aSAP.AlarmSeverityAssignment_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		aSAP.AlarmSeverityAssignment_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
