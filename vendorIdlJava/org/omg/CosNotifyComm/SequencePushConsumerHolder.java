package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of interface "SequencePushConsumer"
 *	@author JacORB IDL compiler 
 */

public final class SequencePushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequencePushConsumer value;
	public SequencePushConsumerHolder ()
	{
	}
	public SequencePushConsumerHolder (final SequencePushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SequencePushConsumerHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequencePushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequencePushConsumerHelper.write (_out,value);
	}
}
