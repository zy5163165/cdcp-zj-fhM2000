package extendedMLSNMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MLSNSubNetWorkIterator_I"
 *	@author JacORB IDL compiler 
 */

public class MLSNSubNetWorkIterator_IPOATie
	extends MLSNSubNetWorkIterator_IPOA
{
	private MLSNSubNetWorkIterator_IOperations _delegate;

	private POA _poa;
	public MLSNSubNetWorkIterator_IPOATie(MLSNSubNetWorkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNSubNetWorkIterator_IPOATie(MLSNSubNetWorkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedMLSNMgr.MLSNSubNetWorkIterator_I _this()
	{
		return extendedMLSNMgr.MLSNSubNetWorkIterator_IHelper.narrow(_this_object());
	}
	public extendedMLSNMgr.MLSNSubNetWorkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedMLSNMgr.MLSNSubNetWorkIterator_IHelper.narrow(_this_object(orb));
	}
	public MLSNSubNetWorkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNSubNetWorkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedMLSNMgr.MLSNSubNetWorkList_THolder mlsnSubNetWorkList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mlsnSubNetWorkList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
