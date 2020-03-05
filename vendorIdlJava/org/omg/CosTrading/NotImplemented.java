package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "NotImplemented"
 *	@author JacORB IDL compiler 
 */

public final class NotImplemented
	extends org.omg.CORBA.UserException
{
	public NotImplemented()
	{
		super(org.omg.CosTrading.NotImplementedHelper.id());
	}

	public NotImplemented(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NotImplemented");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
