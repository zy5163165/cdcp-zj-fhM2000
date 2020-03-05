package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidConstraint"
 *	@author JacORB IDL compiler 
 */

public final class InvalidConstraint
	extends org.omg.CORBA.UserException
{
	public InvalidConstraint()
	{
		super(org.omg.CosNotifyFilter.InvalidConstraintHelper.id());
	}

	public org.omg.CosNotifyFilter.ConstraintExp constr;
	public InvalidConstraint(java.lang.String _reason,org.omg.CosNotifyFilter.ConstraintExp constr)
	{
		super(org.omg.CosNotifyFilter.InvalidConstraintHelper.id()+""+_reason );
		this.constr = constr;
	}
	public InvalidConstraint(org.omg.CosNotifyFilter.ConstraintExp constr)
	{
		this.constr = constr;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("InvalidConstraint");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("constr=");
		textStruct.append(constr);
		textStruct.append(")");
		return textStruct.toString();
	}
}
