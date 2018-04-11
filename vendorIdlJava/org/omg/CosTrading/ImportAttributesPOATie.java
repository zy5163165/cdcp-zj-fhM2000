package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ImportAttributes"
 *	@author JacORB IDL compiler 
 */

public class ImportAttributesPOATie
	extends ImportAttributesPOA
{
	private ImportAttributesOperations _delegate;

	private POA _poa;
	public ImportAttributesPOATie(ImportAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public ImportAttributesPOATie(ImportAttributesOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.ImportAttributes _this()
	{
		return org.omg.CosTrading.ImportAttributesHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.ImportAttributes _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.ImportAttributesHelper.narrow(_this_object(orb));
	}
	public ImportAttributesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ImportAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public int def_hop_count()
	{
		return _delegate.def_hop_count();
	}

	public int def_match_card()
	{
		return _delegate.def_match_card();
	}

	public int max_return_card()
	{
		return _delegate.max_return_card();
	}

	public org.omg.CosTrading.FollowOption max_follow_policy()
	{
		return _delegate.max_follow_policy();
	}

	public int max_list()
	{
		return _delegate.max_list();
	}

	public org.omg.CosTrading.FollowOption def_follow_policy()
	{
		return _delegate.def_follow_policy();
	}

	public int max_hop_count()
	{
		return _delegate.max_hop_count();
	}

	public int max_match_card()
	{
		return _delegate.max_match_card();
	}

	public int def_search_card()
	{
		return _delegate.def_search_card();
	}

	public int max_search_card()
	{
		return _delegate.max_search_card();
	}

	public int def_return_card()
	{
		return _delegate.def_return_card();
	}

}
