package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "Link"
 *	@author JacORB IDL compiler 
 */

public class LinkPOATie
	extends LinkPOA
{
	private LinkOperations _delegate;

	private POA _poa;
	public LinkPOATie(LinkOperations delegate)
	{
		_delegate = delegate;
	}
	public LinkPOATie(LinkOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.Link _this()
	{
		return org.omg.CosTrading.LinkHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.Link _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.LinkHelper.narrow(_this_object(orb));
	}
	public LinkOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LinkOperations delegate)
	{
		_delegate = delegate;
	}
	public java.lang.String[] list_links()
	{
		return _delegate.list_links();
	}

	public org.omg.CosTrading.Admin admin_if()
	{
		return _delegate.admin_if();
	}

	public org.omg.CORBA.Object type_repos()
	{
		return _delegate.type_repos();
	}

	public boolean supports_proxy_offers()
	{
		return _delegate.supports_proxy_offers();
	}

	public org.omg.CosTrading.Link link_if()
	{
		return _delegate.link_if();
	}

	public void modify_link(java.lang.String name, org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive,org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive,org.omg.CosTrading.LinkPackage.UnknownLinkName
	{
_delegate.modify_link(name,def_pass_on_follow_rule,limiting_follow_rule);
	}

	public boolean supports_modifiable_properties()
	{
		return _delegate.supports_modifiable_properties();
	}

	public void remove_link(java.lang.String name) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.UnknownLinkName
	{
_delegate.remove_link(name);
	}

	public org.omg.CosTrading.LinkPackage.LinkInfo describe_link(java.lang.String name) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.UnknownLinkName
	{
		return _delegate.describe_link(name);
	}

	public org.omg.CosTrading.FollowOption max_link_follow_policy()
	{
		return _delegate.max_link_follow_policy();
	}

	public org.omg.CosTrading.Proxy proxy_if()
	{
		return _delegate.proxy_if();
	}

	public org.omg.CosTrading.Register register_if()
	{
		return _delegate.register_if();
	}

	public org.omg.CosTrading.Lookup lookup_if()
	{
		return _delegate.lookup_if();
	}

	public void add_link(java.lang.String name, org.omg.CosTrading.Lookup target, org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.InvalidLookupRef,org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive,org.omg.CosTrading.LinkPackage.DuplicateLinkName,org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive
	{
_delegate.add_link(name,target,def_pass_on_follow_rule,limiting_follow_rule);
	}

	public boolean supports_dynamic_properties()
	{
		return _delegate.supports_dynamic_properties();
	}

}
