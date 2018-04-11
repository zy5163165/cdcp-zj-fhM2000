package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of alias "Preference"
 *	@author JacORB IDL compiler 
 */

public final class PreferenceHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String value;

	public PreferenceHolder ()
	{
	}
	public PreferenceHolder (final java.lang.String initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PreferenceHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PreferenceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PreferenceHelper.write (out,value);
	}
}
