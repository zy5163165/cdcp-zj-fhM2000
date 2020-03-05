package extendedFlowDomainMgr;


/**
 *	Generated from IDL definition of struct "ExMatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class ExMatrixFlowDomainFragment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedFlowDomainMgr.ExMatrixFlowDomainFragment_THelper.id(),"ExMatrixFlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("exMFdFrName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("mfdfrType", flowDomainFragment.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedFlowDomainMgr/ExMatrixFlowDomainFragment_T:1.0";
	}
	public static extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T result = new extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T();
		result.exMFdFrName = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = subnetworkConnection.TPDataList_THelper.read(in);
		result.flexible=in.read_boolean();
		result.active=in.read_boolean();
		result.mfdfrType = flowDomainFragment.FDFrType_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.exMFdFrName);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		out.write_boolean(s.flexible);
		out.write_boolean(s.active);
		flowDomainFragment.FDFrType_THelper.write(out,s.mfdfrType);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
