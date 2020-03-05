package performance;


/**
 *	Generated from IDL definition of struct "TCAParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameter_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( performance.TCAParameter_THelper.id(),"TCAParameter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", performance.PMParameterName_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("pmLocation", performance.PMLocation_THelper.type(), null),new org.omg.CORBA.StructMember("thresholdType", performance.PMThresholdType_THelper.type(), null),new org.omg.CORBA.StructMember("triggerFlag", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.TCAParameter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.TCAParameter_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/TCAParameter_T:1.0";
	}
	public static performance.TCAParameter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.TCAParameter_T result = new performance.TCAParameter_T();
		result.pmParameterName = performance.PMParameterName_THelper.read(in);
		result.granularity = performance.Granularity_THelper.read(in);
		result.pmLocation = performance.PMLocation_THelper.read(in);
		result.thresholdType=performance.PMThresholdType_THelper.read(in);
		result.triggerFlag=in.read_boolean();
		result.value=in.read_float();
		result.unit=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.TCAParameter_T s)
	{
		performance.PMParameterName_THelper.write(out,s.pmParameterName);
		performance.Granularity_THelper.write(out,s.granularity);
		performance.PMLocation_THelper.write(out,s.pmLocation);
		performance.PMThresholdType_THelper.write(out,s.thresholdType);
		out.write_boolean(s.triggerFlag);
		out.write_float(s.value);
		out.write_string(s.unit);
	}
}
