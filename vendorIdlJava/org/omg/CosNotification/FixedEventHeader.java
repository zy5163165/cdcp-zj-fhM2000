package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "FixedEventHeader"
 *	@author JacORB IDL compiler 
 */

public final class FixedEventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	public FixedEventHeader(){}
	public org.omg.CosNotification.EventType event_type;
	public java.lang.String event_name = "";
	public FixedEventHeader(org.omg.CosNotification.EventType event_type, java.lang.String event_name)
	{
		this.event_type = event_type;
		this.event_name = event_name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FixedEventHeader");
		textStruct.append("(");
		textStruct.append("event_type=");
		textStruct.append(event_type);
		textStruct.append(","); 
		textStruct.append("event_name=");
		textStruct.append(event_name);
		textStruct.append(")");
		return textStruct.toString();
	}
}
