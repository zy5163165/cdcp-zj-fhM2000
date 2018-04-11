package extendedFlowDomainMgr;


/**
 *	Generated from IDL definition of interface "ExtendedFlowDomainMgr_I"
 *	@author JacORB IDL compiler 
 */

public class _ExtendedFlowDomainMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements extendedFlowDomainMgr.ExtendedFlowDomainMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedFlowDomainMgr/ExtendedFlowDomainMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = extendedFlowDomainMgr.ExtendedFlowDomainMgr_IOperations.class;
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
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
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
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
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

	public void createFdFr(java.lang.String createType, flowDomainFragment.FlowDomainFragment_T fdFrToCreate, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo, globaldefs.NVSList_THolder fdfrName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFdFr", true);
				_os.write_string(createType);
				flowDomainFragment.FlowDomainFragment_THelper.write(_os,fdFrToCreate);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.write(_os,fdFrCreateAdditonInfo);
				_is = _invoke(_os);
				fdfrName.value = globaldefs.NamingAttributes_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFdFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.createFdFr(createType,fdFrToCreate,fdFrCreateAdditonInfo,fdfrName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteExMFdFrs", true);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_os,exMFdFrs);
				_os.write_string(exParam);
				_is = _invoke(_os);
				exFailedMFdFrs.value = extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteExMFdFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteExMFdFrs(exMFdFrs,exParam,exFailedMFdFrs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void adjustmentFdFrRoute(globaldefs.NameAndStringValue_T[] fdfrNameToAdjust, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrAdjustParam, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrAdjustOrder, flowDomainFragment.FlowDomainFragment_THolder fdFrSuccess) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "adjustmentFdFrRoute", true);
				globaldefs.NamingAttributes_THelper.write(_os,fdfrNameToAdjust);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.write(_os,fdFrAdjustParam);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.write(_os,fdFrAdjustOrder);
				_is = _invoke(_os);
				fdFrSuccess.value = flowDomainFragment.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "adjustmentFdFrRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.adjustmentFdFrRoute(fdfrNameToAdjust,fdFrAdjustParam,fdFrAdjustOrder,fdFrSuccess);
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
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
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

	public void getAllExMFdFrInMeSingleMeRoute(globaldefs.NameAndStringValue_T[] meName, short[] layerList, int how_many, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllExMFdFrInMeSingleMeRoute", true);
				globaldefs.NamingAttributes_THelper.write(_os,meName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				fdfrList.value = flowDomainFragment.FDFrList_THelper.read(_is);
				fdfrIt.value = flowDomainFragment.FDFrIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllExMFdFrInMeSingleMeRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllExMFdFrInMeSingleMeRoute(meName,layerList,how_many,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createExMFdFr(globaldefs.NameAndStringValue_T[] meName, extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T exMFdFrToCreate, java.lang.String exParam, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createExMFdFr", true);
				globaldefs.NamingAttributes_THelper.write(_os,meName);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragment_THelper.write(_os,exMFdFrToCreate);
				_os.write_string(exParam);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.write(_os,fdFrCreateAdditonInfo);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createExMFdFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.createExMFdFr(meName,exMFdFrToCreate,exParam,fdFrCreateAdditonInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getPreCutOverFdFr(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getPreCutOverFdFr", true);
				globaldefs.NamingAttributes_THelper.write(_os,fdName);
				_os.write_ulong(how_many);
				transmissionParameters.LayerRateList_THelper.write(_os,connectivityRateList);
				_is = _invoke(_os);
				fdfrList.value = flowDomainFragment.FDFrList_THelper.read(_is);
				fdfrIt.value = flowDomainFragment.FDFrIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getPreCutOverFdFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getPreCutOverFdFr(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deActivateFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deActivateFdFrs", true);
				flowDomainFragment.FDFrList_THelper.write(_os,fdfrList);
				_os.write_string(exParam);
				_is = _invoke(_os);
				failedFdfrList.value = flowDomainFragment.FDFrList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deActivateFdFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deActivateFdFrs(fdfrList,exParam,failedFdfrList);
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
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
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

	public void activateFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateFdFrs", true);
				flowDomainFragment.FDFrList_THelper.write(_os,fdfrList);
				_os.write_string(exParam);
				_is = _invoke(_os);
				failedFdfrList.value = flowDomainFragment.FDFrList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateFdFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateFdFrs(fdfrList,exParam,failedFdfrList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllExMFdFrInMe(globaldefs.NameAndStringValue_T[] meName, short[] layerList, int how_many, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exMFdFrList, extendedFlowDomainMgr.ExMFDFrIterator_IHolder exMFdFrIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllExMFdFrInMe", true);
				globaldefs.NamingAttributes_THelper.write(_os,meName);
				transmissionParameters.LayerRateList_THelper.write(_os,layerList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				exMFdFrList.value = extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_is);
				exMFdFrIt.value = extendedFlowDomainMgr.ExMFDFrIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllExMFdFrInMe", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllExMFdFrInMe(meName,layerList,how_many,exMFdFrList,exMFdFrIt);
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
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
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

	public void modifyFdFr(java.lang.String modifyType, flowDomainFragment.FlowDomainFragment_T fdFrToModify, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrModifyAdditonInfo, flowDomainFragment.FlowDomainFragment_THolder fdFrSuccess) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyFdFr", true);
				_os.write_string(modifyType);
				flowDomainFragment.FlowDomainFragment_THelper.write(_os,fdFrToModify);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.write(_os,fdFrModifyAdditonInfo);
				_is = _invoke(_os);
				fdFrSuccess.value = flowDomainFragment.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyFdFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyFdFr(modifyType,fdFrToModify,fdFrModifyAdditonInfo,fdFrSuccess);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deActivateExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deActivateExMFdFrs", true);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_os,exMFdFrs);
				_os.write_string(exParam);
				_is = _invoke(_os);
				exFailedMFdFrs.value = extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deActivateExMFdFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deActivateExMFdFrs(exMFdFrs,exParam,exFailedMFdFrs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateExMFdFrs", true);
				extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.write(_os,exMFdFrs);
				_os.write_string(exParam);
				_is = _invoke(_os);
				exFailedMFdFrs.value = extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateExMFdFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateExMFdFrs(exMFdFrs,exParam,exFailedMFdFrs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getExFDFrRoute(globaldefs.NameAndStringValue_T[] fdfrName, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder route) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getExFDFrRoute", true);
				globaldefs.NamingAttributes_THelper.write(_os,fdfrName);
				_is = _invoke(_os);
				route.value = extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getExFDFrRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getExFDFrRoute(fdfrName,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyExMFdFr(java.lang.String modifyType, globaldefs.NameAndStringValue_T[] mfdfrToModify, flowDomainFragment.FlowDomainFragment_T mFdFrModifyAdditonInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyExMFdFr", true);
				_os.write_string(modifyType);
				globaldefs.NamingAttributes_THelper.write(_os,mfdfrToModify);
				flowDomainFragment.FlowDomainFragment_THelper.write(_os,mFdFrModifyAdditonInfo);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyExMFdFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyExMFdFr(modifyType,mfdfrToModify,mFdFrModifyAdditonInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createPreCutOverFdFr(java.lang.String createType, flowDomainFragment.FlowDomainFragment_T fdFrToCreate, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createPreCutOverFdFr", true);
				_os.write_string(createType);
				flowDomainFragment.FlowDomainFragment_THelper.write(_os,fdFrToCreate);
				extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.write(_os,fdFrCreateAdditonInfo);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createPreCutOverFdFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.createPreCutOverFdFr(createType,fdFrToCreate,fdFrCreateAdditonInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteFdFrs", true);
				flowDomainFragment.FDFrList_THelper.write(_os,fdfrList);
				_os.write_string(exParam);
				_is = _invoke(_os);
				failedFdfrList.value = flowDomainFragment.FDFrList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFdFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedFlowDomainMgr_IOperations _localServant = (ExtendedFlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteFdFrs(fdfrList,exParam,failedFdfrList);
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
