package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Register"
 *	@author JacORB IDL compiler 
 */

public final class RegisterHolder	implements org.omg.CORBA.portable.Streamable{
	 public Register value;
	public RegisterHolder ()
	{
	}
	public RegisterHolder (final Register initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RegisterHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RegisterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RegisterHelper.write (_out,value);
	}
}
