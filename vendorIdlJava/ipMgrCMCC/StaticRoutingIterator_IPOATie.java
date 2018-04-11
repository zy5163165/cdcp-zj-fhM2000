package ipMgrCMCC;

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
	public ipMgrCMCC.StaticRoutingIterator_I _this()
	{
		return ipMgrCMCC.StaticRoutingIterator_IHelper.narrow(_this_object());
	}
	public ipMgrCMCC.StaticRoutingIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgrCMCC.StaticRoutingIterator_IHelper.narrow(_this_object(orb));
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

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, ipMgrCMCC.StaticRoutingList_THolder srList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,srList);
	}

}
