package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "NotEmpty"
 *	@author JacORB IDL compiler 
 */

public final class NotEmpty
	extends org.omg.CORBA.UserException
{
	public NotEmpty()
	{
		super(org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.id());
	}

	public NotEmpty(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NotEmpty");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
