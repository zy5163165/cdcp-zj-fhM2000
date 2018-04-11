package org.omg.CosEventComm;

/**
 *	Generated from IDL definition of exception "Disconnected"
 *	@author JacORB IDL compiler 
 */

public final class Disconnected
	extends org.omg.CORBA.UserException
{
	public Disconnected()
	{
		super(org.omg.CosEventComm.DisconnectedHelper.id());
	}

	public Disconnected(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Disconnected");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
