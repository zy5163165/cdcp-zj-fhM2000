package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "BusinessPathList_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessPathList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.BusinessPath_T[] value;

	public BusinessPathList_THolder ()
	{
	}
	public BusinessPathList_THolder (final extendedManagedElementManager.BusinessPath_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BusinessPathList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BusinessPathList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BusinessPathList_THelper.write (out,value);
	}
}
