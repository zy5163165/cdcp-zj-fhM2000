package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "ReadonlyDynamicProperty"
 *	@author JacORB IDL compiler 
 */

public final class ReadonlyDynamicProperty
	extends org.omg.CORBA.UserException
{
	public ReadonlyDynamicProperty()
	{
		super(org.omg.CosTrading.ReadonlyDynamicPropertyHelper.id());
	}

	public java.lang.String type;
	public java.lang.String name;
	public ReadonlyDynamicProperty(java.lang.String _reason,java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.ReadonlyDynamicPropertyHelper.id()+""+_reason );
		this.type = type;
		this.name = name;
	}
	public ReadonlyDynamicProperty(java.lang.String type, java.lang.String name)
	{
		this.type = type;
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ReadonlyDynamicProperty");
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
