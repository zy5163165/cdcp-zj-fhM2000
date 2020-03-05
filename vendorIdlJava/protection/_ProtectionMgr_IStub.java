package protection;


/**
 *	Generated from IDL definition of interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler 
 */

public class _ProtectionMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements protection.ProtectionMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = protection.ProtectionMgr_IOperations.class;
	public void getAllProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.ProtectionGroupList_THolder pgList, protection.ProtectionGroupIterator_IHolder pgpIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllProtectionGroups", true);
				globaldefs.NamingAttributes_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pgList.value = protection.ProtectionGroupList_THelper.read(_is);
				pgpIt.value = protection.ProtectionGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllProtectionGroups(meName,how_many,pgList,pgpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.EProtectionGroupList_THolder epgpList, protection.EProtectionGroupIterator_IHolder epgpIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEProtectionGroups", true);
				globaldefs.NamingAttributes_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				epgpList.value = protection.EProtectionGroupList_THelper.read(_is);
				epgpIt.value = protection.EProtectionGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEProtectionGroups(meName,how_many,epgpList,epgpIt);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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

	public void getAllProtectedTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllProtectedTPNames", true);
				globaldefs.NamingAttributes_THelper.write(_os,pgName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = globaldefs.NamingAttributesIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllProtectedTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllProtectedTPNames(pgName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainingPGNames(globaldefs.NameAndStringValue_T[] pTPName, globaldefs.NamingAttributesList_THolder pgNameList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainingPGNames", true);
				globaldefs.NamingAttributes_THelper.write(_os,pTPName);
				_is = _invoke(_os);
				pgNameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainingPGNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainingPGNames(pTPName,pgNameList);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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

	public void performProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.SwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performProtectionCommand", true);
				protection.ProtectionCommand_THelper.write(_os,protectionCommand);
				globaldefs.NamingAttributes_THelper.write(_os,reliableSinkCtpOrGroupName);
				globaldefs.NamingAttributes_THelper.write(_os,fromTp);
				globaldefs.NamingAttributes_THelper.write(_os,toTp);
				_is = _invoke(_os);
				switchData.value = protection.SwitchData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performProtectionCommand", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.performProtectionCommand(protectionCommand,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEProtectionGroup(globaldefs.NameAndStringValue_T[] ePGPname, protection.EProtectionGroup_THolder eProtectionGroup) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEProtectionGroup", true);
				globaldefs.NamingAttributes_THelper.write(_os,ePGPname);
				_is = _invoke(_os);
				eProtectionGroup.value = protection.EProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getEProtectionGroup(ePGPname,eProtectionGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveSwitchData(globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, protection.SwitchDataList_THolder switchData) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveSwitchData", true);
				globaldefs.NamingAttributes_THelper.write(_os,reliableSinkCtpOrGroupName);
				_is = _invoke(_os);
				switchData.value = protection.SwitchDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveSwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveSwitchData(reliableSinkCtpOrGroupName,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveESwitchData(globaldefs.NameAndStringValue_T[] ePGPName, protection.ESwitchDataList_THolder eSwitchDataList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveESwitchData", true);
				globaldefs.NamingAttributes_THelper.write(_os,ePGPName);
				_is = _invoke(_os);
				eSwitchDataList.value = protection.ESwitchDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveESwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveESwitchData(ePGPName,eSwitchDataList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.ProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getProtectionGroup", true);
				globaldefs.NamingAttributes_THelper.write(_os,pgName);
				_is = _invoke(_os);
				protectionGroup.value = protection.ProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getProtectionGroup(pgName,protectionGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllNUTTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllNUTTPNames", true);
				globaldefs.NamingAttributes_THelper.write(_os,pgName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = globaldefs.NamingAttributesIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllNUTTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllNUTTPNames(pgName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPreemptibleTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPreemptibleTPNames", true);
				globaldefs.NamingAttributes_THelper.write(_os,pgName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = globaldefs.NamingAttributesIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPreemptibleTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPreemptibleTPNames(pgName,how_many,nameList,nameIt);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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
