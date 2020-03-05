package topologicalLink;


/**
 *	Generated from IDL definition of struct "TLCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TLCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( topologicalLink.TLCreateData_THelper.id(),"TLCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("aEndTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zEndTP", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final topologicalLink.TLCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static topologicalLink.TLCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/topologicalLink/TLCreateData_T:1.0";
	}
	public static topologicalLink.TLCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		topologicalLink.TLCreateData_T result = new topologicalLink.TLCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.direction=globaldefs.ConnectionDirection_THelper.read(in);
		result.rate=in.read_short();
		result.aEndTP = globaldefs.NamingAttributes_THelper.read(in);
		result.zEndTP = globaldefs.NamingAttributes_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final topologicalLink.TLCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_short(s.rate);
		globaldefs.NamingAttributes_THelper.write(out,s.aEndTP);
		globaldefs.NamingAttributes_THelper.write(out,s.zEndTP);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
