package org.omg.CosTrading;


/**
 *	Generated from IDL definition of interface "SupportAttributes"
 *	@author JacORB IDL compiler 
 */

public class _SupportAttributesStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTrading.SupportAttributes
{
	private String[] ids = {"IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTrading.SupportAttributesOperations.class;
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
		SupportAttributesOperations _localServant = (SupportAttributesOperations)_so.servant;
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
		SupportAttributesOperations _localServant = (SupportAttributesOperations)_so.servant;
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
		SupportAttributesOperations _localServant = (SupportAttributesOperations)_so.servant;
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
		SupportAttributesOperations _localServant = (SupportAttributesOperations)_so.servant;
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

}
