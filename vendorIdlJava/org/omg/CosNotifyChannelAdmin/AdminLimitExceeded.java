package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of exception "AdminLimitExceeded"
 *	@author JacORB IDL compiler 
 */

public final class AdminLimitExceeded
	extends org.omg.CORBA.UserException
{
	public AdminLimitExceeded()
	{
		super(org.omg.CosNotifyChannelAdmin.AdminLimitExceededHelper.id());
	}

	public org.omg.CosNotifyChannelAdmin.AdminLimit admin_property_err;
	public AdminLimitExceeded(java.lang.String _reason,org.omg.CosNotifyChannelAdmin.AdminLimit admin_property_err)
	{
		super(org.omg.CosNotifyChannelAdmin.AdminLimitExceededHelper.id()+""+_reason );
		this.admin_property_err = admin_property_err;
	}
	public AdminLimitExceeded(org.omg.CosNotifyChannelAdmin.AdminLimit admin_property_err)
	{
		this.admin_property_err = admin_property_err;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AdminLimitExceeded");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("admin_property_err=");
		textStruct.append(admin_property_err);
		textStruct.append(")");
		return textStruct.toString();
	}
}
