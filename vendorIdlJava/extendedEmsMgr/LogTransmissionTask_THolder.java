package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "LogTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class LogTransmissionTask_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.LogTransmissionTask_T value;

	public LogTransmissionTask_THolder ()
	{
	}
	public LogTransmissionTask_THolder (final extendedEmsMgr.LogTransmissionTask_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.LogTransmissionTask_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.LogTransmissionTask_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.LogTransmissionTask_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
