package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "EquipmentClockIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClockIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.EquipmentClockIterator_I s)
	{
		any.insert_Object (s);
	}
	public static extendedManagedElementManager.EquipmentClockIterator_I extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/EquipmentClockIterator_I:1.0", "EquipmentClockIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/EquipmentClockIterator_I:1.0";
	}
	public static EquipmentClockIterator_I read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final extendedManagedElementManager.EquipmentClockIterator_I s)
	{
		_out.write_Object(s);
	}
	public static extendedManagedElementManager.EquipmentClockIterator_I narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (extendedManagedElementManager.EquipmentClockIterator_I)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/EquipmentClockIterator_I:1.0"))
			{
				extendedManagedElementManager._EquipmentClockIterator_IStub stub;
				stub = new extendedManagedElementManager._EquipmentClockIterator_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
