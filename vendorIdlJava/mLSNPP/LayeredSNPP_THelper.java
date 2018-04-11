package mLSNPP;


/**
 *	Generated from IDL definition of struct "LayeredSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( mLSNPP.LayeredSNPP_THelper.id(),"LayeredSNPP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("SNPPList", mLSNPP.SNPPList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mLSNPP.LayeredSNPP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mLSNPP.LayeredSNPP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPP/LayeredSNPP_T:1.0";
	}
	public static mLSNPP.LayeredSNPP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mLSNPP.LayeredSNPP_T result = new mLSNPP.LayeredSNPP_T();
		result.layerRate=in.read_short();
		result.SNPPList = mLSNPP.SNPPList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mLSNPP.LayeredSNPP_T s)
	{
		out.write_short(s.layerRate);
		mLSNPP.SNPPList_THelper.write(out,s.SNPPList);
	}
}
