package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class MultiLayerSubnetworkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllTPPoolNames", new java.lang.Integer(0));
		m_opsHash.put ( "getAllFixedSubnetworkConnectionsWithTP", new java.lang.Integer(1));
		m_opsHash.put ( "getTPGroupingRelationships", new java.lang.Integer(2));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(3));
		m_opsHash.put ( "getCall", new java.lang.Integer(4));
		m_opsHash.put ( "getConnectionsAndRouteDetails", new java.lang.Integer(5));
		m_opsHash.put ( "getAllMLSNPPs", new java.lang.Integer(6));
		m_opsHash.put ( "getCallAndTopLevelConnections", new java.lang.Integer(7));
		m_opsHash.put ( "getAllTopologicalLinkNames", new java.lang.Integer(8));
		m_opsHash.put ( "getAllEdgePointNames", new java.lang.Integer(9));
		m_opsHash.put ( "getAllSubnetworkConnections", new java.lang.Integer(10));
		m_opsHash.put ( "getAllInternalMLSNPPLinks", new java.lang.Integer(11));
		m_opsHash.put ( "releaseCall", new java.lang.Integer(12));
		m_opsHash.put ( "getAllEdgePoints", new java.lang.Integer(13));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(14));
		m_opsHash.put ( "getIntendedRoute", new java.lang.Integer(15));
		m_opsHash.put ( "getAllSubnetworkConnectionNamesWithTP", new java.lang.Integer(16));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(17));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(18));
		m_opsHash.put ( "getAllFixedSubnetworkConnectionNamesWithTP", new java.lang.Integer(19));
		m_opsHash.put ( "getSNCsByUserLabel", new java.lang.Integer(20));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(21));
		m_opsHash.put ( "createAndActivateSNC", new java.lang.Integer(22));
		m_opsHash.put ( "createTPPool", new java.lang.Integer(23));
		m_opsHash.put ( "getAllFixedSubnetworkConnections", new java.lang.Integer(24));
		m_opsHash.put ( "setRoutesAdminState", new java.lang.Integer(25));
		m_opsHash.put ( "deleteSNC", new java.lang.Integer(26));
		m_opsHash.put ( "switchRoute", new java.lang.Integer(27));
		m_opsHash.put ( "setOwner", new java.lang.Integer(28));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", new java.lang.Integer(29));
		m_opsHash.put ( "deactivateAndDeleteSNC", new java.lang.Integer(30));
		m_opsHash.put ( "getAllSubordinateRAidsWithConnection", new java.lang.Integer(31));
		m_opsHash.put ( "createModifiedSNC", new java.lang.Integer(32));
		m_opsHash.put ( "getAllSubnetworkConnectionNames", new java.lang.Integer(33));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCs", new java.lang.Integer(34));
		m_opsHash.put ( "getAllTopologicalLinks", new java.lang.Integer(35));
		m_opsHash.put ( "getTPPool", new java.lang.Integer(36));
		m_opsHash.put ( "getAllMLSNPPLinks", new java.lang.Integer(37));
		m_opsHash.put ( "getMultiLayerSubnetwork", new java.lang.Integer(38));
		m_opsHash.put ( "deactivateSNC", new java.lang.Integer(39));
		m_opsHash.put ( "swapSNC", new java.lang.Integer(40));
		m_opsHash.put ( "deleteTPPool", new java.lang.Integer(41));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", new java.lang.Integer(42));
		m_opsHash.put ( "getAllFixedSubnetworkConnectionNames", new java.lang.Integer(43));
		m_opsHash.put ( "getRoute", new java.lang.Integer(44));
		m_opsHash.put ( "establishCall", new java.lang.Integer(45));
		m_opsHash.put ( "getAllCallsAndTopLevelConnections", new java.lang.Integer(46));
		m_opsHash.put ( "getSNC", new java.lang.Integer(47));
		m_opsHash.put ( "activateSNC", new java.lang.Integer(48));
		m_opsHash.put ( "checkValidSNC", new java.lang.Integer(49));
		m_opsHash.put ( "getCallAndTopLevelConnectionsAndSNCs", new java.lang.Integer(50));
		m_opsHash.put ( "getAllEdgeMLSNPPLinks", new java.lang.Integer(51));
		m_opsHash.put ( "getAllCallIdsWithTP", new java.lang.Integer(52));
		m_opsHash.put ( "modifyCall", new java.lang.Integer(53));
		m_opsHash.put ( "modifyTPPool", new java.lang.Integer(54));
		m_opsHash.put ( "modifyDiversityAndCorouting", new java.lang.Integer(55));
		m_opsHash.put ( "removeConnections", new java.lang.Integer(56));
		m_opsHash.put ( "getRouteAndTopologicalLinks", new java.lang.Integer(57));
		m_opsHash.put ( "removeRoute", new java.lang.Integer(58));
		m_opsHash.put ( "getAllTPPools", new java.lang.Integer(59));
		m_opsHash.put ( "getTopologicalLink", new java.lang.Integer(60));
		m_opsHash.put ( "modifySNC", new java.lang.Integer(61));
		m_opsHash.put ( "getAssociatedTP", new java.lang.Integer(62));
		m_opsHash.put ( "getMLSNPPLink", new java.lang.Integer(63));
		m_opsHash.put ( "getAllCallIdsWithSNPPOrTNAName", new java.lang.Integer(64));
		m_opsHash.put ( "addRoute", new java.lang.Integer(65));
		m_opsHash.put ( "addConnections", new java.lang.Integer(66));
		m_opsHash.put ( "createSNC", new java.lang.Integer(67));
		m_opsHash.put ( "getAllSubnetworkConnectionsWithTP", new java.lang.Integer(68));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsWithME", new java.lang.Integer(69));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(70));
		m_opsHash.put ( "getBackupRoutes", new java.lang.Integer(71));
		m_opsHash.put ( "getAllSubordinateMLSNs", new java.lang.Integer(72));
		m_opsHash.put ( "setIntendedRoute", new java.lang.Integer(73));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllTPPoolNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTPPoolNames(_arg0,_arg1,_arg2,_arg3);
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
			case 1: // getAllFixedSubnetworkConnectionsWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SNCIterator_IHolder _arg4= new subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getTPGroupingRelationships
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getTPGroupingRelationships(_arg0,_arg1,_arg2,_arg3);
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
			case 3: // getAllManagedElements
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				managedElement.ManagedElementList_THolder _arg2= new managedElement.ManagedElementList_THolder();
				managedElement.ManagedElementIterator_IHolder _arg3= new managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2,_arg3);
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
			case 4: // getCall
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				callSNC.Call_THolder _arg1= new callSNC.Call_THolder();
				_out = handler.createReply();
				getCall(_arg0,_arg1);
				callSNC.Call_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getConnectionsAndRouteDetails
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=callSNC.RouteType_THelper.read(_input);
				callSNC.SNCAndRouteList_THolder _arg5= new callSNC.SNCAndRouteList_THolder();
				_out = handler.createReply();
				getConnectionsAndRouteDetails(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				callSNC.SNCAndRouteList_THelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllMLSNPPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				mLSNPP.MLSNPPList_THolder _arg3= new mLSNPP.MLSNPPList_THolder();
				mLSNPP.MLSNPPIterator_IHolder _arg4= new mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				mLSNPP.MLSNPPList_THelper.write(_out,_arg3.value);
				mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getCallAndTopLevelConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				callSNC.CallAndTopLevelConnections_THolder _arg2= new callSNC.CallAndTopLevelConnections_THolder();
				_out = handler.createReply();
				getCallAndTopLevelConnections(_arg0,_arg1,_arg2);
				callSNC.CallAndTopLevelConnections_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllTopologicalLinkNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 9: // getAllEdgePointNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg4= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg5= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllEdgePointNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllSubnetworkConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SNCIterator_IHolder _arg4= new subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllInternalMLSNPPLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				mLSNPPLink.MLSNPPLinkList_THolder _arg3= new mLSNPPLink.MLSNPPLinkList_THolder();
				mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllInternalMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // releaseCall
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg1= new subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				subnetworkConnection.SubnetworkConnectionList_THolder _arg2= new subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				releaseCall(_arg0,_arg1,_arg2,_arg3);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllEdgePoints
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg4= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg5= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllEdgePoints(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
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
			case 15: // getIntendedRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				globaldefs.NVSList_THolder _arg2= new globaldefs.NVSList_THolder();
				_arg2._read (_input);
				subnetworkConnection.Route_THolder _arg3= new subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getIntendedRoute(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NVSList_THelper.write(_out,_arg2.value);
				subnetworkConnection.Route_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAllSubnetworkConnectionNamesWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNamesWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setAdditionalInfo
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
			case 18: // getCapabilities
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
			case 19: // getAllFixedSubnetworkConnectionNamesWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnectionNamesWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getSNCsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByUserLabel(_arg0,_arg1);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setUserLabel
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
			case 22: // createAndActivateSNC
			{
			try
			{
				subnetworkConnection.SNCCreateData_T _arg0=subnetworkConnection.SNCCreateData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // createTPPool
			{
			try
			{
				multiLayerSubnetwork.TPPoolCreateData_T _arg0=multiLayerSubnetwork.TPPoolCreateData_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createTPPool(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllFixedSubnetworkConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SNCIterator_IHolder _arg4= new subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // setRoutesAdminState
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.RouteNameAndAdminStateList_THolder _arg1= new subnetworkConnection.RouteNameAndAdminStateList_THolder();
				_arg1._read (_input);
				subnetworkConnection.SNCState_THolder _arg2= new subnetworkConnection.SNCState_THolder();
				_out = handler.createReply();
				setRoutesAdminState(_arg0,_arg1,_arg2);
				subnetworkConnection.RouteNameAndAdminStateList_THelper.write(_out,_arg1.value);
				subnetworkConnection.SNCState_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // deleteSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg1=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				_out = handler.createReply();
				deleteSNC(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // switchRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				subnetworkConnection.GradesOfImpact_T _arg2=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg3=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg4= new subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				globaldefs.NVSList_THolder _arg5= new globaldefs.NVSList_THolder();
				_arg5._read (_input);
				subnetworkConnection.SNCState_THolder _arg6= new subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				switchRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				globaldefs.NVSList_THelper.write(_out,_arg5.value);
				subnetworkConnection.SNCState_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // setOwner
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
			case 29: // getAllCallsAndTopLevelConnectionsAndSNCsWithME
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg2=_input.read_ulong();
				callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg3= new callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg4= new callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg3.value);
				callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // deactivateAndDeleteSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllSubordinateRAidsWithConnection
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg2=callSNC.RouteType_THelper.read(_input);
				multiLayerSubnetwork.RoutePerRouteType_THolder _arg3= new multiLayerSubnetwork.RoutePerRouteType_THolder();
				_out = handler.createReply();
				getAllSubordinateRAidsWithConnection(_arg0,_arg1,_arg2,_arg3);
				multiLayerSubnetwork.RoutePerRouteType_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // createModifiedSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				subnetworkConnection.SNCModifyData_T _arg2=subnetworkConnection.SNCModifyData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg3=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				subnetworkConnection.ProtectionEffort_T _arg4=subnetworkConnection.ProtectionEffort_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg5=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg6= new subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg7= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createModifiedSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg7.value);
				_out.write_string(_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getAllSubnetworkConnectionNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllCallsAndTopLevelConnectionsAndSNCs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg2= new callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg3= new callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCs(_arg0,_arg1,_arg2,_arg3);
				callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg2.value);
				callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getAllTopologicalLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				topologicalLink.TopologicalLinkList_THolder _arg2= new topologicalLink.TopologicalLinkList_THolder();
				topologicalLink.TopologicalLinkIterator_IHolder _arg3= new topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getTPPool
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				org.omg.CORBA.IntHolder _arg2= new org.omg.CORBA.IntHolder();
				org.omg.CORBA.IntHolder _arg3= new org.omg.CORBA.IntHolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				getTPPool(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
				_out.write_ulong(_arg2.value);
				_out.write_ulong(_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getAllMLSNPPLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				mLSNPPLink.MLSNPPLinkList_THolder _arg3= new mLSNPPLink.MLSNPPLinkList_THolder();
				mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getMultiLayerSubnetwork
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				multiLayerSubnetwork.MultiLayerSubnetwork_THolder _arg1= new multiLayerSubnetwork.MultiLayerSubnetwork_THolder();
				_out = handler.createReply();
				getMultiLayerSubnetwork(_arg0,_arg1);
				multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // deactivateSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // swapSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg3=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg4= new subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				subnetworkConnection.SNCState_THolder _arg5= new subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				swapSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				subnetworkConnection.SNCState_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // deleteTPPool
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteTPPool(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getAllCallsAndTopLevelConnectionsAndSNCsWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg2=_input.read_ulong();
				callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg3= new callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg4= new callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg3.value);
				callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // getAllFixedSubnetworkConnectionNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				subnetworkConnection.Route_THolder _arg2= new subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getRoute(_arg0,_arg1,_arg2);
				subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // establishCall
			{
			try
			{
				callSNC.CallCreateData_T _arg0=callSNC.CallCreateData_THelper.read(_input);
				subnetworkConnection.SNCCreateData_T[] _arg1=subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				callSNC.CallAndTopLevelConnectionsAndSNCs_THolder _arg4= new callSNC.CallAndTopLevelConnectionsAndSNCs_THolder();
				subnetworkConnection.SNCCreateDataList_THolder _arg5= new subnetworkConnection.SNCCreateDataList_THolder();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg6= new subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				establishCall(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write(_out,_arg4.value);
				subnetworkConnection.SNCCreateDataList_THelper.write(_out,_arg5.value);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getAllCallsAndTopLevelConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				callSNC.CallAndTopLevelConnectionsList_THolder _arg2= new callSNC.CallAndTopLevelConnectionsList_THolder();
				callSNC.CallAndTopLevelConnectionsIterator_IHolder _arg3= new callSNC.CallAndTopLevelConnectionsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnections(_arg0,_arg1,_arg2,_arg3);
				callSNC.CallAndTopLevelConnectionsList_THelper.write(_out,_arg2.value);
				callSNC.CallAndTopLevelConnectionsIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // getSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg1= new subnetworkConnection.SubnetworkConnection_THolder();
				_out = handler.createReply();
				getSNC(_arg0,_arg1);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // activateSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // checkValidSNC
			{
			try
			{
				subnetworkConnection.SNCCreateData_T _arg0=subnetworkConnection.SNCCreateData_THelper.read(_input);
				subnetworkConnection.TPData_T[] _arg1=subnetworkConnection.TPDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				org.omg.CORBA.BooleanHolder _arg3= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				checkValidSNC(_arg0,_arg1,_arg2,_arg3);
				_out.write_boolean(_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 50: // getCallAndTopLevelConnectionsAndSNCs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				callSNC.CallAndTopLevelConnectionsAndSNCs_THolder _arg1= new callSNC.CallAndTopLevelConnectionsAndSNCs_THolder();
				_out = handler.createReply();
				getCallAndTopLevelConnectionsAndSNCs(_arg0,_arg1);
				callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 51: // getAllEdgeMLSNPPLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				mLSNPPLink.MLSNPPLinkList_THolder _arg3= new mLSNPPLink.MLSNPPLinkList_THolder();
				mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllEdgeMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 52: // getAllCallIdsWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				callSNC.CallIdList_THolder _arg1= new callSNC.CallIdList_THolder();
				_out = handler.createReply();
				getAllCallIdsWithTP(_arg0,_arg1);
				callSNC.CallIdList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 53: // modifyCall
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				callSNC.CallModifyData_T _arg1=callSNC.CallModifyData_THelper.read(_input);
				callSNC.Call_THolder _arg2= new callSNC.Call_THolder();
				_out = handler.createReply();
				modifyCall(_arg0,_arg1,_arg2);
				callSNC.Call_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 54: // modifyTPPool
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				terminationPoint.TerminationPoint_THolder _arg3= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				modifyTPPool(_arg0,_arg1,_arg2,_arg3);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 55: // modifyDiversityAndCorouting
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				callSNC.Diversity_T _arg1=callSNC.Diversity_THelper.read(_input);
				callSNC.RouteGroupInfo_T[] _arg2=callSNC.RouteGroupInfoList_THelper.read(_input);
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=_input.read_string();
				globaldefs.NVSList_THolder _arg5= new globaldefs.NVSList_THolder();
				_arg5._read (_input);
				callSNC.CallAndTopLevelConnections_THolder _arg6= new callSNC.CallAndTopLevelConnections_THolder();
				_out = handler.createReply();
				modifyDiversityAndCorouting(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				globaldefs.NVSList_THelper.write(_out,_arg5.value);
				callSNC.CallAndTopLevelConnections_THelper.write(_out,_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 56: // removeConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg2= new subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				removeConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 57: // getRouteAndTopologicalLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.Route_THolder _arg1= new subnetworkConnection.Route_THolder();
				topologicalLink.TopologicalLinkList_THolder _arg2= new topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinks(_arg0,_arg1,_arg2);
				subnetworkConnection.Route_THelper.write(_out,_arg1.value);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 58: // removeRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_arg3._read (_input);
				_out = handler.createReply();
				removeRoute(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 59: // getAllTPPools
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg2= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg3= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllTPPools(_arg0,_arg1,_arg2,_arg3);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg2.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 60: // getTopologicalLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				topologicalLink.TopologicalLink_THolder _arg1= new topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopologicalLink(_arg0,_arg1);
				topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 61: // modifySNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				subnetworkConnection.SNCModifyData_T _arg2=subnetworkConnection.SNCModifyData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg3=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				subnetworkConnection.ProtectionEffort_T _arg4=subnetworkConnection.ProtectionEffort_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg5=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg6= new subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg7= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifySNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg7.value);
				_out.write_string(_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 62: // getAssociatedTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				terminationPoint.TerminationPointList_THolder _arg1= new terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getAssociatedTP(_arg0,_arg1);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 63: // getMLSNPPLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				mLSNPPLink.MultiLayerSNPPLink_THolder _arg2= new mLSNPPLink.MultiLayerSNPPLink_THolder();
				_out = handler.createReply();
				getMLSNPPLink(_arg0,_arg1,_arg2);
				mLSNPPLink.MultiLayerSNPPLink_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 64: // getAllCallIdsWithSNPPOrTNAName
			{
			try
			{
				globaldefs.NameAndStringValue_T _arg0=globaldefs.NameAndStringValue_THelper.read(_input);
				callSNC.CallIdList_THolder _arg1= new callSNC.CallIdList_THolder();
				_out = handler.createReply();
				getAllCallIdsWithSNPPOrTNAName(_arg0,_arg1);
				callSNC.CallIdList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 65: // addRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.RouteCreateData_T _arg1=subnetworkConnection.RouteCreateData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg2=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg3=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.RouteDescriptor_THolder _arg4= new subnetworkConnection.RouteDescriptor_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.RouteDescriptor_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 66: // addConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				subnetworkConnection.SNCCreateData_T[] _arg1=subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnectionList_THolder _arg4= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg5= new subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addConnections(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg4.value);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 67: // createSNC
			{
			try
			{
				subnetworkConnection.SNCCreateData_T _arg0=subnetworkConnection.SNCCreateData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg3= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createSNC(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 68: // getAllSubnetworkConnectionsWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SNCIterator_IHolder _arg4= new subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 69: // getAllCallsAndTopLevelConnectionsWithME
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg2=_input.read_ulong();
				callSNC.CallAndTopLevelConnectionsList_THolder _arg3= new callSNC.CallAndTopLevelConnectionsList_THolder();
				callSNC.CallAndTopLevelConnectionsIterator_IHolder _arg4= new callSNC.CallAndTopLevelConnectionsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				callSNC.CallAndTopLevelConnectionsList_THelper.write(_out,_arg3.value);
				callSNC.CallAndTopLevelConnectionsIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 70: // getAllManagedElementNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2,_arg3);
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
			case 71: // getBackupRoutes
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_arg3._read (_input);
				subnetworkConnection.RouteList_THolder _arg4= new subnetworkConnection.RouteList_THolder();
				_out = handler.createReply();
				getBackupRoutes(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NVSList_THelper.write(_out,_arg3.value);
				subnetworkConnection.RouteList_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 72: // getAllSubordinateMLSNs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				multiLayerSubnetwork.SubnetworkList_THolder _arg2= new multiLayerSubnetwork.SubnetworkList_THolder();
				multiLayerSubnetwork.SubnetworkIterator_IHolder _arg3= new multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllSubordinateMLSNs(_arg0,_arg1,_arg2,_arg3);
				multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg2.value);
				multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 73: // setIntendedRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				globaldefs.NVSList_THolder _arg2= new globaldefs.NVSList_THolder();
				_arg2._read (_input);
				_out = handler.createReply();
				setIntendedRoute(_arg0,_arg1,_arg2);
				globaldefs.NVSList_THelper.write(_out,_arg2.value);
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
