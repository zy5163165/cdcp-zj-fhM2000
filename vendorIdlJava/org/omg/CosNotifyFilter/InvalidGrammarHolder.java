package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidGrammar"
 *	@author JacORB IDL compiler 
 */

public final class InvalidGrammarHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.InvalidGrammar value;

	public InvalidGrammarHolder ()
	{
	}
	public InvalidGrammarHolder (final org.omg.CosNotifyFilter.InvalidGrammar initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.InvalidGrammarHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.InvalidGrammarHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.InvalidGrammarHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
