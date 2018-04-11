package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "LogTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class LogTransmissionTask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.LogTransmissionTask_THelper.id(),"LogTransmissionTask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("eventTypeName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("objectTypeList", extendedEmsMgr.ObjectTypeList_THelper.type(), null),new org.omg.CORBA.StructMember("beCompressed", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("beginTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("endTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.LogTransmissionTask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.LogTransmissionTask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/LogTransmissionTask_T:1.0";
	}
	public static extendedEmsMgr.LogTransmissionTask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.LogTransmissionTask_T result = new extendedEmsMgr.LogTransmissionTask_T();
		result.eventTypeName=in.read_string();
		result.objectTypeList = extendedEmsMgr.ObjectTypeList_THelper.read(in);
		result.beCompressed=in.read_boolean();
		result.beginTime = globaldefs.Time_THelper.read(in);
		result.endTime = globaldefs.Time_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.LogTransmissionTask_T s)
	{
		out.write_string(s.eventTypeName);
		extendedEmsMgr.ObjectTypeList_THelper.write(out,s.objectTypeList);
		out.write_boolean(s.beCompressed);
		globaldefs.Time_THelper.write(out,s.beginTime);
		globaldefs.Time_THelper.write(out,s.endTime);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
