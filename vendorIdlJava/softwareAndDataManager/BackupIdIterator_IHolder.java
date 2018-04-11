package softwareAndDataManager;

/**
 *	Generated from IDL definition of interface "BackupIdIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class BackupIdIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public BackupIdIterator_I value;
	public BackupIdIterator_IHolder ()
	{
	}
	public BackupIdIterator_IHolder (final BackupIdIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BackupIdIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BackupIdIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BackupIdIterator_IHelper.write (_out,value);
	}
}
