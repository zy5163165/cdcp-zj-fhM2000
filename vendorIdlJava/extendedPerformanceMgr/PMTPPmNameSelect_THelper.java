package extendedPerformanceMgr;


/**
 *	Generated from IDL definition of struct "PMTPPmNameSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPPmNameSelect_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedPerformanceMgr.PMTPPmNameSelect_THelper.id(),"PMTPPmNameSelect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmTpSelect", performance.PMTPSelect_THelper.type(), null),new org.omg.CORBA.StructMember("pmParamList", performance.PMParameterNameList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedPerformanceMgr.PMTPPmNameSelect_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedPerformanceMgr.PMTPPmNameSelect_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedPerformanceMgr/PMTPPmNameSelect_T:1.0";
	}
	public static extendedPerformanceMgr.PMTPPmNameSelect_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedPerformanceMgr.PMTPPmNameSelect_T result = new extendedPerformanceMgr.PMTPPmNameSelect_T();
		result.pmTpSelect=performance.PMTPSelect_THelper.read(in);
		result.pmParamList = performance.PMParameterNameList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedPerformanceMgr.PMTPPmNameSelect_T s)
	{
		performance.PMTPSelect_THelper.write(out,s.pmTpSelect);
		performance.PMParameterNameList_THelper.write(out,s.pmParamList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
