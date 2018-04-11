package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "ProxyOfferId"
 *	@author JacORB IDL compiler 
 */

public final class ProxyOfferId
	extends org.omg.CORBA.UserException
{
	public ProxyOfferId()
	{
		super(org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.id());
	}

	public java.lang.String id;
	public ProxyOfferId(java.lang.String _reason,java.lang.String id)
	{
		super(org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.id()+""+_reason );
		this.id = id;
	}
	public ProxyOfferId(java.lang.String id)
	{
		this.id = id;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ProxyOfferId");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("id=");
		textStruct.append(id);
		textStruct.append(")");
		return textStruct.toString();
	}
}
