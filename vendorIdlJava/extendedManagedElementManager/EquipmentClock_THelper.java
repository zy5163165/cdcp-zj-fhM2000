package extendedManagedElementManager;


/**
 *	Generated from IDL definition of struct "EquipmentClock_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClock_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedManagedElementManager.EquipmentClock_THelper.id(),"EquipmentClock_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("clockStatus", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("synchroSrcClass", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("synchroSrc", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("workMode", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("clockSourceList", extendedManagedElementManager.StringList_THelper.type(), null),new org.omg.CORBA.StructMember("synchroProtocol", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.EquipmentClock_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedManagedElementManager.EquipmentClock_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/EquipmentClock_T:1.0";
	}
	public static extendedManagedElementManager.EquipmentClock_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedManagedElementManager.EquipmentClock_T result = new extendedManagedElementManager.EquipmentClock_T();
		result.name = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.clockStatus=in.read_string();
		result.synchroSrcClass=in.read_string();
		result.synchroSrc=in.read_string();
		result.workMode=in.read_string();
		result.clockSourceList = extendedManagedElementManager.StringList_THelper.read(in);
		result.synchroProtocol=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedManagedElementManager.EquipmentClock_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.clockStatus);
		out.write_string(s.synchroSrcClass);
		out.write_string(s.synchroSrc);
		out.write_string(s.workMode);
		extendedManagedElementManager.StringList_THelper.write(out,s.clockSourceList);
		out.write_string(s.synchroProtocol);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
