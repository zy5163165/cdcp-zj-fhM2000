package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "AlarmFilterTaskList_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmFilterTaskList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.AlarmFilterTask_T[] value;

	public AlarmFilterTaskList_THolder ()
	{
	}
	public AlarmFilterTaskList_THolder (final extendedEmsMgr.AlarmFilterTask_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmFilterTaskList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmFilterTaskList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmFilterTaskList_THelper.write (out,value);
	}
}
