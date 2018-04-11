package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "CCCapacityList_T"
 *	@author JacORB IDL compiler 
 */

public final class CCCapacityList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedManagedElementManager.CCCapacity_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedManagedElementManager.CCCapacity_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedManagedElementManager.CCCapacityList_THelper.id(), "CCCapacityList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedManagedElementManager.CCCapacity_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/CCCapacityList_T:1.0";
	}
	public static extendedManagedElementManager.CCCapacity_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedManagedElementManager.CCCapacity_T[] _result;
		int _l_result47 = _in.read_long();
		_result = new extendedManagedElementManager.CCCapacity_T[_l_result47];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedManagedElementManager.CCCapacity_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedManagedElementManager.CCCapacity_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedManagedElementManager.CCCapacity_THelper.write(_out,_s[i]);
		}

	}
}
