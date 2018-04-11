package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of interface "Filter"
 *	@author JacORB IDL compiler 
 */


public abstract class FilterPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyFilter.FilterOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "match", new java.lang.Integer(0));
		m_opsHash.put ( "get_callbacks", new java.lang.Integer(1));
		m_opsHash.put ( "detach_callback", new java.lang.Integer(2));
		m_opsHash.put ( "get_all_constraints", new java.lang.Integer(3));
		m_opsHash.put ( "attach_callback", new java.lang.Integer(4));
		m_opsHash.put ( "match_structured", new java.lang.Integer(5));
		m_opsHash.put ( "add_constraints", new java.lang.Integer(6));
		m_opsHash.put ( "_get_constraint_grammar", new java.lang.Integer(7));
		m_opsHash.put ( "modify_constraints", new java.lang.Integer(8));
		m_opsHash.put ( "remove_all_constraints", new java.lang.Integer(9));
		m_opsHash.put ( "match_typed", new java.lang.Integer(10));
		m_opsHash.put ( "destroy", new java.lang.Integer(11));
		m_opsHash.put ( "get_constraints", new java.lang.Integer(12));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyFilter/Filter:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosNotifyFilter.Filter _this()
	{
		return org.omg.CosNotifyFilter.FilterHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyFilter.Filter _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyFilter.FilterHelper.narrow(_this_object(orb));
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
			case 0: // match
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(match(_arg0));
			}
			catch(org.omg.CosNotifyFilter.UnsupportedFilterableData _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.UnsupportedFilterableDataHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // get_callbacks
			{
				_out = handler.createReply();
				org.omg.CosNotifyFilter.CallbackIDSeqHelper.write(_out,get_callbacks());
				break;
			}
			case 2: // detach_callback
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				detach_callback(_arg0);
			}
			catch(org.omg.CosNotifyFilter.CallbackNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.CallbackNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // get_all_constraints
			{
				_out = handler.createReply();
				org.omg.CosNotifyFilter.ConstraintInfoSeqHelper.write(_out,get_all_constraints());
				break;
			}
			case 4: // attach_callback
			{
				org.omg.CosNotifyComm.NotifySubscribe _arg0=org.omg.CosNotifyComm.NotifySubscribeHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(attach_callback(_arg0));
				break;
			}
			case 5: // match_structured
			{
			try
			{
				org.omg.CosNotification.StructuredEvent _arg0=org.omg.CosNotification.StructuredEventHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(match_structured(_arg0));
			}
			catch(org.omg.CosNotifyFilter.UnsupportedFilterableData _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.UnsupportedFilterableDataHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // add_constraints
			{
			try
			{
				org.omg.CosNotifyFilter.ConstraintExp[] _arg0=org.omg.CosNotifyFilter.ConstraintExpSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosNotifyFilter.ConstraintInfoSeqHelper.write(_out,add_constraints(_arg0));
			}
			catch(org.omg.CosNotifyFilter.InvalidConstraint _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.InvalidConstraintHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // _get_constraint_grammar
			{
			_out = handler.createReply();
			_out.write_string(constraint_grammar());
				break;
			}
			case 8: // modify_constraints
			{
			try
			{
				int[] _arg0=org.omg.CosNotifyFilter.ConstraintIDSeqHelper.read(_input);
				org.omg.CosNotifyFilter.ConstraintInfo[] _arg1=org.omg.CosNotifyFilter.ConstraintInfoSeqHelper.read(_input);
				_out = handler.createReply();
				modify_constraints(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyFilter.ConstraintNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.ConstraintNotFoundHelper.write(_out, _ex0);
			}
			catch(org.omg.CosNotifyFilter.InvalidConstraint _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.InvalidConstraintHelper.write(_out, _ex1);
			}
				break;
			}
			case 9: // remove_all_constraints
			{
				_out = handler.createReply();
				remove_all_constraints();
				break;
			}
			case 10: // match_typed
			{
			try
			{
				org.omg.CosNotification.Property[] _arg0=org.omg.CosNotification.PropertySeqHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(match_typed(_arg0));
			}
			catch(org.omg.CosNotifyFilter.UnsupportedFilterableData _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.UnsupportedFilterableDataHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 12: // get_constraints
			{
			try
			{
				int[] _arg0=org.omg.CosNotifyFilter.ConstraintIDSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosNotifyFilter.ConstraintInfoSeqHelper.write(_out,get_constraints(_arg0));
			}
			catch(org.omg.CosNotifyFilter.ConstraintNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyFilter.ConstraintNotFoundHelper.write(_out, _ex0);
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
