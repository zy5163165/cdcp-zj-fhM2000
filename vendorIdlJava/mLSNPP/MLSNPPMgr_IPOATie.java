package mLSNPP;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler 
 */

public class MLSNPPMgr_IPOATie
	extends MLSNPPMgr_IPOA
{
	private MLSNPPMgr_IOperations _delegate;

	private POA _poa;
	public MLSNPPMgr_IPOATie(MLSNPPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPMgr_IPOATie(MLSNPPMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mLSNPP.MLSNPPMgr_I _this()
	{
		return mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object());
	}
	public mLSNPP.MLSNPPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getMLSNPP(globaldefs.NameAndStringValue_T[] mLSNPPName, mLSNPP.MultiLayerSNPP_THolder theMLSNPP) throws globaldefs.ProcessingFailureException
	{
_delegate.getMLSNPP(mLSNPPName,theMLSNPP);
	}

	public void setTNANameForMLSNPP(globaldefs.NameAndStringValue_T[] mLSNPPName, mLSNPP.SNPTNAData_T[] sNPTNADataList, mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String tNAName, java.lang.String tNAGroupName, mLSNPP.MultiLayerSNPP_THolder mLSNPP) throws globaldefs.ProcessingFailureException
	{
_delegate.setTNANameForMLSNPP(mLSNPPName,sNPTNADataList,sNPPTNAPairList,tNAName,tNAGroupName,mLSNPP);
	}

}
