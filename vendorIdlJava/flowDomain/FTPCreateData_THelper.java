package flowDomain;


/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( flowDomain.FTPCreateData_THelper.id(),"FTPCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("equipmentName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ingressTransmissionDescriptorName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("egressTransmissionDescriptorName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("tpMappingMode", terminationPoint.TerminationMode_THelper.type(), null),new org.omg.CORBA.StructMember("direction", terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.FTPCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.FTPCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/FTPCreateData_T:1.0";
	}
	public static flowDomain.FTPCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		flowDomain.FTPCreateData_T result = new flowDomain.FTPCreateData_T();
		result.equipmentName = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.ingressTransmissionDescriptorName = globaldefs.NamingAttributes_THelper.read(in);
		result.egressTransmissionDescriptorName = globaldefs.NamingAttributes_THelper.read(in);
		result.tpMappingMode=terminationPoint.TerminationMode_THelper.read(in);
		result.direction=terminationPoint.Directionality_THelper.read(in);
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final flowDomain.FTPCreateData_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.equipmentName);
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		globaldefs.NamingAttributes_THelper.write(out,s.ingressTransmissionDescriptorName);
		globaldefs.NamingAttributes_THelper.write(out,s.egressTransmissionDescriptorName);
		terminationPoint.TerminationMode_THelper.write(out,s.tpMappingMode);
		terminationPoint.Directionality_THelper.write(out,s.direction);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
