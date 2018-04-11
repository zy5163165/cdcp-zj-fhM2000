package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "CCCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class CCCapacity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.CCCapacity_T value;

	public CCCapacity_THolder ()
	{
	}
	public CCCapacity_THolder (final extendedManagedElementManager.CCCapacity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedManagedElementManager.CCCapacity_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedManagedElementManager.CCCapacity_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedManagedElementManager.CCCapacity_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
