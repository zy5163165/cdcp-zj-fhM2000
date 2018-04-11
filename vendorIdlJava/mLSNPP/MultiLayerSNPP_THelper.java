package mLSNPP;


/**
 *	Generated from IDL definition of struct "MultiLayerSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( mLSNPP.MultiLayerSNPP_THelper.id(),"MultiLayerSNPP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("layeredSNPPList", mLSNPP.LayeredSNPPList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mLSNPP.MultiLayerSNPP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mLSNPP.MultiLayerSNPP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/MultiLayerSNPP_T:1.0";
	}
	public static mLSNPP.MultiLayerSNPP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mLSNPP.MultiLayerSNPP_T result = new mLSNPP.MultiLayerSNPP_T();
		result.name = globaldefs.NamingAttributes_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=terminationPoint.Directionality_THelper.read(in);
		result.layeredSNPPList = mLSNPP.LayeredSNPPList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mLSNPP.MultiLayerSNPP_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		terminationPoint.Directionality_THelper.write(out,s.direction);
		mLSNPP.LayeredSNPPList_THelper.write(out,s.layeredSNPPList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
