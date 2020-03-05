package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of exception "IllegalRecipe"
 *	@author JacORB IDL compiler 
 */

public final class IllegalRecipeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.ProxyPackage.IllegalRecipe value;

	public IllegalRecipeHolder ()
	{
	}
	public IllegalRecipeHolder (final org.omg.CosTrading.ProxyPackage.IllegalRecipe initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
