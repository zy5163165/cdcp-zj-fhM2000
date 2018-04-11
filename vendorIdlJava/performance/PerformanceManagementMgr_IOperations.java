package performance;

/**
 *	Generated from IDL definition of interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface PerformanceManagementMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMEPMcapabilities(globaldefs.NameAndStringValue_T[] meName, short layerRate, performance.PMParameterList_THolder pmParameterList) throws globaldefs.ProcessingFailureException;
	void disablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void enablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void clearPMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void getHoldingTime(performance.HoldingTime_THolder holdingTime) throws globaldefs.ProcessingFailureException;
	void getTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, performance.TCAParameters_THolder tcaParameter) throws globaldefs.ProcessingFailureException;
	void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws globaldefs.ProcessingFailureException;
	void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;
	void setTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, performance.TCAParameters_THolder tcaParameters) throws globaldefs.ProcessingFailureException;
	void enableTCA(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void disableTCA(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void getProfileAssociatedTPs(globaldefs.NameAndStringValue_T[] profileName, int how_many, globaldefs.NamingAttributesList_THolder tpNames, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void createTCAParameterProfile(globaldefs.NameAndStringValue_T[] managedElementName, short layerRate, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.NameAndStringValue_T[] additionalInfo, performance.TCAParameter_T[] listOfTCAParameter, performance.TCAParameterProfile_THolder tcaParameterProfile) throws globaldefs.ProcessingFailureException;
	void deleteTCAParameterProfile(globaldefs.NameAndStringValue_T[] tcaParameterProfileName) throws globaldefs.ProcessingFailureException;
	void getTCAParameterProfile(globaldefs.NameAndStringValue_T[] tcaParameterProfileName, performance.TCAParameterProfile_THolder tcaParameterProfile) throws globaldefs.ProcessingFailureException;
	void setTCAParameterProfile(globaldefs.NameAndStringValue_T[] tcaParameterProfileName, performance.TCAParameter_T[] listOfTCAParameter, int how_many, performance.TCAParameterProfile_THolder tcaParameterProfile, globaldefs.NamingAttributesList_THolder failedTPList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllTCAParameterProfileNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder tcaParameterProfileNames, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTPHistoryPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;
	void getAllPMPs(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, performance.PMPList_THolder pmpList, performance.PMPIterator_IHolder pmpIt) throws globaldefs.ProcessingFailureException;
	void getAllPMPNames(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void setTCAParameterProfilePointer(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NameAndStringValue_T[] addTCAParameterProfile, globaldefs.NameAndStringValue_T[] removeTCAParameterProfile) throws globaldefs.ProcessingFailureException;
	void getAllTCAParameterProfiles(globaldefs.NameAndStringValue_T[] meName, int how_many, performance.TCAParameterProfileList_THolder tcaParameterProfileList, performance.TCAParameterProfileIterator_IHolder tcaParameterProfileIt) throws globaldefs.ProcessingFailureException;
	void getHistoryPMDataByPull(java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime) throws globaldefs.ProcessingFailureException;
}
