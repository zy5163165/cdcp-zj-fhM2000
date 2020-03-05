package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of alias "EXPMThresholdValueList_T"
 *	@author JacORB IDL compiler 
 */

public final class EXPMThresholdValueList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedPerformanceMgr.EXPMThresholdValue_T[] value;

	public EXPMThresholdValueList_THolder ()
	{
	}
	public EXPMThresholdValueList_THolder (final extendedPerformanceMgr.EXPMThresholdValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EXPMThresholdValueList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EXPMThresholdValueList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EXPMThresholdValueList_THelper.write (out,value);
	}
}
