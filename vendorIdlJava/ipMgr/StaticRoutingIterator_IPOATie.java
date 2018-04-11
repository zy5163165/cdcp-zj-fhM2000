package ipMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "StaticRoutingIterator_I"
 *	@author JacORB IDL compiler 
 */

public class StaticRoutingIterator_IPOATie
	extends StaticRoutingIterator_IPOA
{
	private StaticRoutingIterator_IOperations _delegate;

	private POA _poa;
	public StaticRoutingIterator_IPOATie(StaticRoutingIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public StaticRoutingIterator_IPOATie(StaticRoutingIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ipMgr.StaticRoutingIterator_I _this()
	{
		return ipMgr.StaticRoutingIterator_IHelper.narrow(_this_object());
	}
	public ipMgr.StaticRoutingIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgr.StaticRoutingIterator_IHelper.narrow(_this_object(orb));
	}
	public StaticRoutingIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StaticRoutingIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, ipMgr.StaticRoutingList_THolder srList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,srList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
