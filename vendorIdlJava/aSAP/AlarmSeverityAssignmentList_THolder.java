package aSAP;

/**
 *	Generated from IDL definition of alias "AlarmSeverityAssignmentList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmSeverityAssignmentList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public aSAP.AlarmSeverityAssignment_T[] value;

	public AlarmSeverityAssignmentList_THolder ()
	{
	}
	public AlarmSeverityAssignmentList_THolder (final aSAP.AlarmSeverityAssignment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmSeverityAssignmentList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmSeverityAssignmentList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmSeverityAssignmentList_THelper.write (out,value);
	}
}
