package org.omg.CosTrading;
/**
 *	Generated from IDL definition of enum "FollowOption"
 *	@author JacORB IDL compiler 
 */

public final class FollowOptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public FollowOption value;

	public FollowOptionHolder ()
	{
	}
	public FollowOptionHolder (final FollowOption initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FollowOptionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FollowOptionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FollowOptionHelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
