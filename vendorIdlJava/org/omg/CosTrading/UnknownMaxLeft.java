package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "UnknownMaxLeft"
 *	@author JacORB IDL compiler 
 */

public final class UnknownMaxLeft
	extends org.omg.CORBA.UserException
{
	public UnknownMaxLeft()
	{
		super(org.omg.CosTrading.UnknownMaxLeftHelper.id());
	}

	public UnknownMaxLeft(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnknownMaxLeft");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
