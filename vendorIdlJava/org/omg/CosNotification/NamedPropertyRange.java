package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "NamedPropertyRange"
 *	@author JacORB IDL compiler 
 */

public final class NamedPropertyRange
	implements org.omg.CORBA.portable.IDLEntity
{
	public NamedPropertyRange(){}
	public java.lang.String name;
	public org.omg.CosNotification.PropertyRange range;
	public NamedPropertyRange(java.lang.String name, org.omg.CosNotification.PropertyRange range)
	{
		this.name = name;
		this.range = range;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NamedPropertyRange");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(","); 
		textStruct.append("range=");
		textStruct.append(range);
		textStruct.append(")");
		return textStruct.toString();
	}
}
