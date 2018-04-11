package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Admin"
 *	@author JacORB IDL compiler 
 */

public final class AdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public Admin value;
	public AdminHolder ()
	{
	}
	public AdminHolder (final Admin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AdminHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AdminHelper.write (_out,value);
	}
}
