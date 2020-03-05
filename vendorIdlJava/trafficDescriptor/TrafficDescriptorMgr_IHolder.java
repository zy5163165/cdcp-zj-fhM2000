package trafficDescriptor;

/**
 *	Generated from IDL definition of interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptorMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrafficDescriptorMgr_I value;
	public TrafficDescriptorMgr_IHolder ()
	{
	}
	public TrafficDescriptorMgr_IHolder (final TrafficDescriptorMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficDescriptorMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficDescriptorMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrafficDescriptorMgr_IHelper.write (_out,value);
	}
}
