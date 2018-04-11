package performance;

/**
 *	Generated from IDL definition of struct "TCAParameterProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.TCAParameterProfile_T value;

	public TCAParameterProfile_THolder ()
	{
	}
	public TCAParameterProfile_THolder (final performance.TCAParameterProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.TCAParameterProfile_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.TCAParameterProfile_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.TCAParameterProfile_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
