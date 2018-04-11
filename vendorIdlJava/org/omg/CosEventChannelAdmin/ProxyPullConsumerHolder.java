package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyPullConsumer"
 *	@author JacORB IDL compiler 
 */

public final class ProxyPullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPullConsumer value;
	public ProxyPullConsumerHolder ()
	{
	}
	public ProxyPullConsumerHolder (final ProxyPullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyPullConsumerHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPullConsumerHelper.write (_out,value);
	}
}
