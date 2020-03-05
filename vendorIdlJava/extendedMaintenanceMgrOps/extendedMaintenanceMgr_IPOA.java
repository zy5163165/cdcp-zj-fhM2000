package extendedMaintenanceMgrOps;

/**
 *	Generated from IDL definition of interface "extendedMaintenanceMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class extendedMaintenanceMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, extendedMaintenanceMgrOps.extendedMaintenanceMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(2));
		m_opsHash.put ( "performMaintenanceOperationList", new java.lang.Integer(3));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(4));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(5));
		m_opsHash.put ( "performMaintenanceOperation", new java.lang.Integer(6));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedMaintenanceMgrOps/extendedMaintenanceMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public extendedMaintenanceMgrOps.extendedMaintenanceMgr_I _this()
	{
		return extendedMaintenanceMgrOps.extendedMaintenanceMgr_IHelper.narrow(_this_object());
	}
	public extendedMaintenanceMgrOps.extendedMaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedMaintenanceMgrOps.extendedMaintenanceMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setNativeEMSName
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
			case 3: // performMaintenanceOperationList
			{
			try
			{
				maintenanceOps.CurrentMaintenanceOperation_T[] _arg0=maintenanceOps.CurrentMaintenanceOperationList_THelper.read(_input);
				maintenanceOps.MaintenanceOperationMode_T _arg1=maintenanceOps.MaintenanceOperationMode_THelper.read(_input);
				maintenanceOps.CurrentMaintenanceOperationList_THolder _arg2= new maintenanceOps.CurrentMaintenanceOperationList_THolder();
				_out = handler.createReply();
				performMaintenanceOperationList(_arg0,_arg1,_arg2);
				maintenanceOps.CurrentMaintenanceOperationList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setUserLabel
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
			case 6: // performMaintenanceOperation
			{
			try
			{
				maintenanceOps.CurrentMaintenanceOperation_T _arg0=maintenanceOps.CurrentMaintenanceOperation_THelper.read(_input);
				maintenanceOps.MaintenanceOperationMode_T _arg1=maintenanceOps.MaintenanceOperationMode_THelper.read(_input);
				maintenanceOps.CurrentMaintenanceOperationList_THolder _arg2= new maintenanceOps.CurrentMaintenanceOperationList_THolder();
				_out = handler.createReply();
				performMaintenanceOperation(_arg0,_arg1,_arg2);
				maintenanceOps.CurrentMaintenanceOperationList_THelper.write(_out,_arg2.value);
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
