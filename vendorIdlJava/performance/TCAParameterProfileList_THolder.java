package performance;

/**
 *	Generated from IDL definition of alias "TCAParameterProfileList_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterProfileList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.TCAParameterProfile_T[] value;

	public TCAParameterProfileList_THolder ()
	{
	}
	public TCAParameterProfileList_THolder (final performance.TCAParameterProfile_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCAParameterProfileList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCAParameterProfileList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCAParameterProfileList_THelper.write (out,value);
	}
}
