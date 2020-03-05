package org.omg.CosNaming;


/**
 *	Generated from IDL definition of interface "NamingContextExt"
 *	@author JacORB IDL compiler 
 */

public class _NamingContextExtStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosNaming.NamingContextExt
{
	private String[] ids = {"IDL:omg.org/CosNaming/NamingContextExt:1.0","IDL:omg.org/CosNaming/NamingContext:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosNaming.NamingContextExtOperations.class;
	public void list(int how_many, org.omg.CosNaming.BindingListHolder bl, org.omg.CosNaming.BindingIteratorHolder bi)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "list", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				bl.value = org.omg.CosNaming.BindingListHelper.read(_is);
				bi.value = org.omg.CosNaming.BindingIteratorHelper.read(_is);
				return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "list", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			try
			{
			_localServant.list(how_many,bl,bi);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void bind(org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "bind", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				_os.write_Object(obj);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "bind", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			try
			{
			_localServant.bind(n,obj);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosNaming.NamingContext bind_new_context(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "bind_new_context", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				_is = _invoke(_os);
				org.omg.CosNaming.NamingContext _result = org.omg.CosNaming.NamingContextHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "bind_new_context", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			org.omg.CosNaming.NamingContext _result;			try
			{
			_result = _localServant.bind_new_context(n);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void rebind_context(org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "rebind_context", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				org.omg.CosNaming.NamingContextHelper.write(_os,nc);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "rebind_context", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			try
			{
			_localServant.rebind_context(n,nc);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public java.lang.String to_url(java.lang.String addr, java.lang.String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextExtPackage.InvalidAddress
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "to_url", true);
				org.omg.CosNaming.NamingContextExtPackage.AddressHelper.write(_os,addr);
				org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.write(_os,sn);
				_is = _invoke(_os);
				java.lang.String _result = org.omg.CosNaming.NamingContextExtPackage.URLStringHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContextExt/InvalidAddress:1.0"))
				{
					throw org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "to_url", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			java.lang.String _result;			try
			{
			_result = _localServant.to_url(addr,sn);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void bind_context(org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "bind_context", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				org.omg.CosNaming.NamingContextHelper.write(_os,nc);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "bind_context", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			try
			{
			_localServant.bind_context(n,nc);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void unbind(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "unbind", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "unbind", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			try
			{
			_localServant.unbind(n);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosNaming.NamingContext new_context()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "new_context", true);
				_is = _invoke(_os);
				org.omg.CosNaming.NamingContext _result = org.omg.CosNaming.NamingContextHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "new_context", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			org.omg.CosNaming.NamingContext _result;			try
			{
			_result = _localServant.new_context();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.Object resolve_str(java.lang.String n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "resolve_str", true);
				org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.write(_os,n);
				_is = _invoke(_os);
				org.omg.CORBA.Object _result = _is.read_Object();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "resolve_str", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			org.omg.CORBA.Object _result;			try
			{
			_result = _localServant.resolve_str(n);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void rebind(org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "rebind", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				_os.write_Object(obj);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "rebind", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			try
			{
			_localServant.rebind(n,obj);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "destroy", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotEmpty:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "destroy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			try
			{
			_localServant.destroy();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosNaming.NameComponent[] to_name(java.lang.String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "to_name", true);
				org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.write(_os,sn);
				_is = _invoke(_os);
				org.omg.CosNaming.NameComponent[] _result = org.omg.CosNaming.NameHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "to_name", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			org.omg.CosNaming.NameComponent[] _result;			try
			{
			_result = _localServant.to_name(sn);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CORBA.Object resolve(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "resolve", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				_is = _invoke(_os);
				org.omg.CORBA.Object _result = _is.read_Object();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			org.omg.CORBA.Object _result;			try
			{
			_result = _localServant.resolve(n);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public java.lang.String to_string(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "to_string", true);
				org.omg.CosNaming.NameHelper.write(_os,n);
				_is = _invoke(_os);
				java.lang.String _result = org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
				{
					throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "to_string", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NamingContextExtOperations _localServant = (NamingContextExtOperations)_so.servant;
			java.lang.String _result;			try
			{
			_result = _localServant.to_string(n);
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
