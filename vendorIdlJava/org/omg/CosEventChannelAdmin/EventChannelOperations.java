package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "EventChannel"
 *	@author JacORB IDL compiler 
 */


public interface EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosEventChannelAdmin.ConsumerAdmin for_consumers();
	org.omg.CosEventChannelAdmin.SupplierAdmin for_suppliers();
	void destroy();
}
