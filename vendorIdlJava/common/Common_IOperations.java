package common;

/**
 *	Generated from IDL definition of interface "Common_I"
 *	@author JacORB IDL compiler 
 */


public interface Common_IOperations
{
	/* constants */
	/* operations  */
	void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException;
	void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException;
	void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException;
	void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException;
	void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
}
