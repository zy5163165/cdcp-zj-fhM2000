package extendedPerformanceMgr;


/**
 *	Generated from IDL definition of struct "EXTCAParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class EXTCAParameters_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedPerformanceMgr.EXTCAParameters_THelper.id(),"EXTCAParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("extcaTypeValues", extendedPerformanceMgr.EXPMThresholdValueList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedPerformanceMgr.EXTCAParameters_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedPerformanceMgr.EXTCAParameters_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedPerformanceMgr/EXTCAParameters_T:1.0";
	}
	public static extendedPerformanceMgr.EXTCAParameters_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedPerformanceMgr.EXTCAParameters_T result = new extendedPerformanceMgr.EXTCAParameters_T();
		result.layerRate=in.read_short();
		result.granularity = performance.Granularity_THelper.read(in);
		result.extcaTypeValues = extendedPerformanceMgr.EXPMThresholdValueList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedPerformanceMgr.EXTCAParameters_T s)
	{
		out.write_short(s.layerRate);
		performance.Granularity_THelper.write(out,s.granularity);
		extendedPerformanceMgr.EXPMThresholdValueList_THelper.write(out,s.extcaTypeValues);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
