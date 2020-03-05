package protection;

/**
 *	Generated from IDL definition of interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface ProtectionMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.ProtectionGroupList_THolder pgList, protection.ProtectionGroupIterator_IHolder pgpIt) throws globaldefs.ProcessingFailureException;
	void getAllEProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.EProtectionGroupList_THolder epgpList, protection.EProtectionGroupIterator_IHolder epgpIt) throws globaldefs.ProcessingFailureException;
	void getProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.ProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException;
	void getEProtectionGroup(globaldefs.NameAndStringValue_T[] ePGPname, protection.EProtectionGroup_THolder eProtectionGroup) throws globaldefs.ProcessingFailureException;
	void getAllNUTTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllPreemptibleTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllProtectedTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void retrieveSwitchData(globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, protection.SwitchDataList_THolder switchData) throws globaldefs.ProcessingFailureException;
	void retrieveESwitchData(globaldefs.NameAndStringValue_T[] ePGPName, protection.ESwitchDataList_THolder eSwitchDataList) throws globaldefs.ProcessingFailureException;
	void performProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.SwitchData_THolder switchData) throws globaldefs.ProcessingFailureException;
	void getContainingPGNames(globaldefs.NameAndStringValue_T[] pTPName, globaldefs.NamingAttributesList_THolder pgNameList) throws globaldefs.ProcessingFailureException;
}
