package protection;

/**
 *	Generated from IDL definition of interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class ProtectionMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, protection.ProtectionMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllProtectionGroups", new java.lang.Integer(0));
		m_opsHash.put ( "getAllEProtectionGroups", new java.lang.Integer(1));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(2));
		m_opsHash.put ( "getAllProtectedTPNames", new java.lang.Integer(3));
		m_opsHash.put ( "getContainingPGNames", new java.lang.Integer(4));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(5));
		m_opsHash.put ( "performProtectionCommand", new java.lang.Integer(6));
		m_opsHash.put ( "getEProtectionGroup", new java.lang.Integer(7));
		m_opsHash.put ( "retrieveSwitchData", new java.lang.Integer(8));
		m_opsHash.put ( "retrieveESwitchData", new java.lang.Integer(9));
		m_opsHash.put ( "getProtectionGroup", new java.lang.Integer(10));
		m_opsHash.put ( "getAllNUTTPNames", new java.lang.Integer(11));
		m_opsHash.put ( "getAllPreemptibleTPNames", new java.lang.Integer(12));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(13));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(14));
		m_opsHash.put ( "setOwner", new java.lang.Integer(15));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public protection.ProtectionMgr_I _this()
	{
		return protection.ProtectionMgr_IHelper.narrow(_this_object());
	}
	public protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.ProtectionMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllProtectionGroups
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				protection.ProtectionGroupList_THolder _arg2= new protection.ProtectionGroupList_THolder();
				protection.ProtectionGroupIterator_IHolder _arg3= new protection.ProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				protection.ProtectionGroupList_THelper.write(_out,_arg2.value);
				protection.ProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllEProtectionGroups
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				protection.EProtectionGroupList_THolder _arg2= new protection.EProtectionGroupList_THolder();
				protection.EProtectionGroupIterator_IHolder _arg3= new protection.EProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllEProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				protection.EProtectionGroupList_THelper.write(_out,_arg2.value);
				protection.EProtectionGroupIterator_IHelper.write(_out,_arg3.value);
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
			case 3: // getAllProtectedTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllProtectedTPNames(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getContainingPGNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingPGNames(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
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
			case 6: // performProtectionCommand
			{
			try
			{
				protection.ProtectionCommand_T _arg0=protection.ProtectionCommand_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg3=globaldefs.NamingAttributes_THelper.read(_input);
				protection.SwitchData_THolder _arg4= new protection.SwitchData_THolder();
				_out = handler.createReply();
				performProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				protection.SwitchData_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getEProtectionGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				protection.EProtectionGroup_THolder _arg1= new protection.EProtectionGroup_THolder();
				_out = handler.createReply();
				getEProtectionGroup(_arg0,_arg1);
				protection.EProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // retrieveSwitchData
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				protection.SwitchDataList_THolder _arg1= new protection.SwitchDataList_THolder();
				_out = handler.createReply();
				retrieveSwitchData(_arg0,_arg1);
				protection.SwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // retrieveESwitchData
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				protection.ESwitchDataList_THolder _arg1= new protection.ESwitchDataList_THolder();
				_out = handler.createReply();
				retrieveESwitchData(_arg0,_arg1);
				protection.ESwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getProtectionGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				protection.ProtectionGroup_THolder _arg1= new protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				getProtectionGroup(_arg0,_arg1);
				protection.ProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllNUTTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllNUTTPNames(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllPreemptibleTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPreemptibleTPNames(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setUserLabel
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
			case 14: // setNativeEMSName
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
			case 15: // setOwner
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
