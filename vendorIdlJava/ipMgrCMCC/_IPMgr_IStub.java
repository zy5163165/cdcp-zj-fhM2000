package ipMgrCMCC;


/**
 *	Generated from IDL definition of interface "IPMgr_I"
 *	@author JacORB IDL compiler 
 */

public class _IPMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements ipMgrCMCC.IPMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/ipMgrCMCC/IPMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = ipMgrCMCC.IPMgr_IOperations.class;
	public void getAllStaticRoutings(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.StaticRoutingList_THolder srList, ipMgrCMCC.StaticRoutingIterator_IHolder srIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllStaticRoutings", true);
				globaldefs.NamingAttributes_THelper.write(_os,managedElementName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				srList.value = ipMgrCMCC.StaticRoutingList_THelper.read(_is);
				srIt.value = ipMgrCMCC.StaticRoutingIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllStaticRoutings", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllStaticRoutings(managedElementName,how_many,srList,srIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllBridges(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.BridgeList_THolder bridgeList, ipMgrCMCC.BridgeIterator_IHolder bridgeIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllBridges", true);
				globaldefs.NamingAttributes_THelper.write(_os,managedElementName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				bridgeList.value = ipMgrCMCC.BridgeList_THelper.read(_is);
				bridgeIt.value = ipMgrCMCC.BridgeIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllBridges", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllBridges(managedElementName,how_many,bridgeList,bridgeIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAdditionalInfo", true);
				globaldefs.NamingAttributes_THelper.write(_os,objectName);
				globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = globaldefs.NVSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAdditionalInfo(objectName,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCapabilities", true);
				_is = _invoke(_os);
				capabilities.value = common.CapabilityList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCapabilities(capabilities);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllVRRPs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.VRRPList_THolder vrrpList, ipMgrCMCC.VRRPIterator_IHolder vrrpIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllVRRPs", true);
				globaldefs.NamingAttributes_THelper.write(_os,managedElementName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				vrrpList.value = ipMgrCMCC.VRRPList_THelper.read(_is);
				vrrpIt.value = ipMgrCMCC.VRRPIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllVRRPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllVRRPs(managedElementName,how_many,vrrpList,vrrpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setUserLabel", true);
				globaldefs.NamingAttributes_THelper.write(_os,objectName);
				_os.write_string(userLabel);
				_os.write_boolean(enforceUniqueness);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setNativeEMSName", true);
				globaldefs.NamingAttributes_THelper.write(_os,objectName);
				_os.write_string(nativeEMSName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.setNativeEMSName(objectName,nativeEMSName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrVRFs(globaldefs.NameAndStringValue_T[] fdfrName, int how_many, ipMgrCMCC.VRFList_THolder vrfList, ipMgrCMCC.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrVRFs", true);
				globaldefs.NamingAttributes_THelper.write(_os,fdfrName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				vrfList.value = ipMgrCMCC.VRFList_THelper.read(_is);
				vrfIt.value = ipMgrCMCC.VRFIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrVRFs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrVRFs(fdfrName,how_many,vrfList,vrfIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFRRs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.FRRList_THolder frrList, ipMgrCMCC.FRRIterator_IHolder frrIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFRRs", true);
				globaldefs.NamingAttributes_THelper.write(_os,managedElementName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				frrList.value = ipMgrCMCC.FRRList_THelper.read(_is);
				frrIt.value = ipMgrCMCC.FRRIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFRRs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFRRs(managedElementName,how_many,frrList,frrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllVRFs(globaldefs.NameAndStringValue_T[] managedElementName, int how_many, ipMgrCMCC.VRFList_THolder vrfList, ipMgrCMCC.VRFIterator_IHolder vrfIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllVRFs", true);
				globaldefs.NamingAttributes_THelper.write(_os,managedElementName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				vrfList.value = ipMgrCMCC.VRFList_THelper.read(_is);
				vrfIt.value = ipMgrCMCC.VRFIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllVRFs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllVRFs(managedElementName,how_many,vrfList,vrfIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setOwner", true);
				globaldefs.NamingAttributes_THelper.write(_os,objectName);
				_os.write_string(owner);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOwner", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IPMgr_IOperations _localServant = (IPMgr_IOperations)_so.servant;
			try
			{
			_localServant.setOwner(objectName,owner);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
