package mLSNPPLink;


/**
 *	Generated from IDL definition of struct "LayeredCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCapacity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( mLSNPPLink.LayeredCapacity_THelper.id(),"LayeredCapacity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("capacity", mLSNPPLink.Capacity_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mLSNPPLink.LayeredCapacity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mLSNPPLink.LayeredCapacity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPPLink/LayeredCapacity_T:1.0";
	}
	public static mLSNPPLink.LayeredCapacity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mLSNPPLink.LayeredCapacity_T result = new mLSNPPLink.LayeredCapacity_T();
		result.layerRate=in.read_short();
		result.capacity = mLSNPPLink.Capacity_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mLSNPPLink.LayeredCapacity_T s)
	{
		out.write_short(s.layerRate);
		mLSNPPLink.Capacity_THelper.write(out,s.capacity);
	}
}
