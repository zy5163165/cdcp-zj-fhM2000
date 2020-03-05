package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "EventHeader"
 *	@author JacORB IDL compiler 
 */

public final class EventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	public EventHeader(){}
	public org.omg.CosNotification.FixedEventHeader fixed_header;
	public org.omg.CosNotification.Property[] variable_header;
	public EventHeader(org.omg.CosNotification.FixedEventHeader fixed_header, org.omg.CosNotification.Property[] variable_header)
	{
		this.fixed_header = fixed_header;
		this.variable_header = variable_header;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EventHeader");
		textStruct.append("(");
		textStruct.append("fixed_header=");
		textStruct.append(fixed_header);
		textStruct.append(","); 
		textStruct.append("variable_header=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <variable_header.length; mem1++){
			textStruct.append(variable_header[mem1]);
			if(mem1 < variable_header.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
