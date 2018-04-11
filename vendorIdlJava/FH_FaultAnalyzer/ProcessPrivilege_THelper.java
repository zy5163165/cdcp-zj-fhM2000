package FH_FaultAnalyzer;
/**
 *	Generated from IDL definition of enum "ProcessPrivilege_T"
 *	@author JacORB IDL compiler 
 */

public final class ProcessPrivilege_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(FH_FaultAnalyzer.ProcessPrivilege_THelper.id(),"ProcessPrivilege_T",new String[]{"PPR_CRITICAL","PPR_MAJOR","PPR_MINOR","PPR_WARNING","PPR_CLEARED"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final FH_FaultAnalyzer.ProcessPrivilege_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static FH_FaultAnalyzer.ProcessPrivilege_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/FH_FaultAnalyzer/ProcessPrivilege_T:1.0";
	}
	public static ProcessPrivilege_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProcessPrivilege_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProcessPrivilege_T s)
	{
		out.write_long(s.value());
	}
}
