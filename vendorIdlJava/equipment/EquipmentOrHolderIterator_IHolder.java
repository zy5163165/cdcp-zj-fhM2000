package equipment;

/**
 *	Generated from IDL definition of interface "EquipmentOrHolderIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentOrHolderIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EquipmentOrHolderIterator_I value;
	public EquipmentOrHolderIterator_IHolder ()
	{
	}
	public EquipmentOrHolderIterator_IHolder (final EquipmentOrHolderIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EquipmentOrHolderIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentOrHolderIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EquipmentOrHolderIterator_IHelper.write (_out,value);
	}
}
