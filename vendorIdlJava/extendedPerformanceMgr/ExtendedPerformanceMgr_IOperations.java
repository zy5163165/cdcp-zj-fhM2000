package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of interface "ExtendedPerformanceMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface ExtendedPerformanceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void removePMPs(globaldefs.NameAndStringValue_T[][] pmpNameList, globaldefs.NamingAttributesList_THolder failedPmpNameList) throws globaldefs.ProcessingFailureException;
	void createPMP(performance.PMP_T pmpData) throws globaldefs.ProcessingFailureException;
	void modifyPMP(performance.PMP_T pmpData) throws globaldefs.ProcessingFailureException;
	void getAllExtraPmp(globaldefs.NameAndStringValue_T[] meName, int how_many, performance.PMPList_THolder pmpList, performance.PMPIterator_IHolder pmpIt) throws globaldefs.ProcessingFailureException;
	void clearPMData(extendedPerformanceMgr.PMTPPmNameSelect_T[] pmTPSelectList, extendedPerformanceMgr.PMTPPmNameList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
	void setEXTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, extendedPerformanceMgr.EXTCAParameters_THolder extcaParameters) throws globaldefs.ProcessingFailureException;
	void getEXTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, extendedPerformanceMgr.EXTCAParameters_THolder extcaParameter) throws globaldefs.ProcessingFailureException;
}
