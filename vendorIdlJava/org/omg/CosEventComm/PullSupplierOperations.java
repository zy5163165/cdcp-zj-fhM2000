package org.omg.CosEventComm;

/**
 *	Generated from IDL definition of interface "PullSupplier"
 *	@author JacORB IDL compiler 
 */


public interface PullSupplierOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any pull() throws org.omg.CosEventComm.Disconnected;
	org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected;
	void disconnect_pull_supplier();
}
