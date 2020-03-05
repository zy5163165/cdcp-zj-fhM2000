package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "CallbackNotFound"
 *	@author JacORB IDL compiler 
 */

public final class CallbackNotFound
	extends org.omg.CORBA.UserException
{
	public CallbackNotFound()
	{
		super(org.omg.CosNotifyFilter.CallbackNotFoundHelper.id());
	}

	public CallbackNotFound(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CallbackNotFound");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
