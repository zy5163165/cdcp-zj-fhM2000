package performance;

/**
 *	Generated from IDL definition of interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class PerformanceManagementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, performance.PerformanceManagementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllPMPs", new java.lang.Integer(0));
		m_opsHash.put ( "getMEPMcapabilities", new java.lang.Integer(1));
		m_opsHash.put ( "createTCAParameterProfile", new java.lang.Integer(2));
		m_opsHash.put ( "setOwner", new java.lang.Integer(3));
		m_opsHash.put ( "enablePMData", new java.lang.Integer(4));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(5));
		m_opsHash.put ( "getAllCurrentPMData", new java.lang.Integer(6));
		m_opsHash.put ( "getHoldingTime", new java.lang.Integer(7));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(8));
		m_opsHash.put ( "setTCAParameterProfile", new java.lang.Integer(9));
		m_opsHash.put ( "getTCAParameterProfile", new java.lang.Integer(10));
		m_opsHash.put ( "getAllTCAParameterProfiles", new java.lang.Integer(11));
		m_opsHash.put ( "getProfileAssociatedTPs", new java.lang.Integer(12));
		m_opsHash.put ( "getHistoryPMDataByPull", new java.lang.Integer(13));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(14));
		m_opsHash.put ( "disableTCA", new java.lang.Integer(15));
		m_opsHash.put ( "enableTCA", new java.lang.Integer(16));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(17));
		m_opsHash.put ( "getHistoryPMData", new java.lang.Integer(18));
		m_opsHash.put ( "setTCATPParameter", new java.lang.Integer(19));
		m_opsHash.put ( "disablePMData", new java.lang.Integer(20));
		m_opsHash.put ( "getAllPMPNames", new java.lang.Integer(21));
		m_opsHash.put ( "getTCATPParameter", new java.lang.Integer(22));
		m_opsHash.put ( "setTCAParameterProfilePointer", new java.lang.Integer(23));
		m_opsHash.put ( "deleteTCAParameterProfile", new java.lang.Integer(24));
		m_opsHash.put ( "getTPHistoryPMData", new java.lang.Integer(25));
		m_opsHash.put ( "clearPMData", new java.lang.Integer(26));
		m_opsHash.put ( "getAllTCAParameterProfileNames", new java.lang.Integer(27));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public performance.PerformanceManagementMgr_I _this()
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllPMPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				performance.PMPList_THolder _arg2= new performance.PMPList_THolder();
				performance.PMPIterator_IHolder _arg3= new performance.PMPIterator_IHolder();
				_out = handler.createReply();
				getAllPMPs(_arg0,_arg1,_arg2,_arg3);
				performance.PMPList_THelper.write(_out,_arg2.value);
				performance.PMPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getMEPMcapabilities
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short _arg1=_input.read_short();
				performance.PMParameterList_THolder _arg2= new performance.PMParameterList_THolder();
				_out = handler.createReply();
				getMEPMcapabilities(_arg0,_arg1,_arg2);
				performance.PMParameterList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // createTCAParameterProfile
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=_input.read_string();
				globaldefs.NameAndStringValue_T[] _arg5=globaldefs.NVSList_THelper.read(_input);
				performance.TCAParameter_T[] _arg6=performance.TCAParameterList_THelper.read(_input);
				performance.TCAParameterProfile_THolder _arg7= new performance.TCAParameterProfile_THolder();
				_out = handler.createReply();
				createTCAParameterProfile(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				performance.TCAParameterProfile_THelper.write(_out,_arg7.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setOwner
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
			case 4: // enablePMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enablePMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setUserLabel
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
			case 6: // getAllCurrentPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				performance.PMDataList_THolder _arg3= new performance.PMDataList_THolder();
				performance.PMDataIterator_IHolder _arg4= new performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMData(_arg0,_arg1,_arg2,_arg3,_arg4);
				performance.PMDataList_THelper.write(_out,_arg3.value);
				performance.PMDataIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getHoldingTime
			{
			try
			{
				performance.HoldingTime_THolder _arg0= new performance.HoldingTime_THolder();
				_out = handler.createReply();
				getHoldingTime(_arg0);
				performance.HoldingTime_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setAdditionalInfo
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
			case 9: // setTCAParameterProfile
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				performance.TCAParameter_T[] _arg1=performance.TCAParameterList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				performance.TCAParameterProfile_THolder _arg3= new performance.TCAParameterProfile_THolder();
				globaldefs.NamingAttributesList_THolder _arg4= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg5= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				setTCAParameterProfile(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				performance.TCAParameterProfile_THelper.write(_out,_arg3.value);
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
			case 10: // getTCAParameterProfile
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				performance.TCAParameterProfile_THolder _arg1= new performance.TCAParameterProfile_THolder();
				_out = handler.createReply();
				getTCAParameterProfile(_arg0,_arg1);
				performance.TCAParameterProfile_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllTCAParameterProfiles
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				performance.TCAParameterProfileList_THolder _arg2= new performance.TCAParameterProfileList_THolder();
				performance.TCAParameterProfileIterator_IHolder _arg3= new performance.TCAParameterProfileIterator_IHolder();
				_out = handler.createReply();
				getAllTCAParameterProfiles(_arg0,_arg1,_arg2,_arg3);
				performance.TCAParameterProfileList_THelper.write(_out,_arg2.value);
				performance.TCAParameterProfileIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getProfileAssociatedTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getProfileAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 13: // getHistoryPMDataByPull
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				performance.PMTPSelect_T[] _arg3=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=globaldefs.Time_THelper.read(_input);
				java.lang.String _arg6=globaldefs.Time_THelper.read(_input);
				_out = handler.createReply();
				getHistoryPMDataByPull(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getCapabilities
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
			case 15: // disableTCA
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disableTCA(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // enableTCA
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enableTCA(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setNativeEMSName
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
			case 18: // getHistoryPMData
			{
			try
			{
				java.lang.String _arg0=performance.Destination_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				performance.PMTPSelect_T[] _arg3=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=globaldefs.Time_THelper.read(_input);
				java.lang.String _arg6=globaldefs.Time_THelper.read(_input);
				boolean _arg7=_input.read_boolean();
				_out = handler.createReply();
				getHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setTCATPParameter
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				performance.TCAParameters_THolder _arg1= new performance.TCAParameters_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTCATPParameter(_arg0,_arg1);
				performance.TCAParameters_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // disablePMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disablePMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllPMPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPMPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 22: // getTCATPParameter
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=performance.Granularity_THelper.read(_input);
				performance.TCAParameters_THolder _arg3= new performance.TCAParameters_THolder();
				_out = handler.createReply();
				getTCATPParameter(_arg0,_arg1,_arg2,_arg3);
				performance.TCAParameters_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // setTCAParameterProfilePointer
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				setTCAParameterProfilePointer(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // deleteTCAParameterProfile
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteTCAParameterProfile(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getTPHistoryPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg2=globaldefs.Time_THelper.read(_input);
				java.lang.String _arg3=globaldefs.Time_THelper.read(_input);
				int _arg4=_input.read_ulong();
				performance.PMDataList_THolder _arg5= new performance.PMDataList_THolder();
				performance.PMDataIterator_IHolder _arg6= new performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getTPHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				performance.PMDataList_THelper.write(_out,_arg5.value);
				performance.PMDataIterator_IHelper.write(_out,_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // clearPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllTCAParameterProfileNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTCAParameterProfileNames(_arg0,_arg1,_arg2,_arg3);
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
