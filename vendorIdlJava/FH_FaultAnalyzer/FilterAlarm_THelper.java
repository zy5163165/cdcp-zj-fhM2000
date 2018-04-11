package FH_FaultAnalyzer;


/**
 *	Generated from IDL definition of struct "FilterAlarm_T"
 *	@author JacORB IDL compiler 
 */

public final class FilterAlarm_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( FH_FaultAnalyzer.FilterAlarm_THelper.id(),"FilterAlarm_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("emsAlarm", org.omg.CosNotification.StructuredEventHelper.type(), null),new org.omg.CORBA.StructMember("businessNetWorkID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("childAlarmList", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_recursive_tc("IDL:mtnm.tmforum.org/FH_FaultAnalyzer/FilterAlarm_T:1.0")), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final FH_FaultAnalyzer.FilterAlarm_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static FH_FaultAnalyzer.FilterAlarm_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/FH_FaultAnalyzer/FilterAlarm_T:1.0";
	}
	public static FH_FaultAnalyzer.FilterAlarm_T read (final org.omg.CORBA.portable.InputStream in)
	{
		FH_FaultAnalyzer.FilterAlarm_T result = new FH_FaultAnalyzer.FilterAlarm_T();
		result.emsAlarm=org.omg.CosNotification.StructuredEventHelper.read(in);
		result.businessNetWorkID=in.read_string();
		int _lresult_childAlarmList64 = in.read_long();
		result.childAlarmList = new FH_FaultAnalyzer.FilterAlarm_T[_lresult_childAlarmList64];
		for(int i=0;i<result.childAlarmList.length;i++)
		{
			result.childAlarmList[i]=FH_FaultAnalyzer.FilterAlarm_THelper.read(in);
		}

		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final FH_FaultAnalyzer.FilterAlarm_T s)
	{
		org.omg.CosNotification.StructuredEventHelper.write(out,s.emsAlarm);
		out.write_string(s.businessNetWorkID);
		
		out.write_long(s.childAlarmList.length);
		for( int i=0; i<s.childAlarmList.length;i++)
		{
			FH_FaultAnalyzer.FilterAlarm_THelper.write(out,s.childAlarmList[i]);
		}

	}
}
