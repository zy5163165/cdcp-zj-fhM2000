package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "Admin"
 *	@author JacORB IDL compiler 
 */

public class AdminPOATie
	extends AdminPOA
{
	private AdminOperations _delegate;

	private POA _poa;
	public AdminPOATie(AdminOperations delegate)
	{
		_delegate = delegate;
	}
	public AdminPOATie(AdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.Admin _this()
	{
		return org.omg.CosTrading.AdminHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.Admin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.AdminHelper.narrow(_this_object(orb));
	}
	public AdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AdminOperations delegate)
	{
		_delegate = delegate;
	}
	public int set_max_match_card(int value)
	{
		return _delegate.set_max_match_card(value);
	}

	public boolean supports_proxy_offers()
	{
		return _delegate.supports_proxy_offers();
	}

	public org.omg.CosTrading.Proxy proxy_if()
	{
		return _delegate.proxy_if();
	}

	public org.omg.CosTrading.Register register_if()
	{
		return _delegate.register_if();
	}

	public int max_hop_count()
	{
		return _delegate.max_hop_count();
	}

	public org.omg.CosTrading.FollowOption set_max_link_follow_policy(org.omg.CosTrading.FollowOption policy)
	{
		return _delegate.set_max_link_follow_policy(policy);
	}

	public org.omg.CosTrading.Admin admin_if()
	{
		return _delegate.admin_if();
	}

	public int max_match_card()
	{
		return _delegate.max_match_card();
	}

	public int set_max_list(int value)
	{
		return _delegate.set_max_list(value);
	}

	public byte[] request_id_stem()
	{
		return _delegate.request_id_stem();
	}

	public int set_def_search_card(int value)
	{
		return _delegate.set_def_search_card(value);
	}

	public int set_def_hop_count(int value)
	{
		return _delegate.set_def_hop_count(value);
	}

	public org.omg.CosTrading.FollowOption max_follow_policy()
	{
		return _delegate.max_follow_policy();
	}

	public boolean set_supports_dynamic_properties(boolean value)
	{
		return _delegate.set_supports_dynamic_properties(value);
	}

	public int set_max_hop_count(int value)
	{
		return _delegate.set_max_hop_count(value);
	}

	public int set_def_match_card(int value)
	{
		return _delegate.set_def_match_card(value);
	}

	public boolean set_supports_modifiable_properties(boolean value)
	{
		return _delegate.set_supports_modifiable_properties(value);
	}

	public int def_search_card()
	{
		return _delegate.def_search_card();
	}

	public org.omg.CosTrading.FollowOption set_def_follow_policy(org.omg.CosTrading.FollowOption policy)
	{
		return _delegate.set_def_follow_policy(policy);
	}

	public org.omg.CosTrading.FollowOption set_max_follow_policy(org.omg.CosTrading.FollowOption policy)
	{
		return _delegate.set_max_follow_policy(policy);
	}

	public int def_return_card()
	{
		return _delegate.def_return_card();
	}

	public int set_max_return_card(int value)
	{
		return _delegate.set_max_return_card(value);
	}

	public org.omg.CosTrading.Link link_if()
	{
		return _delegate.link_if();
	}

	public org.omg.CosTrading.FollowOption max_link_follow_policy()
	{
		return _delegate.max_link_follow_policy();
	}

	public org.omg.CORBA.Object set_type_repos(org.omg.CORBA.Object repository)
	{
		return _delegate.set_type_repos(repository);
	}

	public org.omg.CORBA.Object type_repos()
	{
		return _delegate.type_repos();
	}

	public int max_search_card()
	{
		return _delegate.max_search_card();
	}

	public byte[] set_request_id_stem(byte[] stem)
	{
		return _delegate.set_request_id_stem(stem);
	}

	public void list_proxies(int how_many, org.omg.CosTrading.OfferIdSeqHolder ids, org.omg.CosTrading.OfferIdIteratorHolder id_itr) throws org.omg.CosTrading.NotImplemented
	{
_delegate.list_proxies(how_many,ids,id_itr);
	}

	public org.omg.CosTrading.FollowOption def_follow_policy()
	{
		return _delegate.def_follow_policy();
	}

	public org.omg.CosTrading.Lookup lookup_if()
	{
		return _delegate.lookup_if();
	}

	public void list_offers(int how_many, org.omg.CosTrading.OfferIdSeqHolder ids, org.omg.CosTrading.OfferIdIteratorHolder id_itr) throws org.omg.CosTrading.NotImplemented
	{
_delegate.list_offers(how_many,ids,id_itr);
	}

	public boolean supports_dynamic_properties()
	{
		return _delegate.supports_dynamic_properties();
	}

	public int max_return_card()
	{
		return _delegate.max_return_card();
	}

	public int set_max_search_card(int value)
	{
		return _delegate.set_max_search_card(value);
	}

	public boolean set_supports_proxy_offers(boolean value)
	{
		return _delegate.set_supports_proxy_offers(value);
	}

	public boolean supports_modifiable_properties()
	{
		return _delegate.supports_modifiable_properties();
	}

	public int def_match_card()
	{
		return _delegate.def_match_card();
	}

	public int max_list()
	{
		return _delegate.max_list();
	}

	public int def_hop_count()
	{
		return _delegate.def_hop_count();
	}

	public int set_def_return_card(int value)
	{
		return _delegate.set_def_return_card(value);
	}

}
