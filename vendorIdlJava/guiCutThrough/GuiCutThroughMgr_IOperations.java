package guiCutThrough;

/**
 *	Generated from IDL definition of interface "GuiCutThroughMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface GuiCutThroughMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getGCTProfileInfo(guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws globaldefs.ProcessingFailureException;
	void launchGCT(globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, globaldefs.NVSList_THolder additionalOutputInfo) throws globaldefs.ProcessingFailureException;
	void destroyGCT(java.lang.String displayAddress) throws globaldefs.ProcessingFailureException;
}
