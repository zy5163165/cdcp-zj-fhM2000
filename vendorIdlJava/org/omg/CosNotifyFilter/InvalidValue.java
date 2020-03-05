package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidValue"
 *	@author JacORB IDL compiler 
 */

public final class InvalidValue
	extends org.omg.CORBA.UserException
{
	public InvalidValue()
	{
		super(org.omg.CosNotifyFilter.InvalidValueHelper.id());
	}

	public org.omg.CosNotifyFilter.ConstraintExp constr;
	public org.omg.CORBA.Any value;
	public InvalidValue(java.lang.String _reason,org.omg.CosNotifyFilter.ConstraintExp constr, org.omg.CORBA.Any value)
	{
		super(org.omg.CosNotifyFilter.InvalidValueHelper.id()+""+_reason );
		this.constr = constr;
		this.value = value;
	}
	public InvalidValue(org.omg.CosNotifyFilter.ConstraintExp constr, org.omg.CORBA.Any value)
	{
		this.constr = constr;
		this.value = value;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("InvalidValue");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("constr=");
		textStruct.append(constr);
		textStruct.append(","); 
		textStruct.append("value=");
		textStruct.append(value);
		textStruct.append(")");
		return textStruct.toString();
	}
}
