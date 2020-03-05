package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "ChannelNotFound"
 *	@author JacORB IDL compiler 
 */

public final class ChannelNotFound
	extends org.omg.CORBA.UserException
{
	public ChannelNotFound()
	{
		super(org.omg.CosNotifyChannelAdmin.ChannelNotFoundHelper.id());
	}

	public ChannelNotFound(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ChannelNotFound");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
