package extendedManagedElementManager;


/**
 *	Generated from IDL definition of struct "LayeredCCCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCCCapacity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedManagedElementManager.LayeredCCCapacity_THelper.id(),"LayeredCCCapacity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("ingressPortsNum", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("egressPortsNum", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("totalPortdNum", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("portsType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.LayeredCCCapacity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedManagedElementManager.LayeredCCCapacity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/LayeredCCCapacity_T:1.0";
	}
	public static extendedManagedElementManager.LayeredCCCapacity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedManagedElementManager.LayeredCCCapacity_T result = new extendedManagedElementManager.LayeredCCCapacity_T();
		result.layerRate=in.read_short();
		result.ingressPortsNum=in.read_ushort();
		result.egressPortsNum=in.read_ushort();
		result.totalPortdNum=in.read_ushort();
		result.portsType=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedManagedElementManager.LayeredCCCapacity_T s)
	{
		out.write_short(s.layerRate);
		out.write_ushort(s.ingressPortsNum);
		out.write_ushort(s.egressPortsNum);
		out.write_ushort(s.totalPortdNum);
		out.write_string(s.portsType);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
