package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "ExtendedEMSMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class ExtendedEMSMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, extendedEmsMgr.ExtendedEMSMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setOwner", new java.lang.Integer(0));
		m_opsHash.put ( "getMEHistoryAlarms", new java.lang.Integer(1));
		m_opsHash.put ( "getAllEMSAndMEActiveAlarmEx", new java.lang.Integer(2));
		m_opsHash.put ( "removeAlarmReportingMask", new java.lang.Integer(3));
		m_opsHash.put ( "removeAlarmFilterTask", new java.lang.Integer(4));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(5));
		m_opsHash.put ( "getAllUnAssignedBcoUnits", new java.lang.Integer(6));
		m_opsHash.put ( "getMEHistoryAlarmsByFtp", new java.lang.Integer(7));
		m_opsHash.put ( "createBusinessCutOverPlan", new java.lang.Integer(8));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(9));
		m_opsHash.put ( "setConcurrencySwitch", new java.lang.Integer(10));
		m_opsHash.put ( "resumeAlarmFilterTask", new java.lang.Integer(11));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(12));
		m_opsHash.put ( "getAllBusinessCutOverGroupList", new java.lang.Integer(13));
		m_opsHash.put ( "pauseAlarmFilterTask", new java.lang.Integer(14));
		m_opsHash.put ( "synchronizeTime", new java.lang.Integer(15));
		m_opsHash.put ( "createAlarmFilterTask", new java.lang.Integer(16));
		m_opsHash.put ( "retrieveAlarmReportingMask", new java.lang.Integer(17));
		m_opsHash.put ( "getAllConfigByPull", new java.lang.Integer(18));
		m_opsHash.put ( "setAlarmReportingMaskOn", new java.lang.Integer(19));
		m_opsHash.put ( "modifyMEG", new java.lang.Integer(20));
		m_opsHash.put ( "deleteMEG", new java.lang.Integer(21));
		m_opsHash.put ( "getAllMEGNames", new java.lang.Integer(22));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(23));
		m_opsHash.put ( "modifyAlarmFilterTask", new java.lang.Integer(24));
		m_opsHash.put ( "changePassword", new java.lang.Integer(25));
		m_opsHash.put ( "setObjStringAttr", new java.lang.Integer(26));
		m_opsHash.put ( "getBusinessCutOverResult", new java.lang.Integer(27));
		m_opsHash.put ( "getAllBusinessCutOverPlansList", new java.lang.Integer(28));
		m_opsHash.put ( "createMEG", new java.lang.Integer(29));
		m_opsHash.put ( "getAllAlarmFilterTask", new java.lang.Integer(30));
		m_opsHash.put ( "performBusinessCutOverPlan", new java.lang.Integer(31));
		m_opsHash.put ( "getAllLogHistoryByFtp", new java.lang.Integer(32));
		m_opsHash.put ( "assignProfile", new java.lang.Integer(33));
		m_opsHash.put ( "getMEG", new java.lang.Integer(34));
		m_opsHash.put ( "setObjAttr", new java.lang.Integer(35));
		m_opsHash.put ( "getAllConfigByFtp", new java.lang.Integer(36));
		m_opsHash.put ( "deleteBusinessCutOverGroup", new java.lang.Integer(37));
		m_opsHash.put ( "deleteBusinessCutOverPlan", new java.lang.Integer(38));
		m_opsHash.put ( "setHeartBeatInterval", new java.lang.Integer(39));
		m_opsHash.put ( "modifyBusinessCutOverGroup", new java.lang.Integer(40));
		m_opsHash.put ( "getEmsExtraParams", new java.lang.Integer(41));
		m_opsHash.put ( "setEmsExtraParams", new java.lang.Integer(42));
		m_opsHash.put ( "getAllMEGs", new java.lang.Integer(43));
		m_opsHash.put ( "createBusinessCutOverGroup", new java.lang.Integer(44));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/ExtendedEMSMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public extendedEmsMgr.ExtendedEMSMgr_I _this()
	{
		return extendedEmsMgr.ExtendedEMSMgr_IHelper.narrow(_this_object());
	}
	public extendedEmsMgr.ExtendedEMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedEmsMgr.ExtendedEMSMgr_IHelper.narrow(_this_object(orb));
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
			case 1: // getMEHistoryAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String[] _arg1=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg2=notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg3=globaldefs.Time_THelper.read(_input);
				java.lang.String _arg4=globaldefs.Time_THelper.read(_input);
				int _arg5=_input.read_ulong();
				notifications.EventList_THolder _arg6= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg7= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getMEHistoryAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				notifications.EventList_THelper.write(_out,_arg6.value);
				notifications.EventIterator_IHelper.write(_out,_arg7.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllEMSAndMEActiveAlarmEx
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String[] _arg2=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg3=notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg4=globaldefs.Time_THelper.read(_input);
				java.lang.String _arg5=globaldefs.Time_THelper.read(_input);
				int _arg6=_input.read_ulong();
				notifications.EventList_THolder _arg7= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg8= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSAndMEActiveAlarmEx(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				notifications.EventList_THelper.write(_out,_arg7.value);
				notifications.EventIterator_IHelper.write(_out,_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // removeAlarmReportingMask
			{
			try
			{
				extendedEmsMgr.AlarmReportingMask_T _arg0=extendedEmsMgr.AlarmReportingMask_THelper.read(_input);
				_out = handler.createReply();
				removeAlarmReportingMask(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // removeAlarmFilterTask
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				removeAlarmFilterTask(_arg0);
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
			case 6: // getAllUnAssignedBcoUnits
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedEmsMgr.NamePairList_THolder _arg1= new extendedEmsMgr.NamePairList_THolder();
				_out = handler.createReply();
				getAllUnAssignedBcoUnits(_arg0,_arg1);
				extendedEmsMgr.NamePairList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getMEHistoryAlarmsByFtp
			{
			try
			{
				extendedEmsMgr.HistoryAlarmsTask_T _arg0=extendedEmsMgr.HistoryAlarmsTask_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				_out = handler.createReply();
				getMEHistoryAlarmsByFtp(_arg0,_arg1,_arg2,_arg3);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // createBusinessCutOverPlan
			{
			try
			{
				extendedEmsMgr.BusinessCutOverPlan_T _arg0=extendedEmsMgr.BusinessCutOverPlan_THelper.read(_input);
				_out = handler.createReply();
				createBusinessCutOverPlan(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setNativeEMSName
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
			case 10: // setConcurrencySwitch
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				setConcurrencySwitch(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // resumeAlarmFilterTask
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				resumeAlarmFilterTask(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getCapabilities
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
			case 13: // getAllBusinessCutOverGroupList
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedEmsMgr.BusinessCutOverGroupList_THolder _arg1= new extendedEmsMgr.BusinessCutOverGroupList_THolder();
				_out = handler.createReply();
				getAllBusinessCutOverGroupList(_arg0,_arg1);
				extendedEmsMgr.BusinessCutOverGroupList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // pauseAlarmFilterTask
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				pauseAlarmFilterTask(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // synchronizeTime
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				java.lang.String _arg1=globaldefs.Time_THelper.read(_input);
				_out = handler.createReply();
				synchronizeTime(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // createAlarmFilterTask
			{
			try
			{
				extendedEmsMgr.AlarmFilterTask_T _arg0=extendedEmsMgr.AlarmFilterTask_THelper.read(_input);
				_out = handler.createReply();
				createAlarmFilterTask(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // retrieveAlarmReportingMask
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short _arg1=_input.read_short();
				int _arg2=_input.read_ulong();
				extendedEmsMgr.AlarmReportingMaskList_THolder _arg3= new extendedEmsMgr.AlarmReportingMaskList_THolder();
				extendedEmsMgr.AlarmReportingMaskIterator_IHolder _arg4= new extendedEmsMgr.AlarmReportingMaskIterator_IHolder();
				_out = handler.createReply();
				retrieveAlarmReportingMask(_arg0,_arg1,_arg2,_arg3,_arg4);
				extendedEmsMgr.AlarmReportingMaskList_THelper.write(_out,_arg3.value);
				extendedEmsMgr.AlarmReportingMaskIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAllConfigByPull
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=extendedManagedElementManager.StringList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				java.lang.String _arg4=extendedEmsMgr.ExtendedEMSMgr_IPackage.Destination_THelper.read(_input);
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				_out = handler.createReply();
				getAllConfigByPull(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setAlarmReportingMaskOn
			{
			try
			{
				extendedEmsMgr.AlarmReportingMask_T _arg0=extendedEmsMgr.AlarmReportingMask_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingMaskOn(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // modifyMEG
			{
			try
			{
				extendedEmsMgr.EXMegEntityData_T _arg0=extendedEmsMgr.EXMegEntityData_THelper.read(_input);
				_out = handler.createReply();
				modifyMEG(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // deleteMEG
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteMEG(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllMEGNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMEGNames(_arg0,_arg1,_arg2);
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
			case 23: // setUserLabel
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
			case 24: // modifyAlarmFilterTask
			{
			try
			{
				extendedEmsMgr.AlarmFilterTask_T _arg0=extendedEmsMgr.AlarmFilterTask_THelper.read(_input);
				_out = handler.createReply();
				modifyAlarmFilterTask(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // changePassword
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				_out = handler.createReply();
				changePassword(_arg0,_arg1,_arg2,_arg3);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // setObjStringAttr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedEmsMgr.ClassType_T[] _arg1=extendedEmsMgr.ClassTypeList_THelper.read(_input);
				extendedEmsMgr.OperationType_T _arg2=extendedEmsMgr.OperationType_THelper.read(_input);
				java.lang.String _arg3=_input.read_string();
				globaldefs.NameAndStringValue_T[] _arg4=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setObjStringAttr(_arg0,_arg1,_arg2,_arg3,_arg4);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getBusinessCutOverResult
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				extendedEmsMgr.NamePairList_THolder _arg2= new extendedEmsMgr.NamePairList_THolder();
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				getBusinessCutOverResult(_arg0,_arg1,_arg2,_arg3);
				_out.write_string(_arg1.value);
				extendedEmsMgr.NamePairList_THelper.write(_out,_arg2.value);
				globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getAllBusinessCutOverPlansList
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				extendedEmsMgr.BusinessCutOverPlanList_THolder _arg2= new extendedEmsMgr.BusinessCutOverPlanList_THolder();
				extendedEmsMgr.BusinessCutOverPlanIterator_IHolder _arg3= new extendedEmsMgr.BusinessCutOverPlanIterator_IHolder();
				_out = handler.createReply();
				getAllBusinessCutOverPlansList(_arg0,_arg1,_arg2,_arg3);
				extendedEmsMgr.BusinessCutOverPlanList_THelper.write(_out,_arg2.value);
				extendedEmsMgr.BusinessCutOverPlanIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // createMEG
			{
			try
			{
				extendedEmsMgr.EXMegEntityData_T _arg0=extendedEmsMgr.EXMegEntityData_THelper.read(_input);
				extendedEmsMgr.EXMegEntityData_THolder _arg1= new extendedEmsMgr.EXMegEntityData_THolder();
				_out = handler.createReply();
				createMEG(_arg0,_arg1);
				extendedEmsMgr.EXMegEntityData_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllAlarmFilterTask
			{
			try
			{
				int _arg0=_input.read_ulong();
				extendedEmsMgr.AlarmFilterTaskList_THolder _arg1= new extendedEmsMgr.AlarmFilterTaskList_THolder();
				extendedEmsMgr.AlarmFilterTaskIterator_IHolder _arg2= new extendedEmsMgr.AlarmFilterTaskIterator_IHolder();
				_out = handler.createReply();
				getAllAlarmFilterTask(_arg0,_arg1,_arg2);
				extendedEmsMgr.AlarmFilterTaskList_THelper.write(_out,_arg1.value);
				extendedEmsMgr.AlarmFilterTaskIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // performBusinessCutOverPlan
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				performBusinessCutOverPlan(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getAllLogHistoryByFtp
			{
			try
			{
				extendedEmsMgr.LogTransmissionTask_T _arg0=extendedEmsMgr.LogTransmissionTask_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				_out = handler.createReply();
				getAllLogHistoryByFtp(_arg0,_arg1,_arg2,_arg3);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // assignProfile
			{
			try
			{
				extendedEmsMgr.ProfileAssignTask_T _arg0=extendedEmsMgr.ProfileAssignTask_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				assignProfile(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getMEG
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedEmsMgr.EXMegEntityData_THolder _arg1= new extendedEmsMgr.EXMegEntityData_THolder();
				_out = handler.createReply();
				getMEG(_arg0,_arg1);
				extendedEmsMgr.EXMegEntityData_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // setObjAttr
			{
			try
			{
				extendedEmsMgr.ObjectAndAttr_T[] _arg0=extendedEmsMgr.ObjectAndAttrList_THelper.read(_input);
				extendedEmsMgr.OperationType_T _arg1=extendedEmsMgr.OperationType_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setObjAttr(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getAllConfigByFtp
			{
			try
			{
				extendedEmsMgr.ConfigureTransmissionTask_T _arg0=extendedEmsMgr.ConfigureTransmissionTask_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				_out = handler.createReply();
				getAllConfigByFtp(_arg0,_arg1,_arg2,_arg3);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // deleteBusinessCutOverGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteBusinessCutOverGroup(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // deleteBusinessCutOverPlan
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteBusinessCutOverPlan(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // setHeartBeatInterval
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				setHeartBeatInterval(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // modifyBusinessCutOverGroup
			{
			try
			{
				extendedEmsMgr.BusinessCutOverGroup_T _arg0=extendedEmsMgr.BusinessCutOverGroup_THelper.read(_input);
				_out = handler.createReply();
				modifyBusinessCutOverGroup(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getEmsExtraParams
			{
			try
			{
				globaldefs.NVSList_THolder _arg0= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				getEmsExtraParams(_arg0);
				globaldefs.NVSList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // setEmsExtraParams
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				setEmsExtraParams(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // getAllMEGs
			{
			try
			{
				int _arg0=_input.read_ulong();
				extendedEmsMgr.EXMegEntityDataList_THolder _arg1= new extendedEmsMgr.EXMegEntityDataList_THolder();
				extendedEmsMgr.EXMegEntityDataIterator_IHolder _arg2= new extendedEmsMgr.EXMegEntityDataIterator_IHolder();
				_out = handler.createReply();
				getAllMEGs(_arg0,_arg1,_arg2);
				extendedEmsMgr.EXMegEntityDataList_THelper.write(_out,_arg1.value);
				extendedEmsMgr.EXMegEntityDataIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // createBusinessCutOverGroup
			{
			try
			{
				extendedEmsMgr.BusinessCutOverGroup_T _arg0=extendedEmsMgr.BusinessCutOverGroup_THelper.read(_input);
				_out = handler.createReply();
				createBusinessCutOverGroup(_arg0);
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
