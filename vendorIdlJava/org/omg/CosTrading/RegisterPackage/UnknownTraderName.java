package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "UnknownTraderName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownTraderName
	extends org.omg.CORBA.UserException
{
	public UnknownTraderName()
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id());
	}

	public java.lang.String[] name;
	public UnknownTraderName(java.lang.String _reason,java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id()+""+_reason );
		this.name = name;
	}
	public UnknownTraderName(java.lang.String[] name)
	{
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnknownTraderName");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("name=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <name.length; mem0++){
			textStruct.append(name[mem0]);
			if(mem0 < name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
