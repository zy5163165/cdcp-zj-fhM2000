package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "CCCapacityList_T"
 *	@author JacORB IDL compiler 
 */

public final class CCCapacityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.CCCapacity_T[] value;

	public CCCapacityList_THolder ()
	{
	}
	public CCCapacityList_THolder (final extendedManagedElementManager.CCCapacity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CCCapacityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CCCapacityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CCCapacityList_THelper.write (out,value);
	}
}
