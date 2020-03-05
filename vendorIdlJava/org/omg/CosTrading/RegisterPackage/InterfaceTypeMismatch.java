package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "InterfaceTypeMismatch"
 *	@author JacORB IDL compiler 
 */

public final class InterfaceTypeMismatch
	extends org.omg.CORBA.UserException
{
	public InterfaceTypeMismatch()
	{
		super(org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatchHelper.id());
	}

	public java.lang.String type;
	public org.omg.CORBA.Object reference;
	public InterfaceTypeMismatch(java.lang.String _reason,java.lang.String type, org.omg.CORBA.Object reference)
	{
		super(org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatchHelper.id()+""+_reason );
		this.type = type;
		this.reference = reference;
	}
	public InterfaceTypeMismatch(java.lang.String type, org.omg.CORBA.Object reference)
	{
		this.type = type;
		this.reference = reference;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("InterfaceTypeMismatch");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("type=");
		textStruct.append(type);
		textStruct.append(","); 
		textStruct.append("reference=");
		textStruct.append(reference);
		textStruct.append(")");
		return textStruct.toString();
	}
}
