package org.omg.CosEventChannelAdmin;


/**
 *	Generated from IDL definition of interface "SupplierAdmin"
 *	@author JacORB IDL compiler 
 */

public class _SupplierAdminStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosEventChannelAdmin.SupplierAdmin
{
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosEventChannelAdmin.SupplierAdminOperations.class;
	public org.omg.CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_push_consumer", true);
				_is = _invoke(_os);
				org.omg.CosEventChannelAdmin.ProxyPushConsumer _result = org.omg.CosEventChannelAdmin.ProxyPushConsumerHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_push_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			SupplierAdminOperations _localServant = (SupplierAdminOperations)_so.servant;
			org.omg.CosEventChannelAdmin.ProxyPushConsumer _result;			try
			{
			_result = _localServant.obtain_push_consumer();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_pull_consumer", true);
				_is = _invoke(_os);
				org.omg.CosEventChannelAdmin.ProxyPullConsumer _result = org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_pull_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			SupplierAdminOperations _localServant = (SupplierAdminOperations)_so.servant;
			org.omg.CosEventChannelAdmin.ProxyPullConsumer _result;			try
			{
			_result = _localServant.obtain_pull_consumer();
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
