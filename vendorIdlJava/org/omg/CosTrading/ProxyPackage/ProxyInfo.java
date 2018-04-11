package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of struct "ProxyInfo"
 *	@author JacORB IDL compiler 
 */

public final class ProxyInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProxyInfo(){}
	public java.lang.String type;
	public org.omg.CosTrading.Lookup target;
	public org.omg.CosTrading.Property[] properties;
	public boolean if_match_all;
	public java.lang.String recipe;
	public org.omg.CosTrading.Policy[] policies_to_pass_on;
	public ProxyInfo(java.lang.String type, org.omg.CosTrading.Lookup target, org.omg.CosTrading.Property[] properties, boolean if_match_all, java.lang.String recipe, org.omg.CosTrading.Policy[] policies_to_pass_on)
	{
		this.type = type;
		this.target = target;
		this.properties = properties;
		this.if_match_all = if_match_all;
		this.recipe = recipe;
		this.policies_to_pass_on = policies_to_pass_on;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ProxyInfo");
		textStruct.append("(");
		textStruct.append("type=");
		textStruct.append(type);
		textStruct.append(","); 
		textStruct.append("target=");
		textStruct.append(target);
		textStruct.append(","); 
		textStruct.append("properties=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <properties.length; mem2++){
			textStruct.append(properties[mem2]);
			if(mem2 < properties.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("if_match_all=");
		textStruct.append(if_match_all);
		textStruct.append(","); 
		textStruct.append("recipe=");
		textStruct.append(recipe);
		textStruct.append(","); 
		textStruct.append("policies_to_pass_on=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <policies_to_pass_on.length; mem5++){
			textStruct.append(policies_to_pass_on[mem5]);
			if(mem5 < policies_to_pass_on.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
