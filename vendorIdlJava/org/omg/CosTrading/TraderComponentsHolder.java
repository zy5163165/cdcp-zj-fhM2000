package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "TraderComponents"
 *	@author JacORB IDL compiler 
 */

public final class TraderComponentsHolder	implements org.omg.CORBA.portable.Streamable{
	 public TraderComponents value;
	public TraderComponentsHolder ()
	{
	}
	public TraderComponentsHolder (final TraderComponents initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TraderComponentsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TraderComponentsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TraderComponentsHelper.write (_out,value);
	}
}
