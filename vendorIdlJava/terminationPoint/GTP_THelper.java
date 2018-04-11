package terminationPoint;


/**
 *	Generated from IDL definition of struct "GTP_T"
 *	@author JacORB IDL compiler 
 */

public final class GTP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( terminationPoint.GTP_THelper.id(),"GTP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("alarmReportingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("listOfTPs", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("gtpConnectionState", terminationPoint.TPConnectionState_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.GTP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.GTP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/GTP_T:1.0";
	}
	public static terminationPoint.GTP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		terminationPoint.GTP_T result = new terminationPoint.GTP_T();
		result.name = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.alarmReportingIndicator=in.read_boolean();
		result.listOfTPs = globaldefs.NamingAttributesList_THelper.read(in);
		result.gtpConnectionState=terminationPoint.TPConnectionState_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final terminationPoint.GTP_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_boolean(s.alarmReportingIndicator);
		globaldefs.NamingAttributesList_THelper.write(out,s.listOfTPs);
		terminationPoint.TPConnectionState_THelper.write(out,s.gtpConnectionState);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
