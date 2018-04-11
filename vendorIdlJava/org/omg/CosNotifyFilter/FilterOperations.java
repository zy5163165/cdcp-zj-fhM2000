package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of interface "Filter"
 *	@author JacORB IDL compiler 
 */


public interface FilterOperations
{
	/* constants */
	/* operations  */
	java.lang.String constraint_grammar();
	org.omg.CosNotifyFilter.ConstraintInfo[] add_constraints(org.omg.CosNotifyFilter.ConstraintExp[] constraint_list) throws org.omg.CosNotifyFilter.InvalidConstraint;
	void modify_constraints(int[] del_list, org.omg.CosNotifyFilter.ConstraintInfo[] modify_list) throws org.omg.CosNotifyFilter.ConstraintNotFound,org.omg.CosNotifyFilter.InvalidConstraint;
	org.omg.CosNotifyFilter.ConstraintInfo[] get_constraints(int[] id_list) throws org.omg.CosNotifyFilter.ConstraintNotFound;
	org.omg.CosNotifyFilter.ConstraintInfo[] get_all_constraints();
	void remove_all_constraints();
	void destroy();
	boolean match(org.omg.CORBA.Any filterable_data) throws org.omg.CosNotifyFilter.UnsupportedFilterableData;
	boolean match_structured(org.omg.CosNotification.StructuredEvent filterable_data) throws org.omg.CosNotifyFilter.UnsupportedFilterableData;
	boolean match_typed(org.omg.CosNotification.Property[] filterable_data) throws org.omg.CosNotifyFilter.UnsupportedFilterableData;
	int attach_callback(org.omg.CosNotifyComm.NotifySubscribe callback);
	void detach_callback(int callback) throws org.omg.CosNotifyFilter.CallbackNotFound;
	int[] get_callbacks();
}
