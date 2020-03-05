package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of struct "EXTCAParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class EXTCAParameters_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedPerformanceMgr.EXTCAParameters_T value;

	public EXTCAParameters_THolder ()
	{
	}
	public EXTCAParameters_THolder (final extendedPerformanceMgr.EXTCAParameters_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedPerformanceMgr.EXTCAParameters_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedPerformanceMgr.EXTCAParameters_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedPerformanceMgr.EXTCAParameters_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
