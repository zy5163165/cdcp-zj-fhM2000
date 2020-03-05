package FH_FaultAnalyzer;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "FH_FaultAnalyzerMgr_I"
 *	@author JacORB IDL compiler 
 */

public class FH_FaultAnalyzerMgr_IPOATie
	extends FH_FaultAnalyzerMgr_IPOA
{
	private FH_FaultAnalyzerMgr_IOperations _delegate;

	private POA _poa;
	public FH_FaultAnalyzerMgr_IPOATie(FH_FaultAnalyzerMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FH_FaultAnalyzerMgr_IPOATie(FH_FaultAnalyzerMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public FH_FaultAnalyzer.FH_FaultAnalyzerMgr_I _this()
	{
		return FH_FaultAnalyzer.FH_FaultAnalyzerMgr_IHelper.narrow(_this_object());
	}
	public FH_FaultAnalyzer.FH_FaultAnalyzerMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return FH_FaultAnalyzer.FH_FaultAnalyzerMgr_IHelper.narrow(_this_object(orb));
	}
	public FH_FaultAnalyzerMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FH_FaultAnalyzerMgr_IOperations delegate)
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

	public void analyseAlarms(boolean bMasked, java.lang.String beginTime, java.lang.String endTime, int how_many, FH_FaultAnalyzer.FaultGroupList_THolder faultGroupList, FH_FaultAnalyzer.FaultGroupIterator_IHolder fgIt) throws globaldefs.ProcessingFailureException
	{
_delegate.analyseAlarms(bMasked,beginTime,endTime,how_many,faultGroupList,fgIt);
	}

}
