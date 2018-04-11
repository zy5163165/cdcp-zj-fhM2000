package org.omg.CosNotification;

/**
 *	Generated from IDL definition of interface "QoSAdmin"
 *	@author JacORB IDL compiler 
 */


public abstract class QoSAdminPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotification.QoSAdminOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "validate_qos", new java.lang.Integer(0));
		m_opsHash.put ( "get_qos", new java.lang.Integer(1));
		m_opsHash.put ( "set_qos", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosNotification/QoSAdmin:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosNotification.QoSAdmin _this()
	{
		return org.omg.CosNotification.QoSAdminHelper.narrow(_this_object());
	}
	public org.omg.CosNotification.QoSAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotification.QoSAdminHelper.narrow(_this_object(orb));
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
			case 0: // validate_qos
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
			case 1: // get_qos
			{
				_out = handler.createReply();
				org.omg.CosNotification.QoSPropertiesHelper.write(_out,get_qos());
				break;
			}
			case 2: // set_qos
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
