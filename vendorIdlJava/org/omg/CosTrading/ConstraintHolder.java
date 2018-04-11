package org.omg.CosTrading;

/**
 *	Generated from IDL definition of alias "Constraint"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String value;

	public ConstraintHolder ()
	{
	}
	public ConstraintHolder (final java.lang.String initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConstraintHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstraintHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConstraintHelper.write (out,value);
	}
}
