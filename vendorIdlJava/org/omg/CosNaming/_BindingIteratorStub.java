package org.omg.CosNaming;


/**
 *	Generated from IDL definition of interface "BindingIterator"
 *	@author JacORB IDL compiler 
 */

public class _BindingIteratorStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosNaming.BindingIterator
{
	private String[] ids = {"IDL:omg.org/CosNaming/BindingIterator:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosNaming.BindingIteratorOperations.class;
	public boolean next_one(org.omg.CosNaming.BindingHolder b)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "next_one", true);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				b.value = org.omg.CosNaming.BindingHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "next_one", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BindingIteratorOperations _localServant = (BindingIteratorOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.next_one(b);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public boolean next_n(int how_many, org.omg.CosNaming.BindingListHolder bl)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "next_n", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				boolean _result = _is.read_boolean();
				bl.value = org.omg.CosNaming.BindingListHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "next_n", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BindingIteratorOperations _localServant = (BindingIteratorOperations)_so.servant;
			boolean _result;			try
			{
			_result = _localServant.next_n(how_many,bl);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void destroy()
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
			BindingIteratorOperations _localServant = (BindingIteratorOperations)_so.servant;
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

}
