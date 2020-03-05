package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "InvalidName"
 *	@author JacORB IDL compiler 
 */

public final class InvalidName
	extends org.omg.CORBA.UserException
{
	public InvalidName()
	{
		super(org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.id());
	}

	public InvalidName(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("InvalidName");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
