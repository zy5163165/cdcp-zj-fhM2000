package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Lookup"
 *	@author JacORB IDL compiler 
 */


public abstract class LookupPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.LookupOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_register_if", new java.lang.Integer(0));
		m_opsHash.put ( "_get_def_follow_policy", new java.lang.Integer(1));
		m_opsHash.put ( "_get_lookup_if", new java.lang.Integer(2));
		m_opsHash.put ( "_get_max_list", new java.lang.Integer(3));
		m_opsHash.put ( "_get_max_search_card", new java.lang.Integer(4));
		m_opsHash.put ( "_get_proxy_if", new java.lang.Integer(5));
		m_opsHash.put ( "query", new java.lang.Integer(6));
		m_opsHash.put ( "_get_def_search_card", new java.lang.Integer(7));
		m_opsHash.put ( "_get_link_if", new java.lang.Integer(8));
		m_opsHash.put ( "_get_type_repos", new java.lang.Integer(9));
		m_opsHash.put ( "_get_max_return_card", new java.lang.Integer(10));
		m_opsHash.put ( "_get_admin_if", new java.lang.Integer(11));
		m_opsHash.put ( "_get_supports_dynamic_properties", new java.lang.Integer(12));
		m_opsHash.put ( "_get_max_hop_count", new java.lang.Integer(13));
		m_opsHash.put ( "_get_def_match_card", new java.lang.Integer(14));
		m_opsHash.put ( "_get_supports_proxy_offers", new java.lang.Integer(15));
		m_opsHash.put ( "_get_max_match_card", new java.lang.Integer(16));
		m_opsHash.put ( "_get_def_return_card", new java.lang.Integer(17));
		m_opsHash.put ( "_get_supports_modifiable_properties", new java.lang.Integer(18));
		m_opsHash.put ( "_get_def_hop_count", new java.lang.Integer(19));
		m_opsHash.put ( "_get_max_follow_policy", new java.lang.Integer(20));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/Lookup:1.0","IDL:omg.org/CosTrading/ImportAttributes:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.Lookup _this()
	{
		return org.omg.CosTrading.LookupHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.Lookup _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.LookupHelper.narrow(_this_object(orb));
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
			case 0: // _get_register_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.RegisterHelper.write(_out,register_if());
				break;
			}
			case 1: // _get_def_follow_policy
			{
			_out = handler.createReply();
			org.omg.CosTrading.FollowOptionHelper.write(_out,def_follow_policy());
				break;
			}
			case 2: // _get_lookup_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LookupHelper.write(_out,lookup_if());
				break;
			}
			case 3: // _get_max_list
			{
			_out = handler.createReply();
			_out.write_ulong(max_list());
				break;
			}
			case 4: // _get_max_search_card
			{
			_out = handler.createReply();
			_out.write_ulong(max_search_card());
				break;
			}
			case 5: // _get_proxy_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.ProxyHelper.write(_out,proxy_if());
				break;
			}
			case 6: // query
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.ServiceTypeNameHelper.read(_input);
				java.lang.String _arg1=org.omg.CosTrading.ConstraintHelper.read(_input);
				java.lang.String _arg2=org.omg.CosTrading.LookupPackage.PreferenceHelper.read(_input);
				org.omg.CosTrading.Policy[] _arg3=org.omg.CosTrading.PolicySeqHelper.read(_input);
				org.omg.CosTrading.LookupPackage.SpecifiedProps _arg4=org.omg.CosTrading.LookupPackage.SpecifiedPropsHelper.read(_input);
				int _arg5=_input.read_ulong();
				org.omg.CosTrading.OfferSeqHolder _arg6= new org.omg.CosTrading.OfferSeqHolder();
				org.omg.CosTrading.OfferIteratorHolder _arg7= new org.omg.CosTrading.OfferIteratorHolder();
				org.omg.CosTrading.PolicyNameSeqHolder _arg8= new org.omg.CosTrading.PolicyNameSeqHolder();
				_out = handler.createReply();
				query(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.omg.CosTrading.OfferSeqHelper.write(_out,_arg6.value);
				org.omg.CosTrading.OfferIteratorHelper.write(_out,_arg7.value);
				org.omg.CosTrading.PolicyNameSeqHelper.write(_out,_arg8.value);
			}
			catch(org.omg.CosTrading.LookupPackage.IllegalPreference _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.DuplicatePropertyName _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.DuplicatePropertyNameHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.LookupPackage.InvalidPolicyValue _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LookupPackage.InvalidPolicyValueHelper.write(_out, _ex2);
			}
			catch(org.omg.CosTrading.IllegalServiceType _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalServiceTypeHelper.write(_out, _ex3);
			}
			catch(org.omg.CosTrading.LookupPackage.PolicyTypeMismatch _ex4)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LookupPackage.PolicyTypeMismatchHelper.write(_out, _ex4);
			}
			catch(org.omg.CosTrading.IllegalConstraint _ex5)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalConstraintHelper.write(_out, _ex5);
			}
			catch(org.omg.CosTrading.LookupPackage.IllegalPolicyName _ex6)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.LookupPackage.IllegalPolicyNameHelper.write(_out, _ex6);
			}
			catch(org.omg.CosTrading.DuplicatePolicyName _ex7)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.DuplicatePolicyNameHelper.write(_out, _ex7);
			}
			catch(org.omg.CosTrading.IllegalPropertyName _ex8)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalPropertyNameHelper.write(_out, _ex8);
			}
			catch(org.omg.CosTrading.UnknownServiceType _ex9)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownServiceTypeHelper.write(_out, _ex9);
			}
				break;
			}
			case 7: // _get_def_search_card
			{
			_out = handler.createReply();
			_out.write_ulong(def_search_card());
				break;
			}
			case 8: // _get_link_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LinkHelper.write(_out,link_if());
				break;
			}
			case 9: // _get_type_repos
			{
			_out = handler.createReply();
			_out.write_Object(type_repos());
				break;
			}
			case 10: // _get_max_return_card
			{
			_out = handler.createReply();
			_out.write_ulong(max_return_card());
				break;
			}
			case 11: // _get_admin_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.AdminHelper.write(_out,admin_if());
				break;
			}
			case 12: // _get_supports_dynamic_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_dynamic_properties());
				break;
			}
			case 13: // _get_max_hop_count
			{
			_out = handler.createReply();
			_out.write_ulong(max_hop_count());
				break;
			}
			case 14: // _get_def_match_card
			{
			_out = handler.createReply();
			_out.write_ulong(def_match_card());
				break;
			}
			case 15: // _get_supports_proxy_offers
			{
			_out = handler.createReply();
			_out.write_boolean(supports_proxy_offers());
				break;
			}
			case 16: // _get_max_match_card
			{
			_out = handler.createReply();
			_out.write_ulong(max_match_card());
				break;
			}
			case 17: // _get_def_return_card
			{
			_out = handler.createReply();
			_out.write_ulong(def_return_card());
				break;
			}
			case 18: // _get_supports_modifiable_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_modifiable_properties());
				break;
			}
			case 19: // _get_def_hop_count
			{
			_out = handler.createReply();
			_out.write_ulong(def_hop_count());
				break;
			}
			case 20: // _get_max_follow_policy
			{
			_out = handler.createReply();
			org.omg.CosTrading.FollowOptionHelper.write(_out,max_follow_policy());
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
