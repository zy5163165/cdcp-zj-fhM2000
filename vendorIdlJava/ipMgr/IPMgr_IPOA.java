package ipMgr;

/**
 *	Generated from IDL definition of interface "IPMgr_I"
 *	@author JacORB IDL compiler 
 */


public abstract class IPMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ipMgr.IPMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllStaticRoutings", new java.lang.Integer(0));
		m_opsHash.put ( "getAllVRFs", new java.lang.Integer(1));
		m_opsHash.put ( "getAllVRRPs", new java.lang.Integer(2));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(3));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(4));
		m_opsHash.put ( "getFDFrVRFs", new java.lang.Integer(5));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(6));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(7));
		m_opsHash.put ( "getAllFRRs", new java.lang.Integer(8));
		m_opsHash.put ( "getAllBridges", new java.lang.Integer(9));
		m_opsHash.put ( "setOwner", new java.lang.Integer(10));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/ipMgr/IPMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public ipMgr.IPMgr_I _this()
	{
		return ipMgr.IPMgr_IHelper.narrow(_this_object());
	}
	public ipMgr.IPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgr.IPMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllStaticRoutings
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				ipMgr.StaticRoutingList_THolder _arg2= new ipMgr.StaticRoutingList_THolder();
				ipMgr.StaticRoutingIterator_IHolder _arg3= new ipMgr.StaticRoutingIterator_IHolder();
				_out = handler.createReply();
				getAllStaticRoutings(_arg0,_arg1,_arg2,_arg3);
				ipMgr.StaticRoutingList_THelper.write(_out,_arg2.value);
				ipMgr.StaticRoutingIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllVRFs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				ipMgr.VRFList_THolder _arg2= new ipMgr.VRFList_THolder();
				ipMgr.VRFIterator_IHolder _arg3= new ipMgr.VRFIterator_IHolder();
				_out = handler.createReply();
				getAllVRFs(_arg0,_arg1,_arg2,_arg3);
				ipMgr.VRFList_THelper.write(_out,_arg2.value);
				ipMgr.VRFIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllVRRPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				ipMgr.VRRPList_THolder _arg2= new ipMgr.VRRPList_THolder();
				ipMgr.VRRPIterator_IHolder _arg3= new ipMgr.VRRPIterator_IHolder();
				_out = handler.createReply();
				getAllVRRPs(_arg0,_arg1,_arg2,_arg3);
				ipMgr.VRRPList_THelper.write(_out,_arg2.value);
				ipMgr.VRRPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setAdditionalInfo
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
			case 4: // getCapabilities
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
			case 5: // getFDFrVRFs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				ipMgr.VRFList_THolder _arg2= new ipMgr.VRFList_THolder();
				ipMgr.VRFIterator_IHolder _arg3= new ipMgr.VRFIterator_IHolder();
				_out = handler.createReply();
				getFDFrVRFs(_arg0,_arg1,_arg2,_arg3);
				ipMgr.VRFList_THelper.write(_out,_arg2.value);
				ipMgr.VRFIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setUserLabel
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
			case 7: // setNativeEMSName
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
			case 8: // getAllFRRs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				ipMgr.FRRList_THolder _arg2= new ipMgr.FRRList_THolder();
				ipMgr.FRRIterator_IHolder _arg3= new ipMgr.FRRIterator_IHolder();
				_out = handler.createReply();
				getAllFRRs(_arg0,_arg1,_arg2,_arg3);
				ipMgr.FRRList_THelper.write(_out,_arg2.value);
				ipMgr.FRRIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllBridges
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NamingAttributes_THelper.read(_input);
				int _arg1=_input.read_ulong();
				ipMgr.BridgeList_THolder _arg2= new ipMgr.BridgeList_THolder();
				ipMgr.BridgeIterator_IHolder _arg3= new ipMgr.BridgeIterator_IHolder();
				_out = handler.createReply();
				getAllBridges(_arg0,_arg1,_arg2,_arg3);
				ipMgr.BridgeList_THelper.write(_out,_arg2.value);
				ipMgr.BridgeIterator_IHelper.write(_out,_arg3.value);
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
