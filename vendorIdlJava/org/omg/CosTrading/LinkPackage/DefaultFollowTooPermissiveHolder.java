package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "DefaultFollowTooPermissive"
 *	@author JacORB IDL compiler 
 */

public final class DefaultFollowTooPermissiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive value;

	public DefaultFollowTooPermissiveHolder ()
	{
	}
	public DefaultFollowTooPermissiveHolder (final org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
