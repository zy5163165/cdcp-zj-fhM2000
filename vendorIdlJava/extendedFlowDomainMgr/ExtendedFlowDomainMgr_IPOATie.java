package extendedFlowDomainMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ExtendedFlowDomainMgr_I"
 *	@author JacORB IDL compiler 
 */

public class ExtendedFlowDomainMgr_IPOATie
	extends ExtendedFlowDomainMgr_IPOA
{
	private ExtendedFlowDomainMgr_IOperations _delegate;

	private POA _poa;
	public ExtendedFlowDomainMgr_IPOATie(ExtendedFlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExtendedFlowDomainMgr_IPOATie(ExtendedFlowDomainMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedFlowDomainMgr.ExtendedFlowDomainMgr_I _this()
	{
		return extendedFlowDomainMgr.ExtendedFlowDomainMgr_IHelper.narrow(_this_object());
	}
	public extendedFlowDomainMgr.ExtendedFlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedFlowDomainMgr.ExtendedFlowDomainMgr_IHelper.narrow(_this_object(orb));
	}
	public ExtendedFlowDomainMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExtendedFlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void createFdFr(java.lang.String createType, flowDomainFragment.FlowDomainFragment_T fdFrToCreate, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo, globaldefs.NVSList_THolder fdfrName) throws globaldefs.ProcessingFailureException
	{
_delegate.createFdFr(createType,fdFrToCreate,fdFrCreateAdditonInfo,fdfrName);
	}

	public void deleteExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteExMFdFrs(exMFdFrs,exParam,exFailedMFdFrs);
	}

	public void adjustmentFdFrRoute(globaldefs.NameAndStringValue_T[] fdfrNameToAdjust, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrAdjustParam, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrAdjustOrder, flowDomainFragment.FlowDomainFragment_THolder fdFrSuccess) throws globaldefs.ProcessingFailureException
	{
_delegate.adjustmentFdFrRoute(fdfrNameToAdjust,fdFrAdjustParam,fdFrAdjustOrder,fdFrSuccess);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllExMFdFrInMeSingleMeRoute(globaldefs.NameAndStringValue_T[] meName, short[] layerList, int how_many, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllExMFdFrInMeSingleMeRoute(meName,layerList,how_many,fdfrList,fdfrIt);
	}

	public void createExMFdFr(globaldefs.NameAndStringValue_T[] meName, extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T exMFdFrToCreate, java.lang.String exParam, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.createExMFdFr(meName,exMFdFrToCreate,exParam,fdFrCreateAdditonInfo);
	}

	public void getPreCutOverFdFr(globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, flowDomainFragment.FDFrList_THolder fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getPreCutOverFdFr(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void deActivateFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException
	{
_delegate.deActivateFdFrs(fdfrList,exParam,failedFdfrList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void activateFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException
	{
_delegate.activateFdFrs(fdfrList,exParam,failedFdfrList);
	}

	public void getAllExMFdFrInMe(globaldefs.NameAndStringValue_T[] meName, short[] layerList, int how_many, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exMFdFrList, extendedFlowDomainMgr.ExMFDFrIterator_IHolder exMFdFrIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllExMFdFrInMe(meName,layerList,how_many,exMFdFrList,exMFdFrIt);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void modifyFdFr(java.lang.String modifyType, flowDomainFragment.FlowDomainFragment_T fdFrToModify, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrModifyAdditonInfo, flowDomainFragment.FlowDomainFragment_THolder fdFrSuccess) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyFdFr(modifyType,fdFrToModify,fdFrModifyAdditonInfo,fdFrSuccess);
	}

	public void deActivateExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException
	{
_delegate.deActivateExMFdFrs(exMFdFrs,exParam,exFailedMFdFrs);
	}

	public void activateExMFdFrs(extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] exMFdFrs, java.lang.String exParam, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder exFailedMFdFrs) throws globaldefs.ProcessingFailureException
	{
_delegate.activateExMFdFrs(exMFdFrs,exParam,exFailedMFdFrs);
	}

	public void getExFDFrRoute(globaldefs.NameAndStringValue_T[] fdfrName, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getExFDFrRoute(fdfrName,route);
	}

	public void modifyExMFdFr(java.lang.String modifyType, globaldefs.NameAndStringValue_T[] mfdfrToModify, flowDomainFragment.FlowDomainFragment_T mFdFrModifyAdditonInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyExMFdFr(modifyType,mfdfrToModify,mFdFrModifyAdditonInfo);
	}

	public void createPreCutOverFdFr(java.lang.String createType, flowDomainFragment.FlowDomainFragment_T fdFrToCreate, extendedFlowDomainMgr.exFdFrCreateAdditionalData_T fdFrCreateAdditonInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.createPreCutOverFdFr(createType,fdFrToCreate,fdFrCreateAdditonInfo);
	}

	public void deleteFdFrs(flowDomainFragment.FlowDomainFragment_T[] fdfrList, java.lang.String exParam, flowDomainFragment.FDFrList_THolder failedFdfrList) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFdFrs(fdfrList,exParam,failedFdfrList);
	}

}
