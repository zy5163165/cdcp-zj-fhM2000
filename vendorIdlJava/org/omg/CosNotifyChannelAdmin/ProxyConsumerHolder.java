package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyConsumer"
 *	@author JacORB IDL compiler 
 */

public final class ProxyConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyConsumer value;
	public ProxyConsumerHolder ()
	{
	}
	public ProxyConsumerHolder (final ProxyConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyConsumerHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyConsumerHelper.write (_out,value);
	}
}
