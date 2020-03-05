package org.omg.CosNaming.NamingContextPackage;
/**
 *	Generated from IDL definition of enum "NotFoundReason"
 *	@author JacORB IDL compiler 
 */

public final class NotFoundReasonHolder
	implements org.omg.CORBA.portable.Streamable
{
	public NotFoundReason value;

	public NotFoundReasonHolder ()
	{
	}
	public NotFoundReasonHolder (final NotFoundReason initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NotFoundReasonHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotFoundReasonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NotFoundReasonHelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
