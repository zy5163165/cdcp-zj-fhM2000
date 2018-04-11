package ipMgr;


/**
 *	Generated from IDL definition of struct "VRRPProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class VRRPProtection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( ipMgr.VRRPProtection_THelper.id(),"VRRPProtection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("tpList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("vrrpParameters", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final ipMgr.VRRPProtection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static ipMgr.VRRPProtection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgr/VRRPProtection_T:1.0";
	}
	public static ipMgr.VRRPProtection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		ipMgr.VRRPProtection_T result = new ipMgr.VRRPProtection_T();
		result.name = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.rate=in.read_short();
		result.tpList = globaldefs.NamingAttributesList_THelper.read(in);
		result.vrrpParameters = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final ipMgr.VRRPProtection_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_short(s.rate);
		globaldefs.NamingAttributesList_THelper.write(out,s.tpList);
		globaldefs.NVSList_THelper.write(out,s.vrrpParameters);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
