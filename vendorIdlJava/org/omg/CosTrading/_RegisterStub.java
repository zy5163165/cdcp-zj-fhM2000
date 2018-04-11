package org.omg.CosTrading;


/**
 *	Generated from IDL definition of interface "Register"
 *	@author JacORB IDL compiler 
 */

public class _RegisterStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTrading.Register
{
	private String[] ids = {"IDL:omg.org/CosTrading/Register:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTrading.RegisterOperations.class;
	public java.lang.String export(org.omg.CORBA.Object reference, java.lang.String type, org.omg.CosTrading.Property[] properties) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.MissingMandatoryProperty,org.omg.CosTrading.IllegalServiceType,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.RegisterPackage.InvalidObjectRef,org.omg.CosTrading.UnknownServiceType
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "export", true);
				_os.write_Object(reference);
				org.omg.CosTrading.ServiceTypeNameHelper.write(_os,type);
				org.omg.CosTrading.PropertySeqHelper.write(_os,properties);
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
				else if( _id.equals("IDL:omg.org/CosTrading/ReadonlyDynamicProperty:1.0"))
				{
					throw org.omg.CosTrading.ReadonlyDynamicPropertyHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/InterfaceTypeMismatch:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatchHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/PropertyTypeMismatch:1.0"))
				{
					throw org.omg.CosTrading.PropertyTypeMismatchHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalPropertyName:1.0"))
				{
					throw org.omg.CosTrading.IllegalPropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/InvalidObjectRef:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "export", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegisterOperations _localServant = (RegisterOperations)_so.servant;
			java.lang.String _result;			try
			{
			_result = _localServant.export(reference,type,properties);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void withdraw(java.lang.String id) throws org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.UnknownOfferId
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "withdraw", true);
				org.omg.CosTrading.OfferIdHelper.write(_os,id);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/IllegalOfferId:1.0"))
				{
					throw org.omg.CosTrading.IllegalOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/ProxyOfferId:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "withdraw", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegisterOperations _localServant = (RegisterOperations)_so.servant;
			try
			{
			_localServant.withdraw(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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

	public org.omg.CosTrading.RegisterPackage.OfferInfo describe(java.lang.String id) throws org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.UnknownOfferId
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "describe", true);
				org.omg.CosTrading.OfferIdHelper.write(_os,id);
				_is = _invoke(_os);
				org.omg.CosTrading.RegisterPackage.OfferInfo _result = org.omg.CosTrading.RegisterPackage.OfferInfoHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/IllegalOfferId:1.0"))
				{
					throw org.omg.CosTrading.IllegalOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/ProxyOfferId:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "describe", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegisterOperations _localServant = (RegisterOperations)_so.servant;
			org.omg.CosTrading.RegisterPackage.OfferInfo _result;			try
			{
			_result = _localServant.describe(id);
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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

	public void modify(java.lang.String id, java.lang.String[] del_list, org.omg.CosTrading.Property[] modify_list) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.NotImplemented,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.UnknownOfferId,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.RegisterPackage.ReadonlyProperty,org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.UnknownPropertyName,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.RegisterPackage.MandatoryProperty
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modify", true);
				org.omg.CosTrading.OfferIdHelper.write(_os,id);
				org.omg.CosTrading.PropertyNameSeqHelper.write(_os,del_list);
				org.omg.CosTrading.PropertySeqHelper.write(_os,modify_list);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/DuplicatePropertyName:1.0"))
				{
					throw org.omg.CosTrading.DuplicatePropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/ProxyOfferId:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/NotImplemented:1.0"))
				{
					throw org.omg.CosTrading.NotImplementedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/ReadonlyDynamicProperty:1.0"))
				{
					throw org.omg.CosTrading.ReadonlyDynamicPropertyHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/UnknownOfferId:1.0"))
				{
					throw org.omg.CosTrading.UnknownOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/PropertyTypeMismatch:1.0"))
				{
					throw org.omg.CosTrading.PropertyTypeMismatchHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/ReadonlyProperty:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalOfferId:1.0"))
				{
					throw org.omg.CosTrading.IllegalOfferIdHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/UnknownPropertyName:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalPropertyName:1.0"))
				{
					throw org.omg.CosTrading.IllegalPropertyNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/MandatoryProperty:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modify", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegisterOperations _localServant = (RegisterOperations)_so.servant;
			try
			{
			_localServant.modify(id,del_list,modify_list);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosTrading.Register resolve(java.lang.String[] name) throws org.omg.CosTrading.RegisterPackage.UnknownTraderName,org.omg.CosTrading.RegisterPackage.RegisterNotSupported,org.omg.CosTrading.RegisterPackage.IllegalTraderName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "resolve", true);
				org.omg.CosTrading.TraderNameHelper.write(_os,name);
				_is = _invoke(_os);
				org.omg.CosTrading.Register _result = org.omg.CosTrading.RegisterHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Register/UnknownTraderName:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/RegisterNotSupported:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/Register/IllegalTraderName:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "resolve", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegisterOperations _localServant = (RegisterOperations)_so.servant;
			org.omg.CosTrading.Register _result;			try
			{
			_result = _localServant.resolve(name);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void withdraw_using_constraint(java.lang.String type, java.lang.String constr) throws org.omg.CosTrading.RegisterPackage.NoMatchingOffers,org.omg.CosTrading.UnknownServiceType,org.omg.CosTrading.IllegalConstraint,org.omg.CosTrading.IllegalServiceType
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "withdraw_using_constraint", true);
				org.omg.CosTrading.ServiceTypeNameHelper.write(_os,type);
				org.omg.CosTrading.ConstraintHelper.write(_os,constr);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosTrading/Register/NoMatchingOffers:1.0"))
				{
					throw org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/UnknownServiceType:1.0"))
				{
					throw org.omg.CosTrading.UnknownServiceTypeHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalConstraint:1.0"))
				{
					throw org.omg.CosTrading.IllegalConstraintHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosTrading/IllegalServiceType:1.0"))
				{
					throw org.omg.CosTrading.IllegalServiceTypeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "withdraw_using_constraint", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegisterOperations _localServant = (RegisterOperations)_so.servant;
			try
			{
			_localServant.withdraw_using_constraint(type,constr);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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
		RegisterOperations _localServant = (RegisterOperations)_so.servant;
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
