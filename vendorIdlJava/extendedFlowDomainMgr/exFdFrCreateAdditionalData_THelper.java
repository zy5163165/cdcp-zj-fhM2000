package extendedFlowDomainMgr;


/**
 *	Generated from IDL definition of struct "exFdFrCreateAdditionalData_T"
 *	@author JacORB IDL compiler 
 */

public final class exFdFrCreateAdditionalData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.id(),"exFdFrCreateAdditionalData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("rerouteAllowed", subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("inclusionResource", subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("exclusionResource", subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("ccInclusions", extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.type(), null),new org.omg.CORBA.StructMember("backupCCInclusions", extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedFlowDomainMgr.exFdFrCreateAdditionalData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedFlowDomainMgr.exFdFrCreateAdditionalData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedFlowDomainMgr/exFdFrCreateAdditionalData_T:1.0";
	}
	public static extendedFlowDomainMgr.exFdFrCreateAdditionalData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedFlowDomainMgr.exFdFrCreateAdditionalData_T result = new extendedFlowDomainMgr.exFdFrCreateAdditionalData_T();
		result.fullRoute=in.read_boolean();
		result.forceUniqueness=in.read_boolean();
		result.rerouteAllowed=subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=subnetworkConnection.NetworkRouted_THelper.read(in);
		result.layerRate=in.read_short();
		result.inclusionResource = subnetworkConnection.ResourceList_THelper.read(in);
		result.exclusionResource = subnetworkConnection.ResourceList_THelper.read(in);
		result.ccInclusions = extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(in);
		result.backupCCInclusions = extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedFlowDomainMgr.exFdFrCreateAdditionalData_T s)
	{
		out.write_boolean(s.fullRoute);
		out.write_boolean(s.forceUniqueness);
		subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		out.write_short(s.layerRate);
		subnetworkConnection.ResourceList_THelper.write(out,s.inclusionResource);
		subnetworkConnection.ResourceList_THelper.write(out,s.exclusionResource);
		extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(out,s.ccInclusions);
		extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(out,s.backupCCInclusions);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
