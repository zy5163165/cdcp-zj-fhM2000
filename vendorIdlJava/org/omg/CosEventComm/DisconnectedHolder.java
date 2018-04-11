package org.omg.CosEventComm;

/**
 *	Generated from IDL definition of exception "Disconnected"
 *	@author JacORB IDL compiler 
 */

public final class DisconnectedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosEventComm.Disconnected value;

	public DisconnectedHolder ()
	{
	}
	public DisconnectedHolder (final org.omg.CosEventComm.Disconnected initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosEventComm.DisconnectedHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosEventComm.DisconnectedHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosEventComm.DisconnectedHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
