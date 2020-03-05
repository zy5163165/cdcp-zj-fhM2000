package extendedManagedElementManager;


/**
 *	Generated from IDL definition of struct "BusinessPath_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessPath_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedManagedElementManager.BusinessPath_THelper.id(),"BusinessPath_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpname", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("ccOrTplList", extendedManagedElementManager.CCorTPLList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.BusinessPath_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedManagedElementManager.BusinessPath_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/BusinessPath_T:1.0";
	}
	public static extendedManagedElementManager.BusinessPath_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedManagedElementManager.BusinessPath_T result = new extendedManagedElementManager.BusinessPath_T();
		result.tpname = globaldefs.NamingAttributes_THelper.read(in);
		result.ccOrTplList = extendedManagedElementManager.CCorTPLList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedManagedElementManager.BusinessPath_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.tpname);
		extendedManagedElementManager.CCorTPLList_THelper.write(out,s.ccOrTplList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
