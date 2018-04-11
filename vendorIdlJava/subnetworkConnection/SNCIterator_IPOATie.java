package subnetworkConnection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "SNCIterator_I"
 *	@author JacORB IDL compiler 
 */

public class SNCIterator_IPOATie
	extends SNCIterator_IPOA
{
	private SNCIterator_IOperations _delegate;

	private POA _poa;
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public subnetworkConnection.SNCIterator_I _this()
	{
		return subnetworkConnection.SNCIterator_IHelper.narrow(_this_object());
	}
	public subnetworkConnection.SNCIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return subnetworkConnection.SNCIterator_IHelper.narrow(_this_object(orb));
	}
	public SNCIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SNCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,sncList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
