package org.omg.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedQoS"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedQoS
	extends org.omg.CORBA.UserException
{
	public UnsupportedQoS()
	{
		super(org.omg.CosNotification.UnsupportedQoSHelper.id());
	}

	public org.omg.CosNotification.PropertyError[] qos_err;
	public UnsupportedQoS(java.lang.String _reason,org.omg.CosNotification.PropertyError[] qos_err)
	{
		super(org.omg.CosNotification.UnsupportedQoSHelper.id()+""+_reason );
		this.qos_err = qos_err;
	}
	public UnsupportedQoS(org.omg.CosNotification.PropertyError[] qos_err)
	{
		this.qos_err = qos_err;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnsupportedQoS");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("qos_err=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <qos_err.length; mem0++){
			textStruct.append(qos_err[mem0]);
			if(mem0 < qos_err.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
