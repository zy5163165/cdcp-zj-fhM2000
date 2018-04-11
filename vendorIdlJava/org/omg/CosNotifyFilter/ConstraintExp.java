package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "ConstraintExp"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintExp
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConstraintExp(){}
	public org.omg.CosNotification.EventType[] event_types;
	public java.lang.String constraint_expr = "";
	public ConstraintExp(org.omg.CosNotification.EventType[] event_types, java.lang.String constraint_expr)
	{
		this.event_types = event_types;
		this.constraint_expr = constraint_expr;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ConstraintExp");
		textStruct.append("(");
		textStruct.append("event_types=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <event_types.length; mem0++){
			textStruct.append(event_types[mem0]);
			if(mem0 < event_types.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("constraint_expr=");
		textStruct.append(constraint_expr);
		textStruct.append(")");
		return textStruct.toString();
	}
}
