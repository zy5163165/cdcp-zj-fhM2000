package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of alias "ConstraintRecipe"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintRecipeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String value;

	public ConstraintRecipeHolder ()
	{
	}
	public ConstraintRecipeHolder (final java.lang.String initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConstraintRecipeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstraintRecipeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConstraintRecipeHelper.write (out,value);
	}
}
