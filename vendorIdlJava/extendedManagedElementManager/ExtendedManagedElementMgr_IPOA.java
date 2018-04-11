package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "ExtendedManagedElementMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class ExtendedManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, extendedManagedElementManager.ExtendedManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setOwner", new java.lang.Integer(0));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(1));
		m_opsHash.put ( "activateCrossConnections", new java.lang.Integer(2));
		m_opsHash.put ( "getAllClockLinkNets", new java.lang.Integer(3));
		m_opsHash.put ( "getAllEquipmentClocks", new java.lang.Integer(4));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(5));
		m_opsHash.put ( "deactivateCrossConnection", new java.lang.Integer(6));
		m_opsHash.put ( "provisionEquipment", new java.lang.Integer(7));
		m_opsHash.put ( "getAllCCCapacity", new java.lang.Integer(8));
		m_opsHash.put ( "getTPRouteAndTopologicalLinksInME", new java.lang.Integer(9));
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(10));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(11));
		m_opsHash.put ( "getBoardInternalSingalFlow", new java.lang.Integer(12));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(13));
		m_opsHash.put ( "activateCrossConnection", new java.lang.Integer(14));
		m_opsHash.put ( "createCrossConnection", new java.lang.Integer(15));
		m_opsHash.put ( "deactivateCrossConnections", new java.lang.Integer(16));
		m_opsHash.put ( "getAssignActiveAlarms", new java.lang.Integer(17));
		m_opsHash.put ( "getTPMembers", new java.lang.Integer(18));
		m_opsHash.put ( "getAllMeClocks", new java.lang.Integer(19));
		m_opsHash.put ( "deleteCrossConnection", new java.lang.Integer(20));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/ExtendedManagedElementMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public extendedManagedElementManager.ExtendedManagedElementMgr_I _this()
	{
		return extendedManagedElementManager.ExtendedManagedElementMgr_IHelper.narrow(_this_object());
	}
	public extendedManagedElementManager.ExtendedManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedManagedElementManager.ExtendedManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setOwner
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
			case 1: // setUserLabel
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
			case 2: // activateCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.CrossConnect_T[] _arg1=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				activateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getAllClockLinkNets
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				int _arg2=_input.read_ulong();
				extendedManagedElementManager.ClockLinkNetList_THolder _arg3= new extendedManagedElementManager.ClockLinkNetList_THolder();
				extendedManagedElementManager.ClockLinkNetIterator_IHolder _arg4= new extendedManagedElementManager.ClockLinkNetIterator_IHolder();
				_out = handler.createReply();
				getAllClockLinkNets(_arg0,_arg1,_arg2,_arg3,_arg4);
				extendedManagedElementManager.ClockLinkNetList_THelper.write(_out,_arg3.value);
				extendedManagedElementManager.ClockLinkNetIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllEquipmentClocks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				extendedManagedElementManager.EquipmentClockList_THolder _arg2= new extendedManagedElementManager.EquipmentClockList_THolder();
				extendedManagedElementManager.EquipmentClockIterator_IHolder _arg3= new extendedManagedElementManager.EquipmentClockIterator_IHolder();
				_out = handler.createReply();
				getAllEquipmentClocks(_arg0,_arg1,_arg2,_arg3);
				extendedManagedElementManager.EquipmentClockList_THelper.write(_out,_arg2.value);
				extendedManagedElementManager.EquipmentClockIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setAdditionalInfo
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
			case 6: // deactivateCrossConnection
			{
			try
			{
				subnetworkConnection.CrossConnect_T _arg0=subnetworkConnection.CrossConnect_THelper.read(_input);
				_out = handler.createReply();
				deactivateCrossConnection(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // provisionEquipment
			{
			try
			{
				equipment.EQTCreateData_T[] _arg0=extendedManagedElementManager.EQTCreateDataList_THelper.read(_input);
				equipment.EquipmentOrHolderList_THolder _arg1= new equipment.EquipmentOrHolderList_THolder();
				_out = handler.createReply();
				provisionEquipment(_arg0,_arg1);
				equipment.EquipmentOrHolderList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllCCCapacity
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				int _arg2=_input.read_ulong();
				extendedManagedElementManager.CCCapacityList_THolder _arg3= new extendedManagedElementManager.CCCapacityList_THolder();
				extendedManagedElementManager.CCCapacityIterator_IHolder _arg4= new extendedManagedElementManager.CCCapacityIterator_IHolder();
				_out = handler.createReply();
				getAllCCCapacity(_arg0,_arg1,_arg2,_arg3,_arg4);
				extendedManagedElementManager.CCCapacityList_THelper.write(_out,_arg3.value);
				extendedManagedElementManager.CCCapacityIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getTPRouteAndTopologicalLinksInME
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				extendedManagedElementManager.BusinessPathList_THolder _arg1= new extendedManagedElementManager.BusinessPathList_THolder();
				extendedManagedElementManager.BusinessPathList_THolder _arg2= new extendedManagedElementManager.BusinessPathList_THolder();
				_out = handler.createReply();
				getTPRouteAndTopologicalLinksInME(_arg0,_arg1,_arg2);
				extendedManagedElementManager.BusinessPathList_THelper.write(_out,_arg1.value);
				extendedManagedElementManager.BusinessPathList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.CrossConnectList_THolder _arg3= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CCIterator_IHolder _arg4= new subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getCapabilities
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
			case 12: // getBoardInternalSingalFlow
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedManagedElementManager.BoardInternalSignalFlowList_THolder _arg1= new extendedManagedElementManager.BoardInternalSignalFlowList_THolder();
				_out = handler.createReply();
				getBoardInternalSingalFlow(_arg0,_arg1);
				extendedManagedElementManager.BoardInternalSignalFlowList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setNativeEMSName
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
			case 14: // activateCrossConnection
			{
			try
			{
				subnetworkConnection.CrossConnect_T _arg0=subnetworkConnection.CrossConnect_THelper.read(_input);
				_out = handler.createReply();
				activateCrossConnection(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // createCrossConnection
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.CrossConnect_T[] _arg1=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.TPData_T[] _arg2=subnetworkConnection.TPDataList_THelper.read(_input);
				subnetworkConnection.TPData_T[] _arg3=subnetworkConnection.TPDataList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg4= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				createCrossConnection(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // deactivateCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.CrossConnect_T[] _arg1=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deactivateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAssignActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String[] _arg2=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg3=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg4=_input.read_ulong();
				notifications.EventList_THolder _arg5= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg6= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAssignActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				notifications.EventList_THelper.write(_out,_arg5.value);
				notifications.EventIterator_IHelper.write(_out,_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getTPMembers
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg1= new subnetworkConnection.TPDataList_THolder();
				_out = handler.createReply();
				getTPMembers(_arg0,_arg1);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllMeClocks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				managedElement.ManagedElementList_THolder _arg2= new managedElement.ManagedElementList_THolder();
				managedElement.ManagedElementIterator_IHolder _arg3= new managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllMeClocks(_arg0,_arg1,_arg2,_arg3);
				managedElement.ManagedElementList_THelper.write(_out,_arg2.value);
				managedElement.ManagedElementIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // deleteCrossConnection
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.CrossConnect_T[] _arg1=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deleteCrossConnection(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
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
