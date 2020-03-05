package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "EventChannelFactory"
 *	@author JacORB IDL compiler 
 */

public final class EventChannelFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public EventChannelFactory value;
	public EventChannelFactoryHolder ()
	{
	}
	public EventChannelFactoryHolder (final EventChannelFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventChannelFactoryHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventChannelFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EventChannelFactoryHelper.write (_out,value);
	}
}
