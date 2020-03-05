package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "BusinessPath_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessPath_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.BusinessPath_T value;

	public BusinessPath_THolder ()
	{
	}
	public BusinessPath_THolder (final extendedManagedElementManager.BusinessPath_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedManagedElementManager.BusinessPath_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedManagedElementManager.BusinessPath_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedManagedElementManager.BusinessPath_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
