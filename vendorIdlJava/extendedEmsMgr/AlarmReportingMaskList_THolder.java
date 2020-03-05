package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "AlarmReportingMaskList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmReportingMaskList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.AlarmReportingMask_T[] value;

	public AlarmReportingMaskList_THolder ()
	{
	}
	public AlarmReportingMaskList_THolder (final extendedEmsMgr.AlarmReportingMask_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmReportingMaskList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmReportingMaskList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmReportingMaskList_THelper.write (out,value);
	}
}
