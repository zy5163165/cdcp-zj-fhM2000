package org.omg.CosNaming.NamingContextExtPackage;

/**
 *	Generated from IDL definition of exception "InvalidAddress"
 *	@author JacORB IDL compiler 
 */

public final class InvalidAddress
	extends org.omg.CORBA.UserException
{
	public InvalidAddress()
	{
		super(org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.id());
	}

	public InvalidAddress(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("InvalidAddress");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
