package softwareAndDataManager;

/**
 *	Generated from IDL definition of struct "BackupStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public softwareAndDataManager.BackupStatus_T value;

	public BackupStatus_THolder ()
	{
	}
	public BackupStatus_THolder (final softwareAndDataManager.BackupStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return softwareAndDataManager.BackupStatus_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = softwareAndDataManager.BackupStatus_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		softwareAndDataManager.BackupStatus_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
