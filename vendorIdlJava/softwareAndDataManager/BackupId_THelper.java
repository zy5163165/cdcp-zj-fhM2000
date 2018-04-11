package softwareAndDataManager;


/**
 *	Generated from IDL definition of struct "BackupId_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupId_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( softwareAndDataManager.BackupId_THelper.id(),"BackupId_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("meName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("backupTime", globaldefs.Time_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final softwareAndDataManager.BackupId_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static softwareAndDataManager.BackupId_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/softwareAndDataManager/BackupId_T:1.0";
	}
	public static softwareAndDataManager.BackupId_T read (final org.omg.CORBA.portable.InputStream in)
	{
		softwareAndDataManager.BackupId_T result = new softwareAndDataManager.BackupId_T();
		result.meName = globaldefs.NamingAttributes_THelper.read(in);
		result.backupTime = globaldefs.Time_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final softwareAndDataManager.BackupId_T s)
	{
		globaldefs.NamingAttributes_THelper.write(out,s.meName);
		globaldefs.Time_THelper.write(out,s.backupTime);
	}
}
