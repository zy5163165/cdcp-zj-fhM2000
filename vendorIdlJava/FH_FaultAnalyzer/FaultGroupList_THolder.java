package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of alias "FaultGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FH_FaultAnalyzer.FaultGroup_T[] value;

	public FaultGroupList_THolder ()
	{
	}
	public FaultGroupList_THolder (final FH_FaultAnalyzer.FaultGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FaultGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FaultGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FaultGroupList_THelper.write (out,value);
	}
}
