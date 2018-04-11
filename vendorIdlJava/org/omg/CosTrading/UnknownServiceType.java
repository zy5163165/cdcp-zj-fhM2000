package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "UnknownServiceType"
 *	@author JacORB IDL compiler 
 */

public final class UnknownServiceType
	extends org.omg.CORBA.UserException
{
	public UnknownServiceType()
	{
		super(org.omg.CosTrading.UnknownServiceTypeHelper.id());
	}

	public java.lang.String type;
	public UnknownServiceType(java.lang.String _reason,java.lang.String type)
	{
		super(org.omg.CosTrading.UnknownServiceTypeHelper.id()+""+_reason );
		this.type = type;
	}
	public UnknownServiceType(java.lang.String type)
	{
		this.type = type;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnknownServiceType");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("type=");
		textStruct.append(type);
		textStruct.append(")");
		return textStruct.toString();
	}
}
