package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "EquipmentClockList_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClockList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedManagedElementManager.EquipmentClock_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedManagedElementManager.EquipmentClock_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedManagedElementManager.EquipmentClockList_THelper.id(), "EquipmentClockList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedManagedElementManager.EquipmentClock_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/EquipmentClockList_T:1.0";
	}
	public static extendedManagedElementManager.EquipmentClock_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedManagedElementManager.EquipmentClock_T[] _result;
		int _l_result41 = _in.read_long();
		_result = new extendedManagedElementManager.EquipmentClock_T[_l_result41];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedManagedElementManager.EquipmentClock_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedManagedElementManager.EquipmentClock_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedManagedElementManager.EquipmentClock_THelper.write(_out,_s[i]);
		}

	}
}
