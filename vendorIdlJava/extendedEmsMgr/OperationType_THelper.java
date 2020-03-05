package extendedEmsMgr;
/**
 *	Generated from IDL definition of enum "OperationType_T"
 *	@author JacORB IDL compiler 
 */

public final class OperationType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(extendedEmsMgr.OperationType_THelper.id(),"OperationType_T",new String[]{"OPERATE_SETUSERLABEL","OPERATE_SETOWNER","OPERATE_SETNATIVEEMSNAME","NULL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.OperationType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.OperationType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/OperationType_T:1.0";
	}
	public static OperationType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return OperationType_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final OperationType_T s)
	{
		out.write_long(s.value());
	}
}
