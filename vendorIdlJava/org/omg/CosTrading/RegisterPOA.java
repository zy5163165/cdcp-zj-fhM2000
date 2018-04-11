package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Register"
 *	@author JacORB IDL compiler 
 */


public abstract class RegisterPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.RegisterOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "export", new java.lang.Integer(0));
		m_opsHash.put ( "withdraw", new java.lang.Integer(1));
		m_opsHash.put ( "_get_admin_if", new java.lang.Integer(2));
		m_opsHash.put ( "_get_type_repos", new java.lang.Integer(3));
		m_opsHash.put ( "_get_supports_proxy_offers", new java.lang.Integer(4));
		m_opsHash.put ( "_get_link_if", new java.lang.Integer(5));
		m_opsHash.put ( "_get_supports_modifiable_properties", new java.lang.Integer(6));
		m_opsHash.put ( "describe", new java.lang.Integer(7));
		m_opsHash.put ( "_get_proxy_if", new java.lang.Integer(8));
		m_opsHash.put ( "_get_register_if", new java.lang.Integer(9));
		m_opsHash.put ( "modify", new java.lang.Integer(10));
		m_opsHash.put ( "resolve", new java.lang.Integer(11));
		m_opsHash.put ( "withdraw_using_constraint", new java.lang.Integer(12));
		m_opsHash.put ( "_get_lookup_if", new java.lang.Integer(13));
		m_opsHash.put ( "_get_supports_dynamic_properties", new java.lang.Integer(14));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/Register:1.0","IDL:omg.org/CosTrading/TraderComponents:1.0","IDL:omg.org/CosTrading/SupportAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.Register _this()
	{
		return org.omg.CosTrading.RegisterHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.Register _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.RegisterHelper.narrow(_this_object(orb));
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
			case 0: // export
			{
			try
			{
				org.omg.CORBA.Object _arg0=_input.read_Object();
				java.lang.String _arg1=org.omg.CosTrading.ServiceTypeNameHelper.read(_input);
				org.omg.CosTrading.Property[] _arg2=org.omg.CosTrading.PropertySeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTrading.OfferIdHelper.write(_out,export(_arg0,_arg1,_arg2));
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
			catch(org.omg.CosTrading.ReadonlyDynamicProperty _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.ReadonlyDynamicPropertyHelper.write(_out, _ex3);
			}
			catch(org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch _ex4)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatchHelper.write(_out, _ex4);
			}
			catch(org.omg.CosTrading.PropertyTypeMismatch _ex5)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.PropertyTypeMismatchHelper.write(_out, _ex5);
			}
			catch(org.omg.CosTrading.IllegalPropertyName _ex6)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalPropertyNameHelper.write(_out, _ex6);
			}
			catch(org.omg.CosTrading.RegisterPackage.InvalidObjectRef _ex7)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.write(_out, _ex7);
			}
			catch(org.omg.CosTrading.UnknownServiceType _ex8)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownServiceTypeHelper.write(_out, _ex8);
			}
				break;
			}
			case 1: // withdraw
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.OfferIdHelper.read(_input);
				_out = handler.createReply();
				withdraw(_arg0);
			}
			catch(org.omg.CosTrading.IllegalOfferId _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalOfferIdHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.RegisterPackage.ProxyOfferId _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.UnknownOfferId _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownOfferIdHelper.write(_out, _ex2);
			}
				break;
			}
			case 2: // _get_admin_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.AdminHelper.write(_out,admin_if());
				break;
			}
			case 3: // _get_type_repos
			{
			_out = handler.createReply();
			_out.write_Object(type_repos());
				break;
			}
			case 4: // _get_supports_proxy_offers
			{
			_out = handler.createReply();
			_out.write_boolean(supports_proxy_offers());
				break;
			}
			case 5: // _get_link_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LinkHelper.write(_out,link_if());
				break;
			}
			case 6: // _get_supports_modifiable_properties
			{
			_out = handler.createReply();
			_out.write_boolean(supports_modifiable_properties());
				break;
			}
			case 7: // describe
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.OfferIdHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTrading.RegisterPackage.OfferInfoHelper.write(_out,describe(_arg0));
			}
			catch(org.omg.CosTrading.IllegalOfferId _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalOfferIdHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.RegisterPackage.ProxyOfferId _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.UnknownOfferId _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownOfferIdHelper.write(_out, _ex2);
			}
				break;
			}
			case 8: // _get_proxy_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.ProxyHelper.write(_out,proxy_if());
				break;
			}
			case 9: // _get_register_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.RegisterHelper.write(_out,register_if());
				break;
			}
			case 10: // modify
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.OfferIdHelper.read(_input);
				java.lang.String[] _arg1=org.omg.CosTrading.PropertyNameSeqHelper.read(_input);
				org.omg.CosTrading.Property[] _arg2=org.omg.CosTrading.PropertySeqHelper.read(_input);
				_out = handler.createReply();
				modify(_arg0,_arg1,_arg2);
			}
			catch(org.omg.CosTrading.DuplicatePropertyName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.DuplicatePropertyNameHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.RegisterPackage.ProxyOfferId _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.NotImplemented _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.NotImplementedHelper.write(_out, _ex2);
			}
			catch(org.omg.CosTrading.ReadonlyDynamicProperty _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.ReadonlyDynamicPropertyHelper.write(_out, _ex3);
			}
			catch(org.omg.CosTrading.UnknownOfferId _ex4)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownOfferIdHelper.write(_out, _ex4);
			}
			catch(org.omg.CosTrading.PropertyTypeMismatch _ex5)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.PropertyTypeMismatchHelper.write(_out, _ex5);
			}
			catch(org.omg.CosTrading.RegisterPackage.ReadonlyProperty _ex6)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.write(_out, _ex6);
			}
			catch(org.omg.CosTrading.IllegalOfferId _ex7)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalOfferIdHelper.write(_out, _ex7);
			}
			catch(org.omg.CosTrading.RegisterPackage.UnknownPropertyName _ex8)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.write(_out, _ex8);
			}
			catch(org.omg.CosTrading.IllegalPropertyName _ex9)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalPropertyNameHelper.write(_out, _ex9);
			}
			catch(org.omg.CosTrading.RegisterPackage.MandatoryProperty _ex10)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.write(_out, _ex10);
			}
				break;
			}
			case 11: // resolve
			{
			try
			{
				java.lang.String[] _arg0=org.omg.CosTrading.TraderNameHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosTrading.RegisterHelper.write(_out,resolve(_arg0));
			}
			catch(org.omg.CosTrading.RegisterPackage.UnknownTraderName _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.RegisterPackage.RegisterNotSupported _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.RegisterPackage.IllegalTraderName _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.write(_out, _ex2);
			}
				break;
			}
			case 12: // withdraw_using_constraint
			{
			try
			{
				java.lang.String _arg0=org.omg.CosTrading.ServiceTypeNameHelper.read(_input);
				java.lang.String _arg1=org.omg.CosTrading.ConstraintHelper.read(_input);
				_out = handler.createReply();
				withdraw_using_constraint(_arg0,_arg1);
			}
			catch(org.omg.CosTrading.RegisterPackage.NoMatchingOffers _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTrading.UnknownServiceType _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownServiceTypeHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTrading.IllegalConstraint _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalConstraintHelper.write(_out, _ex2);
			}
			catch(org.omg.CosTrading.IllegalServiceType _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.IllegalServiceTypeHelper.write(_out, _ex3);
			}
				break;
			}
			case 13: // _get_lookup_if
			{
			_out = handler.createReply();
			org.omg.CosTrading.LookupHelper.write(_out,lookup_if());
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
