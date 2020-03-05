package org.omg.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ProxyType"
 *	@author JacORB IDL compiler 
 */

public final class ProxyTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProxyType value;

	public ProxyTypeHolder ()
	{
	}
	public ProxyTypeHolder (final ProxyType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProxyTypeHelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
