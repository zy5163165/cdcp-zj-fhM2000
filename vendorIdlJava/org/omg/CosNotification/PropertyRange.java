package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "PropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class PropertyRange
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyRange(){}
	public org.omg.CORBA.Any low_val;
	public org.omg.CORBA.Any high_val;
	public PropertyRange(org.omg.CORBA.Any low_val, org.omg.CORBA.Any high_val)
	{
		this.low_val = low_val;
		this.high_val = high_val;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PropertyRange");
		textStruct.append("(");
		textStruct.append("low_val=");
		textStruct.append(low_val);
		textStruct.append(","); 
		textStruct.append("high_val=");
		textStruct.append(high_val);
		textStruct.append(")");
		return textStruct.toString();
	}
}
