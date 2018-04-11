package org.omg.CosTrading;


/**
 *	Generated from IDL definition of interface "Proxy"
 *	@author JacORB IDL compiler 
 */

public class _ProxyStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTrading.Proxy
{
	private String[] ids = {"IDL:omg.org/CosTrading/Proxy:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTrading.ProxyOperations.class;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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

	public void withdraw_proxy(java.lang.String id) throws org.omg.CosTrading.ProxyPackage.NotProxyOfferId,org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.UnknownOfferId
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "withdraw_proxy", true);
				org.omg.CosTrading.OfferIdHelper.write(_os,id);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Proxy/NotProxyOfferId:1.0"))
				{
					throw org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalOfferId:1.0"))
				{
					throw org.omg.CosTrading.IllegalOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/UnknownOfferId:1.0"))
				{
					throw org.omg.CosTrading.UnknownOfferIdHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "withdraw_proxy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProxyOperations _localServant = (ProxyOperations)_so.servant;
			try
			{
			_localServant.withdraw_proxy(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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

	public org.omg.CosTrading.ProxyPackage.ProxyInfo describe_proxy(java.lang.String id) throws org.omg.CosTrading.ProxyPackage.NotProxyOfferId,org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.UnknownOfferId
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "describe_proxy", true);
				org.omg.CosTrading.OfferIdHelper.write(_os,id);
				_is = _invoke(_os);
				org.omg.CosTrading.ProxyPackage.ProxyInfo _result = org.omg.CosTrading.ProxyPackage.ProxyInfoHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Proxy/NotProxyOfferId:1.0"))
				{
					throw org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalOfferId:1.0"))
				{
					throw org.omg.CosTrading.IllegalOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/UnknownOfferId:1.0"))
				{
					throw org.omg.CosTrading.UnknownOfferIdHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "describe_proxy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProxyOperations _localServant = (ProxyOperations)_so.servant;
			org.omg.CosTrading.ProxyPackage.ProxyInfo _result;			try
			{
			_result = _localServant.describe_proxy(id);
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
		ProxyOperations _localServant = (ProxyOperations)_so.servant;
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

	public java.lang.String export_proxy(org.omg.CosTrading.Lookup target, java.lang.String type, org.omg.CosTrading.Property[] properties, boolean if_match_all, java.lang.String recipe, org.omg.CosTrading.Policy[] policies_to_pass_on) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.MissingMandatoryProperty,org.omg.CosTrading.IllegalServiceType,org.omg.CosTrading.ProxyPackage.IllegalRecipe,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.DuplicatePolicyName,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.UnknownServiceType,org.omg.CosTrading.InvalidLookupRef
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "export_proxy", true);
				org.omg.CosTrading.LookupHelper.write(_os,target);
				org.omg.CosTrading.ServiceTypeNameHelper.write(_os,type);
				org.omg.CosTrading.PropertySeqHelper.write(_os,properties);
				_os.write_boolean(if_match_all);
				org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.write(_os,recipe);
				org.omg.CosTrading.PolicySeqHelper.write(_os,policies_to_pass_on);
				_is = _invoke(_os);
				java.lang.String _result = org.omg.CosTrading.OfferIdHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/DuplicatePropertyName:1.0"))
				{
					throw org.omg.CosTrading.DuplicatePropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/MissingMandatoryProperty:1.0"))
				{
					throw org.omg.CosTrading.MissingMandatoryPropertyHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalServiceType:1.0"))
				{
					throw org.omg.CosTrading.IllegalServiceTypeHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Proxy/IllegalRecipe:1.0"))
				{
					throw org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/ReadonlyDynamicProperty:1.0"))
				{
					throw org.omg.CosTrading.ReadonlyDynamicPropertyHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/DuplicatePolicyName:1.0"))
				{
					throw org.omg.CosTrading.DuplicatePolicyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/PropertyTypeMismatch:1.0"))
				{
					throw org.omg.CosTrading.PropertyTypeMismatchHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalPropertyName:1.0"))
				{
					throw org.omg.CosTrading.IllegalPropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/UnknownServiceType:1.0"))
				{
					throw org.omg.CosTrading.UnknownServiceTypeHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/InvalidLookupRef:1.0"))
				{
					throw org.omg.CosTrading.InvalidLookupRefHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "export_proxy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProxyOperations _localServant = (ProxyOperations)_so.servant;
			java.lang.String _result;			try
			{
			_result = _localServant.export_proxy(target,type,properties,if_match_all,recipe,policies_to_pass_on);
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
