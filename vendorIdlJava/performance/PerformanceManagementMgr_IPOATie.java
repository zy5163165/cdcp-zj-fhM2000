package performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler 
 */

public class PerformanceManagementMgr_IPOATie
	extends PerformanceManagementMgr_IPOA
{
	private PerformanceManagementMgr_IOperations _delegate;

	private POA _poa;
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public performance.PerformanceManagementMgr_I _this()
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
	}
	public PerformanceManagementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getAllPMPs(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, performance.PMPList_THolder pmpList, performance.PMPIterator_IHolder pmpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPs(tpOrMeName,how_many,pmpList,pmpIt);
	}

	public void getMEPMcapabilities(globaldefs.NameAndStringValue_T[] meName, short layerRate, performance.PMParameterList_THolder pmParameterList) throws globaldefs.ProcessingFailureException
	{
_delegate.getMEPMcapabilities(meName,layerRate,pmParameterList);
	}

	public void createTCAParameterProfile(globaldefs.NameAndStringValue_T[] managedElementName, short layerRate, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.NameAndStringValue_T[] additionalInfo, performance.TCAParameter_T[] listOfTCAParameter, performance.TCAParameterProfile_THolder tcaParameterProfile) throws globaldefs.ProcessingFailureException
	{
_delegate.createTCAParameterProfile(managedElementName,layerRate,userLabel,forceUniqueness,owner,additionalInfo,listOfTCAParameter,tcaParameterProfile);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void enablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.enablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
	}

	public void getHoldingTime(performance.HoldingTime_THolder holdingTime) throws globaldefs.ProcessingFailureException
	{
_delegate.getHoldingTime(holdingTime);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setTCAParameterProfile(globaldefs.NameAndStringValue_T[] tcaParameterProfileName, performance.TCAParameter_T[] listOfTCAParameter, int how_many, performance.TCAParameterProfile_THolder tcaParameterProfile, globaldefs.NamingAttributesList_THolder failedTPList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.setTCAParameterProfile(tcaParameterProfileName,listOfTCAParameter,how_many,tcaParameterProfile,failedTPList,nameIt);
	}

	public void getTCAParameterProfile(globaldefs.NameAndStringValue_T[] tcaParameterProfileName, performance.TCAParameterProfile_THolder tcaParameterProfile) throws globaldefs.ProcessingFailureException
	{
_delegate.getTCAParameterProfile(tcaParameterProfileName,tcaParameterProfile);
	}

	public void getAllTCAParameterProfiles(globaldefs.NameAndStringValue_T[] meName, int how_many, performance.TCAParameterProfileList_THolder tcaParameterProfileList, performance.TCAParameterProfileIterator_IHolder tcaParameterProfileIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTCAParameterProfiles(meName,how_many,tcaParameterProfileList,tcaParameterProfileIt);
	}

	public void getProfileAssociatedTPs(globaldefs.NameAndStringValue_T[] profileName, int how_many, globaldefs.NamingAttributesList_THolder tpNames, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getProfileAssociatedTPs(profileName,how_many,tpNames,nameIt);
	}

	public void getHistoryPMDataByPull(java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime) throws globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMDataByPull(taskName,compressType,packingType,pmTPSelectList,pmParameters,startTime,endTime);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void disableTCA(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.disableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void enableTCA(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.enableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMData(destination,userName,password,pmTPSelectList,pmParameters,startTime,endTime,forceUpload);
	}

	public void setTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, performance.TCAParameters_THolder tcaParameters) throws globaldefs.ProcessingFailureException
	{
_delegate.setTCATPParameter(tpName,tcaParameters);
	}

	public void disablePMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.disablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void getAllPMPNames(globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPNames(tpOrMeName,how_many,nameList,nameIt);
	}

	public void getTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, performance.TCAParameters_THolder tcaParameter) throws globaldefs.ProcessingFailureException
	{
_delegate.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
	}

	public void setTCAParameterProfilePointer(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NameAndStringValue_T[] addTCAParameterProfile, globaldefs.NameAndStringValue_T[] removeTCAParameterProfile) throws globaldefs.ProcessingFailureException
	{
_delegate.setTCAParameterProfilePointer(tpName,addTCAParameterProfile,removeTCAParameterProfile);
	}

	public void deleteTCAParameterProfile(globaldefs.NameAndStringValue_T[] tcaParameterProfileName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTCAParameterProfile(tcaParameterProfileName);
	}

	public void getTPHistoryPMData(performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
	}

	public void clearPMData(performance.PMTPSelect_T[] pmTPSelectList, performance.PMTPSelectList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void getAllTCAParameterProfileNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder tcaParameterProfileNames, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTCAParameterProfileNames(meName,how_many,tcaParameterProfileNames,nameIt);
	}

}
