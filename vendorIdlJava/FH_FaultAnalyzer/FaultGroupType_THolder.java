package FH_FaultAnalyzer;
/**
 *	Generated from IDL definition of enum "FaultGroupType_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroupType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FaultGroupType_T value;

	public FaultGroupType_THolder ()
	{
	}
	public FaultGroupType_THolder (final FaultGroupType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FaultGroupType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FaultGroupType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FaultGroupType_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
