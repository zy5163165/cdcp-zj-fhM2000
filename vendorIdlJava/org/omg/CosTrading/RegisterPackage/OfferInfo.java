package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of struct "OfferInfo"
 *	@author JacORB IDL compiler 
 */

public final class OfferInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public OfferInfo(){}
	public org.omg.CORBA.Object reference;
	public java.lang.String type;
	public org.omg.CosTrading.Property[] properties;
	public OfferInfo(org.omg.CORBA.Object reference, java.lang.String type, org.omg.CosTrading.Property[] properties)
	{
		this.reference = reference;
		this.type = type;
		this.properties = properties;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("OfferInfo");
		textStruct.append("(");
		textStruct.append("reference=");
		textStruct.append(reference);
		textStruct.append(","); 
		textStruct.append("type=");
		textStruct.append(type);
		textStruct.append(","); 
		textStruct.append("properties=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <properties.length; mem2++){
			textStruct.append(properties[mem2]);
			if(mem2 < properties.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
