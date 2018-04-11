package trailNtwProtection;

/**
 *	Generated from IDL definition of interface "TrailNtwProtMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrailNtwProtMgr_I value;
	public TrailNtwProtMgr_IHolder ()
	{
	}
	public TrailNtwProtMgr_IHolder (final TrailNtwProtMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrailNtwProtMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrailNtwProtMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrailNtwProtMgr_IHelper.write (_out,value);
	}
}
