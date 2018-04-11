package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Link"
 *	@author JacORB IDL compiler 
 */


public abstract class LinkPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.LinkOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "list_links", new java.lang.Integer(0));
		m_opsHash.put ( "_get_admin_if", new java.lang.Integer(1));
		m_opsHash.put ( "_get_type_repos", new java.lang.Integer(2));
		m_opsHash.put ( "_get_supports_proxy_offers", new java.lang.Integer(3));
		m_opsHash.put ( "_get_link_if", new java.lang.Integer(4));
		m_opsHash.put ( "modify_link", new java.lang.Integer(5));
		m_opsHash.put ( "_get_supports_modifiable_properties", new java.lang.Integer(6));
		m_opsHash.put ( "remove_link", new java.lang.Integer(7));
		m_opsHash.put ( "describe_link", new java.lang.Integer(8));
		m_opsHash.put ( "_get_max_link_follow_policy", new java.lang.Integer(9));
		m_opsHash.put ( "_get_proxy_if", new java.lang.Integer(10));
		m_opsHash.put ( "_get_register_if", new java.lang.Integer(11));
		m_opsHash.put ( "_get_lookup_if", new java.lang.Integer(12));
		m_opsHash.put ( "add_link", new java.lang.Integer(13));
		m_opsHash.put ( "_get_supports_dynamic_properties", new java.lang.Integer(14));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/Link:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:omg.org/CosTrading/LinkAttributes:1.0"};
	public org.omg.CosTrading.Link _this()
	{
		return org.omg.CosTrading.LinkHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.Link _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.LinkHelper.narrow(_this_object(orb));
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
			case 0: // list_links
			{
				_out = handler.createReply();
				org.omg.CosTrading.LinkNameSeqHelper.write(_out,list_links());
				break;
			}
			case 1: // _get_admin_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.AdminHelper.write(_out,admin_if());
				break;
			}
			case 2: // _get_type_repos
			{
			_out = handler.createReply();
			_out.write_Object(type_repos());
				break;
			}
			case 3: // _get_supports_proxy_offers
			{
			_out = handler.createReply();
			_out.write_boolean(supports_proxy_offers());
				break;
			}
			case 4: // _get_link_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LinkHelper.write(_out,link_if());
				break;
			}
			case 5: // modify_link
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.LinkNameHelper.read(_input);
				org.omg.CosTrading.FollowOption _arg1=org.omg.CosTrading.FollowOptionHelper.read(_input);
				org.omg.CosTrading.FollowOption _arg2=org.omg.CosTrading.FollowOptionHelper.read(_input);
				_out = handler.createReply();
				modify_link(_arg0,_arg1,_arg2);
			}
			catch(org.omg.CosTrading.LinkPackage.IllegalLinkName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.write(_out, _ex2);
			}
			catch(org.omg.CosTrading.LinkPackage.UnknownLinkName _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.write(_out, _ex3);
			}
				break;
			}
			case 6: // _get_supports_modifiable_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_modifiable_properties());
				break;
			}
			case 7: // remove_link
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.LinkNameHelper.read(_input);
				_out = handler.createReply();
				remove_link(_arg0);
			}
			catch(org.omg.CosTrading.LinkPackage.IllegalLinkName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.LinkPackage.UnknownLinkName _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.write(_out, _ex1);
			}
				break;
			}
			case 8: // describe_link
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.LinkNameHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTrading.LinkPackage.LinkInfoHelper.write(_out,describe_link(_arg0));
			}
			catch(org.omg.CosTrading.LinkPackage.IllegalLinkName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.LinkPackage.UnknownLinkName _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.write(_out, _ex1);
			}
				break;
			}
			case 9: // _get_max_link_follow_policy
			{
			_out = handler.createReply();
			org.omg.CosTrading.FollowOptionHelper.write(_out,max_link_follow_policy());
				break;
			}
			case 10: // _get_proxy_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.ProxyHelper.write(_out,proxy_if());
				break;
			}
			case 11: // _get_register_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.RegisterHelper.write(_out,register_if());
				break;
			}
			case 12: // _get_lookup_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LookupHelper.write(_out,lookup_if());
				break;
			}
			case 13: // add_link
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.LinkNameHelper.read(_input);
				org.omg.CosTrading.Lookup _arg1=org.omg.CosTrading.LookupHelper.read(_input);
				org.omg.CosTrading.FollowOption _arg2=org.omg.CosTrading.FollowOptionHelper.read(_input);
				org.omg.CosTrading.FollowOption _arg3=org.omg.CosTrading.FollowOptionHelper.read(_input);
				_out = handler.createReply();
				add_link(_arg0,_arg1,_arg2,_arg3);
			}
			catch(org.omg.CosTrading.LinkPackage.IllegalLinkName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.InvalidLookupRef _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.InvalidLookupRefHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.write(_out, _ex2);
			}
			catch(org.omg.CosTrading.LinkPackage.DuplicateLinkName _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.write(_out, _ex3);
			}
			catch(org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive _ex4)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.write(_out, _ex4);
			}
				break;
			}
			case 14: // _get_supports_dynamic_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_dynamic_properties());
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
