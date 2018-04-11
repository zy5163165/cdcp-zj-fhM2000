package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "ConnectionAlreadyActive"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAlreadyActive
	extends org.omg.CORBA.UserException
{
	public ConnectionAlreadyActive()
	{
		super(org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.id());
	}

	public ConnectionAlreadyActive(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ConnectionAlreadyActive");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
