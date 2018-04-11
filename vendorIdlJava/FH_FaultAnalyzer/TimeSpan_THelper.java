package FH_FaultAnalyzer;


/**
 *	Generated from IDL definition of struct "TimeSpan_T"
 *	@author JacORB IDL compiler 
 */

public final class TimeSpan_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( FH_FaultAnalyzer.TimeSpan_THelper.id(),"TimeSpan_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("TimeSpanBegin", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("TimeSpanEnd", globaldefs.Time_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final FH_FaultAnalyzer.TimeSpan_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static FH_FaultAnalyzer.TimeSpan_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/FH_FaultAnalyzer/TimeSpan_T:1.0";
	}
	public static FH_FaultAnalyzer.TimeSpan_T read (final org.omg.CORBA.portable.InputStream in)
	{
		FH_FaultAnalyzer.TimeSpan_T result = new FH_FaultAnalyzer.TimeSpan_T();
		result.TimeSpanBegin = globaldefs.Time_THelper.read(in);
		result.TimeSpanEnd = globaldefs.Time_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final FH_FaultAnalyzer.TimeSpan_T s)
	{
		globaldefs.Time_THelper.write(out,s.TimeSpanBegin);
		globaldefs.Time_THelper.write(out,s.TimeSpanEnd);
	}
}
