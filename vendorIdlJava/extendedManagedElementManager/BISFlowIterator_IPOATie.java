package extendedManagedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "BISFlowIterator_I"
 *	@author JacORB IDL compiler 
 */

public class BISFlowIterator_IPOATie
	extends BISFlowIterator_IPOA
{
	private BISFlowIterator_IOperations _delegate;

	private POA _poa;
	public BISFlowIterator_IPOATie(BISFlowIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public BISFlowIterator_IPOATie(BISFlowIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedManagedElementManager.BISFlowIterator_I _this()
	{
		return extendedManagedElementManager.BISFlowIterator_IHelper.narrow(_this_object());
	}
	public extendedManagedElementManager.BISFlowIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedManagedElementManager.BISFlowIterator_IHelper.narrow(_this_object(orb));
	}
	public BISFlowIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BISFlowIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, extendedManagedElementManager.BoardInternalSignalFlowList_THolder internalSignalFlowList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,internalSignalFlowList);
	}

}
