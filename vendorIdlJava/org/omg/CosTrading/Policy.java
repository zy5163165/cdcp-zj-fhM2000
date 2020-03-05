package org.omg.CosTrading;

/**
 *	Generated from IDL definition of struct "Policy"
 *	@author JacORB IDL compiler 
 */

public final class Policy
	implements org.omg.CORBA.portable.IDLEntity
{
	public Policy(){}
	public java.lang.String name;
	public org.omg.CORBA.Any value;
	public Policy(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Policy");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(","); 
		textStruct.append("value=");
		textStruct.append(value);
		textStruct.append(")");
		return textStruct.toString();
	}
}
