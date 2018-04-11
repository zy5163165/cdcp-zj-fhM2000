package extendedManagedElementManager;


/**
 *	Generated from IDL definition of struct "CCCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class CCCapacity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedManagedElementManager.CCCapacity_THelper.id(),"CCCapacity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("capacityType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("maxCapacity", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("maxCCCapacity", extendedManagedElementManager.LayeredCCCapacityList_THelper.type(), null),new org.omg.CORBA.StructMember("currentCCCapacity", extendedManagedElementManager.LayeredCCCapacityList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.CCCapacity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedManagedElementManager.CCCapacity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/CCCapacity_T:1.0";
	}
	public static extendedManagedElementManager.CCCapacity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedManagedElementManager.CCCapacity_T result = new extendedManagedElementManager.CCCapacity_T();
		result.objectName = globaldefs.NamingAttributes_THelper.read(in);
		result.capacityType=in.read_string();
		result.maxCapacity=in.read_string();
		result.maxCCCapacity = extendedManagedElementManager.LayeredCCCapacityList_THelper.read(in);
		result.currentCCCapacity = extendedManagedElementManager.LayeredCCCapacityList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedManagedElementManager.CCCapacity_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.objectName);
		out.write_string(s.capacityType);
		out.write_string(s.maxCapacity);
		extendedManagedElementManager.LayeredCCCapacityList_THelper.write(out,s.maxCCCapacity);
		extendedManagedElementManager.LayeredCCCapacityList_THelper.write(out,s.currentCCCapacity);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
