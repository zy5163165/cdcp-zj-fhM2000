package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalPropertyName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalPropertyName
	extends org.omg.CORBA.UserException
{
	public IllegalPropertyName()
	{
		super(org.omg.CosTrading.IllegalPropertyNameHelper.id());
	}

	public java.lang.String name;
	public IllegalPropertyName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.IllegalPropertyNameHelper.id()+""+_reason );
		this.name = name;
	}
	public IllegalPropertyName(java.lang.String name)
	{
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("IllegalPropertyName");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(")");
		return textStruct.toString();
	}
}
