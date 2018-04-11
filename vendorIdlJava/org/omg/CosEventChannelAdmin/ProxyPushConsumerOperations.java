package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyPushConsumer"
 *	@author JacORB IDL compiler 
 */


public interface ProxyPushConsumerOperations
	extends org.omg.CosEventComm.PushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
