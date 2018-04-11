package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "TraderComponents"
 *	@author JacORB IDL compiler 
 */


public abstract class TraderComponentsPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.TraderComponentsOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_admin_if", new java.lang.Integer(0));
		m_opsHash.put ( "_get_link_if", new java.lang.Integer(1));
		m_opsHash.put ( "_get_proxy_if", new java.lang.Integer(2));
		m_opsHash.put ( "_get_register_if", new java.lang.Integer(3));
		m_opsHash.put ( "_get_lookup_if", new java.lang.Integer(4));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.TraderComponents _this()
	{
		return org.omg.CosTrading.TraderComponentsHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.TraderComponents _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.TraderComponentsHelper.narrow(_this_object(orb));
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
			case 0: // _get_admin_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.AdminHelper.write(_out,admin_if());
				break;
			}
			case 1: // _get_link_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LinkHelper.write(_out,link_if());
				break;
			}
			case 2: // _get_proxy_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.ProxyHelper.write(_out,proxy_if());
				break;
			}
			case 3: // _get_register_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.RegisterHelper.write(_out,register_if());
				break;
			}
			case 4: // _get_lookup_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LookupHelper.write(_out,lookup_if());
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
