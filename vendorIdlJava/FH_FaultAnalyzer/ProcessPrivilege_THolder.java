package FH_FaultAnalyzer;
/**
 *	Generated from IDL definition of enum "ProcessPrivilege_T"
 *	@author JacORB IDL compiler 
 */

public final class ProcessPrivilege_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProcessPrivilege_T value;

	public ProcessPrivilege_THolder ()
	{
	}
	public ProcessPrivilege_THolder (final ProcessPrivilege_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProcessPrivilege_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProcessPrivilege_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProcessPrivilege_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
