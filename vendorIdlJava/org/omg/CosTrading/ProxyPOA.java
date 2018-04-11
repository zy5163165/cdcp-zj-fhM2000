package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Proxy"
 *	@author JacORB IDL compiler 
 */


public abstract class ProxyPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.ProxyOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_admin_if", new java.lang.Integer(0));
		m_opsHash.put ( "_get_type_repos", new java.lang.Integer(1));
		m_opsHash.put ( "_get_supports_proxy_offers", new java.lang.Integer(2));
		m_opsHash.put ( "_get_link_if", new java.lang.Integer(3));
		m_opsHash.put ( "_get_supports_modifiable_properties", new java.lang.Integer(4));
		m_opsHash.put ( "_get_proxy_if", new java.lang.Integer(5));
		m_opsHash.put ( "withdraw_proxy", new java.lang.Integer(6));
		m_opsHash.put ( "_get_register_if", new java.lang.Integer(7));
		m_opsHash.put ( "_get_lookup_if", new java.lang.Integer(8));
		m_opsHash.put ( "describe_proxy", new java.lang.Integer(9));
		m_opsHash.put ( "_get_supports_dynamic_properties", new java.lang.Integer(10));
		m_opsHash.put ( "export_proxy", new java.lang.Integer(11));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/Proxy:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.Proxy _this()
	{
		return org.omg.CosTrading.ProxyHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.Proxy _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.ProxyHelper.narrow(_this_object(orb));
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
			case 1: // _get_type_repos
			{
			_out = handler.createReply();
			_out.write_Object(type_repos());
				break;
			}
			case 2: // _get_supports_proxy_offers
			{
			_out = handler.createReply();
			_out.write_boolean(supports_proxy_offers());
				break;
			}
			case 3: // _get_link_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LinkHelper.write(_out,link_if());
				break;
			}
			case 4: // _get_supports_modifiable_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_modifiable_properties());
				break;
			}
			case 5: // _get_proxy_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.ProxyHelper.write(_out,proxy_if());
				break;
			}
			case 6: // withdraw_proxy
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.OfferIdHelper.read(_input);
				_out = handler.createReply();
				withdraw_proxy(_arg0);
			}
			catch(org.omg.CosTrading.ProxyPackage.NotProxyOfferId _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.IllegalOfferId _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalOfferIdHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.UnknownOfferId _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownOfferIdHelper.write(_out, _ex2);
			}
				break;
			}
			case 7: // _get_register_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.RegisterHelper.write(_out,register_if());
				break;
			}
			case 8: // _get_lookup_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LookupHelper.write(_out,lookup_if());
				break;
			}
			case 9: // describe_proxy
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.OfferIdHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTrading.ProxyPackage.ProxyInfoHelper.write(_out,describe_proxy(_arg0));
			}
			catch(org.omg.CosTrading.ProxyPackage.NotProxyOfferId _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.IllegalOfferId _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalOfferIdHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.UnknownOfferId _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownOfferIdHelper.write(_out, _ex2);
			}
				break;
			}
			case 10: // _get_supports_dynamic_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_dynamic_properties());
				break;
			}
			case 11: // export_proxy
			{
			try
			{
				org.omg.CosTrading.Lookup _arg0=org.omg.CosTrading.LookupHelper.read(_input);
				java.lang.String _arg1=org.omg.CosTrading.ServiceTypeNameHelper.read(_input);
				org.omg.CosTrading.Property[] _arg2=org.omg.CosTrading.PropertySeqHelper.read(_input);
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.read(_input);
				org.omg.CosTrading.Policy[] _arg5=org.omg.CosTrading.PolicySeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTrading.OfferIdHelper.write(_out,export_proxy(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5));
			}
			catch(org.omg.CosTrading.DuplicatePropertyName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.DuplicatePropertyNameHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.MissingMandatoryProperty _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.MissingMandatoryPropertyHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.IllegalServiceType _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalServiceTypeHelper.write(_out, _ex2);
			}
			catch(org.omg.CosTrading.ProxyPackage.IllegalRecipe _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.write(_out, _ex3);
			}
			catch(org.omg.CosTrading.ReadonlyDynamicProperty _ex4)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.ReadonlyDynamicPropertyHelper.write(_out, _ex4);
			}
			catch(org.omg.CosTrading.DuplicatePolicyName _ex5)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.DuplicatePolicyNameHelper.write(_out, _ex5);
			}
			catch(org.omg.CosTrading.PropertyTypeMismatch _ex6)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.PropertyTypeMismatchHelper.write(_out, _ex6);
			}
			catch(org.omg.CosTrading.IllegalPropertyName _ex7)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalPropertyNameHelper.write(_out, _ex7);
			}
			catch(org.omg.CosTrading.UnknownServiceType _ex8)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownServiceTypeHelper.write(_out, _ex8);
			}
			catch(org.omg.CosTrading.InvalidLookupRef _ex9)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.InvalidLookupRefHelper.write(_out, _ex9);
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
