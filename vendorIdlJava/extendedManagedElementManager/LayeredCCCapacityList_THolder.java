package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "LayeredCCCapacityList_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCCCapacityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.LayeredCCCapacity_T[] value;

	public LayeredCCCapacityList_THolder ()
	{
	}
	public LayeredCCCapacityList_THolder (final extendedManagedElementManager.LayeredCCCapacity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LayeredCCCapacityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LayeredCCCapacityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LayeredCCCapacityList_THelper.write (out,value);
	}
}
