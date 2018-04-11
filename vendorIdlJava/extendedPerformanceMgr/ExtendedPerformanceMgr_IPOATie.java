package extendedPerformanceMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ExtendedPerformanceMgr_I"
 *	@author JacORB IDL compiler 
 */

public class ExtendedPerformanceMgr_IPOATie
	extends ExtendedPerformanceMgr_IPOA
{
	private ExtendedPerformanceMgr_IOperations _delegate;

	private POA _poa;
	public ExtendedPerformanceMgr_IPOATie(ExtendedPerformanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExtendedPerformanceMgr_IPOATie(ExtendedPerformanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedPerformanceMgr.ExtendedPerformanceMgr_I _this()
	{
		return extendedPerformanceMgr.ExtendedPerformanceMgr_IHelper.narrow(_this_object());
	}
	public extendedPerformanceMgr.ExtendedPerformanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedPerformanceMgr.ExtendedPerformanceMgr_IHelper.narrow(_this_object(orb));
	}
	public ExtendedPerformanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExtendedPerformanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void getEXTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, extendedPerformanceMgr.EXTCAParameters_THolder extcaParameter) throws globaldefs.ProcessingFailureException
	{
_delegate.getEXTCATPParameter(tpName,layerRate,granularity,extcaParameter);
	}

	public void createPMP(performance.PMP_T pmpData) throws globaldefs.ProcessingFailureException
	{
_delegate.createPMP(pmpData);
	}

	public void clearPMData(extendedPerformanceMgr.PMTPPmNameSelect_T[] pmTPSelectList, extendedPerformanceMgr.PMTPPmNameList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void modifyPMP(performance.PMP_T pmpData) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyPMP(pmpData);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void removePMPs(globaldefs.NameAndStringValue_T[][] pmpNameList, globaldefs.NamingAttributesList_THolder failedPmpNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.removePMPs(pmpNameList,failedPmpNameList);
	}

	public void getAllExtraPmp(globaldefs.NameAndStringValue_T[] meName, int how_many, performance.PMPList_THolder pmpList, performance.PMPIterator_IHolder pmpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllExtraPmp(meName,how_many,pmpList,pmpIt);
	}

	public void setEXTCATPParameter(globaldefs.NameAndStringValue_T[] tpName, extendedPerformanceMgr.EXTCAParameters_THolder extcaParameters) throws globaldefs.ProcessingFailureException
	{
_delegate.setEXTCATPParameter(tpName,extcaParameters);
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
