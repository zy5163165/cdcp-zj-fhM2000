package FH_FaultAnalyzer;


/**
 *	Generated from IDL definition of struct "FaultGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( FH_FaultAnalyzer.FaultGroup_THelper.id(),"FaultGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("filterAlarms", FH_FaultAnalyzer.FilterAlarmList_THelper.type(), null),new org.omg.CORBA.StructMember("suggestedPPR", FH_FaultAnalyzer.ProcessPrivilegeList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final FH_FaultAnalyzer.FaultGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static FH_FaultAnalyzer.FaultGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/FH_FaultAnalyzer/FaultGroup_T:1.0";
	}
	public static FH_FaultAnalyzer.FaultGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		FH_FaultAnalyzer.FaultGroup_T result = new FH_FaultAnalyzer.FaultGroup_T();
		result.filterAlarms = FH_FaultAnalyzer.FilterAlarmList_THelper.read(in);
		result.suggestedPPR = FH_FaultAnalyzer.ProcessPrivilegeList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final FH_FaultAnalyzer.FaultGroup_T s)
	{
		FH_FaultAnalyzer.FilterAlarmList_THelper.write(out,s.filterAlarms);
		FH_FaultAnalyzer.ProcessPrivilegeList_THelper.write(out,s.suggestedPPR);
	}
}
