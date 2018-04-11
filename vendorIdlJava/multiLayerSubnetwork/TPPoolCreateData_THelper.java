package multiLayerSubnetwork;


/**
 *	Generated from IDL definition of struct "TPPoolCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPPoolCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( multiLayerSubnetwork.TPPoolCreateData_THelper.id(),"TPPoolCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containingMLSN", multiLayerSubnetwork.MultiLayerSubnetwork_THelper.type(), null),new org.omg.CORBA.StructMember("containedMembers", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("descriptionOfUse", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final multiLayerSubnetwork.TPPoolCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static multiLayerSubnetwork.TPPoolCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/TPPoolCreateData_T:1.0";
	}
	public static multiLayerSubnetwork.TPPoolCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		multiLayerSubnetwork.TPPoolCreateData_T result = new multiLayerSubnetwork.TPPoolCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.containingMLSN=multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(in);
		result.containedMembers = globaldefs.NamingAttributesList_THelper.read(in);
		result.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read(in);
		result.descriptionOfUse=in.read_string();
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final multiLayerSubnetwork.TPPoolCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(out,s.containingMLSN);
		globaldefs.NamingAttributesList_THelper.write(out,s.containedMembers);
		transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		out.write_string(s.descriptionOfUse);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
