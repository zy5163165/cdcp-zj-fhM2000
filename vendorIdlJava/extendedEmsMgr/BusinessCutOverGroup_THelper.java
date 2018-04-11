package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "BusinessCutOverGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.BusinessCutOverGroup_THelper.id(),"BusinessCutOverGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("businessCutOverSncList", extendedEmsMgr.NamePairList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.BusinessCutOverGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.BusinessCutOverGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/BusinessCutOverGroup_T:1.0";
	}
	public static extendedEmsMgr.BusinessCutOverGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.BusinessCutOverGroup_T result = new extendedEmsMgr.BusinessCutOverGroup_T();
		result.name = globaldefs.NamingAttributes_THelper.read(in);
		result.nativeEMSName=in.read_string();
		result.userLabel=in.read_string();
		result.businessCutOverSncList = extendedEmsMgr.NamePairList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.BusinessCutOverGroup_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.name);
		out.write_string(s.nativeEMSName);
		out.write_string(s.userLabel);
		extendedEmsMgr.NamePairList_THelper.write(out,s.businessCutOverSncList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
