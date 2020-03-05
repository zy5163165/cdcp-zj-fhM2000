package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "EXMegEntityData_T"
 *	@author JacORB IDL compiler 
 */

public final class EXMegEntityData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.EXMegEntityData_THelper.id(),"EXMegEntityData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("mepTPList", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("mipTPList", subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("associatePathNames", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.EXMegEntityData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.EXMegEntityData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/EXMegEntityData_T:1.0";
	}
	public static extendedEmsMgr.EXMegEntityData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.EXMegEntityData_T result = new extendedEmsMgr.EXMegEntityData_T();
		result.name = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.transmissionParams=transmissionParameters.LayeredParameters_THelper.read(in);
		result.mepTPList = subnetworkConnection.TPDataList_THelper.read(in);
		result.mipTPList = subnetworkConnection.TPDataList_THelper.read(in);
		result.associatePathNames = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.EXMegEntityData_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		subnetworkConnection.TPDataList_THelper.write(out,s.mepTPList);
		subnetworkConnection.TPDataList_THelper.write(out,s.mipTPList);
		globaldefs.NamingAttributesList_THelper.write(out,s.associatePathNames);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
