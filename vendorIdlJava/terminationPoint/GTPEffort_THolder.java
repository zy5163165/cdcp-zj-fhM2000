package terminationPoint;
/**
 *	Generated from IDL definition of enum "GTPEffort_T"
 *	@author JacORB IDL compiler 
 */

public final class GTPEffort_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public GTPEffort_T value;

	public GTPEffort_THolder ()
	{
	}
	public GTPEffort_THolder (final GTPEffort_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GTPEffort_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GTPEffort_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GTPEffort_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
