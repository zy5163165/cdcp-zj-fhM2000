package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "NotConnected"
 *	@author JacORB IDL compiler 
 */

public final class NotConnected
	extends org.omg.CORBA.UserException
{
	public NotConnected()
	{
		super(org.omg.CosNotifyChannelAdmin.NotConnectedHelper.id());
	}

	public NotConnected(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NotConnected");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
