package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "AdminNotFound"
 *	@author JacORB IDL compiler 
 */

public final class AdminNotFound
	extends org.omg.CORBA.UserException
{
	public AdminNotFound()
	{
		super(org.omg.CosNotifyChannelAdmin.AdminNotFoundHelper.id());
	}

	public AdminNotFound(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AdminNotFound");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
