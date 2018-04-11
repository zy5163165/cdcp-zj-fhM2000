package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "MandatoryProperty"
 *	@author JacORB IDL compiler 
 */

public final class MandatoryProperty
	extends org.omg.CORBA.UserException
{
	public MandatoryProperty()
	{
		super(org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.id());
	}

	public java.lang.String type;
	public java.lang.String name;
	public MandatoryProperty(java.lang.String _reason,java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.id()+""+_reason );
		this.type = type;
		this.name = name;
	}
	public MandatoryProperty(java.lang.String type, java.lang.String name)
	{
		this.type = type;
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MandatoryProperty");
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
