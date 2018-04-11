package org.omg.CosNotifyChannelAdmin;


/**
 *	Generated from IDL definition of interface "EventChannelFactory"
 *	@author JacORB IDL compiler 
 */

public class _EventChannelFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosNotifyChannelAdmin.EventChannelFactory
{
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosNotifyChannelAdmin.EventChannelFactoryOperations.class;
	public org.omg.CosNotifyChannelAdmin.EventChannel create_channel(org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "create_channel", true);
				org.omg.CosNotification.QoSPropertiesHelper.write(_os,initial_qos);
				org.omg.CosNotification.AdminPropertiesHelper.write(_os,initial_admin);
				_is = _invoke(_os);
				org.omg.CosNotifyChannelAdmin.EventChannel _result = org.omg.CosNotifyChannelAdmin.EventChannelHelper.read(_is);
				id.value = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedAdmin:1.0"))
				{
					throw org.omg.CosNotification.UnsupportedAdminHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_channel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EventChannelFactoryOperations _localServant = (EventChannelFactoryOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.EventChannel _result;			try
			{
			_result = _localServant.create_channel(initial_qos,initial_admin,id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.EventChannel get_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_event_channel", true);
				_os.write_long(id);
				_is = _invoke(_os);
				org.omg.CosNotifyChannelAdmin.EventChannel _result = org.omg.CosNotifyChannelAdmin.EventChannelHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/ChannelNotFound:1.0"))
				{
					throw org.omg.CosNotifyChannelAdmin.ChannelNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_event_channel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EventChannelFactoryOperations _localServant = (EventChannelFactoryOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.EventChannel _result;			try
			{
			_result = _localServant.get_event_channel(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int[] get_all_channels()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_all_channels", true);
				_is = _invoke(_os);
				int[] _result = org.omg.CosNotifyChannelAdmin.ChannelIDSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_channels", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EventChannelFactoryOperations _localServant = (EventChannelFactoryOperations)_so.servant;
			int[] _result;			try
			{
			_result = _localServant.get_all_channels();
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
