package managedElementManager;

/**
 *	Generated from IDL definition of interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "modifyGTP", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "getContainedPotentialTPs", new java.lang.Integer(2));
		m_opsHash.put ( "getAllUnacknowledgedActiveAlarms", new java.lang.Integer(3));
		m_opsHash.put ( "getContainedCurrentTPNames", new java.lang.Integer(4));
		m_opsHash.put ( "getContainedInUseTPNames", new java.lang.Integer(5));
		m_opsHash.put ( "getAllPTPNamesWithoutFTPs", new java.lang.Integer(6));
		m_opsHash.put ( "getManagedElement", new java.lang.Integer(7));
		m_opsHash.put ( "getAllFixedCrossConnections", new java.lang.Integer(8));
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(9));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(10));
		m_opsHash.put ( "getAllPTPNames", new java.lang.Integer(11));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(12));
		m_opsHash.put ( "getAllFTPs", new java.lang.Integer(13));
		m_opsHash.put ( "getContainingSubnetworkNames", new java.lang.Integer(14));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(15));
		m_opsHash.put ( "setGtpAlarmReportingOff", new java.lang.Integer(16));
		m_opsHash.put ( "getAllGTPNames", new java.lang.Integer(17));
		m_opsHash.put ( "getContainingTPs", new java.lang.Integer(18));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(19));
		m_opsHash.put ( "setTPData", new java.lang.Integer(20));
		m_opsHash.put ( "getContainedInUseTPs", new java.lang.Integer(21));
		m_opsHash.put ( "getAllPTPs", new java.lang.Integer(22));
		m_opsHash.put ( "getAllPTPsWithoutFTPs", new java.lang.Integer(23));
		m_opsHash.put ( "deleteGTP", new java.lang.Integer(24));
		m_opsHash.put ( "getAllGTPs", new java.lang.Integer(25));
		m_opsHash.put ( "getPotentialFixedCCs", new java.lang.Integer(26));
		m_opsHash.put ( "getContainingGTP", new java.lang.Integer(27));
		m_opsHash.put ( "getTP", new java.lang.Integer(28));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(29));
		m_opsHash.put ( "getContainedPotentialTPNames", new java.lang.Integer(30));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(31));
		m_opsHash.put ( "setGtpAlarmReportingOn", new java.lang.Integer(32));
		m_opsHash.put ( "verifyTMDAssignment", new java.lang.Integer(33));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(34));
		m_opsHash.put ( "getAllFTPNames", new java.lang.Integer(35));
		m_opsHash.put ( "createGTP", new java.lang.Integer(36));
		m_opsHash.put ( "getContainedCurrentTPs", new java.lang.Integer(37));
		m_opsHash.put ( "getContainingTPNames", new java.lang.Integer(38));
		m_opsHash.put ( "getGTP", new java.lang.Integer(39));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public managedElementManager.ManagedElementMgr_I _this()
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // modifyGTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				terminationPoint.GTP_THolder _arg3= new terminationPoint.GTP_THolder();
				_out = handler.createReply();
				modifyGTP(_arg0,_arg1,_arg2,_arg3);
				terminationPoint.GTP_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setOwner
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
			case 2: // getContainedPotentialTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getAllUnacknowledgedActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String[] _arg1=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg2=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				notifications.EventList_THolder _arg4= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg5= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllUnacknowledgedActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				notifications.EventList_THelper.write(_out,_arg4.value);
				notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getContainedCurrentTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 5: // getContainedInUseTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 6: // getAllPTPNamesWithoutFTPs
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
				getAllPTPNamesWithoutFTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 7: // getManagedElement
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				managedElement.ManagedElement_THolder _arg1= new managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllFixedCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.CrossConnectList_THolder _arg3= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CCIterator_IHolder _arg4= new subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllFixedCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 9: // getAllCrossConnections
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
			case 10: // setAdditionalInfo
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
			case 11: // getAllPTPNames
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
				getAllPTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 12: // setNativeEMSName
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
			case 13: // getAllFTPs
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
				getAllFTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 14: // getContainingSubnetworkNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingSubnetworkNames(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getCapabilities
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
			case 16: // setGtpAlarmReportingOff
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				setGtpAlarmReportingOff(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllGTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllGTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 18: // getContainingTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				terminationPoint.TerminationPointList_THolder _arg1= new terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getContainingTPs(_arg0,_arg1);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllManagedElementNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // setTPData
			{
			try
			{
				subnetworkConnection.TPData_T _arg0=subnetworkConnection.TPData_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getContainedInUseTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllPTPs
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
				getAllPTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 23: // getAllPTPsWithoutFTPs
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
				getAllPTPsWithoutFTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 24: // deleteGTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteGTP(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllGTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.GTPlist_THolder _arg3= new terminationPoint.GTPlist_THolder();
				terminationPoint.GTPiterator_IHolder _arg4= new terminationPoint.GTPiterator_IHolder();
				_out = handler.createReply();
				getAllGTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.GTPlist_THelper.write(_out,_arg3.value);
				terminationPoint.GTPiterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getPotentialFixedCCs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				globaldefs.NVSList_THolder _arg2= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				getPotentialFixedCCs(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributes_THelper.write(_out,_arg1.value);
				globaldefs.NamingAttributes_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getContainingGTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				terminationPoint.GTP_THolder _arg1= new terminationPoint.GTP_THolder();
				_out = handler.createReply();
				getContainingGTP(_arg0,_arg1);
				terminationPoint.GTP_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String[] _arg1=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg2=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				notifications.EventList_THolder _arg4= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg5= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				notifications.EventList_THelper.write(_out,_arg4.value);
				notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getContainedPotentialTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 31: // setUserLabel
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
			case 32: // setGtpAlarmReportingOn
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				setGtpAlarmReportingOn(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // verifyTMDAssignment
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				terminationPoint.Directionality_T _arg1=terminationPoint.Directionality_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				transmissionParameters.LayeredParameterList_THolder _arg3= new transmissionParameters.LayeredParameterList_THolder();
				globaldefs.NVSList_THolder _arg4= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				verifyTMDAssignment(_arg0,_arg1,_arg2,_arg3,_arg4);
				_out.write_string(_arg2.value);
				transmissionParameters.LayeredParameterList_THelper.write(_out,_arg3.value);
				globaldefs.NVSList_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllManagedElements
			{
			try
			{
				int _arg0=_input.read_ulong();
				managedElement.ManagedElementList_THolder _arg1= new managedElement.ManagedElementList_THolder();
				managedElement.ManagedElementIterator_IHolder _arg2= new managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2);
				managedElement.ManagedElementList_THelper.write(_out,_arg1.value);
				managedElement.ManagedElementIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getAllFTPNames
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
				getAllFTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 36: // createGTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				boolean _arg1=_input.read_boolean();
				java.lang.String _arg2=_input.read_string();
				globaldefs.NameAndStringValue_T[][] _arg3=globaldefs.NamingAttributesList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg4=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg5=_input.read_ulong();
				terminationPoint.GTPEffort_T _arg6=terminationPoint.GTPEffort_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg7=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.GTP_THolder _arg8= new terminationPoint.GTP_THolder();
				_out = handler.createReply();
				createGTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				terminationPoint.GTP_THelper.write(_out,_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getContainedCurrentTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getContainingTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingTPNames(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getGTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				terminationPoint.GTP_THolder _arg1= new terminationPoint.GTP_THolder();
				_out = handler.createReply();
				getGTP(_arg0,_arg1);
				terminationPoint.GTP_THelper.write(_out,_arg1.value);
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
