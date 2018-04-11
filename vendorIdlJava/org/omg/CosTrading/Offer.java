package org.omg.CosTrading;

/**
 *	Generated from IDL definition of struct "Offer"
 *	@author JacORB IDL compiler 
 */

public final class Offer
	implements org.omg.CORBA.portable.IDLEntity
{
	public Offer(){}
	public org.omg.CORBA.Object reference;
	public org.omg.CosTrading.Property[] properties;
	public Offer(org.omg.CORBA.Object reference, org.omg.CosTrading.Property[] properties)
	{
		this.reference = reference;
		this.properties = properties;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Offer");
		textStruct.append("(");
		textStruct.append("reference=");
		textStruct.append(reference);
		textStruct.append(","); 
		textStruct.append("properties=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <properties.length; mem1++){
			textStruct.append(properties[mem1]);
			if(mem1 < properties.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
