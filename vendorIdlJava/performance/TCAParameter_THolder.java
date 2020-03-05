package performance;

/**
 *	Generated from IDL definition of struct "TCAParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameter_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.TCAParameter_T value;

	public TCAParameter_THolder ()
	{
	}
	public TCAParameter_THolder (final performance.TCAParameter_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.TCAParameter_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.TCAParameter_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.TCAParameter_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
