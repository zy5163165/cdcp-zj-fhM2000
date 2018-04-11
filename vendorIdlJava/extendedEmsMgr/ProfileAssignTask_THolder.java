package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ProfileAssignTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ProfileAssignTask_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.ProfileAssignTask_T value;

	public ProfileAssignTask_THolder ()
	{
	}
	public ProfileAssignTask_THolder (final extendedEmsMgr.ProfileAssignTask_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.ProfileAssignTask_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.ProfileAssignTask_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.ProfileAssignTask_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
