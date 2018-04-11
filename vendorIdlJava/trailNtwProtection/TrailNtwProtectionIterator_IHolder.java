package trailNtwProtection;

/**
 *	Generated from IDL definition of interface "TrailNtwProtectionIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtectionIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrailNtwProtectionIterator_I value;
	public TrailNtwProtectionIterator_IHolder ()
	{
	}
	public TrailNtwProtectionIterator_IHolder (final TrailNtwProtectionIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrailNtwProtectionIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrailNtwProtectionIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrailNtwProtectionIterator_IHelper.write (_out,value);
	}
}
