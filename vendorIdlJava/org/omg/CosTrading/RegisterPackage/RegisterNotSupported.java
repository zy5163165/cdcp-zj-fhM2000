package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "RegisterNotSupported"
 *	@author JacORB IDL compiler 
 */

public final class RegisterNotSupported
	extends org.omg.CORBA.UserException
{
	public RegisterNotSupported()
	{
		super(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id());
	}

	public java.lang.String[] name;
	public RegisterNotSupported(java.lang.String _reason,java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id()+""+_reason );
		this.name = name;
	}
	public RegisterNotSupported(java.lang.String[] name)
	{
		this.name = name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("RegisterNotSupported");
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
