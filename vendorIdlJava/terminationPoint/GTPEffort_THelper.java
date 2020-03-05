package terminationPoint;
/**
 *	Generated from IDL definition of enum "GTPEffort_T"
 *	@author JacORB IDL compiler 
 */

public final class GTPEffort_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(terminationPoint.GTPEffort_THelper.id(),"GTPEffort_T",new String[]{"EFFORT_WHATEVER","EFFORT_SAME"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.GTPEffort_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.GTPEffort_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/GTPEffort_T:1.0";
	}
	public static GTPEffort_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return GTPEffort_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final GTPEffort_T s)
	{
		out.write_long(s.value());
	}
}
