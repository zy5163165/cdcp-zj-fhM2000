package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "EventType"
 *	@author JacORB IDL compiler 
 */

public final class EventType
	implements org.omg.CORBA.portable.IDLEntity
{
	public EventType(){}
	public java.lang.String domain_name = "";
	public java.lang.String type_name = "";
	public EventType(java.lang.String domain_name, java.lang.String type_name)
	{
		this.domain_name = domain_name;
		this.type_name = type_name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EventType");
		textStruct.append("(");
		textStruct.append("domain_name=");
		textStruct.append(domain_name);
		textStruct.append(","); 
		textStruct.append("type_name=");
		textStruct.append(type_name);
		textStruct.append(")");
		return textStruct.toString();
	}
}
