package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "AlarmFilterTask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmFilterTask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.AlarmFilterTask_THelper.id(),"AlarmFilterTask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("alarmFilterTaskName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("entityName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nativeProbableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ProbableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("perceivedSeverity", notifications.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("emsBeginTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("emsEndTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.AlarmFilterTask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.AlarmFilterTask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/AlarmFilterTask_T:1.0";
	}
	public static extendedEmsMgr.AlarmFilterTask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.AlarmFilterTask_T result = new extendedEmsMgr.AlarmFilterTask_T();
		result.alarmFilterTaskName = globaldefs.NamingAttributes_THelper.read(in);
		result.entityName = globaldefs.NamingAttributes_THelper.read(in);
		result.nativeProbableCause=in.read_string();
		result.ProbableCause=in.read_string();
		result.perceivedSeverity=notifications.PerceivedSeverity_THelper.read(in);
		result.emsBeginTime = globaldefs.Time_THelper.read(in);
		result.emsEndTime = globaldefs.Time_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.AlarmFilterTask_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.alarmFilterTaskName);
		globaldefs.NamingAttributes_THelper.write(out,s.entityName);
		out.write_string(s.nativeProbableCause);
		out.write_string(s.ProbableCause);
		notifications.PerceivedSeverity_THelper.write(out,s.perceivedSeverity);
		globaldefs.Time_THelper.write(out,s.emsBeginTime);
		globaldefs.Time_THelper.write(out,s.emsEndTime);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
