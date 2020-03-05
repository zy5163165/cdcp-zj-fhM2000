package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "ClockLinkNet_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockLinkNet_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.ClockLinkNet_T value;

	public ClockLinkNet_THolder ()
	{
	}
	public ClockLinkNet_THolder (final extendedManagedElementManager.ClockLinkNet_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedManagedElementManager.ClockLinkNet_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedManagedElementManager.ClockLinkNet_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedManagedElementManager.ClockLinkNet_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
