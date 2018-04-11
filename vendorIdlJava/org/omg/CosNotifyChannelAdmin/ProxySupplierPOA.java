package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "ProxySupplier"
 *	@author JacORB IDL compiler 
 */


public abstract class ProxySupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyChannelAdmin.ProxySupplierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_MyType", new java.lang.Integer(0));
		m_opsHash.put ( "set_qos", new java.lang.Integer(1));
		m_opsHash.put ( "validate_event_qos", new java.lang.Integer(2));
		m_opsHash.put ( "_get_priority_filter", new java.lang.Integer(3));
		m_opsHash.put ( "_get_lifetime_filter", new java.lang.Integer(4));
		m_opsHash.put ( "_set_lifetime_filter", new java.lang.Integer(5));
		m_opsHash.put ( "add_filter", new java.lang.Integer(6));
		m_opsHash.put ( "remove_filter", new java.lang.Integer(7));
		m_opsHash.put ( "remove_all_filters", new java.lang.Integer(8));
		m_opsHash.put ( "get_all_filters", new java.lang.Integer(9));
		m_opsHash.put ( "obtain_offered_types", new java.lang.Integer(10));
		m_opsHash.put ( "_get_MyAdmin", new java.lang.Integer(11));
		m_opsHash.put ( "_set_priority_filter", new java.lang.Integer(12));
		m_opsHash.put ( "get_filter", new java.lang.Integer(13));
		m_opsHash.put ( "get_qos", new java.lang.Integer(14));
		m_opsHash.put ( "validate_qos", new java.lang.Integer(15));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/ProxySupplier:1.0","IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0"};
	public org.omg.CosNotifyChannelAdmin.ProxySupplier _this()
	{
		return org.omg.CosNotifyChannelAdmin.ProxySupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.ProxySupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.ProxySupplierHelper.narrow(_this_object(orb));
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
			case 0: // _get_MyType
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.ProxyTypeHelper.write(_out,MyType());
				break;
			}
			case 1: // set_qos
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.QoSPropertiesHelper.read(_input);
				_out = handler.createReply();
				set_qos(_arg0);
			}
			catch(org.omg.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // validate_event_qos
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.QoSPropertiesHelper.read(_input);
				org.omg.CosNotification.NamedPropertyRangeSeqHolder _arg1= new org.omg.CosNotification.NamedPropertyRangeSeqHolder();
				_out = handler.createReply();
				validate_event_qos(_arg0,_arg1);
				org.omg.CosNotification.NamedPropertyRangeSeqHelper.write(_out,_arg1.value);
			}
			catch(org.omg.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // _get_priority_filter
			{
			_out = handler.createReply();
			org.omg.CosNotifyFilter.MappingFilterHelper.write(_out,priority_filter());
				break;
			}
			case 4: // _get_lifetime_filter
			{
			_out = handler.createReply();
			org.omg.CosNotifyFilter.MappingFilterHelper.write(_out,lifetime_filter());
				break;
			}
			case 5: // _set_lifetime_filter
			{
			_out = handler.createReply();
			lifetime_filter(org.omg.CosNotifyFilter.MappingFilterHelper.read(_input));
				break;
			}
			case 6: // add_filter
			{
				org.omg.CosNotifyFilter.Filter _arg0=org.omg.CosNotifyFilter.FilterHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(add_filter(_arg0));
				break;
			}
			case 7: // remove_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				remove_filter(_arg0);
			}
			catch(org.omg.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // remove_all_filters
			{
				_out = handler.createReply();
				remove_all_filters();
				break;
			}
			case 9: // get_all_filters
			{
				_out = handler.createReply();
				org.omg.CosNotifyFilter.FilterIDSeqHelper.write(_out,get_all_filters());
				break;
			}
			case 10: // obtain_offered_types
			{
				org.omg.CosNotifyChannelAdmin.ObtainInfoMode _arg0=org.omg.CosNotifyChannelAdmin.ObtainInfoModeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosNotification.EventTypeSeqHelper.write(_out,obtain_offered_types(_arg0));
				break;
			}
			case 11: // _get_MyAdmin
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.write(_out,MyAdmin());
				break;
			}
			case 12: // _set_priority_filter
			{
			_out = handler.createReply();
			priority_filter(org.omg.CosNotifyFilter.MappingFilterHelper.read(_input));
				break;
			}
			case 13: // get_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.CosNotifyFilter.FilterHelper.write(_out,get_filter(_arg0));
			}
			catch(org.omg.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // get_qos
			{
				_out = handler.createReply();
				org.omg.CosNotification.QoSPropertiesHelper.write(_out,get_qos());
				break;
			}
			case 15: // validate_qos
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.QoSPropertiesHelper.read(_input);
				org.omg.CosNotification.NamedPropertyRangeSeqHolder _arg1= new org.omg.CosNotification.NamedPropertyRangeSeqHolder();
				_out = handler.createReply();
				validate_qos(_arg0,_arg1);
				org.omg.CosNotification.NamedPropertyRangeSeqHelper.write(_out,_arg1.value);
			}
			catch(org.omg.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
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
