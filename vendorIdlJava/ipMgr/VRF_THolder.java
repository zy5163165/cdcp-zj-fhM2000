package ipMgr;

/**
 *	Generated from IDL definition of struct "VRF_T"
 *	@author JacORB IDL compiler 
 */

public final class VRF_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ipMgr.VRF_T value;

	public VRF_THolder ()
	{
	}
	public VRF_THolder (final ipMgr.VRF_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ipMgr.VRF_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = ipMgr.VRF_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ipMgr.VRF_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
