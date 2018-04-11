package performance;

/**
 *	Generated from IDL definition of alias "TCAParameterList_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.TCAParameter_T[] value;

	public TCAParameterList_THolder ()
	{
	}
	public TCAParameterList_THolder (final performance.TCAParameter_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCAParameterList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCAParameterList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCAParameterList_THelper.write (out,value);
	}
}
