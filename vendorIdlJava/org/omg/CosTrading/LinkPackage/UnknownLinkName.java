package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "UnknownLinkName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownLinkName
	extends org.omg.CORBA.UserException
{
	public UnknownLinkName()
	{
		super(org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.id());
	}

	public java.lang.String name;
	public UnknownLinkName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.id()+""+_reason );
		this.name = name;
	}
	public UnknownLinkName(java.lang.String name)
	{
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnknownLinkName");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(")");
		return textStruct.toString();
	}
}
