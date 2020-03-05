package mLSNPPLink;


/**
 *	Generated from IDL definition of struct "LayeredSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( mLSNPPLink.LayeredSNPPLink_THelper.id(),"LayeredSNPPLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("sNPPLinkList", mLSNPPLink.SNPPLinkList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mLSNPPLink.LayeredSNPPLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mLSNPPLink.LayeredSNPPLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPPLink/LayeredSNPPLink_T:1.0";
	}
	public static mLSNPPLink.LayeredSNPPLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mLSNPPLink.LayeredSNPPLink_T result = new mLSNPPLink.LayeredSNPPLink_T();
		result.layerRate=in.read_short();
		result.sNPPLinkList = mLSNPPLink.SNPPLinkList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mLSNPPLink.LayeredSNPPLink_T s)
	{
		out.write_short(s.layerRate);
		mLSNPPLink.SNPPLinkList_THelper.write(out,s.sNPPLinkList);
	}
}
