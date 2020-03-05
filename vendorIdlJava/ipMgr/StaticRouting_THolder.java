package ipMgr;

/**
 *	Generated from IDL definition of struct "StaticRouting_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRouting_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ipMgr.StaticRouting_T value;

	public StaticRouting_THolder ()
	{
	}
	public StaticRouting_THolder (final ipMgr.StaticRouting_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ipMgr.StaticRouting_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = ipMgr.StaticRouting_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ipMgr.StaticRouting_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
