package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "LinkAttributes"
 *	@author JacORB IDL compiler 
 */


public abstract class LinkAttributesPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.LinkAttributesOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_max_link_follow_policy", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/LinkAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.LinkAttributes _this()
	{
		return org.omg.CosTrading.LinkAttributesHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.LinkAttributes _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.LinkAttributesHelper.narrow(_this_object(orb));
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
			case 0: // _get_max_link_follow_policy
			{
			_out = handler.createReply();
			org.omg.CosTrading.FollowOptionHelper.write(_out,max_link_follow_policy());
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
