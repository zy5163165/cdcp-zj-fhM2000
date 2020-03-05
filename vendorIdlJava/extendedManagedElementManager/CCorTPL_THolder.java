package extendedManagedElementManager;
/**
 *	Generated from IDL definition of union "CCorTPL_T"
 *	@author JacORB IDL compiler 
 */

public final class CCorTPL_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public CCorTPL_T value;

	public CCorTPL_THolder ()
	{
	}
	public CCorTPL_THolder (final CCorTPL_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CCorTPL_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CCorTPL_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CCorTPL_THelper.write (out, value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
