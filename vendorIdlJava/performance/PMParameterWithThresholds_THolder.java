package performance;

/**
 *	Generated from IDL definition of struct "PMParameterWithThresholds_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterWithThresholds_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMParameterWithThresholds_T value;

	public PMParameterWithThresholds_THolder ()
	{
	}
	public PMParameterWithThresholds_THolder (final performance.PMParameterWithThresholds_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.PMParameterWithThresholds_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.PMParameterWithThresholds_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.PMParameterWithThresholds_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
