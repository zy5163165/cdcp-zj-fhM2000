package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidGrammar"
 *	@author JacORB IDL compiler 
 */

public final class InvalidGrammar
	extends org.omg.CORBA.UserException
{
	public InvalidGrammar()
	{
		super(org.omg.CosNotifyFilter.InvalidGrammarHelper.id());
	}

	public InvalidGrammar(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("InvalidGrammar");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
