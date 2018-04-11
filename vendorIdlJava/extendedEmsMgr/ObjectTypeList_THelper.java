package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "ObjectTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectTypeList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, notifications.ObjectType_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static notifications.ObjectType_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedEmsMgr.ObjectTypeList_THelper.id(), "ObjectTypeList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, notifications.ObjectType_THelper.type() ) );
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/ObjectTypeList_T:1.0";
	}
	public static notifications.ObjectType_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		notifications.ObjectType_T[] _result;
		int _l_result50 = _in.read_long();
		_result = new notifications.ObjectType_T[_l_result50];
		for(int i=0;i<_result.length;i++)
		{
			_result[i]=notifications.ObjectType_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, notifications.ObjectType_T[] _s)
	{
		
		_out.write_long(_s.length);
		for( int i=0; i<_s.length;i++)
		{
			notifications.ObjectType_THelper.write(_out,_s[i]);
		}

	}
}
