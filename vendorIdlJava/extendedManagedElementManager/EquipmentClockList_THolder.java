package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "EquipmentClockList_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClockList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.EquipmentClock_T[] value;

	public EquipmentClockList_THolder ()
	{
	}
	public EquipmentClockList_THolder (final extendedManagedElementManager.EquipmentClock_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EquipmentClockList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentClockList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EquipmentClockList_THelper.write (out,value);
	}
}
