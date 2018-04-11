package extendedMLSNMgr;

/**
 *	Generated from IDL definition of struct "TNetworkProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class TNetworkProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedMLSNMgr.TNetworkProtectionGroup_T value;

	public TNetworkProtectionGroup_THolder ()
	{
	}
	public TNetworkProtectionGroup_THolder (final extendedMLSNMgr.TNetworkProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedMLSNMgr.TNetworkProtectionGroup_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedMLSNMgr.TNetworkProtectionGroup_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedMLSNMgr.TNetworkProtectionGroup_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
