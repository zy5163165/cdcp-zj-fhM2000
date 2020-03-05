package org.omg.CosTrading;


/**
 *	Generated from IDL definition of interface "Link"
 *	@author JacORB IDL compiler 
 */

public class _LinkStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTrading.Link
{
	private String[] ids = {"IDL:omg.org/CosTrading/Link:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:omg.org/CosTrading/LinkAttributes:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTrading.LinkOperations.class;
	public java.lang.String[] list_links()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "list_links", true);
				_is = _invoke(_os);
				java.lang.String[] _result = org.omg.CosTrading.LinkNameSeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "list_links", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LinkOperations _localServant = (LinkOperations)_so.servant;
			java.lang.String[] _result;			try
			{
			_result = _localServant.list_links();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosTrading.Admin admin_if()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_admin_if",true);
				_is = _invoke(_os);
				return org.omg.CosTrading.AdminHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_admin_if", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CosTrading.Admin _result;
		try
		{
			_result = _localServant.admin_if();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CORBA.Object type_repos()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_type_repos",true);
				_is = _invoke(_os);
				return _is.read_Object();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_type_repos", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CORBA.Object _result;
		try
		{
			_result = _localServant.type_repos();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public boolean supports_proxy_offers()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_supports_proxy_offers",true);
				_is = _invoke(_os);
				return _is.read_boolean();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_supports_proxy_offers", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			boolean _result;
		try
		{
			_result = _localServant.supports_proxy_offers();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CosTrading.Link link_if()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_link_if",true);
				_is = _invoke(_os);
				return org.omg.CosTrading.LinkHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_link_if", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CosTrading.Link _result;
		try
		{
			_result = _localServant.link_if();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void modify_link(java.lang.String name, org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive,org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive,org.omg.CosTrading.LinkPackage.UnknownLinkName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modify_link", true);
				org.omg.CosTrading.LinkNameHelper.write(_os,name);
				org.omg.CosTrading.FollowOptionHelper.write(_os,def_pass_on_follow_rule);
				org.omg.CosTrading.FollowOptionHelper.write(_os,limiting_follow_rule);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Link/IllegalLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/LimitingFollowTooPermissive:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/DefaultFollowTooPermissive:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/UnknownLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modify_link", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LinkOperations _localServant = (LinkOperations)_so.servant;
			try
			{
			_localServant.modify_link(name,def_pass_on_follow_rule,limiting_follow_rule);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean supports_modifiable_properties()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_supports_modifiable_properties",true);
				_is = _invoke(_os);
				return _is.read_boolean();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_supports_modifiable_properties", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			boolean _result;
		try
		{
			_result = _localServant.supports_modifiable_properties();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void remove_link(java.lang.String name) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.UnknownLinkName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "remove_link", true);
				org.omg.CosTrading.LinkNameHelper.write(_os,name);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Link/IllegalLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/UnknownLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_link", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LinkOperations _localServant = (LinkOperations)_so.servant;
			try
			{
			_localServant.remove_link(name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosTrading.LinkPackage.LinkInfo describe_link(java.lang.String name) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.UnknownLinkName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "describe_link", true);
				org.omg.CosTrading.LinkNameHelper.write(_os,name);
				_is = _invoke(_os);
				org.omg.CosTrading.LinkPackage.LinkInfo _result = org.omg.CosTrading.LinkPackage.LinkInfoHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Link/IllegalLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/UnknownLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "describe_link", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CosTrading.LinkPackage.LinkInfo _result;			try
			{
			_result = _localServant.describe_link(name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosTrading.FollowOption max_link_follow_policy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_link_follow_policy",true);
				_is = _invoke(_os);
				return org.omg.CosTrading.FollowOptionHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_link_follow_policy", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CosTrading.FollowOption _result;
		try
		{
			_result = _localServant.max_link_follow_policy();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CosTrading.Proxy proxy_if()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_proxy_if",true);
				_is = _invoke(_os);
				return org.omg.CosTrading.ProxyHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_proxy_if", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CosTrading.Proxy _result;
		try
		{
			_result = _localServant.proxy_if();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CosTrading.Register register_if()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_register_if",true);
				_is = _invoke(_os);
				return org.omg.CosTrading.RegisterHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_register_if", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CosTrading.Register _result;
		try
		{
			_result = _localServant.register_if();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CosTrading.Lookup lookup_if()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_lookup_if",true);
				_is = _invoke(_os);
				return org.omg.CosTrading.LookupHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_lookup_if", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			org.omg.CosTrading.Lookup _result;
		try
		{
			_result = _localServant.lookup_if();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void add_link(java.lang.String name, org.omg.CosTrading.Lookup target, org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.InvalidLookupRef,org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive,org.omg.CosTrading.LinkPackage.DuplicateLinkName,org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "add_link", true);
				org.omg.CosTrading.LinkNameHelper.write(_os,name);
				org.omg.CosTrading.LookupHelper.write(_os,target);
				org.omg.CosTrading.FollowOptionHelper.write(_os,def_pass_on_follow_rule);
				org.omg.CosTrading.FollowOptionHelper.write(_os,limiting_follow_rule);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Link/IllegalLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/InvalidLookupRef:1.0"))
				{
					throw org.omg.CosTrading.InvalidLookupRefHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/LimitingFollowTooPermissive:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/DuplicateLinkName:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Link/DefaultFollowTooPermissive:1.0"))
				{
					throw org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_link", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LinkOperations _localServant = (LinkOperations)_so.servant;
			try
			{
			_localServant.add_link(name,target,def_pass_on_follow_rule,limiting_follow_rule);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public boolean supports_dynamic_properties()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_supports_dynamic_properties",true);
				_is = _invoke(_os);
				return _is.read_boolean();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_supports_dynamic_properties", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkOperations _localServant = (LinkOperations)_so.servant;
			boolean _result;
		try
		{
			_result = _localServant.supports_dynamic_properties();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

}
