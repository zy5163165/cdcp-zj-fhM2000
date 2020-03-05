package org.omg.CosNotification;

/**
 *	Generated from IDL definition of struct "StructuredEvent"
 *	@author JacORB IDL compiler 
 */

public final class StructuredEvent
	implements org.omg.CORBA.portable.IDLEntity
{
	public StructuredEvent(){}
	public org.omg.CosNotification.EventHeader header;
	public org.omg.CosNotification.Property[] filterable_data;
	public org.omg.CORBA.Any remainder_of_body;
	public StructuredEvent(org.omg.CosNotification.EventHeader header, org.omg.CosNotification.Property[] filterable_data, org.omg.CORBA.Any remainder_of_body)
	{
		this.header = header;
		this.filterable_data = filterable_data;
		this.remainder_of_body = remainder_of_body;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("StructuredEvent");
		textStruct.append("(");
		textStruct.append("header=");
		textStruct.append(header);
		textStruct.append(","); 
		textStruct.append("filterable_data=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <filterable_data.length; mem1++){
			textStruct.append(filterable_data[mem1]);
			if(mem1 < filterable_data.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("remainder_of_body=");
		textStruct.append(remainder_of_body);
		textStruct.append(")");
		return textStruct.toString();
	}
}
