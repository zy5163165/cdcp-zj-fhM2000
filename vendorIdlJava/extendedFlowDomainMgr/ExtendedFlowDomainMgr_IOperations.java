package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of interface "ExtendedFlowDomainMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface ExtendedFlowDomainMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createExMFdFr(globaldefs.NameAndStringValue_T[] meName, extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T exMFdFrToCreate, java.lang.String exParam, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo) throws globaldefs.ProcessingFailureException;
	void activateExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException;
	void deActivateExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException;
	void deleteExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException;
	void activateFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException;
	void deActivateFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException;
	void deleteFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException;
	void getAllExMFdFrInMe(globaldefs.NameAndStringValue_T[] meName, short[] layerList, int how_many, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exMFdFrList, extendedFlowDomainMgr.ExMFDFrIterator_IHolder exMFdFrIt) throws globaldefs.ProcessingFailureException;
	void getAllExMFdFrInMeSingleMeRoute(globaldefs.NameAndStringValue_T[] meName, short[] layerList, int how_many, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;
	void modifyExMFdFr(java.lang.String modifyType, globaldefs.NameAndStringValue_T[] mfdfrToModify, flowDomainFragment.FlowDomainFragment_T mFdFrModifyAdditonInfo) throws globaldefs.ProcessingFailureException;
	void createFdFr(java.lang.String createType, flowDomainFragment.FlowDomainFragment_T fdFrToCreate, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo, globaldefs.NVSList_THolder fdfrName) throws globaldefs.ProcessingFailureException;
	void modifyFdFr(java.lang.String modifyType, flowDomainFragment.FlowDomainFragment_T fdFrToModify, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrModifyAdditonInfo, flowDomainFragment.FlowDomainFragment_THolder fdFrSuccess) throws globaldefs.ProcessingFailureException;
	void getExFDFrRoute(globaldefs.NameAndStringValue_T[] fdfrName, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder route) throws globaldefs.ProcessingFailureException;
	void createPreCutOverFdFr(java.lang.String createType, flowDomainFragment.FlowDomainFragment_T fdFrToCreate, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo) throws globaldefs.ProcessingFailureException;
	void getPreCutOverFdFr(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;
	void adjustmentFdFrRoute(globaldefs.NameAndStringValue_T[] fdfrNameToAdjust, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrAdjustParam, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrAdjustOrder, flowDomainFragment.FlowDomainFragment_THolder fdFrSuccess) throws globaldefs.ProcessingFailureException;
}
