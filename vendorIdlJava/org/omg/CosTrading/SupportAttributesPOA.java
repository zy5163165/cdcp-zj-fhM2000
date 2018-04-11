package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "SupportAttributes"
 *	@author JacORB IDL compiler 
 */


public abstract class SupportAttributesPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.SupportAttributesOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_supports_proxy_offers", new java.lang.Integer(0));
		m_opsHash.put ( "_get_type_repos", new java.lang.Integer(1));
		m_opsHash.put ( "_get_supports_dynamic_properties", new java.lang.Integer(2));
		m_opsHash.put ( "_get_supports_modifiable_properties", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.SupportAttributes _this()
	{
		return org.omg.CosTrading.SupportAttributesHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.SupportAttributes _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.SupportAttributesHelper.narrow(_this_object(orb));
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
			case 0: // _get_supports_proxy_offers
			{
			_out = handler.createReply();
			_out.write_boolean(supports_proxy_offers());
				break;
			}
			case 1: // _get_type_repos
			{
			_out = handler.createReply();
			_out.write_Object(type_repos());
				break;
			}
			case 2: // _get_supports_dynamic_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_dynamic_properties());
				break;
			}
			case 3: // _get_supports_modifiable_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_modifiable_properties());
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
