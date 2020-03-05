package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of exception "PolicyTypeMismatch"
 *	@author JacORB IDL compiler 
 */

public final class PolicyTypeMismatch
	extends org.omg.CORBA.UserException
{
	public PolicyTypeMismatch()
	{
		super(org.omg.CosTrading.LookupPackage.PolicyTypeMismatchHelper.id());
	}

	public org.omg.CosTrading.Policy the_policy;
	public PolicyTypeMismatch(java.lang.String _reason,org.omg.CosTrading.Policy the_policy)
	{
		super(org.omg.CosTrading.LookupPackage.PolicyTypeMismatchHelper.id()+""+_reason );
		this.the_policy = the_policy;
	}
	public PolicyTypeMismatch(org.omg.CosTrading.Policy the_policy)
	{
		this.the_policy = the_policy;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PolicyTypeMismatch");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("the_policy=");
		textStruct.append(the_policy);
		textStruct.append(")");
		return textStruct.toString();
	}
}
