package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Admin"
 *	@author JacORB IDL compiler 
 */


public interface AdminOperations
	extends org.omg.CosTrading.TraderComponentsOperations, org.omg.CosTrading.SupportAttributesOperations, org.omg.CosTrading.ImportAttributesOperations, org.omg.CosTrading.LinkAttributesOperations
{
	/* constants */
	/* operations  */
	byte[] request_id_stem();
	int set_def_search_card(int value);
	int set_max_search_card(int value);
	int set_def_match_card(int value);
	int set_max_match_card(int value);
	int set_def_return_card(int value);
	int set_max_return_card(int value);
	int set_max_list(int value);
	boolean set_supports_modifiable_properties(boolean value);
	boolean set_supports_dynamic_properties(boolean value);
	boolean set_supports_proxy_offers(boolean value);
	int set_def_hop_count(int value);
	int set_max_hop_count(int value);
	org.omg.CosTrading.FollowOption set_def_follow_policy(org.omg.CosTrading.FollowOption policy);
	org.omg.CosTrading.FollowOption set_max_follow_policy(org.omg.CosTrading.FollowOption policy);
	org.omg.CosTrading.FollowOption set_max_link_follow_policy(org.omg.CosTrading.FollowOption policy);
	org.omg.CORBA.Object set_type_repos(org.omg.CORBA.Object repository);
	byte[] set_request_id_stem(byte[] stem);
	void list_offers(int how_many, org.omg.CosTrading.OfferIdSeqHolder ids, org.omg.CosTrading.OfferIdIteratorHolder id_itr) throws org.omg.CosTrading.NotImplemented;
	void list_proxies(int how_many, org.omg.CosTrading.OfferIdSeqHolder ids, org.omg.CosTrading.OfferIdIteratorHolder id_itr) throws org.omg.CosTrading.NotImplemented;
}
