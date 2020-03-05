package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "SequenceProxyPushConsumer"
 *	@author JacORB IDL compiler 
 */


public interface SequenceProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations, org.omg.CosNotifyComm.SequencePushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_push_supplier(org.omg.CosNotifyComm.SequencePushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
