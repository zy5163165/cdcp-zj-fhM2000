package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "EventChannel"
 *	@author JacORB IDL compiler 
 */


public interface EventChannelOperations
	extends org.omg.CosNotification.QoSAdminOperations, org.omg.CosNotification.AdminPropertiesAdminOperations, org.omg.CosEventChannelAdmin.EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotifyChannelAdmin.EventChannelFactory MyFactory();
	org.omg.CosNotifyChannelAdmin.ConsumerAdmin default_consumer_admin();
	org.omg.CosNotifyChannelAdmin.SupplierAdmin default_supplier_admin();
	org.omg.CosNotifyFilter.FilterFactory default_filter_factory();
	org.omg.CosNotifyChannelAdmin.ConsumerAdmin new_for_consumers(org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id);
	org.omg.CosNotifyChannelAdmin.SupplierAdmin new_for_suppliers(org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id);
	org.omg.CosNotifyChannelAdmin.ConsumerAdmin get_consumeradmin(int id) throws org.omg.CosNotifyChannelAdmin.AdminNotFound;
	org.omg.CosNotifyChannelAdmin.SupplierAdmin get_supplieradmin(int id) throws org.omg.CosNotifyChannelAdmin.AdminNotFound;
	int[] get_all_consumeradmins();
	int[] get_all_supplieradmins();
}
