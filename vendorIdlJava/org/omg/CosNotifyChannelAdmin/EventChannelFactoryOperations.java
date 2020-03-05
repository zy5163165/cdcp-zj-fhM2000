package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "EventChannelFactory"
 *	@author JacORB IDL compiler 
 */


public interface EventChannelFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotifyChannelAdmin.EventChannel create_channel(org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS;
	int[] get_all_channels();
	org.omg.CosNotifyChannelAdmin.EventChannel get_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound;
}
