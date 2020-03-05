package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxyPullConsumer"
 *	@author JacORB IDL compiler 
 */


public interface ProxyPullConsumerOperations
	extends org.omg.CosEventComm.PullConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_pull_supplier(org.omg.CosEventComm.PullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
}
