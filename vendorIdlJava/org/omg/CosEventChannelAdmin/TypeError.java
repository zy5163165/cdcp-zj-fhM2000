package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of exception "TypeError"
 *	@author JacORB IDL compiler 
 */

public final class TypeError
	extends org.omg.CORBA.UserException
{
	public TypeError()
	{
		super(org.omg.CosEventChannelAdmin.TypeErrorHelper.id());
	}

	public TypeError(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TypeError");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
