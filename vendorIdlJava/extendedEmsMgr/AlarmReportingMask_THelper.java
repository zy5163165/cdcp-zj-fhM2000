package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "AlarmReportingMask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmReportingMask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.AlarmReportingMask_THelper.id(),"AlarmReportingMask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("entityName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.AlarmReportingMask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.AlarmReportingMask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/AlarmReportingMask_T:1.0";
	}
	public static extendedEmsMgr.AlarmReportingMask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.AlarmReportingMask_T result = new extendedEmsMgr.AlarmReportingMask_T();
		result.entityName = globaldefs.NamingAttributes_THelper.read(in);
		result.owner=in.read_string();
		result.layerRate=in.read_short();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.AlarmReportingMask_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.entityName);
		out.write_string(s.owner);
		out.write_short(s.layerRate);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
