package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "AlreadyBound"
 *	@author JacORB IDL compiler 
 */

public final class AlreadyBound
	extends org.omg.CORBA.UserException
{
	public AlreadyBound()
	{
		super(org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.id());
	}

	public AlreadyBound(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AlreadyBound");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
