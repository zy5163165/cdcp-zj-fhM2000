package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of exception "AlreadyConnected"
 *	@author JacORB IDL compiler 
 */

public final class AlreadyConnectedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosEventChannelAdmin.AlreadyConnected value;

	public AlreadyConnectedHolder ()
	{
	}
	public AlreadyConnectedHolder (final org.omg.CosEventChannelAdmin.AlreadyConnected initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosEventChannelAdmin.AlreadyConnectedHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosEventChannelAdmin.AlreadyConnectedHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosEventChannelAdmin.AlreadyConnectedHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
