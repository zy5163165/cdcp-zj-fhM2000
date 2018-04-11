package trafficConditioningProfile;

/**
 *	Generated from IDL definition of interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class TCProfileMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, trafficConditioningProfile.TCProfileMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getTCProfile", new java.lang.Integer(0));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(1));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(2));
		m_opsHash.put ( "getTCProfileAssociatedTPs", new java.lang.Integer(3));
		m_opsHash.put ( "modifyTCProfile", new java.lang.Integer(4));
		m_opsHash.put ( "deleteTCProfile", new java.lang.Integer(5));
		m_opsHash.put ( "createTCProfile", new java.lang.Integer(6));
		m_opsHash.put ( "getAllTCProfiles", new java.lang.Integer(7));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(8));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(9));
		m_opsHash.put ( "setOwner", new java.lang.Integer(10));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/trafficConditioningProfile/TCProfileMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public trafficConditioningProfile.TCProfileMgr_I _this()
	{
		return trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object());
	}
	public trafficConditioningProfile.TCProfileMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getTCProfile
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				trafficConditioningProfile.TCProfile_THolder _arg1= new trafficConditioningProfile.TCProfile_THolder();
				_out = handler.createReply();
				getTCProfile(_arg0,_arg1);
				trafficConditioningProfile.TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setAdditionalInfo
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
			case 2: // getCapabilities
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
			case 3: // getTCProfileAssociatedTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg2= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg3= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getTCProfileAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 4: // modifyTCProfile
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				trafficConditioningProfile.TCProfileCreateData_T _arg1=trafficConditioningProfile.TCProfileCreateData_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg2= new subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				trafficConditioningProfile.TCProfile_THolder _arg3= new trafficConditioningProfile.TCProfile_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTCProfile(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				trafficConditioningProfile.TCProfile_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // deleteTCProfile
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				_out = handler.createReply();
				deleteTCProfile(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // createTCProfile
			{
			try
			{
				trafficConditioningProfile.TCProfileCreateData_T _arg0=trafficConditioningProfile.TCProfileCreateData_THelper.read(_input);
				trafficConditioningProfile.TCProfile_THolder _arg1= new trafficConditioningProfile.TCProfile_THolder();
				_out = handler.createReply();
				createTCProfile(_arg0,_arg1);
				trafficConditioningProfile.TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllTCProfiles
			{
			try
			{
				int _arg0=_input.read_ulong();
				trafficConditioningProfile.TCProfileList_THolder _arg1= new trafficConditioningProfile.TCProfileList_THolder();
				trafficConditioningProfile.TCProfileIterator_IHolder _arg2= new trafficConditioningProfile.TCProfileIterator_IHolder();
				_out = handler.createReply();
				getAllTCProfiles(_arg0,_arg1,_arg2);
				trafficConditioningProfile.TCProfileList_THelper.write(_out,_arg1.value);
				trafficConditioningProfile.TCProfileIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setUserLabel
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
			case 10: // setOwner
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
