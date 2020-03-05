package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "LayeredCCCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCCCapacity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.LayeredCCCapacity_T value;

	public LayeredCCCapacity_THolder ()
	{
	}
	public LayeredCCCapacity_THolder (final extendedManagedElementManager.LayeredCCCapacity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedManagedElementManager.LayeredCCCapacity_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedManagedElementManager.LayeredCCCapacity_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedManagedElementManager.LayeredCCCapacity_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
