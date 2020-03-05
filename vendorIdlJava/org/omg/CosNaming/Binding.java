package org.omg.CosNaming;

/**
 *	Generated from IDL definition of struct "Binding"
 *	@author JacORB IDL compiler 
 */

public final class Binding
	implements org.omg.CORBA.portable.IDLEntity
{
	public Binding(){}
	public org.omg.CosNaming.NameComponent[] binding_name;
	public org.omg.CosNaming.BindingType binding_type;
	public Binding(org.omg.CosNaming.NameComponent[] binding_name, org.omg.CosNaming.BindingType binding_type)
	{
		this.binding_name = binding_name;
		this.binding_type = binding_type;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Binding");
		textStruct.append("(");
		textStruct.append("binding_name=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <binding_name.length; mem0++){
			textStruct.append(binding_name[mem0]);
			if(mem0 < binding_name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("binding_type=");
		textStruct.append(binding_type);
		textStruct.append(")");
		return textStruct.toString();
	}
}
