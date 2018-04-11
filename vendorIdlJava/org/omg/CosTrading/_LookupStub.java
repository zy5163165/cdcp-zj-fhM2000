package org.omg.CosTrading;


/**
 *	Generated from IDL definition of interface "Lookup"
 *	@author JacORB IDL compiler 
 */

public class _LookupStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTrading.Lookup
{
	private String[] ids = {"IDL:omg.org/CosTrading/Lookup:1.0","IDL:omg.org/CosTrading/ImportAttributes:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTrading.LookupOperations.class;
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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

	public org.omg.CosTrading.FollowOption def_follow_policy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_def_follow_policy",true);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_def_follow_policy", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			org.omg.CosTrading.FollowOption _result;
		try
		{
			_result = _localServant.def_follow_policy();
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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

	public int max_list()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_list",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_list", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.max_list();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public int max_search_card()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_search_card",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_search_card", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.max_search_card();
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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

	public void query(java.lang.String type, java.lang.String constr, java.lang.String pref, org.omg.CosTrading.Policy[] policies, org.omg.CosTrading.LookupPackage.SpecifiedProps desired_props, int how_many, org.omg.CosTrading.OfferSeqHolder offers, org.omg.CosTrading.OfferIteratorHolder offer_itr, org.omg.CosTrading.PolicyNameSeqHolder limits_applied) throws org.omg.CosTrading.LookupPackage.IllegalPreference,org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.LookupPackage.InvalidPolicyValue,org.omg.CosTrading.IllegalServiceType,org.omg.CosTrading.LookupPackage.PolicyTypeMismatch,org.omg.CosTrading.IllegalConstraint,org.omg.CosTrading.LookupPackage.IllegalPolicyName,org.omg.CosTrading.DuplicatePolicyName,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.UnknownServiceType
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "query", true);
				org.omg.CosTrading.ServiceTypeNameHelper.write(_os,type);
				org.omg.CosTrading.ConstraintHelper.write(_os,constr);
				org.omg.CosTrading.LookupPackage.PreferenceHelper.write(_os,pref);
				org.omg.CosTrading.PolicySeqHelper.write(_os,policies);
				org.omg.CosTrading.LookupPackage.SpecifiedPropsHelper.write(_os,desired_props);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				offers.value = org.omg.CosTrading.OfferSeqHelper.read(_is);
				offer_itr.value = org.omg.CosTrading.OfferIteratorHelper.read(_is);
				limits_applied.value = org.omg.CosTrading.PolicyNameSeqHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Lookup/IllegalPreference:1.0"))
				{
					throw org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/DuplicatePropertyName:1.0"))
				{
					throw org.omg.CosTrading.DuplicatePropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Lookup/InvalidPolicyValue:1.0"))
				{
					throw org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalServiceType:1.0"))
				{
					throw org.omg.CosTrading.IllegalServiceTypeHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Lookup/PolicyTypeMismatch:1.0"))
				{
					throw org.omg.CosTrading.LookupPackage.PolicyTypeMismatchHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalConstraint:1.0"))
				{
					throw org.omg.CosTrading.IllegalConstraintHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Lookup/IllegalPolicyName:1.0"))
				{
					throw org.omg.CosTrading.LookupPackage.IllegalPolicyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/DuplicatePolicyName:1.0"))
				{
					throw org.omg.CosTrading.DuplicatePolicyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalPropertyName:1.0"))
				{
					throw org.omg.CosTrading.IllegalPropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/UnknownServiceType:1.0"))
				{
					throw org.omg.CosTrading.UnknownServiceTypeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "query", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LookupOperations _localServant = (LookupOperations)_so.servant;
			try
			{
			_localServant.query(type,constr,pref,policies,desired_props,how_many,offers,offer_itr,limits_applied);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public int def_search_card()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_def_search_card",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_def_search_card", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.def_search_card();
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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

	public int max_return_card()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_return_card",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_return_card", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.max_return_card();
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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

	public int max_hop_count()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_hop_count",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_hop_count", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.max_hop_count();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public int def_match_card()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_def_match_card",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_def_match_card", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.def_match_card();
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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

	public int max_match_card()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_match_card",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_match_card", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.max_match_card();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public int def_return_card()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_def_return_card",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_def_return_card", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.def_return_card();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
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
		LookupOperations _localServant = (LookupOperations)_so.servant;
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

	public int def_hop_count()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_def_hop_count",true);
				_is = _invoke(_os);
				return _is.read_ulong();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_def_hop_count", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.def_hop_count();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CosTrading.FollowOption max_follow_policy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_follow_policy",true);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_follow_policy", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LookupOperations _localServant = (LookupOperations)_so.servant;
			org.omg.CosTrading.FollowOption _result;
		try
		{
			_result = _localServant.max_follow_policy();
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
