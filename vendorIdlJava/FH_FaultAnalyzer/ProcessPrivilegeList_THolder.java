package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of alias "ProcessPrivilegeList_T"
 *	@author JacORB IDL compiler 
 */

public final class ProcessPrivilegeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FH_FaultAnalyzer.ProcessPrivilege_T[] value;

	public ProcessPrivilegeList_THolder ()
	{
	}
	public ProcessPrivilegeList_THolder (final FH_FaultAnalyzer.ProcessPrivilege_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProcessPrivilegeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProcessPrivilegeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProcessPrivilegeList_THelper.write (out,value);
	}
}
