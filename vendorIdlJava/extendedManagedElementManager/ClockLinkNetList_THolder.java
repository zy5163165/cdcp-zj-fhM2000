package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "ClockLinkNetList_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockLinkNetList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.ClockLinkNet_T[] value;

	public ClockLinkNetList_THolder ()
	{
	}
	public ClockLinkNetList_THolder (final extendedManagedElementManager.ClockLinkNet_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ClockLinkNetList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClockLinkNetList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ClockLinkNetList_THelper.write (out,value);
	}
}
