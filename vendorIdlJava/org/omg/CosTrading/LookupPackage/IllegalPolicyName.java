package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of exception "IllegalPolicyName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalPolicyName
	extends org.omg.CORBA.UserException
{
	public IllegalPolicyName()
	{
		super(org.omg.CosTrading.LookupPackage.IllegalPolicyNameHelper.id());
	}

	public java.lang.String name;
	public IllegalPolicyName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.LookupPackage.IllegalPolicyNameHelper.id()+""+_reason );
		this.name = name;
	}
	public IllegalPolicyName(java.lang.String name)
	{
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("IllegalPolicyName");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(")");
		return textStruct.toString();
	}
}
