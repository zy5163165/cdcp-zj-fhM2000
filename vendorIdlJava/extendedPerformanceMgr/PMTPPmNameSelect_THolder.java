package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of struct "PMTPPmNameSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPPmNameSelect_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedPerformanceMgr.PMTPPmNameSelect_T value;

	public PMTPPmNameSelect_THolder ()
	{
	}
	public PMTPPmNameSelect_THolder (final extendedPerformanceMgr.PMTPPmNameSelect_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedPerformanceMgr.PMTPPmNameSelect_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedPerformanceMgr.PMTPPmNameSelect_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedPerformanceMgr.PMTPPmNameSelect_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
