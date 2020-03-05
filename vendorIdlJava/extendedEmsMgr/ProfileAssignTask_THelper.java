package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "ProfileAssignTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ProfileAssignTask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.ProfileAssignTask_THelper.id(),"ProfileAssignTask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("profileName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("entityNames", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("layer", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("dataType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.ProfileAssignTask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.ProfileAssignTask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/ProfileAssignTask_T:1.0";
	}
	public static extendedEmsMgr.ProfileAssignTask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.ProfileAssignTask_T result = new extendedEmsMgr.ProfileAssignTask_T();
		result.profileName = globaldefs.NamingAttributes_THelper.read(in);
		result.entityNames = globaldefs.NamingAttributesList_THelper.read(in);
		result.layer=in.read_short();
		result.dataType=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.ProfileAssignTask_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.profileName);
		globaldefs.NamingAttributesList_THelper.write(out,s.entityNames);
		out.write_short(s.layer);
		out.write_string(s.dataType);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
