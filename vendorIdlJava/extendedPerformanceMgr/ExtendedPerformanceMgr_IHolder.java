package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of interface "ExtendedPerformanceMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class ExtendedPerformanceMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtendedPerformanceMgr_I value;
	public ExtendedPerformanceMgr_IHolder ()
	{
	}
	public ExtendedPerformanceMgr_IHolder (final ExtendedPerformanceMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtendedPerformanceMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtendedPerformanceMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtendedPerformanceMgr_IHelper.write (_out,value);
	}
}
