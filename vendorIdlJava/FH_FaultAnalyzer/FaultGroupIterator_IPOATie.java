package FH_FaultAnalyzer;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "FaultGroupIterator_I"
 *	@author JacORB IDL compiler 
 */

public class FaultGroupIterator_IPOATie
	extends FaultGroupIterator_IPOA
{
	private FaultGroupIterator_IOperations _delegate;

	private POA _poa;
	public FaultGroupIterator_IPOATie(FaultGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FaultGroupIterator_IPOATie(FaultGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public FH_FaultAnalyzer.FaultGroupIterator_I _this()
	{
		return FH_FaultAnalyzer.FaultGroupIterator_IHelper.narrow(_this_object());
	}
	public FH_FaultAnalyzer.FaultGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return FH_FaultAnalyzer.FaultGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public FaultGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FaultGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, FH_FaultAnalyzer.FaultGroupList_THolder faultGroupList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,faultGroupList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
