package ipMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "BridgeIterator_I"
 *	@author JacORB IDL compiler 
 */

public class BridgeIterator_IPOATie
	extends BridgeIterator_IPOA
{
	private BridgeIterator_IOperations _delegate;

	private POA _poa;
	public BridgeIterator_IPOATie(BridgeIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public BridgeIterator_IPOATie(BridgeIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ipMgr.BridgeIterator_I _this()
	{
		return ipMgr.BridgeIterator_IHelper.narrow(_this_object());
	}
	public ipMgr.BridgeIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgr.BridgeIterator_IHelper.narrow(_this_object(orb));
	}
	public BridgeIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BridgeIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, ipMgr.BridgeList_THolder bridgeList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,bridgeList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
