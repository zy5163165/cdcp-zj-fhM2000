package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "ServiceTypeName"
 *	@author JacORB IDL compiler 
 */

public final class ServiceTypeNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String value;

	public ServiceTypeNameHolder ()
	{
	}
	public ServiceTypeNameHolder (final java.lang.String initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceTypeNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceTypeNameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceTypeNameHelper.write (out,value);
	}
}
