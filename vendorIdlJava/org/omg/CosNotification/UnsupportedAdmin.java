package org.omg.CosNotification;

/**
 *	Generated from IDL definition of exception "UnsupportedAdmin"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedAdmin
	extends org.omg.CORBA.UserException
{
	public UnsupportedAdmin()
	{
		super(org.omg.CosNotification.UnsupportedAdminHelper.id());
	}

	public org.omg.CosNotification.PropertyError[] admin_err;
	public UnsupportedAdmin(java.lang.String _reason,org.omg.CosNotification.PropertyError[] admin_err)
	{
		super(org.omg.CosNotification.UnsupportedAdminHelper.id()+""+_reason );
		this.admin_err = admin_err;
	}
	public UnsupportedAdmin(org.omg.CosNotification.PropertyError[] admin_err)
	{
		this.admin_err = admin_err;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnsupportedAdmin");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("admin_err=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <admin_err.length; mem0++){
			textStruct.append(admin_err[mem0]);
			if(mem0 < admin_err.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
