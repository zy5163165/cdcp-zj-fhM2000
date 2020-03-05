package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "SupplierAdmin"
 *	@author JacORB IDL compiler 
 */


public interface SupplierAdminOperations
	extends org.omg.CosNotification.QoSAdminOperations, org.omg.CosNotifyComm.NotifyPublishOperations, org.omg.CosNotifyFilter.FilterAdminOperations, org.omg.CosEventChannelAdmin.SupplierAdminOperations
{
	/* constants */
	/* operations  */
	int MyID();
	org.omg.CosNotifyChannelAdmin.EventChannel MyChannel();
	org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator();
	int[] pull_consumers();
	int[] push_consumers();
	org.omg.CosNotifyChannelAdmin.ProxyConsumer get_proxy_consumer(int proxy_id) throws org.omg.CosNotifyChannelAdmin.ProxyNotFound;
	org.omg.CosNotifyChannelAdmin.ProxyConsumer obtain_notification_pull_consumer(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
	org.omg.CosNotifyChannelAdmin.ProxyConsumer obtain_notification_push_consumer(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
	void destroy();
}
