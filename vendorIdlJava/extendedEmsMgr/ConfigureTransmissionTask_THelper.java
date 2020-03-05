package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "ConfigureTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ConfigureTransmissionTask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.ConfigureTransmissionTask_THelper.id(),"ConfigureTransmissionTask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectNameList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("objectTypeList", extendedEmsMgr.ObjectTypeList_THelper.type(), null),new org.omg.CORBA.StructMember("beCompressed", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.ConfigureTransmissionTask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.ConfigureTransmissionTask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/ConfigureTransmissionTask_T:1.0";
	}
	public static extendedEmsMgr.ConfigureTransmissionTask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.ConfigureTransmissionTask_T result = new extendedEmsMgr.ConfigureTransmissionTask_T();
		result.objectNameList = globaldefs.NamingAttributesList_THelper.read(in);
		result.objectTypeList = extendedEmsMgr.ObjectTypeList_THelper.read(in);
		result.beCompressed=in.read_boolean();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.ConfigureTransmissionTask_T s)
	{
		globaldefs.NamingAttributesList_THelper.write(out,s.objectNameList);
		extendedEmsMgr.ObjectTypeList_THelper.write(out,s.objectTypeList);
		out.write_boolean(s.beCompressed);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
