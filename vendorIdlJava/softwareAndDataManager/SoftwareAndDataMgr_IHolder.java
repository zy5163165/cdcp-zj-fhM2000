package softwareAndDataManager;

/**
 *	Generated from IDL definition of interface "SoftwareAndDataMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class SoftwareAndDataMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public SoftwareAndDataMgr_I value;
	public SoftwareAndDataMgr_IHolder ()
	{
	}
	public SoftwareAndDataMgr_IHolder (final SoftwareAndDataMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SoftwareAndDataMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SoftwareAndDataMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SoftwareAndDataMgr_IHelper.write (_out,value);
	}
}
