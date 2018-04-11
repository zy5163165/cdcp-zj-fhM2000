package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of exception "NotProxyOfferId"
 *	@author JacORB IDL compiler 
 */

public final class NotProxyOfferId
	extends org.omg.CORBA.UserException
{
	public NotProxyOfferId()
	{
		super(org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.id());
	}

	public java.lang.String id;
	public NotProxyOfferId(java.lang.String _reason,java.lang.String id)
	{
		super(org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.id()+""+_reason );
		this.id = id;
	}
	public NotProxyOfferId(java.lang.String id)
	{
		this.id = id;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NotProxyOfferId");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("id=");
		textStruct.append(id);
		textStruct.append(")");
		return textStruct.toString();
	}
}
