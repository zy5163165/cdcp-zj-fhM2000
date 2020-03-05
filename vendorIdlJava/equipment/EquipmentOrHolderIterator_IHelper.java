package equipment;

/**
 *	Generated from IDL definition of interface "EquipmentOrHolderIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentOrHolderIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final equipment.EquipmentOrHolderIterator_I s)
	{
		any.insert_Object (s);
	}
	public static equipment.EquipmentOrHolderIterator_I extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:mtnm.tmforum.org/equipment/EquipmentOrHolderIterator_I:1.0", "EquipmentOrHolderIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/EquipmentOrHolderIterator_I:1.0";
	}
	public static EquipmentOrHolderIterator_I read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final equipment.EquipmentOrHolderIterator_I s)
	{
		_out.write_Object(s);
	}
	public static equipment.EquipmentOrHolderIterator_I narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (equipment.EquipmentOrHolderIterator_I)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:mtnm.tmforum.org/equipment/EquipmentOrHolderIterator_I:1.0"))
			{
				equipment._EquipmentOrHolderIterator_IStub stub;
				stub = new equipment._EquipmentOrHolderIterator_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
