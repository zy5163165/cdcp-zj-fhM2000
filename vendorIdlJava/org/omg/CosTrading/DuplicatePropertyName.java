package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "DuplicatePropertyName"
 *	@author JacORB IDL compiler 
 */

public final class DuplicatePropertyName
	extends org.omg.CORBA.UserException
{
	public DuplicatePropertyName()
	{
		super(org.omg.CosTrading.DuplicatePropertyNameHelper.id());
	}

	public java.lang.String name;
	public DuplicatePropertyName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.DuplicatePropertyNameHelper.id()+""+_reason );
		this.name = name;
	}
	public DuplicatePropertyName(java.lang.String name)
	{
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("DuplicatePropertyName");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(")");
		return textStruct.toString();
	}
}
