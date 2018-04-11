package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ConfigureTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ConfigureTransmissionTask_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.ConfigureTransmissionTask_T value;

	public ConfigureTransmissionTask_THolder ()
	{
	}
	public ConfigureTransmissionTask_THolder (final extendedEmsMgr.ConfigureTransmissionTask_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.ConfigureTransmissionTask_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.ConfigureTransmissionTask_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.ConfigureTransmissionTask_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
