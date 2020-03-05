package trafficDescriptor;

/**
 *	Generated from IDL definition of alias "TrafficParameterList_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficParameterList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[] value;

	public TrafficParameterList_THolder ()
	{
	}
	public TrafficParameterList_THolder (final globaldefs.NameAndStringValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficParameterList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficParameterList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrafficParameterList_THelper.write (out,value);
	}
}
