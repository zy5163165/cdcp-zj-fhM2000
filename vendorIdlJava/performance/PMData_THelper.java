package performance;


/**
 *	Generated from IDL definition of struct "PMData_T"
 *	@author JacORB IDL compiler 
 */

public final class PMData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( performance.PMData_THelper.id(),"PMData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("retrievalTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("pmMeasurementList", performance.PMMeasurementList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.PMData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.PMData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMData_T:1.0";
	}
	public static performance.PMData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.PMData_T result = new performance.PMData_T();
		result.tpName = globaldefs.NamingAttributes_THelper.read(in);
		result.layerRate=in.read_short();
		result.granularity = performance.Granularity_THelper.read(in);
		result.retrievalTime = globaldefs.Time_THelper.read(in);
		result.pmMeasurementList = performance.PMMeasurementList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.PMData_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.tpName);
		out.write_short(s.layerRate);
		performance.Granularity_THelper.write(out,s.granularity);
		globaldefs.Time_THelper.write(out,s.retrievalTime);
		performance.PMMeasurementList_THelper.write(out,s.pmMeasurementList);
	}
}
