package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of interface "FilterFactory"
 *	@author JacORB IDL compiler 
 */


public interface FilterFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotifyFilter.Filter create_filter(java.lang.String constraint_grammar) throws org.omg.CosNotifyFilter.InvalidGrammar;
	org.omg.CosNotifyFilter.MappingFilter create_mapping_filter(java.lang.String constraint_grammar, org.omg.CORBA.Any default_value) throws org.omg.CosNotifyFilter.InvalidGrammar;
}
