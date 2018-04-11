package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of struct "EXPMThresholdValue_T"
 *	@author JacORB IDL compiler 
 */

public final class EXPMThresholdValue_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedPerformanceMgr.EXPMThresholdValue_T value;

	public EXPMThresholdValue_THolder ()
	{
	}
	public EXPMThresholdValue_THolder (final extendedPerformanceMgr.EXPMThresholdValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedPerformanceMgr.EXPMThresholdValue_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedPerformanceMgr.EXPMThresholdValue_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedPerformanceMgr.EXPMThresholdValue_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
