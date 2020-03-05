package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "StructuredProxyPushConsumer"
 *	@author JacORB IDL compiler 
 */

public final class StructuredProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPushConsumer value;
	public StructuredProxyPushConsumerHolder ()
	{
	}
	public StructuredProxyPushConsumerHolder (final StructuredProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StructuredProxyPushConsumerHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPushConsumerHelper.write (_out,value);
	}
}
