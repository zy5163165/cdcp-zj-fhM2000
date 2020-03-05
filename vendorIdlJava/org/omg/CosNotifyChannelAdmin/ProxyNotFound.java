package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "ProxyNotFound"
 *	@author JacORB IDL compiler 
 */

public final class ProxyNotFound
	extends org.omg.CORBA.UserException
{
	public ProxyNotFound()
	{
		super(org.omg.CosNotifyChannelAdmin.ProxyNotFoundHelper.id());
	}

	public ProxyNotFound(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ProxyNotFound");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
