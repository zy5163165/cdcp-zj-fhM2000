package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of exception "AlreadyConnected"
 *	@author JacORB IDL compiler 
 */

public final class AlreadyConnected
	extends org.omg.CORBA.UserException
{
	public AlreadyConnected()
	{
		super(org.omg.CosEventChannelAdmin.AlreadyConnectedHelper.id());
	}

	public AlreadyConnected(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AlreadyConnected");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
