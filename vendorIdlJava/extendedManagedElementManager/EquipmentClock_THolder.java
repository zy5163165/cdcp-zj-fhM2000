package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "EquipmentClock_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClock_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.EquipmentClock_T value;

	public EquipmentClock_THolder ()
	{
	}
	public EquipmentClock_THolder (final extendedManagedElementManager.EquipmentClock_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedManagedElementManager.EquipmentClock_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedManagedElementManager.EquipmentClock_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedManagedElementManager.EquipmentClock_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
