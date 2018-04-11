package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "EquipmentClockIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClockIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EquipmentClockIterator_I value;
	public EquipmentClockIterator_IHolder ()
	{
	}
	public EquipmentClockIterator_IHolder (final EquipmentClockIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EquipmentClockIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentClockIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EquipmentClockIterator_IHelper.write (_out,value);
	}
}
