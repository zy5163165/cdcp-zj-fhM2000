package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of exception "InvalidEventType"
 *	@author JacORB IDL compiler 
 */

public final class InvalidEventTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyComm.InvalidEventType value;

	public InvalidEventTypeHolder ()
	{
	}
	public InvalidEventTypeHolder (final org.omg.CosNotifyComm.InvalidEventType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyComm.InvalidEventTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyComm.InvalidEventTypeHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyComm.InvalidEventTypeHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
