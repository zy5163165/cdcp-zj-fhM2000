package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "MissingMandatoryProperty"
 *	@author JacORB IDL compiler 
 */

public final class MissingMandatoryProperty
	extends org.omg.CORBA.UserException
{
	public MissingMandatoryProperty()
	{
		super(org.omg.CosTrading.MissingMandatoryPropertyHelper.id());
	}

	public java.lang.String type;
	public java.lang.String name;
	public MissingMandatoryProperty(java.lang.String _reason,java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.MissingMandatoryPropertyHelper.id()+""+_reason );
		this.type = type;
		this.name = name;
	}
	public MissingMandatoryProperty(java.lang.String type, java.lang.String name)
	{
		this.type = type;
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MissingMandatoryProperty");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("type=");
		textStruct.append(type);
		textStruct.append(","); 
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(")");
		return textStruct.toString();
	}
}
