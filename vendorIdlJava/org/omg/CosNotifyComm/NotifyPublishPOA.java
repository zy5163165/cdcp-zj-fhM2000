package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of interface "NotifyPublish"
 *	@author JacORB IDL compiler 
 */


public abstract class NotifyPublishPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyComm.NotifyPublishOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "offer_change", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyComm/NotifyPublish:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosNotifyComm.NotifyPublish _this()
	{
		return org.omg.CosNotifyComm.NotifyPublishHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.NotifyPublish _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.NotifyPublishHelper.narrow(_this_object(orb));
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
			case 0: // offer_change
			{
			try
			{
				org.omg.CosNotification.EventType[] _arg0=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.CosNotification.EventType[] _arg1=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				offer_change(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
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
