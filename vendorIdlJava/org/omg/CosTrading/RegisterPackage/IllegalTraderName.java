package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "IllegalTraderName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalTraderName
	extends org.omg.CORBA.UserException
{
	public IllegalTraderName()
	{
		super(org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.id());
	}

	public java.lang.String[] name;
	public IllegalTraderName(java.lang.String _reason,java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.id()+""+_reason );
		this.name = name;
	}
	public IllegalTraderName(java.lang.String[] name)
	{
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("IllegalTraderName");
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
