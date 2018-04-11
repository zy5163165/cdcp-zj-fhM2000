package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "BoardInternalSignalFlowList_T"
 *	@author JacORB IDL compiler 
 */

public final class BoardInternalSignalFlowList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedManagedElementManager.BoardInternalSignalFlow_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedManagedElementManager.BoardInternalSignalFlow_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedManagedElementManager.BoardInternalSignalFlowList_THelper.id(), "BoardInternalSignalFlowList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedManagedElementManager.BoardInternalSignalFlow_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/BoardInternalSignalFlowList_T:1.0";
	}
	public static extendedManagedElementManager.BoardInternalSignalFlow_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedManagedElementManager.BoardInternalSignalFlow_T[] _result;
		int _l_result44 = _in.read_long();
		_result = new extendedManagedElementManager.BoardInternalSignalFlow_T[_l_result44];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=extendedManagedElementManager.BoardInternalSignalFlow_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedManagedElementManager.BoardInternalSignalFlow_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			extendedManagedElementManager.BoardInternalSignalFlow_THelper.write(_out,_s[i]);
		}

	}
}
