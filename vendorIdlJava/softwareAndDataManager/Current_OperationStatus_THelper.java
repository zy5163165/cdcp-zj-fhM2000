package softwareAndDataManager;
/**
 *	Generated from IDL definition of enum "Current_OperationStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class Current_OperationStatus_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(softwareAndDataManager.Current_OperationStatus_THelper.id(),"Current_OperationStatus_T",new String[]{"COS_Idle","COS_Pending","COS_InProgress","COS_Completed","COS_Aborted"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final softwareAndDataManager.Current_OperationStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static softwareAndDataManager.Current_OperationStatus_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/softwareAndDataManager/Current_OperationStatus_T:1.0";
	}
	public static Current_OperationStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return Current_OperationStatus_T.from_int( in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final Current_OperationStatus_T s)
	{
		out.write_long(s.value());
	}
}
