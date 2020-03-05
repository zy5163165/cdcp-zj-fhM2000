package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "ConsumerAdmin"
 *	@author JacORB IDL compiler 
 */

public final class ConsumerAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public ConsumerAdmin value;
	public ConsumerAdminHolder ()
	{
	}
	public ConsumerAdminHolder (final ConsumerAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConsumerAdminHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConsumerAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ConsumerAdminHelper.write (_out,value);
	}
}
