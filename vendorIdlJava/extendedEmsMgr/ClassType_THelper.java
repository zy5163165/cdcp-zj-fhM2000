package extendedEmsMgr;
/**
 *	Generated from IDL definition of enum "ClassType_T"
 *	@author JacORB IDL compiler 
 */

public final class ClassType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(extendedEmsMgr.ClassType_THelper.id(),"ClassType_T",new String[]{"EMS","ME","EQUIPMENT","PTP","CTP","TOPOLOGICALLINK","SUBNETWORK","SNC","CROSSCONNECT","FDFR","MFDFR","PROTECTIONGROUP","RACK","SHELF","SLOT","OTHER"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.ClassType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.ClassType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/ClassType_T:1.0";
	}
	public static ClassType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ClassType_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ClassType_T s)
	{
		out.write_long(s.value());
	}
}
