package extendedPerformanceMgr;


/**
 *	Generated from IDL definition of struct "EXPMThresholdValue_T"
 *	@author JacORB IDL compiler 
 */

public final class EXPMThresholdValue_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedPerformanceMgr.EXPMThresholdValue_THelper.id(),"EXPMThresholdValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", performance.PMParameterName_THelper.type(), null),new org.omg.CORBA.StructMember("pmLocation", performance.PMLocation_THelper.type(), null),new org.omg.CORBA.StructMember("thresholdType", performance.PMThresholdType_THelper.type(), null),new org.omg.CORBA.StructMember("triggerFlag", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedPerformanceMgr.EXPMThresholdValue_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedPerformanceMgr.EXPMThresholdValue_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedPerformanceMgr/EXPMThresholdValue_T:1.0";
	}
	public static extendedPerformanceMgr.EXPMThresholdValue_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedPerformanceMgr.EXPMThresholdValue_T result = new extendedPerformanceMgr.EXPMThresholdValue_T();
		result.pmParameterName = performance.PMParameterName_THelper.read(in);
		result.pmLocation = performance.PMLocation_THelper.read(in);
		result.thresholdType=performance.PMThresholdType_THelper.read(in);
		result.triggerFlag=in.read_boolean();
		result.value=in.read_float();
		result.unit=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedPerformanceMgr.EXPMThresholdValue_T s)
	{
		performance.PMParameterName_THelper.write(out,s.pmParameterName);
		performance.PMLocation_THelper.write(out,s.pmLocation);
		performance.PMThresholdType_THelper.write(out,s.thresholdType);
		out.write_boolean(s.triggerFlag);
		out.write_float(s.value);
		out.write_string(s.unit);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
