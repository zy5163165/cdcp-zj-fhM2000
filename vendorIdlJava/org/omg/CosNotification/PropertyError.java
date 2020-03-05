package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "PropertyError"
 *	@author JacORB IDL compiler 
 */

public final class PropertyError
	implements org.omg.CORBA.portable.IDLEntity
{
	public PropertyError(){}
	public org.omg.CosNotification.QoSError_code code;
	public java.lang.String name;
	public org.omg.CosNotification.PropertyRange available_range;
	public PropertyError(org.omg.CosNotification.QoSError_code code, java.lang.String name, org.omg.CosNotification.PropertyRange available_range)
	{
		this.code = code;
		this.name = name;
		this.available_range = available_range;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PropertyError");
		textStruct.append("(");
		textStruct.append("code=");
		textStruct.append(code);
		textStruct.append(","); 
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(","); 
		textStruct.append("available_range=");
		textStruct.append(available_range);
		textStruct.append(")");
		return textStruct.toString();
	}
}
