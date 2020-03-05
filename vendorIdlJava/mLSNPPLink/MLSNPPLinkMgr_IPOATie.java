package mLSNPPLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler 
 */

public class MLSNPPLinkMgr_IPOATie
	extends MLSNPPLinkMgr_IPOA
{
	private MLSNPPLinkMgr_IOperations _delegate;

	private POA _poa;
	public MLSNPPLinkMgr_IPOATie(MLSNPPLinkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPLinkMgr_IPOATie(MLSNPPLinkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mLSNPPLink.MLSNPPLinkMgr_I _this()
	{
		return mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object());
	}
	public mLSNPPLink.MLSNPPLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPLinkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPLinkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public void deassignSignallingController(globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException
	{
_delegate.deassignSignallingController(mLSNPPLinkName);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setSignallingProtocolAndParameters(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingProtocol, globaldefs.NameAndStringValue_T[] signallingParameters) throws globaldefs.ProcessingFailureException
	{
_delegate.setSignallingProtocolAndParameters(mLSNPPLinkName,signallingProtocol,signallingParameters);
	}

	public void modifySignallingProtocolParameters(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, globaldefs.NVSList_THolder signallingParameters) throws globaldefs.ProcessingFailureException
	{
_delegate.modifySignallingProtocolParameters(mLSNPPLinkName,signallingParameters);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setTNANameForMLSNPPLinkEnd(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, mLSNPP.SNPTNAData_T[] sNPTNADataList, mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink) throws globaldefs.ProcessingFailureException
	{
_delegate.setTNANameForMLSNPPLinkEnd(mLSNPPLinkName,sNPTNADataList,sNPPTNAPairList,aTNAName,zTNAName,aTNAGroupName,zTNAGroupName,mLSNPPLink);
	}

	public void disableSignalling(globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException
	{
_delegate.disableSignalling(mLSNPPLinkName);
	}

	public void assignSignallingController(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingControllerIdentifier) throws globaldefs.ProcessingFailureException
	{
_delegate.assignSignallingController(mLSNPPLinkName,signallingControllerIdentifier);
	}

	public void getAvailableCapacity(globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws globaldefs.ProcessingFailureException
	{
_delegate.getAvailableCapacity(mLSNPPLinkName,layerRate,availableCapacity);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void enableSignalling(globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException
	{
_delegate.enableSignalling(mLSNPPLinkName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
