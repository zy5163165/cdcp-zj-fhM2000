package softwareAndDataManager;


/**
 *	Generated from IDL definition of struct "BackupStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupStatus_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( softwareAndDataManager.BackupStatus_THelper.id(),"BackupStatus_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("opStatus", softwareAndDataManager.Current_OperationStatus_THelper.type(), null),new org.omg.CORBA.StructMember("failureReason", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final softwareAndDataManager.BackupStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static softwareAndDataManager.BackupStatus_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/softwareAndDataManager/BackupStatus_T:1.0";
	}
	public static softwareAndDataManager.BackupStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		softwareAndDataManager.BackupStatus_T result = new softwareAndDataManager.BackupStatus_T();
		result.opStatus=softwareAndDataManager.Current_OperationStatus_THelper.read(in);
		result.failureReason=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final softwareAndDataManager.BackupStatus_T s)
	{
		softwareAndDataManager.Current_OperationStatus_THelper.write(out,s.opStatus);
		out.write_string(s.failureReason);
	}
}
