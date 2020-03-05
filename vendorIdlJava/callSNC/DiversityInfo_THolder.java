package callSNC;

/**
 *	Generated from IDL definition of struct "DiversityInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class DiversityInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.DiversityInfo_T value;

	public DiversityInfo_THolder ()
	{
	}
	public DiversityInfo_THolder (final callSNC.DiversityInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.DiversityInfo_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.DiversityInfo_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.DiversityInfo_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
