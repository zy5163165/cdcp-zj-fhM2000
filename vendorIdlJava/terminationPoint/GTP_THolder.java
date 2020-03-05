package terminationPoint;

/**
 *	Generated from IDL definition of struct "GTP_T"
 *	@author JacORB IDL compiler 
 */

public final class GTP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public terminationPoint.GTP_T value;

	public GTP_THolder ()
	{
	}
	public GTP_THolder (final terminationPoint.GTP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return terminationPoint.GTP_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = terminationPoint.GTP_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		terminationPoint.GTP_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
