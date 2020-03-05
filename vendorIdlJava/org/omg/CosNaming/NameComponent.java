package org.omg.CosNaming;

/**
 *	Generated from IDL definition of struct "NameComponent"
 *	@author JacORB IDL compiler 
 */

public final class NameComponent
	implements org.omg.CORBA.portable.IDLEntity
{
	public NameComponent(){}
	public java.lang.String id;
	public java.lang.String kind;
	public NameComponent(java.lang.String id, java.lang.String kind)
	{
		this.id = id;
		this.kind = kind;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NameComponent");
		textStruct.append("(");
		textStruct.append("id=");
		textStruct.append(id);
		textStruct.append(","); 
		textStruct.append("kind=");
		textStruct.append(kind);
		textStruct.append(")");
		return textStruct.toString();
	}
}
