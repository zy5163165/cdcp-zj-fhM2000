package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of exception "InvalidPolicyValue"
 *	@author JacORB IDL compiler 
 */

public final class InvalidPolicyValue
	extends org.omg.CORBA.UserException
{
	public InvalidPolicyValue()
	{
		super(org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.id());
	}

	public org.omg.CosTrading.Policy the_policy;
	public InvalidPolicyValue(java.lang.String _reason,org.omg.CosTrading.Policy the_policy)
	{
		super(org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.id()+""+_reason );
		this.the_policy = the_policy;
	}
	public InvalidPolicyValue(org.omg.CosTrading.Policy the_policy)
	{
		this.the_policy = the_policy;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("InvalidPolicyValue");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("the_policy=");
		textStruct.append(the_policy);
		textStruct.append(")");
		return textStruct.toString();
	}
}
