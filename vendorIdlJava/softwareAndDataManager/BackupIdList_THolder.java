package softwareAndDataManager;

/**
 *	Generated from IDL definition of alias "BackupIdList_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupIdList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public softwareAndDataManager.BackupId_T[] value;

	public BackupIdList_THolder ()
	{
	}
	public BackupIdList_THolder (final softwareAndDataManager.BackupId_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BackupIdList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BackupIdList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BackupIdList_THelper.write (out,value);
	}
}
