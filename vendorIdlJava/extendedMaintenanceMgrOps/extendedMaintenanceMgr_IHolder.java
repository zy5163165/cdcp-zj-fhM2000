package extendedMaintenanceMgrOps;

/**
 *	Generated from IDL definition of interface "extendedMaintenanceMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class extendedMaintenanceMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public extendedMaintenanceMgr_I value;
	public extendedMaintenanceMgr_IHolder ()
	{
	}
	public extendedMaintenanceMgr_IHolder (final extendedMaintenanceMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedMaintenanceMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = extendedMaintenanceMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedMaintenanceMgr_IHelper.write (_out,value);
	}
}
