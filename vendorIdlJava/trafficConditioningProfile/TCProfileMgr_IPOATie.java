package trafficConditioningProfile;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler 
 */

public class TCProfileMgr_IPOATie
	extends TCProfileMgr_IPOA
{
	private TCProfileMgr_IOperations _delegate;

	private POA _poa;
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public trafficConditioningProfile.TCProfileMgr_I _this()
	{
		return trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object());
	}
	public trafficConditioningProfile.TCProfileMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object(orb));
	}
	public TCProfileMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCProfileMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfile_THolder tcProfile) throws globaldefs.ProcessingFailureException
	{
_delegate.getTCProfile(tcProfileName,tcProfile);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getTCProfileAssociatedTPs(globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTCProfileAssociatedTPs(tcProfileName,how_many,tpList,tpIt);
	}

	public void modifyTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyTCProfile(tcProfileName,tcProfileModifyData,tpsToModify,modifiedTCProfile,errorReason);
	}

	public void deleteTCProfile(globaldefs.NameAndStringValue_T[] tcProfileName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTCProfile(tcProfileName);
	}

	public void createTCProfile(trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, trafficConditioningProfile.TCProfile_THolder newTCProfile) throws globaldefs.ProcessingFailureException
	{
_delegate.createTCProfile(newTCProfileCreateData,newTCProfile);
	}

	public void getAllTCProfiles(int how_many, trafficConditioningProfile.TCProfileList_THolder tcProfileList, trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTCProfiles(how_many,tcProfileList,tcProfileIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
