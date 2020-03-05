package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "ImportAttributes"
 *	@author JacORB IDL compiler 
 */


public abstract class ImportAttributesPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.ImportAttributesOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_def_hop_count", new java.lang.Integer(0));
		m_opsHash.put ( "_get_def_match_card", new java.lang.Integer(1));
		m_opsHash.put ( "_get_max_return_card", new java.lang.Integer(2));
		m_opsHash.put ( "_get_max_follow_policy", new java.lang.Integer(3));
		m_opsHash.put ( "_get_max_list", new java.lang.Integer(4));
		m_opsHash.put ( "_get_def_follow_policy", new java.lang.Integer(5));
		m_opsHash.put ( "_get_max_hop_count", new java.lang.Integer(6));
		m_opsHash.put ( "_get_max_match_card", new java.lang.Integer(7));
		m_opsHash.put ( "_get_def_search_card", new java.lang.Integer(8));
		m_opsHash.put ( "_get_max_search_card", new java.lang.Integer(9));
		m_opsHash.put ( "_get_def_return_card", new java.lang.Integer(10));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/ImportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.ImportAttributes _this()
	{
		return org.omg.CosTrading.ImportAttributesHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.ImportAttributes _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.ImportAttributesHelper.narrow(_this_object(orb));
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
			case 0: // _get_def_hop_count
			{
			_out = handler.createReply();
			_out.write_ulong(def_hop_count());
				break;
			}
			case 1: // _get_def_match_card
			{
			_out = handler.createReply();
			_out.write_ulong(def_match_card());
				break;
			}
			case 2: // _get_max_return_card
			{
			_out = handler.createReply();
			_out.write_ulong(max_return_card());
				break;
			}
			case 3: // _get_max_follow_policy
			{
			_out = handler.createReply();
			org.omg.CosTrading.FollowOptionHelper.write(_out,max_follow_policy());
				break;
			}
			case 4: // _get_max_list
			{
			_out = handler.createReply();
			_out.write_ulong(max_list());
				break;
			}
			case 5: // _get_def_follow_policy
			{
			_out = handler.createReply();
			org.omg.CosTrading.FollowOptionHelper.write(_out,def_follow_policy());
				break;
			}
			case 6: // _get_max_hop_count
			{
			_out = handler.createReply();
			_out.write_ulong(max_hop_count());
				break;
			}
			case 7: // _get_max_match_card
			{
			_out = handler.createReply();
			_out.write_ulong(max_match_card());
				break;
			}
			case 8: // _get_def_search_card
			{
			_out = handler.createReply();
			_out.write_ulong(def_search_card());
				break;
			}
			case 9: // _get_max_search_card
			{
			_out = handler.createReply();
			_out.write_ulong(max_search_card());
				break;
			}
			case 10: // _get_def_return_card
			{
			_out = handler.createReply();
			_out.write_ulong(def_return_card());
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
