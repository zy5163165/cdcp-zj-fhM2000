package ipMgrCMCC;

/**
 *	Generated from IDL definition of struct "StaticRouting_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRouting_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ipMgrCMCC.StaticRouting_T value;

	public StaticRouting_THolder ()
	{
	}
	public StaticRouting_THolder (final ipMgrCMCC.StaticRouting_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ipMgrCMCC.StaticRouting_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = ipMgrCMCC.StaticRouting_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ipMgrCMCC.StaticRouting_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
