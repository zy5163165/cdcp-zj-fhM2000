package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "EventChannelFactory"
 *	@author JacORB IDL compiler 
 */


public abstract class EventChannelFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyChannelAdmin.EventChannelFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_channel", new java.lang.Integer(0));
		m_opsHash.put ( "get_event_channel", new java.lang.Integer(1));
		m_opsHash.put ( "get_all_channels", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosNotifyChannelAdmin.EventChannelFactory _this()
	{
		return org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.EventChannelFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // create_channel
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.QoSPropertiesHelper.read(_input);
				org.omg.CosNotification.Property[] _arg1=org.omg.CosNotification.AdminPropertiesHelper.read(_input);
				org.omg.CORBA.IntHolder _arg2= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.EventChannelHelper.write(_out,create_channel(_arg0,_arg1,_arg2));
				_out.write_long(_arg2.value);
			}
			catch(org.omg.CosNotification.UnsupportedAdmin _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedAdminHelper.write(_out, _ex0);
			}
			catch(org.omg.CosNotification.UnsupportedQoS _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedQoSHelper.write(_out, _ex1);
			}
				break;
			}
			case 1: // get_event_channel
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.EventChannelHelper.write(_out,get_event_channel(_arg0));
			}
			catch(org.omg.CosNotifyChannelAdmin.ChannelNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyChannelAdmin.ChannelNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // get_all_channels
			{
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.ChannelIDSeqHelper.write(_out,get_all_channels());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
