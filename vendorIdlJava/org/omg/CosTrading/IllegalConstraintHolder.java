package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalConstraint"
 *	@author JacORB IDL compiler 
 */

public final class IllegalConstraintHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.IllegalConstraint value;

	public IllegalConstraintHolder ()
	{
	}
	public IllegalConstraintHolder (final org.omg.CosTrading.IllegalConstraint initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.IllegalConstraintHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.IllegalConstraintHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.IllegalConstraintHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
