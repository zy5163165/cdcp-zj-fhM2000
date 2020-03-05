package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of interface "ExtendedFlowDomainMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class ExtendedFlowDomainMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, extendedFlowDomainMgr.ExtendedFlowDomainMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setOwner", new java.lang.Integer(0));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(1));
		m_opsHash.put ( "createFdFr", new java.lang.Integer(2));
		m_opsHash.put ( "deleteExMFdFrs", new java.lang.Integer(3));
		m_opsHash.put ( "adjustmentFdFrRoute", new java.lang.Integer(4));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(5));
		m_opsHash.put ( "getAllExMFdFrInMeSingleMeRoute", new java.lang.Integer(6));
		m_opsHash.put ( "createExMFdFr", new java.lang.Integer(7));
		m_opsHash.put ( "getPreCutOverFdFr", new java.lang.Integer(8));
		m_opsHash.put ( "deActivateFdFrs", new java.lang.Integer(9));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(10));
		m_opsHash.put ( "activateFdFrs", new java.lang.Integer(11));
		m_opsHash.put ( "getAllExMFdFrInMe", new java.lang.Integer(12));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(13));
		m_opsHash.put ( "modifyFdFr", new java.lang.Integer(14));
		m_opsHash.put ( "deActivateExMFdFrs", new java.lang.Integer(15));
		m_opsHash.put ( "activateExMFdFrs", new java.lang.Integer(16));
		m_opsHash.put ( "getExFDFrRoute", new java.lang.Integer(17));
		m_opsHash.put ( "modifyExMFdFr", new java.lang.Integer(18));
		m_opsHash.put ( "createPreCutOverFdFr", new java.lang.Integer(19));
		m_opsHash.put ( "deleteFdFrs", new java.lang.Integer(20));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedFlowDomainMgr/ExtendedFlowDomainMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public extendedFlowDomainMgr.ExtendedFlowDomainMgr_I _this()
	{
		return extendedFlowDomainMgr.ExtendedFlowDomainMgr_IHelper.narrow(_this_object());
	}
	public extendedFlowDomainMgr.ExtendedFlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedFlowDomainMgr.ExtendedFlowDomainMgr_IHelper.narrow(_this_object(orb));
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
			case 2: // createFdFr
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				flowDomainFragment.FlowDomainFragment_T _arg1=flowDomainFragment.FlowDomainFragment_THelper.read(_input);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_T _arg2=extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.read(_input);
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				createFdFr(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributes_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // deleteExMFdFrs
			{
			try
			{
				extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] _arg0=extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder _arg2= new extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder();
				_out = handler.createReply();
				deleteExMFdFrs(_arg0,_arg1,_arg2);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // adjustmentFdFrRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_T _arg1=extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.read(_input);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_T _arg2=extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.read(_input);
				flowDomainFragment.FlowDomainFragment_THolder _arg3= new flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				adjustmentFdFrRoute(_arg0,_arg1,_arg2,_arg3);
				flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg3.value);
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
			case 6: // getAllExMFdFrInMeSingleMeRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				flowDomainFragment.FDFrList_THolder _arg3= new flowDomainFragment.FDFrList_THolder();
				flowDomainFragment.FDFrIterator_IHolder _arg4= new flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllExMFdFrInMeSingleMeRoute(_arg0,_arg1,_arg2,_arg3,_arg4);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg3.value);
				flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // createExMFdFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T _arg1=extendedFlowDomainMgr.ExMatrixFlowDomainFragment_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_T _arg3=extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.read(_input);
				_out = handler.createReply();
				createExMFdFr(_arg0,_arg1,_arg2,_arg3);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getPreCutOverFdFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				flowDomainFragment.FDFrList_THolder _arg3= new flowDomainFragment.FDFrList_THolder();
				flowDomainFragment.FDFrIterator_IHolder _arg4= new flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getPreCutOverFdFr(_arg0,_arg1,_arg2,_arg3,_arg4);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg3.value);
				flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // deActivateFdFrs
			{
			try
			{
				flowDomainFragment.FlowDomainFragment_T[] _arg0=flowDomainFragment.FDFrList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				flowDomainFragment.FDFrList_THolder _arg2= new flowDomainFragment.FDFrList_THolder();
				_out = handler.createReply();
				deActivateFdFrs(_arg0,_arg1,_arg2);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getCapabilities
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
			case 11: // activateFdFrs
			{
			try
			{
				flowDomainFragment.FlowDomainFragment_T[] _arg0=flowDomainFragment.FDFrList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				flowDomainFragment.FDFrList_THolder _arg2= new flowDomainFragment.FDFrList_THolder();
				_out = handler.createReply();
				activateFdFrs(_arg0,_arg1,_arg2);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllExMFdFrInMe
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder _arg3= new extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder();
				extendedFlowDomainMgr.ExMFDFrIterator_IHolder _arg4= new extendedFlowDomainMgr.ExMFDFrIterator_IHolder();
				_out = handler.createReply();
				getAllExMFdFrInMe(_arg0,_arg1,_arg2,_arg3,_arg4);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_out,_arg3.value);
				extendedFlowDomainMgr.ExMFDFrIterator_IHelper.write(_out,_arg4.value);
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
			case 14: // modifyFdFr
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				flowDomainFragment.FlowDomainFragment_T _arg1=flowDomainFragment.FlowDomainFragment_THelper.read(_input);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_T _arg2=extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.read(_input);
				flowDomainFragment.FlowDomainFragment_THolder _arg3= new flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				modifyFdFr(_arg0,_arg1,_arg2,_arg3);
				flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // deActivateExMFdFrs
			{
			try
			{
				extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] _arg0=extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder _arg2= new extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder();
				_out = handler.createReply();
				deActivateExMFdFrs(_arg0,_arg1,_arg2);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // activateExMFdFrs
			{
			try
			{
				extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] _arg0=extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder _arg2= new extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder();
				_out = handler.createReply();
				activateExMFdFrs(_arg0,_arg1,_arg2);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getExFDFrRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder _arg1= new extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder();
				_out = handler.createReply();
				getExFDFrRoute(_arg0,_arg1);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // modifyExMFdFr
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NamingAttributes_THelper.read(_input);
				flowDomainFragment.FlowDomainFragment_T _arg2=flowDomainFragment.FlowDomainFragment_THelper.read(_input);
				_out = handler.createReply();
				modifyExMFdFr(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // createPreCutOverFdFr
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				flowDomainFragment.FlowDomainFragment_T _arg1=flowDomainFragment.FlowDomainFragment_THelper.read(_input);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_T _arg2=extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.read(_input);
				_out = handler.createReply();
				createPreCutOverFdFr(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // deleteFdFrs
			{
			try
			{
				flowDomainFragment.FlowDomainFragment_T[] _arg0=flowDomainFragment.FDFrList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				flowDomainFragment.FDFrList_THolder _arg2= new flowDomainFragment.FDFrList_THolder();
				_out = handler.createReply();
				deleteFdFrs(_arg0,_arg1,_arg2);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg2.value);
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
