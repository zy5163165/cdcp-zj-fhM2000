package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "ObjectAndAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAndAttr_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedEmsMgr.ObjectAndAttr_THelper.id(),"ObjectAndAttr_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.ObjectAndAttr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.ObjectAndAttr_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/ObjectAndAttr_T:1.0";
	}
	public static extendedEmsMgr.ObjectAndAttr_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.ObjectAndAttr_T result = new extendedEmsMgr.ObjectAndAttr_T();
		result.objectName = globaldefs.NamingAttributes_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.ObjectAndAttr_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.objectName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
