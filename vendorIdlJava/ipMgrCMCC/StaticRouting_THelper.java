package ipMgrCMCC;


/**
 *	Generated from IDL definition of struct "StaticRouting_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRouting_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( ipMgrCMCC.StaticRouting_THelper.id(),"StaticRouting_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("destIP", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("destMask", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nextHopIP", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("outPort", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("priority", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("bindingObject", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final ipMgrCMCC.StaticRouting_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static ipMgrCMCC.StaticRouting_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgrCMCC/StaticRouting_T:1.0";
	}
	public static ipMgrCMCC.StaticRouting_T read (final org.omg.CORBA.portable.InputStream in)
	{
		ipMgrCMCC.StaticRouting_T result = new ipMgrCMCC.StaticRouting_T();
		result.destIP=in.read_string();
		result.destMask=in.read_string();
		result.nextHopIP=in.read_string();
		result.outPort = globaldefs.NamingAttributes_THelper.read(in);
		result.priority=in.read_string();
		result.bindingObject = globaldefs.NamingAttributes_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final ipMgrCMCC.StaticRouting_T s)
	{
		out.write_string(s.destIP);
		out.write_string(s.destMask);
		out.write_string(s.nextHopIP);
		globaldefs.NamingAttributes_THelper.write(out,s.outPort);
		out.write_string(s.priority);
		globaldefs.NamingAttributes_THelper.write(out,s.bindingObject);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
