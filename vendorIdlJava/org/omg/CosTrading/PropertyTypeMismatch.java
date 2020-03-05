package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "PropertyTypeMismatch"
 *	@author JacORB IDL compiler 
 */

public final class PropertyTypeMismatch
	extends org.omg.CORBA.UserException
{
	public PropertyTypeMismatch()
	{
		super(org.omg.CosTrading.PropertyTypeMismatchHelper.id());
	}

	public java.lang.String type;
	public org.omg.CosTrading.Property prop;
	public PropertyTypeMismatch(java.lang.String _reason,java.lang.String type, org.omg.CosTrading.Property prop)
	{
		super(org.omg.CosTrading.PropertyTypeMismatchHelper.id()+""+_reason );
		this.type = type;
		this.prop = prop;
	}
	public PropertyTypeMismatch(java.lang.String type, org.omg.CosTrading.Property prop)
	{
		this.type = type;
		this.prop = prop;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PropertyTypeMismatch");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("type=");
		textStruct.append(type);
		textStruct.append(","); 
		textStruct.append("prop=");
		textStruct.append(prop);
		textStruct.append(")");
		return textStruct.toString();
	}
}
