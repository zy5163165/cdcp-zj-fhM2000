package ipMgr;

/**
 *	Generated from IDL definition of struct "VRRPProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class VRRPProtection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ipMgr.VRRPProtection_T value;

	public VRRPProtection_THolder ()
	{
	}
	public VRRPProtection_THolder (final ipMgr.VRRPProtection_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ipMgr.VRRPProtection_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = ipMgr.VRRPProtection_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ipMgr.VRRPProtection_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
