package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of exception "IllegalRecipe"
 *	@author JacORB IDL compiler 
 */

public final class IllegalRecipe
	extends org.omg.CORBA.UserException
{
	public IllegalRecipe()
	{
		super(org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id());
	}

	public java.lang.String recipe;
	public IllegalRecipe(java.lang.String _reason,java.lang.String recipe)
	{
		super(org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id()+""+_reason );
		this.recipe = recipe;
	}
	public IllegalRecipe(java.lang.String recipe)
	{
		this.recipe = recipe;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("IllegalRecipe");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("recipe=");
		textStruct.append(recipe);
		textStruct.append(")");
		return textStruct.toString();
	}
}
