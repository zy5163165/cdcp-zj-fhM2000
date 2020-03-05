package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of alias "PMTPPmNameList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPPmNameList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedPerformanceMgr.PMTPPmNameSelect_T[] value;

	public PMTPPmNameList_THolder ()
	{
	}
	public PMTPPmNameList_THolder (final extendedPerformanceMgr.PMTPPmNameSelect_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMTPPmNameList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMTPPmNameList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMTPPmNameList_THelper.write (out,value);
	}
}
