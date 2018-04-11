package extendedFlowDomainMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ExMFDFrIterator_I"
 *	@author JacORB IDL compiler 
 */

public class ExMFDFrIterator_IPOATie
	extends ExMFDFrIterator_IPOA
{
	private ExMFDFrIterator_IOperations _delegate;

	private POA _poa;
	public ExMFDFrIterator_IPOATie(ExMFDFrIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExMFDFrIterator_IPOATie(ExMFDFrIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedFlowDomainMgr.ExMFDFrIterator_I _this()
	{
		return extendedFlowDomainMgr.ExMFDFrIterator_IHelper.narrow(_this_object());
	}
	public extendedFlowDomainMgr.ExMFDFrIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedFlowDomainMgr.ExMFDFrIterator_IHelper.narrow(_this_object(orb));
	}
	public ExMFDFrIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExMFDFrIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mfdfrList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
