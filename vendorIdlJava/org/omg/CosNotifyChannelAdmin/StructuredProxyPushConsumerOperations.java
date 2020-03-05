package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "StructuredProxyPushConsumer"
 *	@author JacORB IDL compiler 
 */


public interface StructuredProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations, org.omg.CosNotifyComm.StructuredPushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_structured_push_supplier(org.omg.CosNotifyComm.StructuredPushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
