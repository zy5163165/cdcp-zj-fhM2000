package mLSNPP;

/**
 *	Generated from IDL definition of interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface MLSNPPMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMLSNPP(globaldefs.NameAndStringValue_T[] mLSNPPName, mLSNPP.MultiLayerSNPP_THolder theMLSNPP) throws globaldefs.ProcessingFailureException;
	void setTNANameForMLSNPP(globaldefs.NameAndStringValue_T[] mLSNPPName, mLSNPP.SNPTNAData_T[] sNPTNADataList, mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String tNAName, java.lang.String tNAGroupName, mLSNPP.MultiLayerSNPP_THolder mLSNPP) throws globaldefs.ProcessingFailureException;
}
