package extendedMLSNMgr;


/**
 *	Generated from IDL definition of struct "TNetworkProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class TNetworkProtectionGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedMLSNMgr.TNetworkProtectionGroup_THelper.id(),"TNetworkProtectionGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", protection.ProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("protectionSchemeState", protection.ProtectionSchemeState_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("pgpNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("tpNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("sncProtectedNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("sncProtectingNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgpParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedMLSNMgr.TNetworkProtectionGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedMLSNMgr.TNetworkProtectionGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/TNetworkProtectionGroup_T:1.0";
	}
	public static extendedMLSNMgr.TNetworkProtectionGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedMLSNMgr.TNetworkProtectionGroup_T result = new extendedMLSNMgr.TNetworkProtectionGroup_T();
		result.name = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionType=in.read_string();
		result.protectionGroupType=protection.ProtectionGroupType_THelper.read(in);
		result.protectionSchemeState=protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=protection.ReversionMode_THelper.read(in);
		result.rate=in.read_short();
		result.pgpNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.tpNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.sncProtectedNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.sncProtectingNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.pgpParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedMLSNMgr.TNetworkProtectionGroup_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.protectionType);
		protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		protection.ReversionMode_THelper.write(out,s.reversionMode);
		out.write_short(s.rate);
		globaldefs.NamingAttributesList_THelper.write(out,s.pgpNameList);
		globaldefs.NamingAttributesList_THelper.write(out,s.tpNameList);
		globaldefs.NamingAttributesList_THelper.write(out,s.sncProtectedNameList);
		globaldefs.NamingAttributesList_THelper.write(out,s.sncProtectingNameList);
		globaldefs.NVSList_THelper.write(out,s.pgpParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
