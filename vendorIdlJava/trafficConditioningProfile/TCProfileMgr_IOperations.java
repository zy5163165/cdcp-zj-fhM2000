package trafficConditioningProfile;

/**
 *	Generated from IDL definition of interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface TCProfileMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTCProfiles(int how_many, trafficConditioningProfile.TCProfileList_THolder tcProfileList, trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws globaldefs.ProcessingFailureException;
	void getTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfile_THolder tcProfile) throws globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedTPs(globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void createTCProfile(trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, trafficConditioningProfile.TCProfile_THolder newTCProfile) throws globaldefs.ProcessingFailureException;
	void deleteTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName) throws globaldefs.ProcessingFailureException;
	void modifyTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
}
