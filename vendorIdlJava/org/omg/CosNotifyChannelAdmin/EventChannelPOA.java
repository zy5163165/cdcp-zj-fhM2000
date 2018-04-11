package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL definition of interface "EventChannel"
 *	@author JacORB IDL compiler 
 */


public abstract class EventChannelPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyChannelAdmin.EventChannelOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "for_consumers", new java.lang.Integer(0));
		m_opsHash.put ( "get_all_consumeradmins", new java.lang.Integer(1));
		m_opsHash.put ( "get_all_supplieradmins", new java.lang.Integer(2));
		m_opsHash.put ( "get_qos", new java.lang.Integer(3));
		m_opsHash.put ( "_get_MyFactory", new java.lang.Integer(4));
		m_opsHash.put ( "_get_default_consumer_admin", new java.lang.Integer(5));
		m_opsHash.put ( "new_for_suppliers", new java.lang.Integer(6));
		m_opsHash.put ( "set_admin", new java.lang.Integer(7));
		m_opsHash.put ( "_get_default_supplier_admin", new java.lang.Integer(8));
		m_opsHash.put ( "get_supplieradmin", new java.lang.Integer(9));
		m_opsHash.put ( "for_suppliers", new java.lang.Integer(10));
		m_opsHash.put ( "set_qos", new java.lang.Integer(11));
		m_opsHash.put ( "_get_default_filter_factory", new java.lang.Integer(12));
		m_opsHash.put ( "new_for_consumers", new java.lang.Integer(13));
		m_opsHash.put ( "get_admin", new java.lang.Integer(14));
		m_opsHash.put ( "validate_qos", new java.lang.Integer(15));
		m_opsHash.put ( "get_consumeradmin", new java.lang.Integer(16));
		m_opsHash.put ( "destroy", new java.lang.Integer(17));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/EventChannel:1.0","IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0","IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0"};
	public org.omg.CosNotifyChannelAdmin.EventChannel _this()
	{
		return org.omg.CosNotifyChannelAdmin.EventChannelHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyChannelAdmin.EventChannel _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyChannelAdmin.EventChannelHelper.narrow(_this_object(orb));
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
			case 0: // for_consumers
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.ConsumerAdminHelper.write(_out,for_consumers());
				break;
			}
			case 1: // get_all_consumeradmins
			{
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.AdminIDSeqHelper.write(_out,get_all_consumeradmins());
				break;
			}
			case 2: // get_all_supplieradmins
			{
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.AdminIDSeqHelper.write(_out,get_all_supplieradmins());
				break;
			}
			case 3: // get_qos
			{
				_out = handler.createReply();
				org.omg.CosNotification.QoSPropertiesHelper.write(_out,get_qos());
				break;
			}
			case 4: // _get_MyFactory
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.write(_out,MyFactory());
				break;
			}
			case 5: // _get_default_consumer_admin
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.write(_out,default_consumer_admin());
				break;
			}
			case 6: // new_for_suppliers
			{
				org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator _arg0=org.omg.CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.SupplierAdminHelper.write(_out,new_for_suppliers(_arg0,_arg1));
				_out.write_long(_arg1.value);
				break;
			}
			case 7: // set_admin
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.AdminPropertiesHelper.read(_input);
				_out = handler.createReply();
				set_admin(_arg0);
			}
			catch(org.omg.CosNotification.UnsupportedAdmin _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotification.UnsupportedAdminHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // _get_default_supplier_admin
			{
			_out = handler.createReply();
			org.omg.CosNotifyChannelAdmin.SupplierAdminHelper.write(_out,default_supplier_admin());
				break;
			}
			case 9: // get_supplieradmin
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.SupplierAdminHelper.write(_out,get_supplieradmin(_arg0));
			}
			catch(org.omg.CosNotifyChannelAdmin.AdminNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyChannelAdmin.AdminNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // for_suppliers
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.SupplierAdminHelper.write(_out,for_suppliers());
				break;
			}
			case 11: // set_qos
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
			case 12: // _get_default_filter_factory
			{
			_out = handler.createReply();
			org.omg.CosNotifyFilter.FilterFactoryHelper.write(_out,default_filter_factory());
				break;
			}
			case 13: // new_for_consumers
			{
				org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator _arg0=org.omg.CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.write(_out,new_for_consumers(_arg0,_arg1));
				_out.write_long(_arg1.value);
				break;
			}
			case 14: // get_admin
			{
				_out = handler.createReply();
				org.omg.CosNotification.AdminPropertiesHelper.write(_out,get_admin());
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
			case 16: // get_consumeradmin
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.write(_out,get_consumeradmin(_arg0));
			}
			catch(org.omg.CosNotifyChannelAdmin.AdminNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyChannelAdmin.AdminNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // destroy
			{
				_out = handler.createReply();
				destroy();
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
