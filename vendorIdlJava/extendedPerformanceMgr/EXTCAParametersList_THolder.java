package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of alias "EXTCAParametersList_T"
 *	@author JacORB IDL compiler 
 */

public final class EXTCAParametersList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedPerformanceMgr.EXTCAParameters_T[] value;

	public EXTCAParametersList_THolder ()
	{
	}
	public EXTCAParametersList_THolder (final extendedPerformanceMgr.EXTCAParameters_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EXTCAParametersList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EXTCAParametersList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EXTCAParametersList_THelper.write (out,value);
	}
}
