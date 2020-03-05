package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "UnknownOfferId"
 *	@author JacORB IDL compiler 
 */

public final class UnknownOfferId
	extends org.omg.CORBA.UserException
{
	public UnknownOfferId()
	{
		super(org.omg.CosTrading.UnknownOfferIdHelper.id());
	}

	public java.lang.String id;
	public UnknownOfferId(java.lang.String _reason,java.lang.String id)
	{
		super(org.omg.CosTrading.UnknownOfferIdHelper.id()+""+_reason );
		this.id = id;
	}
	public UnknownOfferId(java.lang.String id)
	{
		this.id = id;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnknownOfferId");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("id=");
		textStruct.append(id);
		textStruct.append(")");
		return textStruct.toString();
	}
}
