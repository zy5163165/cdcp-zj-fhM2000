package mLSNPP;


/**
 *	Generated from IDL definition of struct "SNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( mLSNPP.SNPP_THelper.id(),"SNPP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sNPPId", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sNPList", mLSNPP.SNPList_THelper.type(), null),new org.omg.CORBA.StructMember("tNAName", mLSNPP.TNAName_THelper.type(), null),new org.omg.CORBA.StructMember("groupTNAName", mLSNPP.TNAName_THelper.type(), null),new org.omg.CORBA.StructMember("rAId", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mLSNPP.SNPP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mLSNPP.SNPP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/SNPP_T:1.0";
	}
	public static mLSNPP.SNPP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mLSNPP.SNPP_T result = new mLSNPP.SNPP_T();
		result.sNPPId=in.read_string();
		result.sNPList = mLSNPP.SNPList_THelper.read(in);
		result.tNAName = mLSNPP.TNAName_THelper.read(in);
		result.groupTNAName = mLSNPP.TNAName_THelper.read(in);
		result.rAId=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mLSNPP.SNPP_T s)
	{
		out.write_string(s.sNPPId);
		mLSNPP.SNPList_THelper.write(out,s.sNPList);
		mLSNPP.TNAName_THelper.write(out,s.tNAName);
		mLSNPP.TNAName_THelper.write(out,s.groupTNAName);
		out.write_string(s.rAId);
	}
}
