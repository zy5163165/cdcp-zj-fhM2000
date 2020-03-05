package ipMgr;

/**
 *	Generated from IDL definition of struct "Bridge_T"
 *	@author JacORB IDL compiler 
 */

public final class Bridge_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ipMgr.Bridge_T value;

	public Bridge_THolder ()
	{
	}
	public Bridge_THolder (final ipMgr.Bridge_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ipMgr.Bridge_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = ipMgr.Bridge_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ipMgr.Bridge_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
