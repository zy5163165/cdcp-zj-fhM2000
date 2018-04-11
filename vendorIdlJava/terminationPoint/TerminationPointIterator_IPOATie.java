package terminationPoint;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "TerminationPointIterator_I"
 *	@author JacORB IDL compiler 
 */

public class TerminationPointIterator_IPOATie
	extends TerminationPointIterator_IPOA
{
	private TerminationPointIterator_IOperations _delegate;

	private POA _poa;
	public TerminationPointIterator_IPOATie(TerminationPointIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TerminationPointIterator_IPOATie(TerminationPointIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public terminationPoint.TerminationPointIterator_I _this()
	{
		return terminationPoint.TerminationPointIterator_IHelper.narrow(_this_object());
	}
	public terminationPoint.TerminationPointIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return terminationPoint.TerminationPointIterator_IHelper.narrow(_this_object(orb));
	}
	public TerminationPointIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TerminationPointIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tpList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
