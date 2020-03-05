package FH_FaultAnalyzer;
/**
 *	Generated from IDL definition of enum "FaultGroupType_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroupType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(FH_FaultAnalyzer.FaultGroupType_THelper.id(),"FaultGroupType_T",new String[]{"NORMAL_TYPE","NO_OBJECT_FAULT","INVALIDE_CROSSCONNECTION","NO_CROSSCONNECTION","NOT_USED_CROSSCONNECTION","ENV_PROBABLECAUSE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final FH_FaultAnalyzer.FaultGroupType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static FH_FaultAnalyzer.FaultGroupType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/FH_FaultAnalyzer/FaultGroupType_T:1.0";
	}
	public static FaultGroupType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return FaultGroupType_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final FaultGroupType_T s)
	{
		out.write_long(s.value());
	}
}
