package mLSNPPLink;

/**
 *	Generated from IDL definition of interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface MLSNPPLinkMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAvailableCapacity(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws globaldefs.ProcessingFailureException;
	void assignSignallingController(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingControllerIdentifier) throws globaldefs.ProcessingFailureException;
	void deassignSignallingController(globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException;
	void setSignallingProtocolAndParameters(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingProtocol, globaldefs.NameAndStringValue_T[] signallingParameters) throws globaldefs.ProcessingFailureException;
	void setTNANameForMLSNPPLinkEnd(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, mLSNPP.SNPTNAData_T[] sNPTNADataList, mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink) throws globaldefs.ProcessingFailureException;
	void modifySignallingProtocolParameters(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, globaldefs.NVSList_THolder signallingParameters) throws globaldefs.ProcessingFailureException;
	void enableSignalling(globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException;
	void disableSignalling(globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException;
}
