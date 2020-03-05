package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "ExtendedMLSNMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class ExtendedMLSNMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, extendedMLSNMgr.ExtendedMLSNMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "createTNetworkProtectionGroup", new java.lang.Integer(0));
		m_opsHash.put ( "getTNetworkProtectionGroups", new java.lang.Integer(1));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(2));
		m_opsHash.put ( "deleteTNetworkProtectionGroups", new java.lang.Integer(3));
		m_opsHash.put ( "modifyTNetworkProtectionGroups", new java.lang.Integer(4));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(5));
		m_opsHash.put ( "setMLSNPPLinkSRLGs", new java.lang.Integer(6));
		m_opsHash.put ( "performTnpProtectionCommand", new java.lang.Integer(7));
		m_opsHash.put ( "getMLSNBackBoneRoute", new java.lang.Integer(8));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(9));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(10));
		m_opsHash.put ( "setOwner", new java.lang.Integer(11));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/ExtendedMLSNMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public extendedMLSNMgr.ExtendedMLSNMgr_I _this()
	{
		return extendedMLSNMgr.ExtendedMLSNMgr_IHelper.narrow(_this_object());
	}
	public extendedMLSNMgr.ExtendedMLSNMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedMLSNMgr.ExtendedMLSNMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // createTNetworkProtectionGroup
			{
			try
			{
				extendedMLSNMgr.TNetworkProtectionGroup_T _arg0=extendedMLSNMgr.TNetworkProtectionGroup_THelper.read(_input);
				extendedMLSNMgr.TNetworkProtectionGroup_THolder _arg1= new extendedMLSNMgr.TNetworkProtectionGroup_THolder();
				_out = handler.createReply();
				createTNetworkProtectionGroup(_arg0,_arg1);
				extendedMLSNMgr.TNetworkProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getTNetworkProtectionGroups
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				int _arg2=_input.read_ulong();
				extendedMLSNMgr.TNProtectionGroupList_THolder _arg3= new extendedMLSNMgr.TNProtectionGroupList_THolder();
				extendedMLSNMgr.TNProtectionGroupIterator_IHolder _arg4= new extendedMLSNMgr.TNProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getTNetworkProtectionGroups(_arg0,_arg1,_arg2,_arg3,_arg4);
				extendedMLSNMgr.TNProtectionGroupList_THelper.write(_out,_arg3.value);
				extendedMLSNMgr.TNProtectionGroupIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setAdditionalInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // deleteTNetworkProtectionGroups
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteTNetworkProtectionGroups(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // modifyTNetworkProtectionGroups
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				extendedMLSNMgr.TNetworkProtectionGroup_T _arg1=extendedMLSNMgr.TNetworkProtectionGroup_THelper.read(_input);
				extendedMLSNMgr.TNetworkProtectionGroup_THolder _arg2= new extendedMLSNMgr.TNetworkProtectionGroup_THolder();
				_out = handler.createReply();
				modifyTNetworkProtectionGroups(_arg0,_arg1,_arg2);
				extendedMLSNMgr.TNetworkProtectionGroup_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getCapabilities
			{
			try
			{
				common.CapabilityList_THolder _arg0= new common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setMLSNPPLinkSRLGs
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				setMLSNPPLinkSRLGs(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // performTnpProtectionCommand
			{
			try
			{
				protection.ProtectionCommand_T _arg0=protection.ProtectionCommand_THelper.read(_input);
				extendedMLSNMgr.TNetworkProtectionGroup_T _arg1=extendedMLSNMgr.TNetworkProtectionGroup_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg3=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg4=globaldefs.NamingAttributes_THelper.read(_input);
				protection.SwitchData_THolder _arg5= new protection.SwitchData_THolder();
				_out = handler.createReply();
				performTnpProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				protection.SwitchData_THelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getMLSNBackBoneRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				extendedMLSNMgr.MLSNSubNetWorkList_THolder _arg2= new extendedMLSNMgr.MLSNSubNetWorkList_THolder();
				extendedMLSNMgr.MLSNSubNetWorkIterator_IHolder _arg3= new extendedMLSNMgr.MLSNSubNetWorkIterator_IHolder();
				_out = handler.createReply();
				getMLSNBackBoneRoute(_arg0,_arg1,_arg2,_arg3);
				extendedMLSNMgr.MLSNSubNetWorkList_THelper.write(_out,_arg2.value);
				extendedMLSNMgr.MLSNSubNetWorkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setUserLabel
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setNativeEMSName
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // setOwner
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
