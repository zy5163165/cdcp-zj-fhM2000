package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "SequenceProxyPushConsumer"
 *	@author JacORB IDL compiler 
 */

public final class SequenceProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPushConsumer value;
	public SequenceProxyPushConsumerHolder ()
	{
	}
	public SequenceProxyPushConsumerHolder (final SequenceProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SequenceProxyPushConsumerHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPushConsumerHelper.write (_out,value);
	}
}
