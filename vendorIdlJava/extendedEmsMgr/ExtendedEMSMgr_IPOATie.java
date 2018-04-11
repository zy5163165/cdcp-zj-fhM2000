package extendedEmsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ExtendedEMSMgr_I"
 *	@author JacORB IDL compiler 
 */

public class ExtendedEMSMgr_IPOATie
	extends ExtendedEMSMgr_IPOA
{
	private ExtendedEMSMgr_IOperations _delegate;

	private POA _poa;
	public ExtendedEMSMgr_IPOATie(ExtendedEMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExtendedEMSMgr_IPOATie(ExtendedEMSMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedEmsMgr.ExtendedEMSMgr_I _this()
	{
		return extendedEmsMgr.ExtendedEMSMgr_IHelper.narrow(_this_object());
	}
	public extendedEmsMgr.ExtendedEMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedEmsMgr.ExtendedEMSMgr_IHelper.narrow(_this_object(orb));
	}
	public ExtendedEMSMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExtendedEMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getMEHistoryAlarms(globaldefs.NameAndStringValue_T[] managedElement, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getMEHistoryAlarms(managedElement,excludeProbCauseList,excludeSeverityList,beginTime,endTime,how_many,eventList,eventIt);
	}

	public void getAllEMSAndMEActiveAlarmEx(globaldefs.NameAndStringValue_T[] emsOrmeName, java.lang.String meProductName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEActiveAlarmEx(emsOrmeName,meProductName,excludeProbCauseList,excludeSeverityList,beginTime,endTime,how_many,eventList,eventIt);
	}

	public void removeAlarmReportingMask(extendedEmsMgr.AlarmReportingMask_T alarmReportingMask) throws globaldefs.ProcessingFailureException
	{
_delegate.removeAlarmReportingMask(alarmReportingMask);
	}

	public void removeAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException
	{
_delegate.removeAlarmFilterTask(alarmFilterTaskName);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllUnAssignedBcoUnits(globaldefs.NameAndStringValue_T[] emsName, extendedEmsMgr.NamePairList_THolder businessCutOverUnitList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllUnAssignedBcoUnits(emsName,businessCutOverUnitList);
	}

	public void getMEHistoryAlarmsByFtp(extendedEmsMgr.HistoryAlarmsTask_T historyAlarmsTask, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
_delegate.getMEHistoryAlarmsByFtp(historyAlarmsTask,destination,userName,password);
	}

	public void createBusinessCutOverPlan(extendedEmsMgr.BusinessCutOverPlan_T bcoPlanCreateData) throws globaldefs.ProcessingFailureException
	{
_delegate.createBusinessCutOverPlan(bcoPlanCreateData);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setConcurrencySwitch(int EnableSwitch) throws globaldefs.ProcessingFailureException
	{
_delegate.setConcurrencySwitch(EnableSwitch);
	}

	public void resumeAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException
	{
_delegate.resumeAlarmFilterTask(alarmFilterTaskName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllBusinessCutOverGroupList(globaldefs.NameAndStringValue_T[] bcoPlanName, extendedEmsMgr.BusinessCutOverGroupList_THolder bcoGroupList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllBusinessCutOverGroupList(bcoPlanName,bcoGroupList);
	}

	public void pauseAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException
	{
_delegate.pauseAlarmFilterTask(alarmFilterTaskName);
	}

	public void synchronizeTime(globaldefs.NameAndStringValue_T[] entityName, java.lang.String nmsNime) throws globaldefs.ProcessingFailureException
	{
_delegate.synchronizeTime(entityName,nmsNime);
	}

	public void createAlarmFilterTask(extendedEmsMgr.AlarmFilterTask_T alarmFilterTask) throws globaldefs.ProcessingFailureException
	{
_delegate.createAlarmFilterTask(alarmFilterTask);
	}

	public void retrieveAlarmReportingMask(globaldefs.NameAndStringValue_T[] entityName, short layerRate, int how_many, extendedEmsMgr.AlarmReportingMaskList_THolder alarmReportMaskList, extendedEmsMgr.AlarmReportingMaskIterator_IHolder alarmReportMaskIt) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveAlarmReportingMask(entityName,layerRate,how_many,alarmReportMaskList,alarmReportMaskIt);
	}

	public void getAllConfigByPull(globaldefs.NameAndStringValue_T[][] nameList, java.lang.String[] ObjectTypeList, java.lang.String compressType, java.lang.String packingType, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllConfigByPull(nameList,ObjectTypeList,compressType,packingType,destination,userName,password);
	}

	public void setAlarmReportingMaskOn(extendedEmsMgr.AlarmReportingMask_T alarmReportingMask) throws globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingMaskOn(alarmReportingMask);
	}

	public void modifyMEG(extendedEmsMgr.EXMegEntityData_T meg) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyMEG(meg);
	}

	public void deleteMEG(globaldefs.NameAndStringValue_T[] megName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteMEG(megName);
	}

	public void getAllMEGNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMEGNames(how_many,nameList,nameIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void modifyAlarmFilterTask(extendedEmsMgr.AlarmFilterTask_T alarmFilterTask) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyAlarmFilterTask(alarmFilterTask);
	}

	public void changePassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword, java.lang.String encryptType) throws globaldefs.ProcessingFailureException
	{
_delegate.changePassword(userName,oldPassword,newPassword,encryptType);
	}

	public void setObjStringAttr(globaldefs.NameAndStringValue_T[] objectName, extendedEmsMgr.ClassType_T[] classTypelist, extendedEmsMgr.OperationType_T operationType, java.lang.String attrValue, globaldefs.NameAndStringValue_T[] additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setObjStringAttr(objectName,classTypelist,operationType,attrValue,additionalInfo);
	}

	public void getBusinessCutOverResult(globaldefs.NameAndStringValue_T[] bcoPlanName, org.omg.CORBA.StringHolder performanceTime, extendedEmsMgr.NamePairList_THolder sncResult, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.getBusinessCutOverResult(bcoPlanName,performanceTime,sncResult,additionalInfo);
	}

	public void getAllBusinessCutOverPlansList(globaldefs.NameAndStringValue_T[] emsName, int how_many, extendedEmsMgr.BusinessCutOverPlanList_THolder bcoPlanList, extendedEmsMgr.BusinessCutOverPlanIterator_IHolder bcoPlanIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllBusinessCutOverPlansList(emsName,how_many,bcoPlanList,bcoPlanIt);
	}

	public void createMEG(extendedEmsMgr.EXMegEntityData_T megCreateData, extendedEmsMgr.EXMegEntityData_THolder meg) throws globaldefs.ProcessingFailureException
	{
_delegate.createMEG(megCreateData,meg);
	}

	public void getAllAlarmFilterTask(int how_many, extendedEmsMgr.AlarmFilterTaskList_THolder alarmFilterTaskList, extendedEmsMgr.AlarmFilterTaskIterator_IHolder alarmFilterTaskIterator) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllAlarmFilterTask(how_many,alarmFilterTaskList,alarmFilterTaskIterator);
	}

	public void performBusinessCutOverPlan(globaldefs.NameAndStringValue_T[] bcoPlanName) throws globaldefs.ProcessingFailureException
	{
_delegate.performBusinessCutOverPlan(bcoPlanName);
	}

	public void getAllLogHistoryByFtp(extendedEmsMgr.LogTransmissionTask_T configureTransmissionTask, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllLogHistoryByFtp(configureTransmissionTask,destination,userName,password);
	}

	public void assignProfile(extendedEmsMgr.ProfileAssignTask_T profileTask, boolean assignFlag) throws globaldefs.ProcessingFailureException
	{
_delegate.assignProfile(profileTask,assignFlag);
	}

	public void getMEG(globaldefs.NameAndStringValue_T[] megName, extendedEmsMgr.EXMegEntityData_THolder meg) throws globaldefs.ProcessingFailureException
	{
_delegate.getMEG(megName,meg);
	}

	public void setObjAttr(extendedEmsMgr.ObjectAndAttr_T[] objectAndAttrList, extendedEmsMgr.OperationType_T operationType, globaldefs.NameAndStringValue_T[] additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setObjAttr(objectAndAttrList,operationType,additionalInfo);
	}

	public void getAllConfigByFtp(extendedEmsMgr.ConfigureTransmissionTask_T configureTransmissionTask_, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllConfigByFtp(configureTransmissionTask_,destination,userName,password);
	}

	public void deleteBusinessCutOverGroup(globaldefs.NameAndStringValue_T[] bcoGroupName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteBusinessCutOverGroup(bcoGroupName);
	}

	public void deleteBusinessCutOverPlan(globaldefs.NameAndStringValue_T[] bcoPlanName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteBusinessCutOverPlan(bcoPlanName);
	}

	public void setHeartBeatInterval(int heartBeatInterval) throws globaldefs.ProcessingFailureException
	{
_delegate.setHeartBeatInterval(heartBeatInterval);
	}

	public void modifyBusinessCutOverGroup(extendedEmsMgr.BusinessCutOverGroup_T bcoGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyBusinessCutOverGroup(bcoGroup);
	}

	public void getEmsExtraParams(globaldefs.NVSList_THolder emsExtraParams) throws globaldefs.ProcessingFailureException
	{
_delegate.getEmsExtraParams(emsExtraParams);
	}

	public void setEmsExtraParams(globaldefs.NameAndStringValue_T[] emsExtraParamsToModify, globaldefs.NVSList_THolder failedEmsExtraParams) throws globaldefs.ProcessingFailureException
	{
_delegate.setEmsExtraParams(emsExtraParamsToModify,failedEmsExtraParams);
	}

	public void getAllMEGs(int how_many, extendedEmsMgr.EXMegEntityDataList_THolder megList, extendedEmsMgr.EXMegEntityDataIterator_IHolder megIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMEGs(how_many,megList,megIt);
	}

	public void createBusinessCutOverGroup(extendedEmsMgr.BusinessCutOverGroup_T bcoGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.createBusinessCutOverGroup(bcoGroup);
	}

}
