package org.omg.CosNotifyFilter;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MappingFilter"
 *	@author JacORB IDL compiler 
 */

public class MappingFilterPOATie
	extends MappingFilterPOA
{
	private MappingFilterOperations _delegate;

	private POA _poa;
	public MappingFilterPOATie(MappingFilterOperations delegate)
	{
		_delegate = delegate;
	}
	public MappingFilterPOATie(MappingFilterOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyFilter.MappingFilter _this()
	{
		return org.omg.CosNotifyFilter.MappingFilterHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyFilter.MappingFilter _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyFilter.MappingFilterHelper.narrow(_this_object(orb));
	}
	public MappingFilterOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MappingFilterOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CosNotifyFilter.MappingConstraintInfo[] add_mapping_constraints(org.omg.CosNotifyFilter.MappingConstraintPair[] pair_list) throws org.omg.CosNotifyFilter.InvalidValue,org.omg.CosNotifyFilter.InvalidConstraint
	{
		return _delegate.add_mapping_constraints(pair_list);
	}

	public boolean match_typed(org.omg.CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match_typed(filterable_data,result_to_set);
	}

	public java.lang.String constraint_grammar()
	{
		return _delegate.constraint_grammar();
	}

	public void modify_mapping_constraints(int[] del_list, org.omg.CosNotifyFilter.MappingConstraintInfo[] modify_list) throws org.omg.CosNotifyFilter.ConstraintNotFound,org.omg.CosNotifyFilter.InvalidValue,org.omg.CosNotifyFilter.InvalidConstraint
	{
_delegate.modify_mapping_constraints(del_list,modify_list);
	}

	public org.omg.CORBA.TypeCode value_type()
	{
		return _delegate.value_type();
	}

	public org.omg.CORBA.Any default_value()
	{
		return _delegate.default_value();
	}

	public void remove_all_mapping_constraints()
	{
_delegate.remove_all_mapping_constraints();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CosNotifyFilter.MappingConstraintInfo[] get_mapping_constraints(int[] id_list) throws org.omg.CosNotifyFilter.ConstraintNotFound
	{
		return _delegate.get_mapping_constraints(id_list);
	}

	public boolean match_structured(org.omg.CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match_structured(filterable_data,result_to_set);
	}

	public org.omg.CosNotifyFilter.MappingConstraintInfo[] get_all_mapping_constraints()
	{
		return _delegate.get_all_mapping_constraints();
	}

	public boolean match(org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws org.omg.CosNotifyFilter.UnsupportedFilterableData
	{
		return _delegate.match(filterable_data,result_to_set);
	}

}
