package extendedEmsMgr;


/**
 *	Generated from IDL definition of interface "ExtendedEMSMgr_I"
 *	@author JacORB IDL compiler 
 */

public class _ExtendedEMSMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements extendedEmsMgr.ExtendedEMSMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/ExtendedEMSMgr_I:1.0","IDL:omg.org/CORBA/Object:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = extendedEmsMgr.ExtendedEMSMgr_IOperations.class;
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
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
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

	public void getMEHistoryAlarms(globaldefs.NameAndStringValue_T[] managedElement, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMEHistoryAlarms", true);
				globaldefs.NamingAttributes_THelper.write(_os,managedElement);
				notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				globaldefs.Time_THelper.write(_os,beginTime);
				globaldefs.Time_THelper.write(_os,endTime);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = notifications.EventList_THelper.read(_is);
				eventIt.value = notifications.EventIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMEHistoryAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMEHistoryAlarms(managedElement,excludeProbCauseList,excludeSeverityList,beginTime,endTime,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEMSAndMEActiveAlarmEx(globaldefs.NameAndStringValue_T[] emsOrmeName, java.lang.String meProductName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEMSAndMEActiveAlarmEx", true);
				globaldefs.NamingAttributes_THelper.write(_os,emsOrmeName);
				_os.write_string(meProductName);
				notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				globaldefs.Time_THelper.write(_os,beginTime);
				globaldefs.Time_THelper.write(_os,endTime);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = notifications.EventList_THelper.read(_is);
				eventIt.value = notifications.EventIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEMSAndMEActiveAlarmEx", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEMSAndMEActiveAlarmEx(emsOrmeName,meProductName,excludeProbCauseList,excludeSeverityList,beginTime,endTime,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void removeAlarmReportingMask(extendedEmsMgr.AlarmReportingMask_T alarmReportingMask) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "removeAlarmReportingMask", true);
				extendedEmsMgr.AlarmReportingMask_THelper.write(_os,alarmReportingMask);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeAlarmReportingMask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.removeAlarmReportingMask(alarmReportingMask);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void removeAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "removeAlarmFilterTask", true);
				globaldefs.NamingAttributes_THelper.write(_os,alarmFilterTaskName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeAlarmFilterTask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.removeAlarmFilterTask(alarmFilterTaskName);
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
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
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

	public void getAllUnAssignedBcoUnits(globaldefs.NameAndStringValue_T[] emsName, extendedEmsMgr.NamePairList_THolder businessCutOverUnitList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllUnAssignedBcoUnits", true);
				globaldefs.NamingAttributes_THelper.write(_os,emsName);
				_is = _invoke(_os);
				businessCutOverUnitList.value = extendedEmsMgr.NamePairList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllUnAssignedBcoUnits", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllUnAssignedBcoUnits(emsName,businessCutOverUnitList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMEHistoryAlarmsByFtp(extendedEmsMgr.HistoryAlarmsTask_T historyAlarmsTask, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMEHistoryAlarmsByFtp", true);
				extendedEmsMgr.HistoryAlarmsTask_THelper.write(_os,historyAlarmsTask);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMEHistoryAlarmsByFtp", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMEHistoryAlarmsByFtp(historyAlarmsTask,destination,userName,password);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createBusinessCutOverPlan(extendedEmsMgr.BusinessCutOverPlan_T bcoPlanCreateData) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createBusinessCutOverPlan", true);
				extendedEmsMgr.BusinessCutOverPlan_THelper.write(_os,bcoPlanCreateData);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createBusinessCutOverPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createBusinessCutOverPlan(bcoPlanCreateData);
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
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
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

	public void setConcurrencySwitch(int EnableSwitch) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setConcurrencySwitch", true);
				_os.write_ulong(EnableSwitch);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setConcurrencySwitch", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setConcurrencySwitch(EnableSwitch);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void resumeAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "resumeAlarmFilterTask", true);
				globaldefs.NamingAttributes_THelper.write(_os,alarmFilterTaskName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "resumeAlarmFilterTask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.resumeAlarmFilterTask(alarmFilterTaskName);
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
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
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

	public void getAllBusinessCutOverGroupList(globaldefs.NameAndStringValue_T[] bcoPlanName, extendedEmsMgr.BusinessCutOverGroupList_THolder bcoGroupList) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllBusinessCutOverGroupList", true);
				globaldefs.NamingAttributes_THelper.write(_os,bcoPlanName);
				_is = _invoke(_os);
				bcoGroupList.value = extendedEmsMgr.BusinessCutOverGroupList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllBusinessCutOverGroupList", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllBusinessCutOverGroupList(bcoPlanName,bcoGroupList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void pauseAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "pauseAlarmFilterTask", true);
				globaldefs.NamingAttributes_THelper.write(_os,alarmFilterTaskName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "pauseAlarmFilterTask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.pauseAlarmFilterTask(alarmFilterTaskName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void synchronizeTime(globaldefs.NameAndStringValue_T[] entityName, java.lang.String nmsNime) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "synchronizeTime", true);
				globaldefs.NamingAttributes_THelper.write(_os,entityName);
				globaldefs.Time_THelper.write(_os,nmsNime);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "synchronizeTime", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.synchronizeTime(entityName,nmsNime);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createAlarmFilterTask(extendedEmsMgr.AlarmFilterTask_T alarmFilterTask) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createAlarmFilterTask", true);
				extendedEmsMgr.AlarmFilterTask_THelper.write(_os,alarmFilterTask);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createAlarmFilterTask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createAlarmFilterTask(alarmFilterTask);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveAlarmReportingMask(globaldefs.NameAndStringValue_T[] entityName, short layerRate, int how_many, extendedEmsMgr.AlarmReportingMaskList_THolder alarmReportMaskList, extendedEmsMgr.AlarmReportingMaskIterator_IHolder alarmReportMaskIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveAlarmReportingMask", true);
				globaldefs.NamingAttributes_THelper.write(_os,entityName);
				_os.write_short(layerRate);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				alarmReportMaskList.value = extendedEmsMgr.AlarmReportingMaskList_THelper.read(_is);
				alarmReportMaskIt.value = extendedEmsMgr.AlarmReportingMaskIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveAlarmReportingMask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveAlarmReportingMask(entityName,layerRate,how_many,alarmReportMaskList,alarmReportMaskIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllConfigByPull(globaldefs.NameAndStringValue_T[][] nameList, java.lang.String[] ObjectTypeList, java.lang.String compressType, java.lang.String packingType, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllConfigByPull", true);
				globaldefs.NamingAttributesList_THelper.write(_os,nameList);
				extendedManagedElementManager.StringList_THelper.write(_os,ObjectTypeList);
				_os.write_string(compressType);
				_os.write_string(packingType);
				extendedEmsMgr.ExtendedEMSMgr_IPackage.Destination_THelper.write(_os,destination);
				_os.write_string(userName);
				_os.write_string(password);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllConfigByPull", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllConfigByPull(nameList,ObjectTypeList,compressType,packingType,destination,userName,password);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAlarmReportingMaskOn(extendedEmsMgr.AlarmReportingMask_T alarmReportingMask) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAlarmReportingMaskOn", true);
				extendedEmsMgr.AlarmReportingMask_THelper.write(_os,alarmReportingMask);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAlarmReportingMaskOn", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAlarmReportingMaskOn(alarmReportingMask);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyMEG(extendedEmsMgr.EXMegEntityData_T meg) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyMEG", true);
				extendedEmsMgr.EXMegEntityData_THelper.write(_os,meg);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyMEG", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyMEG(meg);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteMEG(globaldefs.NameAndStringValue_T[] megName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteMEG", true);
				globaldefs.NamingAttributes_THelper.write(_os,megName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMEG", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteMEG(megName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMEGNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMEGNames", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMEGNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMEGNames(how_many,nameList,nameIt);
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
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
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

	public void modifyAlarmFilterTask(extendedEmsMgr.AlarmFilterTask_T alarmFilterTask) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyAlarmFilterTask", true);
				extendedEmsMgr.AlarmFilterTask_THelper.write(_os,alarmFilterTask);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyAlarmFilterTask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyAlarmFilterTask(alarmFilterTask);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void changePassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword, java.lang.String encryptType) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "changePassword", true);
				_os.write_string(userName);
				_os.write_string(oldPassword);
				_os.write_string(newPassword);
				_os.write_string(encryptType);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "changePassword", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.changePassword(userName,oldPassword,newPassword,encryptType);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setObjStringAttr(globaldefs.NameAndStringValue_T[] objectName, extendedEmsMgr.ClassType_T[] classTypelist, extendedEmsMgr.OperationType_T operationType, java.lang.String attrValue, globaldefs.NameAndStringValue_T[] additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setObjStringAttr", true);
				globaldefs.NamingAttributes_THelper.write(_os,objectName);
				extendedEmsMgr.ClassTypeList_THelper.write(_os,classTypelist);
				extendedEmsMgr.OperationType_THelper.write(_os,operationType);
				_os.write_string(attrValue);
				globaldefs.NVSList_THelper.write(_os,additionalInfo);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setObjStringAttr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setObjStringAttr(objectName,classTypelist,operationType,attrValue,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getBusinessCutOverResult(globaldefs.NameAndStringValue_T[] bcoPlanName, org.omg.CORBA.StringHolder performanceTime, extendedEmsMgr.NamePairList_THolder sncResult, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getBusinessCutOverResult", true);
				globaldefs.NamingAttributes_THelper.write(_os,bcoPlanName);
				_is = _invoke(_os);
				performanceTime.value = _is.read_string();
				sncResult.value = extendedEmsMgr.NamePairList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getBusinessCutOverResult", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getBusinessCutOverResult(bcoPlanName,performanceTime,sncResult,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllBusinessCutOverPlansList(globaldefs.NameAndStringValue_T[] emsName, int how_many, extendedEmsMgr.BusinessCutOverPlanList_THolder bcoPlanList, extendedEmsMgr.BusinessCutOverPlanIterator_IHolder bcoPlanIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllBusinessCutOverPlansList", true);
				globaldefs.NamingAttributes_THelper.write(_os,emsName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				bcoPlanList.value = extendedEmsMgr.BusinessCutOverPlanList_THelper.read(_is);
				bcoPlanIt.value = extendedEmsMgr.BusinessCutOverPlanIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllBusinessCutOverPlansList", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllBusinessCutOverPlansList(emsName,how_many,bcoPlanList,bcoPlanIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createMEG(extendedEmsMgr.EXMegEntityData_T megCreateData, extendedEmsMgr.EXMegEntityData_THolder meg) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createMEG", true);
				extendedEmsMgr.EXMegEntityData_THelper.write(_os,megCreateData);
				_is = _invoke(_os);
				meg.value = extendedEmsMgr.EXMegEntityData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMEG", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createMEG(megCreateData,meg);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAlarmFilterTask(int how_many, extendedEmsMgr.AlarmFilterTaskList_THolder alarmFilterTaskList, extendedEmsMgr.AlarmFilterTaskIterator_IHolder alarmFilterTaskIterator) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAlarmFilterTask", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				alarmFilterTaskList.value = extendedEmsMgr.AlarmFilterTaskList_THelper.read(_is);
				alarmFilterTaskIterator.value = extendedEmsMgr.AlarmFilterTaskIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAlarmFilterTask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllAlarmFilterTask(how_many,alarmFilterTaskList,alarmFilterTaskIterator);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void performBusinessCutOverPlan(globaldefs.NameAndStringValue_T[] bcoPlanName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performBusinessCutOverPlan", true);
				globaldefs.NamingAttributes_THelper.write(_os,bcoPlanName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performBusinessCutOverPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.performBusinessCutOverPlan(bcoPlanName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllLogHistoryByFtp(extendedEmsMgr.LogTransmissionTask_T configureTransmissionTask, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllLogHistoryByFtp", true);
				extendedEmsMgr.LogTransmissionTask_THelper.write(_os,configureTransmissionTask);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllLogHistoryByFtp", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllLogHistoryByFtp(configureTransmissionTask,destination,userName,password);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void assignProfile(extendedEmsMgr.ProfileAssignTask_T profileTask, boolean assignFlag) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "assignProfile", true);
				extendedEmsMgr.ProfileAssignTask_THelper.write(_os,profileTask);
				_os.write_boolean(assignFlag);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "assignProfile", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.assignProfile(profileTask,assignFlag);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMEG(globaldefs.NameAndStringValue_T[] megName, extendedEmsMgr.EXMegEntityData_THolder meg) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMEG", true);
				globaldefs.NamingAttributes_THelper.write(_os,megName);
				_is = _invoke(_os);
				meg.value = extendedEmsMgr.EXMegEntityData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMEG", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMEG(megName,meg);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setObjAttr(extendedEmsMgr.ObjectAndAttr_T[] objectAndAttrList, extendedEmsMgr.OperationType_T operationType, globaldefs.NameAndStringValue_T[] additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setObjAttr", true);
				extendedEmsMgr.ObjectAndAttrList_THelper.write(_os,objectAndAttrList);
				extendedEmsMgr.OperationType_THelper.write(_os,operationType);
				globaldefs.NVSList_THelper.write(_os,additionalInfo);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setObjAttr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setObjAttr(objectAndAttrList,operationType,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllConfigByFtp(extendedEmsMgr.ConfigureTransmissionTask_T configureTransmissionTask_, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllConfigByFtp", true);
				extendedEmsMgr.ConfigureTransmissionTask_THelper.write(_os,configureTransmissionTask_);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllConfigByFtp", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllConfigByFtp(configureTransmissionTask_,destination,userName,password);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteBusinessCutOverGroup(globaldefs.NameAndStringValue_T[] bcoGroupName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteBusinessCutOverGroup", true);
				globaldefs.NamingAttributes_THelper.write(_os,bcoGroupName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteBusinessCutOverGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteBusinessCutOverGroup(bcoGroupName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteBusinessCutOverPlan(globaldefs.NameAndStringValue_T[] bcoPlanName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteBusinessCutOverPlan", true);
				globaldefs.NamingAttributes_THelper.write(_os,bcoPlanName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteBusinessCutOverPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteBusinessCutOverPlan(bcoPlanName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setHeartBeatInterval(int heartBeatInterval) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setHeartBeatInterval", true);
				_os.write_ulong(heartBeatInterval);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setHeartBeatInterval", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setHeartBeatInterval(heartBeatInterval);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyBusinessCutOverGroup(extendedEmsMgr.BusinessCutOverGroup_T bcoGroup) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyBusinessCutOverGroup", true);
				extendedEmsMgr.BusinessCutOverGroup_THelper.write(_os,bcoGroup);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyBusinessCutOverGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyBusinessCutOverGroup(bcoGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEmsExtraParams(globaldefs.NVSList_THolder emsExtraParams) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEmsExtraParams", true);
				_is = _invoke(_os);
				emsExtraParams.value = globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEmsExtraParams", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getEmsExtraParams(emsExtraParams);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setEmsExtraParams(globaldefs.NameAndStringValue_T[] emsExtraParamsToModify, globaldefs.NVSList_THolder failedEmsExtraParams) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setEmsExtraParams", true);
				globaldefs.NVSList_THelper.write(_os,emsExtraParamsToModify);
				_is = _invoke(_os);
				failedEmsExtraParams.value = globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setEmsExtraParams", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setEmsExtraParams(emsExtraParamsToModify,failedEmsExtraParams);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMEGs(int how_many, extendedEmsMgr.EXMegEntityDataList_THolder megList, extendedEmsMgr.EXMegEntityDataIterator_IHolder megIt) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMEGs", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				megList.value = extendedEmsMgr.EXMegEntityDataList_THelper.read(_is);
				megIt.value = extendedEmsMgr.EXMegEntityDataIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMEGs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMEGs(how_many,megList,megIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createBusinessCutOverGroup(extendedEmsMgr.BusinessCutOverGroup_T bcoGroup) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createBusinessCutOverGroup", true);
				extendedEmsMgr.BusinessCutOverGroup_THelper.write(_os,bcoGroup);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createBusinessCutOverGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ExtendedEMSMgr_IOperations _localServant = (ExtendedEMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createBusinessCutOverGroup(bcoGroup);
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
