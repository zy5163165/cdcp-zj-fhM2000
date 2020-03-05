package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler 
 */


public interface ProxyPushSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations, org.omg.CosNotifyComm.PushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_any_push_consumer(org.omg.CosEventComm.PushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
	void suspend_connection() throws org.omg.CosNotifyChannelAdmin.NotConnected,org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive;
	void resume_connection() throws org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive,org.omg.CosNotifyChannelAdmin.NotConnected;
}
