package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "NamePair_T"
 *	@author JacORB IDL compiler 
 */

public final class NamePair_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.NamePair_THelper.id(),"NamePair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("preName", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("afterName", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.NamePair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.NamePair_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/NamePair_T:1.0";
	}
	public static extendedEmsMgr.NamePair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.NamePair_T result = new extendedEmsMgr.NamePair_T();
		result.preName = globaldefs.NamingAttributesList_THelper.read(in);
		result.afterName = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.NamePair_T s)
	{
		globaldefs.NamingAttributesList_THelper.write(out,s.preName);
		globaldefs.NamingAttributesList_THelper.write(out,s.afterName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
