package ipMgrCMCC;

/**
 *	Generated from IDL definition of struct "FRRProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class FRRProtection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ipMgrCMCC.FRRProtection_T value;

	public FRRProtection_THolder ()
	{
	}
	public FRRProtection_THolder (final ipMgrCMCC.FRRProtection_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ipMgrCMCC.FRRProtection_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = ipMgrCMCC.FRRProtection_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ipMgrCMCC.FRRProtection_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
