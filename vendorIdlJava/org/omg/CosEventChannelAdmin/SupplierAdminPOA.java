package org.omg.CosEventChannelAdmin;

/**
 *	Generated from IDL definition of interface "SupplierAdmin"
 *	@author JacORB IDL compiler 
 */


public abstract class SupplierAdminPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosEventChannelAdmin.SupplierAdminOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "obtain_push_consumer", new java.lang.Integer(0));
		m_opsHash.put ( "obtain_pull_consumer", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosEventChannelAdmin.SupplierAdmin _this()
	{
		return org.omg.CosEventChannelAdmin.SupplierAdminHelper.narrow(_this_object());
	}
	public org.omg.CosEventChannelAdmin.SupplierAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosEventChannelAdmin.SupplierAdminHelper.narrow(_this_object(orb));
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
			case 0: // obtain_push_consumer
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.ProxyPushConsumerHelper.write(_out,obtain_push_consumer());
				break;
			}
			case 1: // obtain_pull_consumer
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.ProxyPullConsumerHelper.write(_out,obtain_pull_consumer());
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
