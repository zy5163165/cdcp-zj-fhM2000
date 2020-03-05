package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "ExtendedEMSMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface ExtendedEMSMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMEHistoryAlarms(globaldefs.NameAndStringValue_T[] managedElement, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void getMEHistoryAlarmsByFtp(extendedEmsMgr.HistoryAlarmsTask_T historyAlarmsTask, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException;
	void getAllEMSAndMEActiveAlarmEx(globaldefs.NameAndStringValue_T[] emsOrmeName, java.lang.String meProductName, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;
	void setAlarmReportingMaskOn(extendedEmsMgr.AlarmReportingMask_T alarmReportingMask) throws globaldefs.ProcessingFailureException;
	void removeAlarmReportingMask(extendedEmsMgr.AlarmReportingMask_T alarmReportingMask) throws globaldefs.ProcessingFailureException;
	void retrieveAlarmReportingMask(globaldefs.NameAndStringValue_T[] entityName, short layerRate, int how_many, extendedEmsMgr.AlarmReportingMaskList_THolder alarmReportMaskList, extendedEmsMgr.AlarmReportingMaskIterator_IHolder alarmReportMaskIt) throws globaldefs.ProcessingFailureException;
	void changePassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword, java.lang.String encryptType) throws globaldefs.ProcessingFailureException;
	void synchronizeTime(globaldefs.NameAndStringValue_T[] entityName, java.lang.String nmsNime) throws globaldefs.ProcessingFailureException;
	void setHeartBeatInterval(int heartBeatInterval) throws globaldefs.ProcessingFailureException;
	void getEmsExtraParams(globaldefs.NVSList_THolder emsExtraParams) throws globaldefs.ProcessingFailureException;
	void setEmsExtraParams(globaldefs.NameAndStringValue_T[] emsExtraParamsToModify, globaldefs.NVSList_THolder failedEmsExtraParams) throws globaldefs.ProcessingFailureException;
	void createAlarmFilterTask(extendedEmsMgr.AlarmFilterTask_T alarmFilterTask) throws globaldefs.ProcessingFailureException;
	void removeAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException;
	void modifyAlarmFilterTask(extendedEmsMgr.AlarmFilterTask_T alarmFilterTask) throws globaldefs.ProcessingFailureException;
	void getAllAlarmFilterTask(int how_many, extendedEmsMgr.AlarmFilterTaskList_THolder alarmFilterTaskList, extendedEmsMgr.AlarmFilterTaskIterator_IHolder alarmFilterTaskIterator) throws globaldefs.ProcessingFailureException;
	void pauseAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException;
	void resumeAlarmFilterTask(globaldefs.NameAndStringValue_T[] alarmFilterTaskName) throws globaldefs.ProcessingFailureException;
	void getAllLogHistoryByFtp(extendedEmsMgr.LogTransmissionTask_T configureTransmissionTask, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException;
	void getAllConfigByFtp(extendedEmsMgr.ConfigureTransmissionTask_T configureTransmissionTask_, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException;
	void assignProfile(extendedEmsMgr.ProfileAssignTask_T profileTask, boolean assignFlag) throws globaldefs.ProcessingFailureException;
	void createBusinessCutOverPlan(extendedEmsMgr.BusinessCutOverPlan_T bcoPlanCreateData) throws globaldefs.ProcessingFailureException;
	void getAllBusinessCutOverPlansList(globaldefs.NameAndStringValue_T[] emsName, int how_many, extendedEmsMgr.BusinessCutOverPlanList_THolder bcoPlanList, extendedEmsMgr.BusinessCutOverPlanIterator_IHolder bcoPlanIt) throws globaldefs.ProcessingFailureException;
	void deleteBusinessCutOverPlan(globaldefs.NameAndStringValue_T[] bcoPlanName) throws globaldefs.ProcessingFailureException;
	void createBusinessCutOverGroup(extendedEmsMgr.BusinessCutOverGroup_T bcoGroup) throws globaldefs.ProcessingFailureException;
	void getAllBusinessCutOverGroupList(globaldefs.NameAndStringValue_T[] bcoPlanName, extendedEmsMgr.BusinessCutOverGroupList_THolder bcoGroupList) throws globaldefs.ProcessingFailureException;
	void modifyBusinessCutOverGroup(extendedEmsMgr.BusinessCutOverGroup_T bcoGroup) throws globaldefs.ProcessingFailureException;
	void deleteBusinessCutOverGroup(globaldefs.NameAndStringValue_T[] bcoGroupName) throws globaldefs.ProcessingFailureException;
	void performBusinessCutOverPlan(globaldefs.NameAndStringValue_T[] bcoPlanName) throws globaldefs.ProcessingFailureException;
	void getBusinessCutOverResult(globaldefs.NameAndStringValue_T[] bcoPlanName, org.omg.CORBA.StringHolder performanceTime, extendedEmsMgr.NamePairList_THolder sncResult, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
	void getAllUnAssignedBcoUnits(globaldefs.NameAndStringValue_T[] emsName, extendedEmsMgr.NamePairList_THolder businessCutOverUnitList) throws globaldefs.ProcessingFailureException;
	void setObjAttr(extendedEmsMgr.ObjectAndAttr_T[] objectAndAttrList, extendedEmsMgr.OperationType_T operationType, globaldefs.NameAndStringValue_T[] additionalInfo) throws globaldefs.ProcessingFailureException;
	void setObjStringAttr(globaldefs.NameAndStringValue_T[] objectName, extendedEmsMgr.ClassType_T[] classTypelist, extendedEmsMgr.OperationType_T operationType, java.lang.String attrValue, globaldefs.NameAndStringValue_T[] additionalInfo) throws globaldefs.ProcessingFailureException;
	void getAllMEGs(int how_many, extendedEmsMgr.EXMegEntityDataList_THolder megList, extendedEmsMgr.EXMegEntityDataIterator_IHolder megIt) throws globaldefs.ProcessingFailureException;
	void getAllMEGNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getMEG(globaldefs.NameAndStringValue_T[] megName, extendedEmsMgr.EXMegEntityData_THolder meg) throws globaldefs.ProcessingFailureException;
	void createMEG(extendedEmsMgr.EXMegEntityData_T megCreateData, extendedEmsMgr.EXMegEntityData_THolder meg) throws globaldefs.ProcessingFailureException;
	void deleteMEG(globaldefs.NameAndStringValue_T[] megName) throws globaldefs.ProcessingFailureException;
	void modifyMEG(extendedEmsMgr.EXMegEntityData_T meg) throws globaldefs.ProcessingFailureException;
	void setConcurrencySwitch(int EnableSwitch) throws globaldefs.ProcessingFailureException;
	void getAllConfigByPull(globaldefs.NameAndStringValue_T[][] nameList, java.lang.String[] ObjectTypeList, java.lang.String compressType, java.lang.String packingType, java.lang.String destination, java.lang.String userName, java.lang.String password) throws globaldefs.ProcessingFailureException;
}
